package com.edu.konradlorenz.model;

import com.edu.konradlorenz.model.Rol;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-13T14:43:01", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Persona.class)
public abstract class Persona_ { 

    public static volatile SingularAttribute<Persona, String> tipoDocumento;
    public static volatile SingularAttribute<Persona, String> correo;
    public static volatile SingularAttribute<Persona, Integer> salario;
    public static volatile SingularAttribute<Persona, String> contrasena;
    public static volatile SingularAttribute<Persona, Integer> id_user;
    public static volatile SingularAttribute<Persona, Integer> numeroDocumento;
    public static volatile SingularAttribute<Persona, Integer> telefono;
    public static volatile SingularAttribute<Persona, String> nombre;
    public static volatile SingularAttribute<Persona, Rol> rol;

}