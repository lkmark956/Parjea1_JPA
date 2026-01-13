package model;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Socio;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2026-01-13T19:21:06", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Abono.class)
public class Abono_ { 

    public static volatile SingularAttribute<Abono, String> zona;
    public static volatile SingularAttribute<Abono, BigDecimal> precio;
    public static volatile SingularAttribute<Abono, Integer> numero;
    public static volatile SingularAttribute<Abono, Socio> socio;
    public static volatile SingularAttribute<Abono, Integer> fila;
    public static volatile SingularAttribute<Abono, Long> id;
    public static volatile SingularAttribute<Abono, Integer> asiento;
    public static volatile SingularAttribute<Abono, Boolean> activo;

}