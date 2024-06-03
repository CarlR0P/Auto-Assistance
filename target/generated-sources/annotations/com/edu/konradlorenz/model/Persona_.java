package com.edu.konradlorenz.model;

import com.edu.konradlorenz.model.HistorialHorario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-03T18:35:46", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Persona.class)
public abstract class Persona_ { 

    public static volatile SingularAttribute<Persona, String> tipoDocumento;
    public static volatile SingularAttribute<Persona, String> correo;
    public static volatile SingularAttribute<Persona, Long> salario;
    public static volatile SingularAttribute<Persona, String> contrasena;
    public static volatile SingularAttribute<Persona, Short> id;
    public static volatile SingularAttribute<Persona, String> nombreUsuario;
    public static volatile SingularAttribute<Persona, Long> numeroDocumento;
    public static volatile SingularAttribute<Persona, Long> telefono;
    public static volatile SingularAttribute<Persona, String> nombre;
    public static volatile SingularAttribute<Persona, String> rol;
    public static volatile SetAttribute<Persona, HistorialHorario> historialHorarios;

}