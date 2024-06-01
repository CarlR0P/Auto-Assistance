
package com.edu.konradlorenz.model;

import com.edu.konradlorenz.persistence.ControladorPersistencia;
import java.time.LocalDateTime;
import java.util.List;



public class TrampososException extends Exception{
    
    private ControladorPersistencia controladorPersistencia;
    
    public TrampososException(String message) {
        super(message);
    }
   
    public TrampososException(ControladorPersistencia controladorPersistencia) {
        this.controladorPersistencia = controladorPersistencia;
    }
    
    public void verificarLlegadaE(Persona persona, LocalDateTime llegada) throws TrampososException {
        if (verificarUltimoRegistro(persona)) {
            throw new TrampososException("Su hora de llegada de hoy ya fue registrada.");
        }
    }

    public void verificarLlegadaS(short id) throws TrampososException {
        if (verificarUltimoRegistro(id)) {
            throw new TrampososException("Su hora de salida de hoy ya fue registrada.");
        }
    }

    public boolean verificarUltimoRegistro(Persona persona) {
        LocalDateTime ultimaEntrada = controladorPersistencia.obtenerFechaUltimaEntradaDesdeBaseDeDatos(persona);
        LocalDateTime ahora = LocalDateTime.now();
        
        return ultimaEntrada != null && ultimaEntrada.toLocalDate().isEqual(ahora.toLocalDate());
    }
    public boolean verificarUltimoRegistro(short id_historial) {
    LocalDateTime ultimaSalida = controladorPersistencia.obtenerFechaUltimaSalidaDesdeBaseDeDatos(id_historial);
    LocalDateTime ahora = LocalDateTime.now();
    
    return ultimaSalida != null && ultimaSalida.toLocalDate().isEqual(ahora.toLocalDate());
}

}
