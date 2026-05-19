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
public class Punto_4 {
     public static int[] cargarVector(int tam) {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[tam];

        for (int i = 0; i < vector.length; i++) {

            System.out.print("Ingrese un número: ");
            vector[i] = sc.nextInt();
        }

        return vector;
    }
     
     public static int[] devuelveMasAlto(int[] vector){
         int valorAlto = 0;
         int posicion = 0;
         for(int i=0; i<vector.length; i++){
             if(vector[i]>valorAlto){
                 valorAlto = vector[i];
                 posicion = i+1;
             }
         }
         return new int[]{valorAlto, posicion};
     }
}
