package com.edu.konradlorenz.model;

import java.sql.Date;
import java.time.LocalTime;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("empleado")
public class Empleado extends Persona implements Trabajador {
    
    
    private Date fechaInicial;
    private Date fechaFinal;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private int calificacion;

    public Empleado() {
    }   

    public Empleado(Date fechaInicial, Date fechaFinal, LocalTime horaEntrada, LocalTime horaSalida, int calificacion) {
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.calificacion = calificacion;
    }

    public Empleado(String nombreUsuario, String nombre, String contrasena, String tipoDocumento, long numeroDocumento, String correo, long telefono) {
        super(nombreUsuario, nombre, contrasena, tipoDocumento, numeroDocumento, correo, telefono);
    }

    public Empleado(Date fechaInicial, Date fechaFinal, LocalTime horaEntrada, LocalTime horaSalida, int calificacion, String nombreUsuario, String nombre, String contrasena, String tipoDocumento, long numeroDocumento, String correo, long telefono) {
        super(nombreUsuario, nombre, contrasena, tipoDocumento, numeroDocumento, correo, telefono);
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.calificacion = calificacion;
    }

    

    @Override
    public void iniciarSesion() {

    }
     
    public void registrarLabor() {
        
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Empleado{" + "fechaInicial=" + fechaInicial + ", fechaFinal=" + fechaFinal + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", calificacion=" + calificacion + '}';
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