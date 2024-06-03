package com.edu.konradlorenz.model;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-06-03T18:35:46", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Empleado.class)
public class Empleado_ extends Persona_ {

    public static volatile SingularAttribute<Empleado, LocalDate> fechaInicial;
    public static volatile SingularAttribute<Empleado, Integer> calificacion;
    public static volatile SingularAttribute<Empleado, LocalTime> horaEntrada;
    public static volatile SingularAttribute<Empleado, LocalDate> fechaFinal;
    public static volatile SingularAttribute<Empleado, LocalTime> horaSalida;

}