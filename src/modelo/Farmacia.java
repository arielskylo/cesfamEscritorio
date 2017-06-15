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
public class Farmacia {
    
    private int idFarmacia,fono,sucursalCesfamId;

    public Farmacia() {
    }

    public Farmacia(int idFarmacia, int fono, int sucursalCesfamId) {
        this.idFarmacia = idFarmacia;
        this.fono = fono;
        this.sucursalCesfamId = sucursalCesfamId;
    }

    public int getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(int idFarmacia) {
        this.idFarmacia = idFarmacia;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public int getSucursalCesfamId() {
        return sucursalCesfamId;
    }

    public void setSucursalCesfamId(int sucursalCesfamId) {
        this.sucursalCesfamId = sucursalCesfamId;
    }
    
    
    
    
}
