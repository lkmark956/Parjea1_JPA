package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(
    name = "socios",
    uniqueConstraints = {
        @UniqueConstraint(columnNames = "dni"),
        @UniqueConstraint(columnNames = "email")
    }
)
public class Socio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 12)
    private String dni;

    @Column(nullable = false, length = 80)
    private String nombre;

    @Column(nullable = false, length = 120)
    private String email;

    @Column(name = "fecha_alta", nullable = false)
    private LocalDate fechaAlta;

    @Column(name = "cuota_mensual", nullable = false, precision = 8, scale = 2)
    private BigDecimal cuotaMensual;

    @OneToMany(mappedBy = "socio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Abono> abonos = new ArrayList<>();

    @OneToMany(mappedBy = "socio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pago> pagos = new ArrayList<>();

    public Socio() {}

    public Long getId() { return id; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDate getFechaAlta() { return fechaAlta; }
    public void setFechaAlta(LocalDate fechaAlta) { this.fechaAlta = fechaAlta; }

    public BigDecimal getCuotaMensual() { return cuotaMensual; }
    public void setCuotaMensual(BigDecimal cuotaMensual) { this.cuotaMensual = cuotaMensual; }

    public List<Abono> getAbonos() { return abonos; }
    public void setAbonos(List<Abono> abonos) { this.abonos = abonos; }

    public List<Pago> getPagos() { return pagos; }
    public void setPagos(List<Pago> pagos) { this.pagos = pagos; }
}
