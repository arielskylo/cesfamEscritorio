/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Skylo
 */
public class Nivel {
    
    private int idNvl;
    private String nombre,descripcion;

    public Nivel() {
    }

    public Nivel(int idNvl, String nombre, String descripcion) {
        this.idNvl = idNvl;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdNvl() {
        return idNvl;
    }

    public void setIdNvl(int idNvl) {
        this.idNvl = idNvl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
