/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author grace
 */


public class Persona {
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String cidentidad;
    private String telefonomovil;
    private String edad;
    private String direccion;

    public Persona() {
    }

    public Persona(String nombre1, String nombre2, String apellido1, String apellido2, String cidentidad, String telefonomovil, String edad, String direccion) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cidentidad = cidentidad;
        this.telefonomovil = telefonomovil;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCidentidad() {
        return cidentidad;
    }

    public void setCidentidad(String cidentidad) {
        this.cidentidad = cidentidad;
    }

    public String getTelefonomovil() {
        return telefonomovil;
    }

    public void setTelefonomovil(String telefonomovil) {
        this.telefonomovil = telefonomovil;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

   
    @Override
    public String toString() {
        
        return "los datos de una persona son: \n "
                + "Cedula: "+getCidentidad()+"\n"
                + "Apellidos y Nombres: "+getApellido1()+" "+getApellido2()+
                " "+getNombre1()+" "+getNombre2()+"\n"
                + "Direccion: "+getDireccion()+"\n"
                + "Celular: " +getTelefonomovil()+"\n"
                + "Edad persona: "+getEdad();
}
}
