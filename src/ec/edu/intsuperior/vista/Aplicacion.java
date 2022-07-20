/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Directivo;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Empresa;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;

/**
 *
 * @author grace
 */
public class Aplicacion {
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        Persona p1=new Persona();
        Empleado em=new Empleado ();
        Empresa emp= new Empresa();
        Cliente cli = new Cliente();
        Directivo dr=new Directivo();
        
        
        
       
        System.out.println("ingrese los adatos correspondientes :");
        System.out.println("");
        System.out.println("ingrese el nombre de la empresa :");
        emp.setNombreEmpresa(leer.next());
        System.out.println("");
        System.out.println("ingrese datos de los empleados :");
        System.out.println("ingrese el primer nombre :");
        em.setNombre1(leer.next());
        System.out.println("ingrese el segundo nombre :");
        em.setNombre2(leer.next());
        System.out.println("ingrese el primer apellido :");
        em.setApellido1(leer.next());
        System.out.println("ingrese el segundo apellido:");
        em.setApellido2(leer.next());
        
        System.out.println("Ingrese los datos de la directiva de la empresa : ");
        
        System.out.println("el bodegero de la empresa es: ");
        dr.setBodega(leer.next());
        System.out.println("el secretario de la empresa es: ");
        dr.setSecretaria(leer.next());
        System.out.println("el encargado de la limpieza de la empresa es: ");
        dr.setLimpieza(leer.next());
        System.out.println("el encargado de ña contabilidad de la empresa es: ");
        dr.setContabilidad(leer.next());
        System.out.println("el encargado de ventas de la empresa es: ");
        dr.setVentas(leer.next());
        System.out.println("el representante de las tics de la empresa es: ");
        dr.setTics(leer.next());
        
        System.out.println("Los datos de clientes de la empresa: ");
        
        System.out.println("ingrese el primer nombre del cliente: ");
        cli.setNombre1(leer.next());
        System.out.println("ingrese el segundo nombre del cliente: ");
        cli.setNombre2(leer.next());
        System.out.println("ingrese el primer apellido del cliente: ");
        cli.setApellido1(leer.next());
        System.out.println("ingrese el segundo apellido del cliente: ");
        cli.setApellido2(leer.next());
        System.out.println("ingrese el numero de cedula del cliente :");
        cli.setCidentidad(leer.next());
        System.out.println("ingrese el telefono de contacto del cliente: ");
        cli.setTelefonoContactoCliente(leer.next());
        
        System.out.println("los datos de la empresa son :" );
        System.out.println("el nombre de la empresa es:" +emp );
        System.out.println("los datos del empleado son: " );
        System.out.println("nombres y apellidos: " +em);
        System.out.println("los datos de la directiva son:");
        System.out.println("bodegero"+dr);
        System.out.println("los datos del cliente es: "+cli);
 
        
        
}
}