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
public class SucursalCesfam {
    
    private int idSucursal;
    private String direccion;
    private int telofono,comunaId;

    public SucursalCesfam() {
    }

    public SucursalCesfam(int idSucursal, String direccion, int telofono, int comunaId) {
        this.idSucursal = idSucursal;
        this.direccion = direccion;
        this.telofono = telofono;
        this.comunaId = comunaId;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelofono() {
        return telofono;
    }

    public void setTelofono(int telofono) {
        this.telofono = telofono;
    }

    public int getComunaId() {
        return comunaId;
    }

    public void setComunaId(int comunaId) {
        this.comunaId = comunaId;
    }
    
    
    
    
    
    
    
}
