package com.agendasample.model;

import java.io.Serializable;

public class Person implements Serializable{
  private int dni;
  private String nombre;
  private boolean sexo;
  
  public Person(int dni, String nombre, boolean sexo) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	this.sexo = sexo;
  }

  public Integer getDni() {
	return this.dni;
  }

  public void setDni(int dni) {
	this.dni = dni;
  }

  public String getNombre() {
	return nombre;
  }

  public void setNombre(String nombre) {
	this.nombre = nombre;
  }

  public boolean isSexo() {
	return sexo;
  }

  public void setSexo(boolean sexo) {
	this.sexo = sexo;
  }
}
