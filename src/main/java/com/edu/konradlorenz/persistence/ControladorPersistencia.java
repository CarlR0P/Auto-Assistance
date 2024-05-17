package com.edu.konradlorenz.persistence;

import com.edu.konradlorenz.model.Persona;
import com.edu.konradlorenz.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistencia {
    
    PersonaJpaController personJpa = new PersonaJpaController();

    public List<Persona> traerUsuarios() {      
        List<Persona> listaUsuarios = personJpa.findPersonaEntities();
        return personJpa.findPersonaEntities();   
    }
    
    public Persona traerUsuario(int id_usuario) {        
        return personJpa.findPersona((short) id_usuario);
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
    
}
