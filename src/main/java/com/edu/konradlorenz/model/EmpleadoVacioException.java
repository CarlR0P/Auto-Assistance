package com.edu.konradlorenz.model;
/*
 * @author linas
 */
public class EmpleadoVacioException extends Exception {
    
    public EmpleadoVacioException (String mensaje){
        super(mensaje);
    }
    
    public static void validarCampos(String nombreUser, String contra, String nombresApellidos, String numeroDoc, String correo, String telefono) throws EmpleadoVacioException {
        if (nombreUser.isEmpty() || contra.isEmpty() || nombresApellidos.isEmpty() || numeroDoc.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
            throw new EmpleadoVacioException("Todos los campos son obligatorios");
        }
    }
    
    public static void validarCampos(String nombreUser, String nombresApellidos, String numeroDoc, String correo, String telefono) throws EmpleadoVacioException {
        if (nombreUser.isEmpty() || nombresApellidos.isEmpty() || numeroDoc.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
            throw new EmpleadoVacioException("Todos los campos son obligatorios");
        }
    }
    
    public static void validarCampos(String contra) throws EmpleadoVacioException {        
        if (contra.isEmpty()) {
            throw new EmpleadoVacioException("La contraseña es obligatoria");
        }
    }

}