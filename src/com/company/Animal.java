package com.company;

public class Animal {

    // permitir listar todos, actualizar edad y buscar segun su especie

    private int id_Animal;
    private String nombre;
    private ESPECIE especie;
    private int edad;

    public Animal() {
    }

    public Animal(int id_Animal, String nombre, int edad) {
        this.id_Animal = id_Animal;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Animal(int id_Animal, String nombre, ESPECIE especie, int edad) {
        this.id_Animal = id_Animal;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public int getId_Animal() {
        return id_Animal;
    }

    public void setId_Animal(int id_Animal) {
        this.id_Animal = id_Animal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ESPECIE getEspecie() {
        return especie;
    }

    public void setEspecie(ESPECIE especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id_Animal=" + id_Animal +
                ", nombre='" + nombre + '\'' +
                ", especie=" + especie +
                ", edad=" + edad +
                '}';
    }
}
