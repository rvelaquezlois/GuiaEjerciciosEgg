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
public class Punto_1 {
    public static int[] cargarVector() {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[5];

        for (int i = 0; i < vector.length; i++) {

            System.out.print("Ingrese un número: ");
            vector[i] = sc.nextInt();
        }

        return vector;
    }
    
     public static void mostrarVector(int[] vector) {

        System.out.println("Contenido del vector:");

        for (int i = 0; i < vector.length; i++) {

            System.out.println(vector[i]);
        }
}
}

