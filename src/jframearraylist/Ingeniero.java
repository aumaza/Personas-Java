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
public class Ingeniero extends Persona{
    //CONSTRUCTOR
    public Ingeniero(ArrayList nombre, ArrayList apellido, ArrayList dni, ArrayList edad, ArrayList email, ArrayList direccion) {
        super(nombre, apellido, dni, edad, email, direccion);
    }

    @Override
    public void ingresarNombre(String nombre) {
        super.nombre.add(nombre);
    }

    @Override
    public void ingresarApellido(String apellido) {
        super.apellido.add(apellido);
    }

    @Override
    public void ingresarDni(String dni) {
        super.dni.add(dni);
    }

    @Override
    public void ingresarEdad(int edad) {
        super.edad.add(edad);
    }

    @Override
    public void ingresarEmail(String email) {
        super.email.add(email);
    }

    @Override
    public void ingresarDireccion(String direccion) {
        super.direccion.add(direccion);
    }

    @Override
    public void eliminarNombre(String nombre) {
        super.nombre.remove(super.nombre.indexOf(nombre));
    }

    @Override
    public void eliminarApellido(String apellido) {
        super.apellido.remove(super.apellido.indexOf(apellido));
    }

    @Override
    public void eliminarDni(String dni) {
        super.dni.remove(super.dni.indexOf(dni));
    }

    @Override
    public void eliminarEdad(int edad) {
        super.edad.remove(super.edad.indexOf(edad));
    }

    @Override
    public void eliminarEmail(String email) {
        super.email.remove(super.email.indexOf(email));
    }

    @Override
    public void eliminarDirecccion(String direccion) {
        super.direccion.remove(super.direccion.indexOf(direccion));
    }

    @Override
    public String buscarNombre(String nombre) {
        String buscarNombre = "";
        
        if(super.nombre.contains(nombre) == true){
            
            buscarNombre = super.nombre.get(super.nombre.indexOf(nombre)).toString();
        }else{
            buscarNombre = "Nombre Inexistente";
        }
        return buscarNombre;
    }

    @Override
    public String buscarApellido(String apellido) {
        String buscarApellido = "";
        
        if(super.apellido.contains(apellido) == true){
            
            buscarApellido = super.apellido.get(super.apellido.indexOf(apellido)).toString();
        }else{
            buscarApellido = "Apellido Inexistente";
        }
        return buscarApellido;
    }

    @Override
    public String buscarDni(String dni) {
        String buscarDni = "";
        
        if(super.dni.contains(dni) == true){
            
            buscarDni = super.dni.get(super.dni.indexOf(dni)).toString();
        }else{
            
            buscarDni = "DNI Inexistente";
        }
        return buscarDni;
    }

    @Override
    public int buscarEdad(int edad) {
        int buscarEdad = 0;
        
        if(super.edad.contains(edad) == true){
            buscarEdad = Integer.parseInt(super.edad.get(super.edad.indexOf(edad)).toString());
        }else{
            buscarEdad = 0;
        }
        return buscarEdad;
    }

    @Override
    public String buscarEmail(String email) {
        String buscarEmail = "";
        
        if(super.email.contains(email) == true){
            buscarEmail = super.email.get(super.email.indexOf(email)).toString();
        }else{
            buscarEmail = "Email Inexistente";
        }
        return buscarEmail;
    }

    @Override
    public String buscarDireccion(String direccion) {
        String buscarDireccion = "";
        
        if(super.direccion.contains(direccion) == true){
            
            buscarDireccion = super.direccion.get(super.direccion.indexOf(direccion)).toString();
        }else{
            buscarDireccion = "Direccion Inexistente";
        }
        return buscarDireccion;
    }
    
    
    
}
