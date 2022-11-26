package com.venta.venta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre",nullable = false)
    private String nombre;
    @Column(name = "apellido",nullable = false)
    private String apellido;
    @Column(name = "celular",nullable = false)
    private String  celular;
    @Column(name = "telefono",nullable = false)
    private String telefono;
    @Column(name = "email",nullable = false)
    private String email;

        
	public Persona() {
    }

    

   


    public Persona(long id, String nombre, String apellido, String celular, String telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.telefono = telefono;
        this.email = email;
    }






    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }






    public String getCelular() {
        return celular;
    }






    public void setCelular(String celular) {
        this.celular = celular;
    }






    public String getTelefono() {
        return telefono;
    }






    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }






    public String getEmail() {
        return email;
    }






    public void setEmail(String email) {
        this.email = email;
    }



	
	
}
