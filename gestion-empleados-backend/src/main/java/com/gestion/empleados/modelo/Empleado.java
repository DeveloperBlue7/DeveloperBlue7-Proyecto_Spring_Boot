package com.gestion.empleados.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre", length = 60, nullable = false)
	private String nombre;

	@Column(name = "apellido", length = 60, nullable = false)
	private String apellido;

	@Column(name = "cargo", length = 60, nullable = false)
	private String cargo;

	@Column(name = "celular", length = 60, nullable = false)
	private String celular;

	@Column(name = "direccion", length = 60, nullable = false)
	private String direccion;

	@Column(name = "email", length = 60, nullable = false)
	private String email;

	public Empleado() {

	}

	public Empleado(Long id, String nombre, String apellido, String cargo, String celular, String direccion,
			String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
		this.celular = celular;
		this.direccion = direccion;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
