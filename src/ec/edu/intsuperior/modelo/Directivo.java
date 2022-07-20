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
public class Directivo  {
    public String ventas;
    public String tics;
    public String Secretaria;
    public String contabilidad;
    public String Bodega;
    public String limpieza;

    public Directivo() {
    }

    public Directivo(String ventas, String tics, String Secretaria, String contabilidad, String Bodega, String limpieza) {
        this.ventas = ventas;
        this.tics = tics;
        this.Secretaria = Secretaria;
        this.contabilidad = contabilidad;
        this.Bodega = Bodega;
        this.limpieza = limpieza;
    }

    public String getVentas() {
        return ventas;
    }

    public void setVentas(String ventas) {
        this.ventas = ventas;
    }

    public String getTics() {
        return tics;
    }

    public void setTics(String tics) {
        this.tics = tics;
    }

    public String getSecretaria() {
        return Secretaria;
    }

    public void setSecretaria(String Secretaria) {
        this.Secretaria = Secretaria;
    }

    public String getContabilidad() {
        return contabilidad;
    }

    public void setContabilidad(String contabilidad) {
        this.contabilidad = contabilidad;
    }

    public String getBodega() {
        return Bodega;
    }

    public void setBodega(String Bodega) {
        this.Bodega = Bodega;
    }

    public String getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(String limpieza) {
        this.limpieza = limpieza;
    }
    
  
    

    @Override
    public String toString() {
        return "la directiva existentes en la empresa son: \n "
                + "directiva bodega: " +getBodega()+"\n"
        + "directiva ventas: "+getVentas()+ "\n"
          + "directiva secretaria: " +getSecretaria()+ "\n"
          + "directiva contabilidad: " +getContabilidad()+ "\n"
          + "directiva limpieza: " +getLimpieza()+ "\n"
                + "directiva tics " +getTics();
                

       
        
    }

    
    }
