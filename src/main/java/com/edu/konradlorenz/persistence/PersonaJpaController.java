package com.edu.konradlorenz.persistence;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.edu.konradlorenz.model.HistorialHorario;
import com.edu.konradlorenz.model.Persona;
import com.edu.konradlorenz.persistence.exceptions.NonexistentEntityException;
import com.edu.konradlorenz.persistence.exceptions.PreexistingEntityException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonaJpaController implements Serializable {

    public PersonaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private final EntityManagerFactory emf;
    
    public PersonaJpaController(){
        emf = Persistence.createEntityManagerFactory("autoAssistancePU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Persona persona) throws Exception {
        if (persona.getHistorialHorarios() == null) {
            persona.setHistorialHorarios(new HashSet<>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Set<HistorialHorario> attachedHistorialHorarios = new HashSet<>();
            for (HistorialHorario historialHorariosHistorialHorarioToAttach : persona.getHistorialHorarios()) {
                historialHorariosHistorialHorarioToAttach = em.getReference(historialHorariosHistorialHorarioToAttach.getClass(), historialHorariosHistorialHorarioToAttach.getId_historial());
                attachedHistorialHorarios.add(historialHorariosHistorialHorarioToAttach);
            }
            persona.setHistorialHorarios(attachedHistorialHorarios);
            em.persist(persona);
            for (HistorialHorario historialHorariosHistorialHorario : persona.getHistorialHorarios()) {
                Persona oldId_userOfHistorialHorariosHistorialHorario = historialHorariosHistorialHorario.getId_user();
                historialHorariosHistorialHorario.setId_user(persona);
                historialHorariosHistorialHorario = em.merge(historialHorariosHistorialHorario);
                if (oldId_userOfHistorialHorariosHistorialHorario != null) {
                    oldId_userOfHistorialHorariosHistorialHorario.getHistorialHorarios().remove(historialHorariosHistorialHorario);
                    oldId_userOfHistorialHorariosHistorialHorario = em.merge(oldId_userOfHistorialHorariosHistorialHorario);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPersona(persona.getId()) != null) {
                throw new PreexistingEntityException("Persona " + persona + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Persona persona) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persistentPersona = em.find(Persona.class, persona.getId());
            Set<HistorialHorario> historialHorariosOld = persistentPersona.getHistorialHorarios();
            Set<HistorialHorario> historialHorariosNew = persona.getHistorialHorarios();
            Set<HistorialHorario> attachedHistorialHorariosNew = new HashSet<>();
            for (HistorialHorario historialHorariosNewHistorialHorarioToAttach : historialHorariosNew) {
                historialHorariosNewHistorialHorarioToAttach = em.getReference(historialHorariosNewHistorialHorarioToAttach.getClass(), historialHorariosNewHistorialHorarioToAttach.getId_historial());
                attachedHistorialHorariosNew.add(historialHorariosNewHistorialHorarioToAttach);
            }
            historialHorariosNew = attachedHistorialHorariosNew;
            persona.setHistorialHorarios(historialHorariosNew);
            persona = em.merge(persona);
            for (HistorialHorario historialHorariosOldHistorialHorario : historialHorariosOld) {
                if (!historialHorariosNew.contains(historialHorariosOldHistorialHorario)) {
                    historialHorariosOldHistorialHorario.setId_user(null);
                    historialHorariosOldHistorialHorario = em.merge(historialHorariosOldHistorialHorario);
                }
            }
            for (HistorialHorario historialHorariosNewHistorialHorario : historialHorariosNew) {
                if (!historialHorariosOld.contains(historialHorariosNewHistorialHorario)) {
                    Persona oldId_userOfHistorialHorariosNewHistorialHorario = historialHorariosNewHistorialHorario.getId_user();
                    historialHorariosNewHistorialHorario.setId_user(persona);
                    historialHorariosNewHistorialHorario = em.merge(historialHorariosNewHistorialHorario);
                    if (oldId_userOfHistorialHorariosNewHistorialHorario != null && !oldId_userOfHistorialHorariosNewHistorialHorario.equals(persona)) {
                        oldId_userOfHistorialHorariosNewHistorialHorario.getHistorialHorarios().remove(historialHorariosNewHistorialHorario);
                        oldId_userOfHistorialHorariosNewHistorialHorario = em.merge(oldId_userOfHistorialHorariosNewHistorialHorario);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.isEmpty()) {
                short id = persona.getId();
                if (findPersona(id) == null) {
                    throw new NonexistentEntityException("The persona with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(short id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Persona persona;
            try {
                persona = em.getReference(Persona.class, id);
                persona.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The persona with id " + id + " no longer exists.", enfe);
            }
            Set<HistorialHorario> historialHorarios = persona.getHistorialHorarios();
            for (HistorialHorario historialHorariosHistorialHorario : historialHorarios) {
                historialHorariosHistorialHorario.setId_user(null);
                historialHorariosHistorialHorario = em.merge(historialHorariosHistorialHorario);
            }
            em.remove(persona);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List findPersonaEntities() {
        return findPersonaEntities(true, -1, -1);
    }

    public List findPersonaEntities(int maxResults, int firstResult) {
        return findPersonaEntities(false, maxResults, firstResult);
    }

    private List findPersonaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Object> cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Persona.class));
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

    public Persona findPersona(short id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Persona.class, id);
        } finally {
            em.close();
        }
    }

    public int getPersonaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Object> cq = em.getCriteriaBuilder().createQuery();
            Root<Persona> rt = cq.from(Persona.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
