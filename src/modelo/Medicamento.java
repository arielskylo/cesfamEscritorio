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
public class Medicamento {
    
    private int idMctos;
    private String nombreRegistrado,formaFarmaceutica,dosis;
    private Date caducidad;
    private String indicaciones;
    private int farmaciaId;

    public Medicamento() {
    }

    public Medicamento(int idMctos, String nombreRegistrado, String formaFarmaceutica, String dosis, Date caducidad, String indicaciones, int farmaciaId) {
        this.idMctos = idMctos;
        this.nombreRegistrado = nombreRegistrado;
        this.formaFarmaceutica = formaFarmaceutica;
        this.dosis = dosis;
        this.caducidad = caducidad;
        this.indicaciones = indicaciones;
        this.farmaciaId = farmaciaId;
    }

    public int getIdMctos() {
        return idMctos;
    }

    public void setIdMctos(int idMctos) {
        this.idMctos = idMctos;
    }

    public String getNombreRegistrado() {
        return nombreRegistrado;
    }

    public void setNombreRegistrado(String nombreRegistrado) {
        this.nombreRegistrado = nombreRegistrado;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public int getFarmaciaId() {
        return farmaciaId;
    }

    public void setFarmaciaId(int farmaciaId) {
        this.farmaciaId = farmaciaId;
    }
    
    
    
    
}
