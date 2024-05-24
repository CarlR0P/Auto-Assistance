package com.edu.konradlorenz.model;
/*
 * @author linas
 */
public class NoLeenException extends Exception {
    
    public NoLeenException (String mensaje){
        super(mensaje);
    }
    
    public static void validarTextos(String texto) throws NoLeenException {
        if (!texto.matches("[a-zA-Z ]+")) {
            throw new NoLeenException("El campo de Nombres y Apellidos no puede tener numeros.");
        }
    }
    
    public static void validarCorreo(String correo) throws NoLeenException {
        if (!correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new NoLeenException("El correo electrónico ingresado no es válido.");
        }
    }
    
    public static void validarNumeros(String numero)throws NoLeenException{
        if (!numero.matches("\\d+")) {
            throw new NoLeenException("El campo debe contener solo dígitos.");
        }
    }
    
}