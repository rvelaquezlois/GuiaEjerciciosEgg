/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.egg_guia4;

import java.util.Scanner;

/**
 *
 * @author elpir
 */
public class Punto_3 {
    public static int[] cargarVector(int tam) {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[tam];

        for (int i = 0; i < vector.length; i++) {

            System.out.print("Ingrese un número: ");
            vector[i] = sc.nextInt();
        }

        return vector;
    }
    
     public static void mostrarVector(int[] vector) {
         int buscado=0;
         boolean encontrado=false;
         Scanner sc = new Scanner(System.in);
         System.out.println("Ingrese el número que anda buscando: ");
         buscado = sc.nextInt();
        System.out.println("Contenido del vector:");

        for (int i = 0; i < vector.length; i++) {

            System.out.println(vector[i]);
            if(vector[i]==buscado){
                System.out.println("El número "+buscado+" se encuentra en la posición "+(i+1));
                encontrado = true;
            }
        }
        if(encontrado==false){
            System.out.println("No se encontró el número solicitado");
        }
}
}
