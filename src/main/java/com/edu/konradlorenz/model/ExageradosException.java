package com.edu.konradlorenz.model;
/*
 * @author linas
 */
public class ExageradosException extends Exception {

    public ExageradosException(String message) {
        super(message);
    }
    
    public static void validarTelefono(String telefono) throws ExageradosException {     
        if (telefono.length() != 10) {
            throw new ExageradosException("El número de teléfono debe tener 10 dígitos.");
        }
    }

    public static void validarNumeroDocumento(String numeroDoc) throws ExageradosException {
        if (numeroDoc.length() < 8 || numeroDoc.length() > 10) {
            throw new ExageradosException("El número de documento debe tener entre 8 y 10 digitos.");
        }
    }
    
    public static void validarContrasena(String contra) throws ExageradosException {
        if (contra.length() <= 6) {
            throw new ExageradosException("La contraseña debe tener más de 6 dígitos.");
        }
    }
    
    public static void validarSalario(long salario) throws ExageradosException {
        if (salario <= 0) {
            throw new ExageradosException("El número contiene más de 10 dígitos.");
        }
    }
    
}