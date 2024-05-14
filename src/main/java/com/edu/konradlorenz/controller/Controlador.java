package com.edu.konradlorenz.controller;

import com.edu.konradlorenz.persistence.ControladorPersistencia;
import com.edu.konradlorenz.view.*;
import com.edu.konradlorenz.model.*;
import java.util.List;

public class Controlador {
    
    ControladorPersistencia controlPersistencia;
    
    public Controlador () {
        controlPersistencia = new ControladorPersistencia();
    }

    public void funcionar() {
        
        VentanaPrincipal ventaPrinc = new VentanaPrincipal();
        ventaPrinc.setVisible(true);
        ventaPrinc.setLocationRelativeTo(null);
    }

    public Persona validarUsuario(String usuario, String contrasena) {
        
        List<Persona> listaUsuarios = controlPersistencia.traerUsuarios();     
        Persona person = null;
        
        for (Persona usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(usuario)) {
                if(usu.getContrasena().equals(contrasena)){
                    person = usu;
                    return person;
                } else {
                    person = null;
                    return person;
                } 
            } else {               
                person = null;
            }
        }        
        return person;
    }
    
    
}
