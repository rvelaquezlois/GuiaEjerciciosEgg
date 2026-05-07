/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.egg_guia1;

import java.util.Scanner;

/**
 *
 * @author elpir
 */
public class EGG_Guia1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        System.out.println("En la guía 1 hay siete enunciados ¿Cuál quiere ejecutar?");
        switch(num){
            case 1:
                System.out.println("¿Cómo está el día hoy? Ingrese si está nublado, soleado o lloviendo");
                String clima = sc.nextLine();
                clima.toLowerCase();
                if(clima.contains("soleado")){
                    System.out.println("El día está soleado");
                } else if(clima.contains("nublado")){
                    System.out.println("El día está nublado");
                } else if(clima.contains("lloviendo")){
                    System.out.println("El día está lluvioso");
                } else{
                    System.out.println("No ha ingresado un valor permitido");
                }
                break;
            case 2:
                double radio;
                System.out.println("Ingrese el radio de la circunferencia en centímetros:");
                radio = sc.nextDouble();
                double radio_pow = Math.pow(radio, 2);
                double area = Math.PI*radio_pow;
                System.out.println("El area de la circunferencia es de "+area+"cm.");
                double perimetro = 2*Math.PI*radio;
                System.out.println("El perímetro es de "+perimetro+"cm.");
                break;
            case 3:
                System.out.println("Ingrese el precio en el establecimiento 1:");
                double precio_1 = sc.nextDouble();
                System.out.println("Ingrese el precio en el establecimiento 2:");
                double precio_2 = sc.nextDouble();
                System.out.println("Ingrese el precio en el establecimiento 3:");
                double precio_3 = sc.nextDouble();
                double promedio = (precio_1+precio_2+precio_3)/3;
                System.out.println("El precio promedio del producto es de $"+promedio);
                break;
            case 4:
                System.out.println("Ingrese la medida en metros:");
                double medida = sc.nextDouble();
                double cm = medida*100;
                double mm = medida*1000;
                double pulgada = medida*39.37;
                System.out.println("La medida en centímetros es de "+cm+"cm. La medida en milímetros es de "+mm+"mm. y en pulgadas es de "+pulgada);
                break;
            case 5:
                System.out.println("Ingrese cuantos litros cargó el vehículo:");
                double litros = sc.nextDouble();
                System.out.println("Ingrese cuantos kilometros hizo:");
                double kilometros = sc.nextDouble();
                double km_lt = kilometros/litros;
                System.out.println("El consumo es de "+km_lt+"km/lt.");
                break;
            case 6:
                System.out.println("Ingrese el primer número:");
                int num1 = sc.nextInt();
                System.out.println("Ingrese el segundo número:");
                int num2 = sc.nextInt();
                int aux = num2;
                num2 = num1;
                num1 = aux;
                System.out.println("El valor del primer número ahora es de "+num1+" y el segundo número es de "+num2);
                break;
            case 7:
                System.out.println("Ingrese el valor del primer número: ");
                num1 = sc.nextInt();
                System.out.println("Ingrese el valor del segundo número: ");
                num2 = sc.nextInt();
                System.out.println("El resultado de la suma es de: "+(num1+num2));
                System.out.println("El resultado de la resta es de: "+(num1-num2));
                System.out.println("El resultado de la multiplicación es de "+(num1*num2));
                System.out.println("El resultado de la división es de "+(num1/num2));
                break;    
        }
    }
}
