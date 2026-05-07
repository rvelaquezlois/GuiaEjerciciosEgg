/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.egg_guia2;

import java.util.Scanner;

/**
 *
 * @author elpir
 */
public class EGG_Guia2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("La guía 2 de ejercicios consta de 13 ejercicios.");
        System.out.println("Ingrese el ejercicio que desea ejecutar:");
        int ej = sc.nextInt();
        
        switch(ej){
            case 1:
                System.out.println("Ingrese su edad:");
                int edad = sc.nextInt();
                Punto1 p1 = new Punto1();
                System.out.println(p1.mayor(edad));
                break;
            case 2:
                System.out.println("Ingrese su sueldo actual");
                double sueldoActual = sc.nextDouble();
                System.out.println("Ingrese el sueldo mínimo");
                double sueldoMinimo = sc.nextDouble();
                Punto2 p2 = new Punto2();
                boolean mayor = p2.sueldo(sueldoActual, sueldoMinimo);
                if(mayor==true){
                    System.out.println("Su sueldo es mayor al mínimo");
                } else{
                    System.out.println("Su sueldo no supera el mínimo");
                }
                break;
            case 3:
                System.out.println("Ingrese un número");
                int num = sc.nextInt();
                Punto3 p3 = new Punto3();
                if(p3.mayorOmenor(num)==true){
                    System.out.println("El número es mayor a 100");
                }else{
                    System.out.println("El número es menor a 100");
                }
                break;
            case 4:
                System.out.println("Ingrese una letra:");
                char letra = sc.next().charAt(0);
                letra = Character.toUpperCase(letra);
                Punto4 p4 = new Punto4();
                if(p4.letraCorrecta(letra)==true){
                    System.out.println("CORRECTO");
                }else {
                    System.out.println("INCORRECTO");
                }
                break;
            case 5:
                System.out.println("Ingrese un número:");
                num = sc.nextInt();
                Punto5 p5 = new Punto5();
                if(p5.parOimpar(num)==true){
                    System.out.println("El número ingresado es par");
                } else {
                    System.out.println("El número ingresado es impar");
                }
                break;
            case 6:
                  System.out.println("Ingrese una palabra:");
                  String palabra = sc.next();
                  Punto6 p6 = new Punto6();
                  if(p6.longstr(palabra)==true){
                      System.out.println("CORRECTO");
                  } else{
                      System.out.println("INCORRECTO");
                  }
                  break;
            case 7:
                System.out.println("Ingrese una palabra");
                palabra = sc.next();
                Punto7 p7 = new Punto7();
                System.out.println(p7.palabraCorrecta(palabra));
                break;
            case 8:
                System.out.println("Ingrese la primer nota");
                int n1 = sc.nextInt();
                System.out.println("Ingrese la segunda nota");
                int n2 = sc.nextInt();
                System.out.println("Ingrese la tercer nota");
                int n3 = sc.nextInt();
                Punto8 p8 = new Punto8();
                System.out.println(p8.notas(n1, n2, n3));
                break;
            case 9:
                System.out.println("Ingrese una palabra");
                palabra = sc.next();
                Punto9 p9 = new Punto9();
                if(p9.PrimerLetra(palabra)==true){
                    System.out.println("CORRECTO");
                } else{
                    System.out.println("INCORRECTO");
                }
                System.out.println("Desea seguir con el punto 10? Ingrese S para si o N para no");
                char opcion = sc.next().charAt(0);
                if(opcion=='S'){
                    Punto10 p10 = new Punto10();
                    if(p10.primerUltimaPalabra(palabra)==true){
                        System.out.println("CORRECTO, coincide la primer y última letra");
                    }else{
                        System.out.println("INCORRECTO, no coincide la primer y última letra");
                    }
                } else{
                    System.out.println("No se ejecutará el ejercicio 10");
                }
            break;    
            case 11:
                System.out.println("BIENVENIDO AL PROGRAMA DE OPERACIONES ARITMÉTICAS");
                System.out.println("Ingrese S para suma, R para resta, M para multiplicación o D para división");
                letra = sc.next().charAt(0);
                letra = Character.toUpperCase(letra);
                System.out.println("Ingrese el primer número:");
                int num1 = sc.nextInt();
                System.out.println("Ingrese el segundo número");
                int num2 = sc.nextInt();
                Punto11 p11 = new Punto11();
                if(letra=='S'){
                    System.out.println("El resultado de la suma es de "+p11.Operaciones(letra, num1, num2));
                } else if(letra=='R'){
                    System.out.println("El resultado de la resta es de "+p11.Operaciones(letra, num1, num2));
                }else if(letra=='M'){
                    System.out.println("El resultado de la multiplicación es de "+p11.Operaciones(letra, num1, num2));
                }else if(letra=='D'){
                    System.out.println("El resultado de la división es de "+p11.Operaciones(letra, num1, num2));
                }
                break;
        }
    }
}
