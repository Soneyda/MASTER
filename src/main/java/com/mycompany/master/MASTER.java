/*
 */

package com.mycompany.master;

public class MASTER {
    private String nombre;
    private int edad;

    public MASTER(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String obtenerInformacion() {
        return "Nombre: " + nombre + "\nEdad: " + edad;
    }
}

