package com.edu.konradlorenz.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("administrador")
public class Administrador extends Persona implements Trabajador {

    public Administrador() {
    }  
    
    public Administrador(String nombreUsuario, String nombre, String contrasena, String tipoDocumento, long numeroDocumento, String correo, long telefono) {
        super(nombreUsuario, nombre, contrasena, tipoDocumento, numeroDocumento, correo, telefono);
    }  
     
    public void registrarHorario() {
        
    }
    
    public void eliminarHorario() {
        
    }
    
    public void modificarHorario() {
        
    }
    
    public int revisarProductividad (Empleado e ) { 
        return 0;
    }
    
    @Override
    public void iniciarSesion() {

    }

    @Override
    public String verSalario(long salario) {
        return "";
    }

    @Override
    public long cobrarSalario() {
        return 0;
    }

    @Override
    public String verDatos(Persona personita) {
        return "";
    }
}