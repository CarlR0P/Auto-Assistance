package com.edu.konradlorenz.model;

public abstract class Persona {
    
    private String nombre;
    
    private int id;
    
    private String tipoDocumento;
    
    private int cedula;
    
    private String correo;
    
    private int telefono;
    
    private int salario;

    public Persona () {
    }

    public Persona(String nombre, int id, String tipoDocumento, int cedula, String correo, int telefono, int salario) {
        this.nombre = nombre;
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", id=" + id + ", tipoDocumento=" + tipoDocumento + ", cedula=" + cedula + ", correo=" + correo + ", telefono=" + telefono + ", salario=" + salario + '}';
    }
    
    public String registrarUsuario() {
        return " ";
    }
    
    public abstract void iniciarSesion();

}
