package com.edu.konradlorenz.model;

import com.edu.konradlorenz.model.Persona;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-25T08:36:46", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(HistorialHorario.class)
public class HistorialHorario_ { 

    public static volatile SingularAttribute<HistorialHorario, Short> id_historial;
    public static volatile SingularAttribute<HistorialHorario, LocalDateTime> fechaHoraIni;
    public static volatile SingularAttribute<HistorialHorario, Persona> id_user;
    public static volatile SingularAttribute<HistorialHorario, LocalDateTime> fechaHoraFin;

}