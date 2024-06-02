package com.edu.konradlorenz.persistence;

import com.edu.konradlorenz.model.Empleado;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.edu.konradlorenz.model.HistorialHorario;
import com.edu.konradlorenz.persistence.exceptions.NonexistentEntityException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpleadoJpaController implements Serializable {

    public EmpleadoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private final EntityManagerFactory emf;
    
    public EmpleadoJpaController(){
        emf = Persistence.createEntityManagerFactory("autoAssistancePU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void edit(Empleado empleado) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Empleado persistentEmpleado = em.find(Empleado.class, empleado.getId());
            Set<HistorialHorario> historialHorariosOld = persistentEmpleado.getHistorialHorarios();
            Set<HistorialHorario> historialHorariosNew = empleado.getHistorialHorarios();
            Set<HistorialHorario> attachedHistorialHorariosNew = new HashSet<>();
            for (HistorialHorario historialHorariosNewHistorialHorarioToAttach : historialHorariosNew) {
                historialHorariosNewHistorialHorarioToAttach = em.getReference(historialHorariosNewHistorialHorarioToAttach.getClass(), historialHorariosNewHistorialHorarioToAttach.getId_historial());
                attachedHistorialHorariosNew.add(historialHorariosNewHistorialHorarioToAttach);
            }
            historialHorariosNew = attachedHistorialHorariosNew;
            empleado.setHistorialHorarios(historialHorariosNew);
            empleado = em.merge(empleado);
            for (HistorialHorario historialHorariosOldHistorialHorario : historialHorariosOld) {
                if (!historialHorariosNew.contains(historialHorariosOldHistorialHorario)) {
                    historialHorariosOldHistorialHorario.setId_user(null);
                    historialHorariosOldHistorialHorario = em.merge(historialHorariosOldHistorialHorario);
                }
            }
            for (HistorialHorario historialHorariosNewHistorialHorario : historialHorariosNew) {
                if (!historialHorariosOld.contains(historialHorariosNewHistorialHorario)) {
                    Empleado oldId_userOfHistorialHorariosNewHistorialHorario = (Empleado) historialHorariosNewHistorialHorario.getId_user();
                    historialHorariosNewHistorialHorario.setId_user(empleado);
                    historialHorariosNewHistorialHorario = em.merge(historialHorariosNewHistorialHorario);
                    if (oldId_userOfHistorialHorariosNewHistorialHorario != null && !oldId_userOfHistorialHorariosNewHistorialHorario.equals(empleado)) {
                        oldId_userOfHistorialHorariosNewHistorialHorario.getHistorialHorarios().remove(historialHorariosNewHistorialHorario);
                        oldId_userOfHistorialHorariosNewHistorialHorario = em.merge(oldId_userOfHistorialHorariosNewHistorialHorario);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.isEmpty()) {
                short id = empleado.getId();
                if (findEmpleado(id) == null) {
                    throw new NonexistentEntityException("The empleado with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Empleado> findEmpleadoEntities() {
        return findEmpleadoEntities(true, -1, -1);
    }

    public List findEmpleadoEntities(int maxResults, int firstResult) {
        return findEmpleadoEntities(false, maxResults, firstResult);
    }

    private List findEmpleadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Object> cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Empleado.class));
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

    public Empleado findEmpleado(short id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Empleado.class, id);
        } finally {
            em.close();
        }
    }

    public int getEmpleadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery<Object> cq = em.getCriteriaBuilder().createQuery();
            Root<Empleado> rt = cq.from(Empleado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
