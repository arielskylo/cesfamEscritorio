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
public class CarnetPaciente {
    
    private int idCp;
    private String pacienteRut;

    public CarnetPaciente() {
    }

    public CarnetPaciente(int idCp, String pacienteRut) {
        this.idCp = idCp;
        this.pacienteRut = pacienteRut;
    }

    public int getIdCp() {
        return idCp;
    }

    public void setIdCp(int idCp) {
        this.idCp = idCp;
    }

    public String getPacienteRut() {
        return pacienteRut;
    }

    public void setPacienteRut(String pacienteRut) {
        this.pacienteRut = pacienteRut;
    }
    
    
    
    
}
