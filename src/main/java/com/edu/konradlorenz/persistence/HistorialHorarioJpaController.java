package com.edu.konradlorenz.persistence;

import com.edu.konradlorenz.model.HistorialHorario;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.edu.konradlorenz.model.Persona;
import com.edu.konradlorenz.persistence.exceptions.NonexistentEntityException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class HistorialHorarioJpaController implements Serializable {

    public HistorialHorarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public HistorialHorarioJpaController() {
        emf = Persistence.createEntityManagerFactory("autoAssistancePU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public void create(HistorialHorario historialHorario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona id_user = historialHorario.getId_user();
            if (id_user != null) {
                id_user = em.getReference(id_user.getClass(), id_user.getId());
                historialHorario.setId_user(id_user);
            }
            em.persist(historialHorario);
            if (id_user != null) {
                id_user.getHistorialHorarios().add(historialHorario);
                id_user = em.merge(id_user);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void edit(HistorialHorario historialHorario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            HistorialHorario persistentHistorialHorario = em.find(HistorialHorario.class, historialHorario.getId_historial());
            Persona id_userOld = persistentHistorialHorario.getId_user();
            Persona id_userNew = historialHorario.getId_user();
            if (id_userNew != null) {
                id_userNew = em.getReference(id_userNew.getClass(), id_userNew.getId());
                historialHorario.setId_user(id_userNew);
            }
            historialHorario = em.merge(historialHorario);
            if (id_userOld != null && !id_userOld.equals(id_userNew)) {
                id_userOld.getHistorialHorarios().remove(historialHorario);
                id_userOld = em.merge(id_userOld);
            }
            if (id_userNew != null && !id_userNew.equals(id_userOld)) {
                id_userNew.getHistorialHorarios().add(historialHorario);
                id_userNew = em.merge(id_userNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                short id = historialHorario.getId_historial();
                if (findHistorialHorario(id) == null) {
                    throw new NonexistentEntityException("The historialHorario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
      
    /*
    public void destroy(short id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            HistorialHorario historialHorario;
            try {
                historialHorario = em.getReference(HistorialHorario.class, id);
                historialHorario.getId_historial();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The historialHorario with id " + id + " no longer exists.", enfe);
            }
            Persona id_user = historialHorario.getId_user();
            if (id_user != null) {
                id_user.getHistorialHorarios().remove(historialHorario);
                id_user = em.merge(id_user);
            }
            em.remove(historialHorario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    */

    public List<HistorialHorario> findHistorialHorarioEntities() {
        return findHistorialHorarioEntities(true, -1, -1);
    }

    public List<HistorialHorario> findHistorialHorarioEntities(int maxResults, int firstResult) {
        return findHistorialHorarioEntities(false, maxResults, firstResult);
    }

    private List<HistorialHorario> findHistorialHorarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(HistorialHorario.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public HistorialHorario findHistorialHorario(short id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(HistorialHorario.class, id);
        } finally {
            em.close();
        }
    }

    public int getHistorialHorarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<HistorialHorario> rt = cq.from(HistorialHorario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
        public HistorialHorario obtenerUltimaEntradaPorPersona(Persona persona) {
        EntityManager em = getEntityManager();
        try {
            
            String jpql = "SELECT h FROM HistorialHorario h WHERE h.id_user = :persona "
                        + "AND h.fechaHoraIni = (SELECT MAX(h2.fechaHoraIni) FROM HistorialHorario h2 WHERE h2.id_user = :persona)";
            TypedQuery<HistorialHorario> query = em.createQuery(jpql, HistorialHorario.class);
            query.setParameter("persona", persona);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null; 
        } finally {
        em.close();
    }
}
        
}
