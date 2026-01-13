package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Socio;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2026-01-13T19:21:06", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, LocalDate> fecha;
    public static volatile SingularAttribute<Pago, Socio> socio;
    public static volatile SingularAttribute<Pago, String> concepto;
    public static volatile SingularAttribute<Pago, Long> id;
    public static volatile SingularAttribute<Pago, BigDecimal> importe;

}