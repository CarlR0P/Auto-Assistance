package com.edu.konradlorenz.controller;

import com.edu.konradlorenz.persistence.ControladorPersistencia;
import com.edu.konradlorenz.view.*;
import com.edu.konradlorenz.model.*;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Controlador {
    
    ControladorPersistencia controlPersistencia;
    Persona objPerson;
    Empleado objEmpleado;
    HistorialHorario objHistorialHorario;
    
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
    
    public List<Persona> traerEmpleados() {
        return controlPersistencia.traerEmpleados();
    }
    
    private short buscarUltimoIdUsuario() {
        List <Persona> listaUsuarios = this.traerUsuarios();       
        Persona perso = listaUsuarios.get(listaUsuarios.size()-1);        
        return perso.getId();
    }
    
    private void setearDatosPersona(String nombreUser, String nombresApellidos, String tipoDoc, String numeroDoc, String correo, String telefono) {   
        objPerson.setNombreUsuario(nombreUser);
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
            setearDatosPersona(nombreUser, nombresApellidos, tipoDoc, numeroDoc, correo, telefono);
            objPerson.setContrasena(contra);  
            objPerson.setRol(rol);       
            short id = this.buscarUltimoIdUsuario();
            objPerson.setId((short) (id+1));
            controlPersistencia.crearUsuario(objPerson);
    }
    
    public void editarUsuario(Persona person, String nombreUser, String nombresApellidos, String tipoDoc, String numeroDoc, String correo, String telefono, String rol) throws EmpleadoVacioException  {        
        
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
                setearDatosPersona(nombreUser, nombresApellidos, tipoDoc, numeroDoc, correo, telefono);
                person.setContrasena("Colombia123");
                person.setRol(rol);
                controlPersistencia.crearUsuario(person);
            } else {
                objPerson = person;
                setearDatosPersona(nombreUser, nombresApellidos, tipoDoc, numeroDoc, correo, telefono);
                controlPersistencia.editarUsuario(person);
            }
        } catch (NumberFormatException e) {
        e.printStackTrace(); 
        }
        
    }

    public void eliminarUsuario(short id_usuario) {
        controlPersistencia.eliminarUsuario(id_usuario);
    }    
    
    public void cambiarContra(Persona person, String contrasena) {
        objPerson = person;
        objPerson.setContrasena(contrasena);
        controlPersistencia.editarUsuario(person);
    }

    public void crearHorario(short id_user, Date fecha_sqlIni, Date fecha_sqlFin, LocalTime horaEntrada, LocalTime horaSalida) {
        
        
        
    }

    public void editarHorario(short id_user, Date fecha_sqlIni, Date fecha_sqlFin, LocalTime horaEntrada, LocalTime horaSalida) {
        
        
        
    }

    public void registrarLlegada(Persona person, LocalDateTime llegada) {
        
        objHistorialHorario = new HistorialHorario();
        objHistorialHorario.setFechaHoraIni(llegada);
        objHistorialHorario.setId_user(person);
        controlPersistencia.crearRegistroHorario(objHistorialHorario);
    }

    public void registrarSalida(short person, LocalDateTime salida) {
        
        controlPersistencia.editarRegistroHorario(objHistorialHorario);
    }

    public void registrarLabores(String labores) {
        
        
        
    }

}