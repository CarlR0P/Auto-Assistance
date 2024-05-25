package com.edu.konradlorenz.model;

import java.sql.Date;
import java.time.LocalTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-25T08:36:46", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Empleado.class)
public class Empleado_ extends Persona_ {

    public static volatile SingularAttribute<Empleado, Date> fechaInicial;
    public static volatile SingularAttribute<Empleado, Integer> calificacion;
    public static volatile SingularAttribute<Empleado, LocalTime> horaEntrada;
    public static volatile SingularAttribute<Empleado, Date> fechaFinal;
    public static volatile SingularAttribute<Empleado, LocalTime> horaSalida;

}