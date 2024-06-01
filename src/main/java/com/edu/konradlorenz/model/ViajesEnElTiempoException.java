
package com.edu.konradlorenz.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class ViajesEnElTiempoException extends Exception {

    public ViajesEnElTiempoException(String message) {
        super(message);
    }

    public static void viajeAlPasado (String hEntrada, String hSalida) throws ViajesEnElTiempoException{
        LocalTime horaEntrada = LocalTime.parse(hEntrada);
        LocalTime horaSalida = LocalTime.parse(hSalida);
        if (horaEntrada.isAfter(horaSalida)) {
        throw new ViajesEnElTiempoException("La hora inicial no puede ser posterior a la final");
        }
    }
    public static void viajeAlPasado (Date fechaInicial, Date fechaFinal) throws ViajesEnElTiempoException{
        LocalDate fechaIniLocal = fechaInicial.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
        LocalDate fechaFinLocal = fechaFinal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();  
        if (fechaIniLocal.isAfter(fechaFinLocal)) {
        throw new ViajesEnElTiempoException("La fecha inicial no puede ser posterior a la final");
    
        }

    }
    
}
