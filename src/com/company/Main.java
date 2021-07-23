package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Refugio refugio = new Refugio();
        Scanner sc= new Scanner(System.in);
        int op;
        do {
            System.out.println("Elija una opcion");
            System.out.println("1 - Listar todos");
            System.out.println("2 - Buscar por especie");
            System.out.println("3 - Actualizar edad");
            System.out.println("0 - Salir");
            op = Integer.parseInt(sc.nextLine());

            switch (op){
                case 1:
                    refugio.listarAnimales();
                    break;
                case 2:
                    System.out.println("Consultar por: 0-Perro ; 1-Gato ; 2-Tortuga ; 3-Caballo ; 4-Ballena");
                    op = Integer.parseInt(sc.nextLine());
                    refugio.consultarPorEspecie(op);
                    break;
                case 3:
                    System.out.println("Ingrese el nro de animal por el que quiere actualizar");
                   int nroAnimal = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese la nueva edad");
                   int edad = Integer.parseInt(sc.nextLine());
                    refugio.actualizarEdad(nroAnimal,edad);
                    break;
                case 9:
                    System.out.println("Adios");
                    break;
                default: System.out.println("Intente de nuevo");
            }


        }while (op !=9);




    }
}
