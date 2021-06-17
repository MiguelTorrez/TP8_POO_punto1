
package com.raul.crudraul.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class personal {
    @Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dni;
        private int idservicio;
	private String apellido;
	private String nombre;
        private String funcion;
        private String revista;
        private String escalafon;
        private String foto;
        private char estado;
        private int idhorario;

    public personal() {
    }

    public personal(int dni, int idservicio, String apellido, String nombre, String funcion, String revista, String escalafon, String foto, char estado, int idhorario) {
        this.dni = dni;
        this.idservicio = idservicio;
        this.apellido = apellido;
        this.nombre = nombre;
        this.funcion = funcion;
        this.revista = revista;
        this.escalafon = escalafon;
        this.foto = foto;
        this.estado = estado;
        this.idhorario = idhorario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getRevista() {
        return revista;
    }

    public void setRevista(String revista) {
        this.revista = revista;
    }

    public String getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(String escalafon) {
        this.escalafon = escalafon;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(int idhorario) {
        this.idhorario = idhorario;
    }
    
        
}
