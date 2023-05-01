/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistact;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author jenni
 */
public class LinkedListAct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        
        Scanner lectura = new Scanner(System.in);
        int opcion = 1, pos = 0;

        String nombre;

        do {
            System.out.println("////////////////////////////////////////////////////////////////////");
            System.out.println("1.- Ingrese participante a la lista");
            System.out.println("2.- Ingrese participante al inicio de la lista");
            System.out.println("3.- Ingrese participante al fin de la lista");
            System.out.println("4.- Ingrese participante en determinado lugar de la lista");
            System.out.println("5.- Mostrar la lista de participantes");
            System.out.println("6.- Verificar si ya llego determinado asistente");
            System.out.println("7.- Eliminar de la lista a algún participante");
            System.out.println("8.- Cantidad total de participantes registrados");
            System.out.println("9.- Salir");
            System.out.println("////////////////////////////////////////////////////////////////////");
            opcion = lectura.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Participantes ingresado");
                    nombre = lectura.next();
                    lista.add(nombre);
                    break;

                case 2:
                    System.out.println("Participante Ingresado al inicio de la lista:");
                    nombre = lectura.next();
                    lista.addFirst(nombre);
                    break;

                case 3:
                    System.out.println("Participante ingresado al final de la lista:");
                    nombre = lectura.next();
                    lista.addLast(nombre);
                    break;

                case 4:
                    System.out.println("Participante ingresado en determinado lugar:");
                    nombre = lectura.next();
                    System.out.println("Seleccione la posición: ");
                    pos = lectura.nextInt();
                    lista.add(pos - 1, nombre);
                    break;

                case 5:
                    System.out.println("Participantes en la lista:" + lista);
                    lista.get(pos);
                    break;

                case 6:
                    System.out.println("Inserte el partcipante a buscar");
                    nombre = lectura.next();

                    if (lista.contains(nombre)) {
                        System.out.println("El participante " + nombre + "esta en la lista");
                    } else {
                        System.out.println("El participante " + nombre + "no esta en la lista");
                    }
                    break;

                case 7:
                    System.out.println("Ingrese a participante a eliminar ");
                    nombre = lectura.next();
                    lista.remove(nombre);
                    break;

                case 8:

                    System.out.println("Total de participantes ingresados  "
                            + lista.size());
                    break;
                    
                case 9:
                    System.out.println("Lista original: " + lista);
                   LinkedList clonn = new LinkedList();
                   clonn = (LinkedList) lista.clone();
                    System.out.println("El clon de la primera lista es: " + clonn);
                   
            }
        } while (opcion != 10);

    }

}
