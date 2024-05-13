package com.edu.konradlorenz.model;

import java.time.LocalDateTime;

public class Empleado extends Persona implements Trabajador {
    
    private Horario horario;
    
    private int calificacion;

    public Empleado() {
    }

    @Override
    public void iniciarSesion() {

    }

    public Empleado(Horario horario, int calificacion) {
        this.horario = horario;
        this.calificacion = calificacion;
    }

    public Empleado(Horario horario, int calificacion, String nombre, int id, String tipoDocumento, int cedula, String correo, int telefono, int salario) {
        super(nombre, id, tipoDocumento, cedula, correo, telefono, salario);
        this.horario = horario;
        this.calificacion = calificacion;
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
