package com.upchiapas.practica04;

import com.upchiapas.practica04.models.Persona;

import java.util.Scanner;

public class Main {
    private static Persona[] listaPersonas = new Persona[5];
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        byte opcion;

        do {
            System.out.println("UNIVERSIDAD POLITÉCNICA DE CHIAPAS");
            System.out.println("1. Agregar persona");
            System.out.println("2. Agregar vehículo");
            System.out.println("3. Imprimir registros");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = teclado.nextByte();
            switch (opcion){
                case 1: addPersona(); break;
                case 2: addVehiculo(); break;
                case 3: imprimirPersonas(); break;
            }
        } while (opcion <4);

    }

    public static void addPersona() {
        short id;
        String nombre;
        String rol;
        byte numeroVehiculos;
        Persona persona;

        // Sección para capturar datos
        System.out.print("Ingresa el ID: ");
        id = teclado.nextShort();
        teclado.nextLine();
        System.out.print("Ingresa el nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingresa el rol: ");
        rol = teclado.nextLine();
        System.out.print("Vehículo a registrar: ");
        numeroVehiculos = teclado.nextByte();

        // Sección para almacenar datos
        persona = new Persona(numeroVehiculos);
        persona.setId(id);
        persona.setNombre(nombre);
        persona.setRol(rol);

        System.out.println("Valor de persona: " + persona);
        byte indice = 0;
        while (listaPersonas[indice] != null)
            indice++;
        listaPersonas[indice] = persona;

    }
    public static void addVehiculo() {}
    public static void imprimirPersonas() {}
}
