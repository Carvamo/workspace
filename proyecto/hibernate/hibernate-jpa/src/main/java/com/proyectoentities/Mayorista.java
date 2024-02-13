package com.proyectoentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Mayorista")
public class Mayorista {
    @Id
    @Column(name="contract_address")
    private String contract_address;
    @Column(name="nombre")
    private String nombre;

    public Mayorista(){

    }

    public Mayorista(String contract_address, String nombre) {
        this.contract_address = contract_address;
        this.nombre = nombre;
    }

    public String getContract_address() {
        return contract_address;
    }

    public void setContract_address(String contract_address) {
        this.contract_address = contract_address;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mayorista{" +
                "contract_address='" + contract_address + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}





