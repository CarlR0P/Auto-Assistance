package com.edu.konradlorenz.model;

public class Administrador extends Persona implements Trabajador {

    public Administrador() {
    }

    public Administrador(String nombre, int id, String tipoDocumento, int cedula, String correo, int telefono, int salario) {
        super(nombre, id, tipoDocumento, cedula, correo, telefono, salario);
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
    
    public void eliminarEmpleado() {
       
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
