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

public class Empleado extends Persona{
public String nombredeEmpleado;
public String sueldoBruto;
    

    public Empleado() {
    }

    public Empleado(String nombredeEmpleado, String sueldoBruto, String nombre1, String nombre2, String apellido1, String apellido2, String cidentidad, String telefonomovil, String edad, String direccion) {
        super(nombre1, nombre2, apellido1, apellido2, cidentidad, telefonomovil, edad, direccion);
        this.nombredeEmpleado = nombredeEmpleado;
        this.sueldoBruto = sueldoBruto;
    }

    public String getNombredeEmpleado() {
        return nombredeEmpleado;
    }

    public void setNombredeEmpleado(String nombredeEmpleado) {
        this.nombredeEmpleado = nombredeEmpleado;
    }

    public String getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(String sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

   
   

   



    @Override
    public String toString() {
        return  "el nombre del empleado es :" +getNombredeEmpleado()
        + "el numero de cedula del empleado es :" +getCidentidad()+"\n"
        +"el suledo bruto del empleado es: "+getSueldoBruto()+"\n";
              
      
        
    }
    
    }
      
