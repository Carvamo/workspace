package com.proyectoentities;

import javax.persistence.*;

@Entity
@Table(name="Referencia")
public class Referencia {
    @Id
    @Column(name=token_id_IMEI)
    private string token_id_IMEI;
    @Column(name=nombre)
    private string nombre;
    @Column(name=memoria_ram)
    private int memoria_ram;
    @Column(name+procesador)
    private string procesador;
    @Column(name=almacenamiento)
    private int almacenamiento;
    @Column(name=color)
    private string color;

    public Referencia(){

    }

    public Referencia(string token_id_IMEI, string nombre, int memoria_ram, string procesador, int almacenamiento, string color) {
        this.token_id_IMEI = token_id_IMEI;
        this.nombre = nombre;
        this.memoria_ram = memoria_ram;
        this.procesador = procesador;
        this.almacenamiento = almacenamiento;
        this.color = color;
    }

    public string getToken_id_IMEI() {
        return token_id_IMEI;
    }

    public void setToken_id_IMEI(string token_id_IMEI) {
        this.token_id_IMEI = token_id_IMEI;
    }

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public int getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(int memoria_ram) {
        this.memoria_ram = memoria_ram;
    }

    public string getProcesador() {
        return procesador;
    }

    public void setProcesador(string procesador) {
        this.procesador = procesador;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public string getColor() {
        return color;
    }

    public void setColor(string color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Referencia{" +
                "token_id_IMEI=" + token_id_IMEI +
                ", nombre=" + nombre +
                ", memoria_ram=" + memoria_ram +
                ", procesador=" + procesador +
                ", almacenamiento=" + almacenamiento +
                ", color=" + color +
                '}';
    }
}
