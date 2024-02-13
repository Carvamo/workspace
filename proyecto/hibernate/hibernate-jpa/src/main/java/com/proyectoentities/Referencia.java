package com.proyectoentities;

import javax.persistence.*;

@Entity
@Table(name="Referencia")
public class Referencia {
    @Id
    @Column(name="token_id_IMEI")
    private String token_id_IMEI;
    @Column(name="nombre")
    private String nombre;
    @Column(name="memoria_ram")
    private int memoria_ram;
    @Column(name="procesador")
    private String procesador;
    @Column(name="almacenamiento")
    private int almacenamiento;
    @Column(name="color")
    private String color;

    public Referencia(){

    }

    public Referencia(String token_id_IMEI, String nombre, int memoria_ram, String procesador, int almacenamiento, String color) {
        this.token_id_IMEI = token_id_IMEI;
        this.nombre = nombre;
        this.memoria_ram = memoria_ram;
        this.procesador = procesador;
        this.almacenamiento = almacenamiento;
        this.color = color;
    }

    public String getToken_id_IMEI() {
        return token_id_IMEI;
    }

    public void setToken_id_IMEI(String token_id_IMEI) {
        this.token_id_IMEI = token_id_IMEI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(int memoria_ram) {
        this.memoria_ram = memoria_ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Referencia{" +
                "token_id_IMEI='" + token_id_IMEI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", memoria_ram=" + memoria_ram +
                ", procesador='" + procesador + '\'' +
                ", almacenamiento=" + almacenamiento +
                ", color='" + color + '\'' +
                '}';
    }
}
