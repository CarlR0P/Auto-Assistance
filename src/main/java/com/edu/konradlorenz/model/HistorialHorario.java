package com.edu.konradlorenz.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class HistorialHorario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id_historial;
    @ManyToOne
    @JoinColumn(name = "PERSONA_ID", referencedColumnName = "id")
    private Persona id_user;
    LocalDateTime fechaHoraIni;
    LocalDateTime fechaHoraFin;

    public HistorialHorario() {
    }

    public HistorialHorario(LocalDateTime fechaHoraIni, LocalDateTime fechaHoraFin) {
        this.fechaHoraIni = fechaHoraIni;
        this.fechaHoraFin = fechaHoraFin;
    }

    public short getId_historial() {
        return id_historial;
    }

    public void setId_historial(short id_historial) {
        this.id_historial = id_historial;
    }

    public Persona getId_user() {
        return id_user;
    }

    public void setId_user(Persona id_user) {
        this.id_user = id_user;
    }

    public LocalDateTime getFechaHoraIni() {
        return fechaHoraIni;
    }

    public void setFechaHoraIni(LocalDateTime fechaHoraIni) {
        this.fechaHoraIni = fechaHoraIni;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }
    
}
