package com.edu.konradlorenz.model;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-29T13:19:44", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Empleado.class)
public class Empleado_ extends Persona_ {

    public static volatile SingularAttribute<Empleado, LocalDate> fechaInicial;
    public static volatile SingularAttribute<Empleado, Integer> calificacion;
    public static volatile SingularAttribute<Empleado, LocalTime> horaEntrada;
    public static volatile SingularAttribute<Empleado, LocalDate> fechaFinal;
    public static volatile SingularAttribute<Empleado, String> registroLabor;
    public static volatile SingularAttribute<Empleado, LocalTime> horaSalida;

}