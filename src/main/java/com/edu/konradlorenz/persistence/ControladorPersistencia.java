package com.edu.konradlorenz.persistence;

import com.edu.konradlorenz.model.Persona;
import com.edu.konradlorenz.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistencia {
    
    PersonaJpaController personJpa = new PersonaJpaController();
    AdministradorJpaController adminJpa = new AdministradorJpaController();

    public List<Persona> traerUsuarios() {
        
        List<Persona> listaUsuarios = personJpa.findPersonaEntities();
        return personJpa.findPersonaEntities();
    
    }
    
    public Persona traerUsuario(int id_usuario) {
        
        return personJpa.findPersona(id_usuario);
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
            personJpa.destroy(id_usuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
