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

    public class Deportista extends Personas {
    private String deporte;
    
    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }
    
    public String getDeporte() {
        return deporte;
    }
    
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
}

