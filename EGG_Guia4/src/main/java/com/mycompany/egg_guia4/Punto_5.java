/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.egg_guia4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elpir
 */
public class Punto_5 {
    public static int[][] cargarVector(int tam) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] vectorA = new int[tam];
        int[] vectorB = new int[tam];

        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = random.nextInt(201)-100;
        }
        
        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = random.nextInt(201)-100;
        }


        return new int[][]{vectorA, vectorB};
    }
    public static int[] SumaVectores(int[] vectorA, int[] vectorB, int tam){
        int[] vectorC = new int[tam];
        for(int i=0; i<tam; i++){
            vectorC[i] = vectorA[i]+vectorB[i];
            System.out.println(vectorA[i]+"+"+vectorB[i]+"="+vectorC[i]);
        }
        return vectorC;
    }
    public static int[] RestaVectores(int[] vectorA, int[] vectorB, int tam){
        int[] vectorC = new int[tam];
        for(int i=0; i<tam; i++){
            vectorC[i] = vectorB[i]-vectorA[i];
            System.out.println(vectorB[i]+"-"+vectorA[i]+"="+vectorC[i]);
        }
        return vectorC;
    }
}
