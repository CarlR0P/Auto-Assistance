package com.edu.konradlorenz.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.OneToMany;

@Entity
@Table(name = "persona")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "ROL", discriminatorType = DiscriminatorType.STRING)
public abstract class Persona implements Serializable {
    
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;   
    private String nombreUsuario;
    private String nombre;   
    private String contrasena;     
    private String tipoDocumento;  
    private long numeroDocumento;  
    private String correo;  
    private long telefono;  
    private long salario;
    @Column(name = "ROL", insertable = false, updatable = false)
    private String rol;
    @OneToMany(mappedBy = "id_user", cascade = CascadeType.ALL)
    private Set<HistorialHorario> historialHorarios;
    
    public Persona () {
    }

    public Persona(String nombreUsuario, String nombre, String contrasena, String tipoDocumento, long numeroDocumento, String correo, long telefono) {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.correo = correo;
        this.telefono = telefono;
  
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Set<HistorialHorario> getHistorialHorarios() {
        return historialHorarios;
    }

    public void setHistorialHorarios(Set<HistorialHorario> historialHorarios) {
        this.historialHorarios = historialHorarios;
    }
    
    public abstract void iniciarSesion();
    
}
