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
public class SectorPerteneciente {
    
    private int idSp;
    private String nombre,descripcion;

    public SectorPerteneciente() {
    }

    public SectorPerteneciente(int idSp, String nombre, String descripcion) {
        this.idSp = idSp;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdSp() {
        return idSp;
    }

    public void setIdSp(int idSp) {
        this.idSp = idSp;
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
