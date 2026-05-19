/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.egg_guia4;

import java.util.Scanner;

/**
 *
 * @author elpir
 */
public class EGG_Guia4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO");
        System.out.print("La guía 4 consta de 7 ejercicios. Por favor ingrese el N° de ejercicio que desea realizar: ");
        int ej = sc.nextInt();
        
        switch (ej){
            case 1:
                System.out.println("Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los\n" +
"muestre por pantalla.");
                Punto_1 p1 = new Punto_1();
                 int[] numeros = p1.cargarVector();

        p1.mostrarVector(numeros);
        break;
            case 2:
                System.out.println("Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo\n" +
"y muestre por pantalla la suma, resta y multiplicación de todos los números ingresados\n" +
"al arreglo.");
                Punto_2 p2 = new Punto_2();
                numeros = p2.cargarVector();
                p2.mostrarVector(numeros);
                break;
            case 3:
                System.out.println("Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el\n" +
"usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a\n" +
"buscar también debe ser ingresado por el usuario). El programa debe indicar la posición\n" +
"donde se encuentra el valor. En caso que el número se encuentre repetido dentro del\n" +
"arreglo se deben imprimir todas las posiciones donde se encuentra ese valor.\n" +
"Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar\n" +
"un mensaje.");
                Punto_3 p3 = new Punto_3();
                System.out.println("Ingrese el tamaño del vector:");
                int tam = sc.nextInt();
                numeros = p3.cargarVector(tam);
                p3.mostrarVector(numeros);
                break;
            case 4:
                System.out.println("Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el\n" +
"usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el\n" +
"valor más grande del vector");
                Punto_4 p4 = new Punto_4();
                System.out.println("Ingrese el tamaño del vector:");
                tam = sc.nextInt();
                numeros = p4.cargarVector(tam);
                int[] valorAlto = p4.devuelveMasAlto(numeros);
                System.out.println("El número más alto del arreglo es el "+valorAlto[0]+" en la posición "+valorAlto[1]);
                break;
            case 5:
                System.out.println("Ingrese el tamaño del vector A y B:");
                tam = sc.nextInt();
                Punto_5 p5 = new Punto_5();
                int[][] resultado = p5.cargarVector(tam);
                int[] vectorA = resultado[0];
                int[] vectorB = resultado[1];
                int[] vectorC = null;
                boolean vectorCargado = false;
                /*System.out.println("VECTOR A:");
                for(int i=0; i<tam; i++){
                    System.out.println(vectorA[i]);
                }
                System.out.println("VECTOR B:");
                for(int i=0; i<tam; i++){
                    System.out.println(vectorB[i]);
                }*/
                System.out.println("INGRESE EL NÚMERO DE EJERCICIO QUE DESEE EJECUTAR:");
                System.out.println("1) Llenar el vector C con la suma de los vectores A y B");
                System.out.println("2) Llenar vector C con la resta de los vectores B y A");
                System.out.println("3) Mostrar vector A o B o C si está cargado");
                System.out.println("4) Salir");
                int opcion = sc.nextInt();
                switch(opcion){
                    case 1:
                    vectorC = p5.SumaVectores(vectorA, vectorB, tam);
                    vectorCargado = true;
                    break;
                    case 2:
                        vectorC = p5.RestaVectores(vectorA, vectorB, tam);
                        vectorCargado = true;
                        break;
                    case 3:
                        System.out.println("¿Qué vector desea mostrar? A, B o C?");
                        char opcionCh = sc.next().charAt(0);
                        opcionCh = Character.toUpperCase(opcionCh);
                        switch(opcionCh){
                            case 'A':
                                for(int i=0; i<tam; i++){
                                    System.out.print(vectorA[i]+"\t");
                                }
                                break;
                            case 'B':
                                for(int i=0; i<tam; i++){
                                    System.out.print(vectorB[i]+"\t");
                                }
                                break;
                            case 'C':
                                if(vectorCargado==true){
                                    for(int i=0; i<tam; i++){
                                        System.out.print(vectorC[i]+"\t");
                                    }
                                }else{
                                    System.out.println("No ha cargado el vector C");
                                }
                                break;
                        }
                }
        }
    }
    
    
}