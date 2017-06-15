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
public class Usuario {
    
    private String rut;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private char sexo;
    private Date fechaNac;
    private String email;
    private int cel;
    private String direccion;
    private int comunaId;
    private String codUsuario;
    private String contraseña;
    private int cargoId;

    public Usuario() {
    }

    public Usuario(String rut, String nombre, String apPaterno, String apMaterno, char sexo, Date fechaNac, String email, int cel, String direccion, int comunaId, String codUsuario, String contraseña, int cargoId) {
        this.rut = rut;
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.email = email;
        this.cel = cel;
        this.direccion = direccion;
        this.comunaId = comunaId;
        this.codUsuario = codUsuario;
        this.contraseña = contraseña;
        this.cargoId = cargoId;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getComunaId() {
        return comunaId;
    }

    public void setComunaId(int comunaId) {
        this.comunaId = comunaId;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getCargoId() {
        return cargoId;
    }

    public void setCargoId(int cargoId) {
        this.cargoId = cargoId;
    }
    
    
    
}
