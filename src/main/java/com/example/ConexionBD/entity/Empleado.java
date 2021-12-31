package com.example.ConexionBD.entity;

import javax.persistence.*;

@Entity
@Table(name="Empleados")
public class Empleado {

	@Id
    @GeneratedValue
    private Integer id;
	
	private String nombre;
	private String apellido;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id=id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	
	
}
