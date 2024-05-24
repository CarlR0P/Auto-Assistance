package com.edu.konradlorenz.model;

import com.edu.konradlorenz.persistence.ControladorPersistencia;
import java.util.List;

public class YaExisteException extends Exception {
    
    private static ControladorPersistencia controlPersistencia;

    static {
        controlPersistencia = new ControladorPersistencia();
    }

    public YaExisteException(String message) {
        super(message);
    }
    
    public static List<Persona> traerUsuarios() throws YaExisteException {
        return controlPersistencia.traerUsuarios();
    }
    
    //Para crear Usuario
    public static boolean usuarioYaExiste(String nombreUsuario) throws YaExisteException  {       
        List <Persona> listaUsuarios = traerUsuarios();
        for (Persona perso : listaUsuarios) {
            if ((perso.getNombreUsuario().equals(nombreUsuario))) {
                return true; 
            } 
        }
        return false; 
    }
    
    //Para editar Usuario
    public static boolean usuarioYaExiste(String nombreUsuario, short id) throws YaExisteException  {       
        List <Persona> listaUsuarios = traerUsuarios();       
        for (Persona perso : listaUsuarios) {
            if ((perso.getNombreUsuario().equals(nombreUsuario) && perso.getId() != id)) {
                return true; 
            }
        }
        return false; 
    }
    
}