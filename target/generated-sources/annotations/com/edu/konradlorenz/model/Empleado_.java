package com.edu.konradlorenz.model;

import com.edu.konradlorenz.model.Horario;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-17T14:39:31", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Empleado.class)
public class Empleado_ extends Persona_ {

    public static volatile SingularAttribute<Empleado, Integer> calificacion;
    public static volatile SingularAttribute<Empleado, Horario> horario;

}