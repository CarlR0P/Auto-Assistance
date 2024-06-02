package com.edu.konradlorenz.model;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("empleado")
public class Empleado extends Persona implements Trabajador {
    @Column(name = "FECHAINICIAL")
    private LocalDate  fechaInicial;
    @Column(name = "FECHAFINAL")
    private LocalDate  fechaFinal;
    @Column(name = "HORAENTRADA")
    private LocalTime horaEntrada;
    @Column(name = "HORASALIDA")
    private LocalTime horaSalida;
    private String registroLabor;
    private int calificacion;

    public Empleado() {
    }   

    public Empleado(LocalDate fechaInicial, LocalDate fechaFinal, LocalTime horaEntrada, LocalTime horaSalida, String registroLabor, int calificacion) {
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.registroLabor = registroLabor;
        this.calificacion = calificacion;
    }

    public Empleado(String nombreUsuario, String nombre, String contrasena, String tipoDocumento, long numeroDocumento, String correo, long telefono) {
        super(nombreUsuario, nombre, contrasena, tipoDocumento, numeroDocumento, correo, telefono);
    }

    public Empleado(LocalDate fechaInicial, LocalDate fechaFinal, LocalTime horaEntrada, LocalTime horaSalida, String registroLabor, int calificacion, String nombreUsuario, String nombre, String contrasena, String tipoDocumento, long numeroDocumento, String correo, long telefono) {
        super(nombreUsuario, nombre, contrasena, tipoDocumento, numeroDocumento, correo, telefono);
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.registroLabor = registroLabor;
        this.calificacion = calificacion;
    }

    @Override
    public void iniciarSesion() {

    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
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

    public String getRegistroLabor() {
        return registroLabor;
    }

    public void setRegistroLabor(String registroLabor) {
        this.registroLabor = registroLabor;
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