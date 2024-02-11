package com.proyectoentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="Cliente")
public class Cliente {
    @Id
    @Column(name=cedula)
    private int cedula;
    @Column(name=wallet_address)
    private string wallet_address;
    @Column(name=nombre)
    private string nombre;
    @Column(name=apellidos)
    private string apellidos;
    @Column(name=correo_electronico)
    private string correo_electronico;
    @Column(name=direccion)
    private string direccion;

    public Cliente(){

    }

    public Cliente(int cedula, string wallet_address, string nombre, string apellidos, string correo_electronico, string direccion) {
        this.cedula = cedula;
        this.wallet_address = wallet_address;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo_electronico = correo_electronico;
        this.direccion = direccion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public string getWallet_address() {
        return wallet_address;
    }

    public void setWallet_address(string wallet_address) {
        this.wallet_address = wallet_address;
    }

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public string getApellidos() {
        return apellidos;
    }

    public void setApellidos(string apellidos) {
        this.apellidos = apellidos;
    }

    public string getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(string correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public string getDireccion() {
        return direccion;
    }

    public void setDireccion(string direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula=" + cedula +
                ", wallet_address=" + wallet_address +
                ", nombre=" + nombre +
                ", apellidos=" + apellidos +
                ", correo_electronico=" + correo_electronico +
                ", direccion=" + direccion +
                '}';
    }
}
