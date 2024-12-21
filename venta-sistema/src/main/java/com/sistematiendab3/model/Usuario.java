package com.sistematiendab3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuarios")

public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
@Column(nullable = false)

private String rol;
private boolean activo;

private String nombre_usuario;
@Column(nullable = false, unique = true)

private String email;
@Column(nullable = false)

private String password;
@Column(nullable = false)

private String telefono;

public Usuario() {
	super();
}

public Usuario(Long id, String rol, boolean activo, String nombre_usuario, String email, String password,
		String telefono) {
	super();
	this.id = id;
	this.rol = rol;
	this.activo = activo;
	this.nombre_usuario = nombre_usuario;
	this.email = email;
	this.password = password;
	this.telefono = telefono;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getRol() {
	return rol;
}

public void setRol(String rol) {
	this.rol = rol;
}

public boolean isActivo() {
	return activo;
}

public void setActivo(boolean activo) {
	this.activo = activo;
}

public String getNombre_usuario() {
	return nombre_usuario;
}

public void setNombre_usuario(String nombre_usuario) {
	this.nombre_usuario = nombre_usuario;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

}
