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
public class Tratamiento {
    
    private int idTt;
    private String nombre,detalle;
    private int pacienteIdPc;
    private String medicoRut;

    public Tratamiento() {
    }

    public Tratamiento(int idTt, String nombre, String detalle, int pacienteIdPc, String medicoRut) {
        this.idTt = idTt;
        this.nombre = nombre;
        this.detalle = detalle;
        this.pacienteIdPc = pacienteIdPc;
        this.medicoRut = medicoRut;
    }

    public int getIdTt() {
        return idTt;
    }

    public void setIdTt(int idTt) {
        this.idTt = idTt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getPacienteIdPc() {
        return pacienteIdPc;
    }

    public void setPacienteIdPc(int pacienteIdPc) {
        this.pacienteIdPc = pacienteIdPc;
    }

    public String getMedicoRut() {
        return medicoRut;
    }

    public void setMedicoRut(String medicoRut) {
        this.medicoRut = medicoRut;
    }
    
    
    
    
    
    
}
