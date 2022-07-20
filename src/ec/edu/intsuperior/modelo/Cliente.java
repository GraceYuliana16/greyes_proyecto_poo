/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author jonat
 */
public class Cliente extends Persona{
    public String telefonoContactoCliente;

    public Cliente() {
    }

    public Cliente(String telefonoContactoCliente, String nombre1, String nombre2, String apellido1, String apellido2, String cidentidad, String telefonomovil, String edad, String direccion) {
        super(nombre1, nombre2, apellido1, apellido2, cidentidad, telefonomovil, edad, direccion);
        this.telefonoContactoCliente = telefonoContactoCliente;
    }

    public String getTelefonoContactoCliente() {
        return telefonoContactoCliente;
    }

    public void setTelefonoContactoCliente(String telefonoContactoCliente) {
        this.telefonoContactoCliente = telefonoContactoCliente;
    }
    @Override
    public String toString() {
        return   "los datos del cliente son: "
                +"Cedula: "+getCidentidad()+"\n"
                + "Apellidos y Nombres: "+getApellido1()+" "+getApellido2()+
                " "+getNombre1()+" "+getNombre2()+"\n"
                + "Direccion: "+getDireccion()+"\n"
                + "Edad: "+getEdad()+"\n"
                + "el telefono de contacto del cliente es : " +getTelefonoContactoCliente();
        
        
}
}