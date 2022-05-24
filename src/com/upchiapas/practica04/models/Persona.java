package com.upchiapas.practica04.models;

public class Persona {
    private short id;
    private String nombre;
    private String rol;
    private Vehiculo[] listaVehiculos;

    public Persona(byte numeroVehiculos){
        listaVehiculos = new Vehiculo[numeroVehiculos];
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
