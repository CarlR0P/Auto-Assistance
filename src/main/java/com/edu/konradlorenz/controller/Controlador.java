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

        Persona user = null;

        for (Persona usu : listaUsuarios) {
            if (usu.getNombre().equals(usuario)) {
                if (usu.getContrasena().equals(contrasena)){
                    user = usu;
                    return user;
                } else {
                    user = null;
                    return user;
                } 
            } else {
               user = null; 
            }
        }   
        return user;
    }
    
    
    
}
