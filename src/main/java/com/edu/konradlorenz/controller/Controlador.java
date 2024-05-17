package com.edu.konradlorenz.controller;

import com.edu.konradlorenz.persistence.ControladorPersistencia;
import com.edu.konradlorenz.view.*;
import com.edu.konradlorenz.model.*;
import java.util.List;

public class Controlador {
    
    ControladorPersistencia controlPersistencia;
    Persona objPerson;
    
    public Controlador () {       
        controlPersistencia = new ControladorPersistencia();   
    }

    public void funcionar() {       
        VentanaPrincipal ventaPrinc = new VentanaPrincipal();  
        ventaPrinc.setLocationRelativeTo(null);
        ventaPrinc.setVisible(true);
    }

    public Persona validarUsuario(String usuario, String contrasena) {        
        List<Persona> listaUsuarios = controlPersistencia.traerUsuarios();     
        Persona person = null;        
        for (Persona usu : listaUsuarios) {
            if (usu.getNombreUsuario().equals(usuario)) {
                if(usu.getContrasena().equals(contrasena)){
                    person = usu;
                    return person;
                } else {
                    person = null;
                    return person;
                } 
            } else {               
                person = null;
            }
        }        
        return person;
    }

    public List<Persona> traerUsuarios() {
        return controlPersistencia.traerUsuarios();
    }
    
    public Persona traerUsuario(short id_user) {
        return controlPersistencia.traerUsuario(id_user);
    }

    public void eliminarUsuario(int id_usuario) {
        controlPersistencia.eliminarUsuario(id_usuario);
    }
    
    private short buscarUltimoIdUsuario() {
        List <Persona> listaUsuarios = this.traerUsuarios();       
        Persona perso = listaUsuarios.get(listaUsuarios.size()-1);        
        return perso.getId();
    }
    
    private void setearDatosPersona(String nombreUser, String contra, String nombresApellidos, String tipoDoc, String numeroDoc, String correo, String telefono) {   
        objPerson.setNombreUsuario(nombreUser);
        objPerson.setContrasena(contra);
        objPerson.setNombre(nombresApellidos);
        objPerson.setTipoDocumento(tipoDoc);
        objPerson.setNumeroDocumento(Long.parseLong(numeroDoc));  // Asegúrate de manejar la conversión de String a long adecuadamente
        objPerson.setCorreo(correo);
        objPerson.setTelefono(Long.parseLong(telefono));
    } 
   
    public void crearUsuario(String nombreUser, String contra, String nombresApellidos, String tipoDoc, String numeroDoc, String correo, String telefono, String rol) {
        
        if (rol.equals("administrador")) {
            objPerson = new Administrador();
        } else if (rol.equals("empleado")) {
            objPerson = new Empleado();
        }
            setearDatosPersona(nombreUser, contra, nombresApellidos, tipoDoc, numeroDoc, correo, telefono);
            objPerson.setRol(rol);       
            short id = this.buscarUltimoIdUsuario();
            objPerson.setId((short) (id+1));
            controlPersistencia.crearUsuario(objPerson);
    }
    
    public void editarUsuario(Persona person, String nombreUser, String contra, String nombresApellidos, String tipoDoc, String numeroDoc, String correo, String telefono, String rol) {        
        try {     
        short originalId = person.getId();
            if (!person.getRol().equals(rol)) {
                controlPersistencia.eliminarUsuario(person);          
                if (rol.equals("administrador")) {
                    person = new Administrador();
                } else if (rol.equals("empleado")) {
                    person = new Empleado();
                } else {
                    throw new IllegalArgumentException("Rol no válido: " + rol);
                }
                person.setId(originalId);
                objPerson = person;
                setearDatosPersona(nombreUser, contra, nombresApellidos, tipoDoc, numeroDoc, correo, telefono);           
                person.setRol(rol);
                controlPersistencia.crearUsuario(person);
            } else {
                objPerson = person;
                setearDatosPersona(nombreUser, contra, nombresApellidos, tipoDoc, numeroDoc, correo, telefono);
                controlPersistencia.editarUsuario(person);
            }
        } catch (NumberFormatException e) {
        e.printStackTrace(); // Manejo adecuado de la excepción
        }
    }    

}
