package com.edu.konradlorenz.model;

import java.time.LocalDateTime;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("empleado")
public class Empleado extends Persona implements Trabajador {
    
    private Horario horario;
    
    private int calificacion;

    public Empleado() {
    }   

    public Empleado(Horario horario, int calificacion) {
        this.horario = horario;
        this.calificacion = calificacion;
    }

    public Empleado(String nombreUsuario, String nombre, String contrasena, String tipoDocumento, int numeroDocumento, String correo, int telefono) {
        super(nombreUsuario, nombre, contrasena, tipoDocumento, numeroDocumento, correo, telefono);
    }

    public Empleado(Horario horario, int calificacion, String nombreUsuario, String nombre, String contrasena, String tipoDocumento, int cedula, String correo, int telefono) {
        super(nombreUsuario, nombre, contrasena, tipoDocumento, cedula, correo, telefono);
        this.horario = horario;
        this.calificacion = calificacion;
    }

    @Override
    public void iniciarSesion() {

    }
    
    public LocalDateTime verHorario() {
        LocalDateTime ahora = LocalDateTime.now();
        return ahora;
    }
    
    public void registrarLabor() {
        
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
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
