/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;


public class Empresa {
    public String nombreEmpresa;

    public Empresa() {
    }

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

  
   

   
 

            
    @Override
    public String toString() {
        return "los datos de la empresa son : \n "
                + "nombre: " +getNombreEmpresa();
                
    }
}