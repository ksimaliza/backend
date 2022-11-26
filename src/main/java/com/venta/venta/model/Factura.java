package com.venta.venta.model;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "emisor", nullable = false)
    private String emisor;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "valor", nullable = true)
    private double valor;

    @Column(name = "fecha", nullable = true)
    private Date fecha;

    public Factura() {
    }
 
    


    public Factura(long id, String emisor, String descripcion, double valor, Date fecha) {
        this.id = id;
        this.emisor = emisor;
        this.descripcion = descripcion;
        this.valor = valor;
        this.fecha = fecha;
    }




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    

}
