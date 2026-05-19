/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.egg_guia5;

import java.util.Scanner;

/**
 *
 * @author elpir
 */
public class EGG_Guia5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Hello World!");
        System.out.println("Ingrese el N° de ejercicio que desea ejecutar:");
        int ej = sc.nextInt();
        switch(ej){
            case 1:
                System.out.println("Escribir un programa que pida dos números enteros por teclado y calcule la suma\n" +
"de los dos. El programa deberá después mostrar el resultado de la suma");
                int n1, n2, suma;
                int[] numeros = IngresaNumeros(sc);
                n1 = numeros[0];
                n2 = numeros[1];
                suma = numeros[2];
                System.out.println("El resultado de la suma es: "+n1+"+"+n2+"="+suma);
                break;
            case 2:
                System.out.println("BIENVENIDO "+IngresaNombre(sc).toUpperCase());
                break;
            case 3:
                String frase = IngresaFrase(sc);
                System.out.println("MAYÚSCULAS: "+frase.toUpperCase());
                System.out.println("minúsculas: "+frase.toLowerCase());
                break;
            case 4:
                double temp_C;
                System.out.print("Ingrese la temperatura en grados Celcius: ");
                temp_C = sc.nextDouble();
                System.out.println("La temperatura en grados Farenheit es de: "+CelciusAFarenheit(sc, temp_C)+"°");
                break;
            case 5:
                int n;
                System.out.println("Ingrese un número:");
                n = sc.nextInt();
                DobleTripleSqrt(n);
                break;
            case 6:
                System.out.println("Ingrese el primer número:");
                n1 = sc.nextInt();
                System.out.println("Ingrese el segundo número:");
                n2 = sc.nextInt();
                System.out.println("El mayor de los números es "+DevuelveMayor(n1,n2));
                break;
            case 7:
                System.out.println("Ingrese el número:");
                n = sc.nextInt();
                EsPar(n);
                break;
            case 8:
                System.out.println("Ingrese una frase:");
                frase = sc.next();
                Correcto(frase);
                break;
            case 9:
                System.out.println("Ingrese una palabra:");
                String palabra = sc.next();
                Correcto_2(palabra);
                break;
            case 10:
                System.out.println("Ingrese una palabra:");
                palabra = sc.next();
                Correcto_3(palabra);
                break;
            case 11:
                System.out.println("Ingrese un tipo de motor:");
                int tipo_motor = sc.nextInt();
                Menu(tipo_motor);
                break;
            case 12:
                System.out.println("Ingrese la nota");
                int nota = sc.nextInt();
                nota = ValidaNota(sc, nota);
                System.out.println("La nota es de "+nota);
                break;
            case 13:
                System.out.println("Ingrese un límite positivo:");
                int lim = sc.nextInt();
                System.out.println(Sumatoria(sc, lim));
                break;
            case 14:
                System.out.println("Ingrese el primer número:");
                n1 = sc.nextInt();
                System.out.println("Ingrese el segundo número:");
                n2 = sc.nextInt();
                Operaciones(n1, n2, sc);
                break;
        }
    }
    
    public static int[] IngresaNumeros(Scanner sc){
        int n1, n2;
        System.out.println("Ingrese el primer número:");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo número:");
        n2 = sc.nextInt();
        int suma = n1+n2;
        return new int[]{n1, n2, suma};
    }
    
    public static String IngresaNombre(Scanner sc){
        String nombre;
        System.out.println("Ingrese su nombre por favor:");
        nombre = sc.next();
        return nombre;
    } 
    
    public static String IngresaFrase(Scanner sc){
        String frase;
        System.out.println("Ingrese la frase por favor:");
        frase = sc.nextLine();
        return frase;
    } 
    
    public static double CelciusAFarenheit(Scanner sc, double temp_C){
        double temp_F;
        temp_F = 32+(9*temp_C/5);
        return temp_F;
    }
    
    public static void DobleTripleSqrt(int n){
        System.out.println("El doble del número "+n+" es de "+Math.pow(n, 2));
        System.out.println("El triple del número "+n+" es de "+Math.pow(n, 3));
        System.out.println("La raíz cuadrada de "+n+" es de "+Math.sqrt(n));
    }
    
    public static int DevuelveMayor(int n1, int n2){
        int mayor;
        if(n1>n2){
            mayor = n1;
        }else{
            mayor = n2;
        }
        return mayor;
    }
    
    public static void EsPar(int n){
        if(n%2==0){
            System.out.println(n+" es par");
        }else{
            System.out.println(n+" es impar");
        }
    }
    
    public static void Correcto(String frase){
        frase = frase.toLowerCase();
        if(frase.equals("eureka")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
    public static void Correcto_2(String palabra){
        if(palabra.length()==8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
    public static void Correcto_3(String palabra){
        if(palabra.startsWith("A")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
    public static void Menu(int tipo_motor){
        switch(tipo_motor){
            case 1:
                System.out.println("Bomba de agua");
                break;
            case 2:
                System.out.println("Bomba de gasolina");
                break;
            case 3:
                System.out.println("Bomba de hormigón");
                break;
            case 4:
                System.out.println("Bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No ha ingresado un valor válido");
                break;
        }
    }
    
    public static int ValidaNota(Scanner sc, int nota){
        while(nota<0 || nota>10){
            System.out.println("Ingrese nuevamente la nota:");
            nota = sc.nextInt();
        }
        return nota;
    }
    
    public static String Sumatoria(Scanner sc, int lim){
        int suma=0;
        do{
            System.out.println("Ingrese el número:");
            suma = suma + sc.nextInt();
        }while(suma<=lim);
        return "SE SUPERÓ EL LÍMITE";
    }
    
    public static void Operaciones(int n1, int n2, Scanner sc){
        
        char opcion = 'N';
        do{
            System.out.println("MENÚ\n 1.Sumar\n 2.Restar\n 3.Multiplicar\n 4.Dividir\n 5.Salir");
        int ej = sc.nextInt();
            switch(ej){
            case 1:
                System.out.println(n1+"+"+n2+"="+(n1+n2));
                break;
            case 2:
                System.out.println(n1+"-"+n2+"="+(n1-n2));
                break;
            case 3:
                System.out.println(n1+"*"+n2+"="+(n1*n2));
                break;
            case 4:
                System.out.println(n1+"/"+n2+"="+(n1/n2));
                break;
            case 5:
                System.out.println("¿Seguro que desea salir? Ingrese S para si o N para no");
                opcion = sc.next().charAt(0);
                break;
        }
        }while(opcion!='S');
        
    }
}
