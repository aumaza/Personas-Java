/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframearraylist;

import java.util.ArrayList;

/**
 *
 * @author aumaza_mecon
 */
public abstract class Persona {
    //ATRIBUTOS
    ArrayList nombre;
    ArrayList apellido;
    ArrayList dni;
    ArrayList edad;
    ArrayList email;
    ArrayList direccion;
        
    //CONSTRUCTOR
    public Persona(ArrayList nombre, ArrayList apellido, ArrayList dni, ArrayList edad, ArrayList email, ArrayList direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.email = email;
        this.direccion = direccion;
    }
    
    //SETTERS AND GETTERS

    public ArrayList getNombre() {
        return nombre;
    }

    public void setNombre(ArrayList nombre) {
        this.nombre = nombre;
    }

    public ArrayList getApellido() {
        return apellido;
    }

    public void setApellido(ArrayList apellido) {
        this.apellido = apellido;
    }

    public ArrayList getDni() {
        return dni;
    }

    public void setDni(ArrayList dni) {
        this.dni = dni;
    }

    public ArrayList getEdad() {
        return edad;
    }

    public void setEdad(ArrayList edad) {
        this.edad = edad;
    }

    public ArrayList getEmail() {
        return email;
    }

    public void setEmail(ArrayList email) {
        this.email = email;
    }

    public ArrayList getDireccion() {
        return direccion;
    }

    public void setDireccion(ArrayList direccion) {
        this.direccion = direccion;
    }
    
    //METODOS
    public abstract void ingresarNombre(String nombre);
    public abstract void ingresarApellido(String apellido);
    public abstract void ingresarDni(String dni);
    public abstract void ingresarEdad(int edad);
    public abstract void ingresarEmail(String email);
    public abstract void ingresarDireccion(String direccion);
    
    public abstract void eliminarNombre(String nombre);
    public abstract void eliminarApellido(String apellido);
    public abstract void eliminarDni(String dni);
    public abstract void eliminarEdad(int edad);
    public abstract void eliminarEmail(String email);
    public abstract void eliminarDirecccion(String direccion);
    
    public abstract String buscarNombre(String nombre);
    public abstract String buscarApellido(String nombre);
    public abstract String buscarDni(String dni);
    public abstract int buscarEdad(int edad);
    public abstract String buscarEmail(String email);
    public abstract String buscarDireccion(String direccion);
    
    
}
