/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table(name = "abonos",
       uniqueConstraints = @UniqueConstraint(columnNames = "numero"))
public class Abono implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false, length = 30)
    private String zona;

    private Integer fila;
    private Integer asiento;

    @Column(nullable = false, precision = 8, scale = 2)
    private BigDecimal precio;

    @Column(nullable = false)
    private boolean activo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "socio_id", nullable = false)
    private Socio socio;

    public Abono() {}

    public Long getId() { return id; }

    public Integer getNumero() { return numero; }
    public void setNumero(Integer numero) { this.numero = numero; }

    public String getZona() { return zona; }
    public void setZona(String zona) { this.zona = zona; }

    public Integer getFila() { return fila; }
    public void setFila(Integer fila) { this.fila = fila; }

    public Integer getAsiento() { return asiento; }
    public void setAsiento(Integer asiento) { this.asiento = asiento; }

    public BigDecimal getPrecio() { return precio; }
    public void setPrecio(BigDecimal precio) { this.precio = precio; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    public Socio getSocio() { return socio; }
    public void setSocio(Socio socio) { this.socio = socio; }
}
