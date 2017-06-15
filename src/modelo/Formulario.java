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
public class Formulario {
    
    private int idForm,duracionTt;
    private String detalleFrecuencia,medicoRut, estado;
    private int medicamentoId,tratamientoId;
   

    public Formulario() {
    }

    public Formulario(int idForm, int duracionTt, String detalleFrecuencia, String medicoRut, String estado, int medicamentoId, int tratamientoId) {
        this.idForm = idForm;
        this.duracionTt = duracionTt;
        this.detalleFrecuencia = detalleFrecuencia;
        this.medicoRut = medicoRut;
        this.estado = estado;
        this.medicamentoId = medicamentoId;
        this.tratamientoId = tratamientoId;
    }

    public int getIdForm() {
        return idForm;
    }

    public void setIdForm(int idForm) {
        this.idForm = idForm;
    }

    public int getDuracionTt() {
        return duracionTt;
    }

    public void setDuracionTt(int duracionTt) {
        this.duracionTt = duracionTt;
    }

    public String getDetalleFrecuencia() {
        return detalleFrecuencia;
    }

    public void setDetalleFrecuencia(String detalleFrecuencia) {
        this.detalleFrecuencia = detalleFrecuencia;
    }

    public String getMedicoRut() {
        return medicoRut;
    }

    public void setMedicoRut(String medicoRut) {
        this.medicoRut = medicoRut;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getMedicamentoId() {
        return medicamentoId;
    }

    public void setMedicamentoId(int medicamentoId) {
        this.medicamentoId = medicamentoId;
    }

    public int getTratamientoId() {
        return tratamientoId;
    }

    public void setTratamientoId(int tratamientoId) {
        this.tratamientoId = tratamientoId;
    }

    
    
    
    
    
}