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
public class Punto_2 {
    public static int[] cargarVector() {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {

            System.out.print("Ingrese un número: ");
            vector[i] = sc.nextInt();
        }

        return vector;
    }
    
    public static void mostrarVector(int[] vector) {
        
        boolean sum = false, rest = false, mult = false, div = false;
        int suma = 0, resta=0, multiplicacion=0;
        double division = 0;
        
        do{
            for(int i=0; i<vector.length; i++){
                suma = suma+vector[i];
                if(i==vector.length-1){
                    sum = true;
                }
            }
            for(int i=0; i<vector.length; i++){
                resta = resta - vector[i];
                if(i==vector.length-1){
                    rest = true;
                }
            }
            for(int i=0; i<vector.length; i++){
                multiplicacion = multiplicacion * vector[i];
                if(i==vector.length-1){
                    mult = true;
                }
            }
            for(int i=0; i<vector.length; i++){
                division = division / vector[i];
                if(i==vector.length-1){
                    div = true;
                }
            }
        }while(sum==false && rest==false && mult==false && div==false);

        System.out.println("Contenido del vector:");

        for (int i = 0; i < vector.length; i++) {

            System.out.println(vector[i]);
        }
        System.out.println("El resultado de la suma es de "+suma);
        System.out.println("El resultado de la resta es de "+resta);
        System.out.println("El resultadod de la multiplicacion es de "+multiplicacion);
        System.out.println("El resultado de la división es de "+division);
}
}
