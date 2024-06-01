package com.edu.konradlorenz.persistence;

import com.edu.konradlorenz.model.Empleado;
import com.edu.konradlorenz.model.HistorialHorario;
import com.edu.konradlorenz.model.Persona;
import com.edu.konradlorenz.persistence.exceptions.NonexistentEntityException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistencia {
    
    PersonaJpaController personJpa = new PersonaJpaController();
    EmpleadoJpaController empleJpa = new EmpleadoJpaController();
    HistorialHorarioJpaController historialJpa = new HistorialHorarioJpaController();

    public List<Persona> traerUsuarios() {      
        List<Persona> listaUsuarios = personJpa.findPersonaEntities();
        return personJpa.findPersonaEntities();   
    }
    
    public Persona traerUsuario(short id_usuario) {        
        return personJpa.findPersona(id_usuario);
    }
    
    
    public List<Persona> traerEmpleados() {
        
        List<Persona> listaUsuarios = personJpa.findPersonaEntities();
    
        // Filtra solo aquellos que tienen el rol de empleado
        List<Persona> listaEmpleados = new ArrayList<>();
        for (Persona persona : listaUsuarios) {
            if ("empleado".equals(persona.getRol())) {
                listaEmpleados.add(persona);
            }
        }
        return listaEmpleados;
    }
    
    public void crearUsuario(Persona person) {
        
        try {
            personJpa.create(person);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarUsuario(Persona person) {
        try {
            personJpa.edit(person);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarUsuario(int id_usuario) {
        
        try {
            personJpa.destroy((short) id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarUsuario(Persona person) {
        try {
            personJpa.destroy(person.getId());
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public HistorialHorario traerRegistro(short id_user) {
        return historialJpa.findHistorialHorario(id_user);
    }
    
    public List<HistorialHorario> traerRegistros() {
        
        List<HistorialHorario> listaRegistros = historialJpa.findHistorialHorarioEntities();
        return historialJpa.findHistorialHorarioEntities();
    }
    
    public void crearRegistroHorario(HistorialHorario objHistorialHorario) {
        
        historialJpa.create(objHistorialHorario);
    }

    public void editarRegistroHorario(HistorialHorario objHistorialHorario) {
        
        try {
            historialJpa.edit(objHistorialHorario);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void editarEmpleado(Empleado empleado) {
        try {
            empleJpa.edit(empleado);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public LocalDateTime obtenerFechaUltimaEntradaDesdeBaseDeDatos(Persona persona) {
        HistorialHorario ultimaEntrada = historialJpa.obtenerUltimaEntradaPorPersona(persona);
        if (ultimaEntrada != null) {
            return ultimaEntrada.getFechaHoraIni();
        } else {
            return null; 
        }
    }
    public LocalDateTime obtenerFechaUltimaSalidaDesdeBaseDeDatos(short id_historial) {
        HistorialHorario historial = historialJpa.findHistorialHorario(id_historial);
        if (historial != null) {
            return historial.getFechaHoraFin();
        } else {
            return null;
        }
    }
}

    
    
