package com.upechiapas.queue.models;

public class Pizza {
    private short id;
    private String especialsalida;
    private float precio;

    public Pizza() {
    }
    public Pizza(short id, String especialsalida, float precio) {
        this.id = id;
        this.especialsalida = especialsalida;
        this.precio = precio;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getEspecialsalida() {
        return especialsalida;
    }

    public void setEspecialsalida(String especialsalida) {
        this.especialsalida = especialsalida;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", especialsalida='" + especialsalida + '\'' +
                ", precio=" + precio +
                '}';
    }
}
