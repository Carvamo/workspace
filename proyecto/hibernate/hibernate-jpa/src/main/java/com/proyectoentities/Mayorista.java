package com.proyectoentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Mayorista")
public class Mayorista {
    @Id
    @Column(name=contract_address)
    private string contract_address;
    @Column(name=nombre)
    private string nombre;

    public Mayorista(){

    }

    public Mayorista(string contract_address, string nombre) {
        this.contract_address = contract_address;
        this.nombre = nombre;
    }

    public string getContract_address() {
        return contract_address;
    }

    public void setContract_address(string contract_address) {
        this.contract_address = contract_address;
    }

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mayorista{" +
                "contract_address=" + contract_address +
                ", nombre=" + nombre +
                '}';
    }
}





