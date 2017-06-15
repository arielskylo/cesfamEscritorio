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
public class Cargo {
    
    private int idCu;
    private String nombre,descripcion;
    private int nivelId;

    public Cargo() {
    }

    public Cargo(int idCu, String nombre, String descripcion, int nivelId) {
        this.idCu = idCu;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivelId = nivelId;
    }

    public int getIdCu() {
        return idCu;
    }

    public void setIdCu(int idCu) {
        this.idCu = idCu;
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

    public int getNivelId() {
        return nivelId;
    }

    public void setNivelId(int nivelId) {
        this.nivelId = nivelId;
    }
    
    
    
    
}
