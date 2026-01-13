/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "pagos")
public class Pago implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "socio_id", nullable = false)
    private Socio socio;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false, precision = 8, scale = 2)
    private BigDecimal importe;

    @Column(nullable = false, length = 30)
    private String concepto;

    public Pago() {}

    public Long getId() { return id; }

    public Socio getSocio() { return socio; }
    public void setSocio(Socio socio) { this.socio = socio; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public BigDecimal getImporte() { return importe; }
    public void setImporte(BigDecimal importe) { this.importe = importe; }

    public String getConcepto() { return concepto; }
    public void setConcepto(String concepto) { this.concepto = concepto; }
}


