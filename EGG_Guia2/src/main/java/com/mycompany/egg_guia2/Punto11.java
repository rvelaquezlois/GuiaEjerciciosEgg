/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.egg_guia2;

/**
 *
 * @author elpir
 */
public class Punto11 {
    public double Operaciones(char letra, int num1, int num2){
        double resultado=0;
        switch(letra){
            case 'S':
                resultado = num1+num2;
            break;
            case 'R':
                resultado = num1-num2;
                break;
            case 'M':
                resultado = num1*num2;
                break;
            case 'D':
                resultado = num1/num2;
                break;
        }
        return resultado;
    }
}
