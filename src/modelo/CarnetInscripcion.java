/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Skylo
 */
public class CarnetInscripcion {
    
    private int idCi;
    private Date fechaInscripcion,fechaCreacion;
    private String Prut;
    private int idSp;

    public CarnetInscripcion() {
    }

    public CarnetInscripcion(int idCi, Date fechaInscripcion, Date fechaCreacion, String Prut, int idSp) {
        this.idCi = idCi;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaCreacion = fechaCreacion;
        this.Prut = Prut;
        this.idSp = idSp;
    }

    public int getIdCi() {
        return idCi;
    }

    public void setIdCi(int idCi) {
        this.idCi = idCi;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getPrut() {
        return Prut;
    }

    public void setPrut(String Prut) {
        this.Prut = Prut;
    }

    public int getIdSp() {
        return idSp;
    }

    public void setIdSp(int idSp) {
        this.idSp = idSp;
    }

    
    
    
    
    
}
