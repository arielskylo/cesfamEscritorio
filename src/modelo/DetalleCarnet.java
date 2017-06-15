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
public class DetalleCarnet {

    private int carnetPacienteId;
    private String indicacionesMedicas;
    private Date entregaMedicamento;

    public DetalleCarnet() {
    }

    public DetalleCarnet(int carnetPacienteId, String pacienteRut, String indicacionesMedicas, Date entregaMedicamento) {
        this.carnetPacienteId = carnetPacienteId;

        this.indicacionesMedicas = indicacionesMedicas;
        this.entregaMedicamento = entregaMedicamento;
    }

    public int getCarnetPacienteId() {
        return carnetPacienteId;
    }

    public void setCarnetPacienteId(int carnetPacienteId) {
        this.carnetPacienteId = carnetPacienteId;
    }

    public String getIndicacionesMedicas() {
        return indicacionesMedicas;
    }

    public void setIndicacionesMedicas(String indicacionesMedicas) {
        this.indicacionesMedicas = indicacionesMedicas;
    }

    public Date getEntregaMedicamento() {
        return entregaMedicamento;
    }

    public void setEntregaMedicamento(Date entregaMedicamento) {
        this.entregaMedicamento = entregaMedicamento;
    }

}
