package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Abono;
import model.Pago;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2026-01-13T19:21:06", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Socio.class)
public class Socio_ { 

    public static volatile SingularAttribute<Socio, LocalDate> fechaAlta;
    public static volatile SingularAttribute<Socio, Long> id;
    public static volatile SingularAttribute<Socio, BigDecimal> cuotaMensual;
    public static volatile ListAttribute<Socio, Abono> abonos;
    public static volatile SingularAttribute<Socio, String> nombre;
    public static volatile ListAttribute<Socio, Pago> pagos;
    public static volatile SingularAttribute<Socio, String> dni;
    public static volatile SingularAttribute<Socio, String> email;

}