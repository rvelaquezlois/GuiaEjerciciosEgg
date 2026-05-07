/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.egg_guia2;

/**
 *
 * @author elpir
 */
public class Punto1 {
    public String mayor(int edad){
        String mayor_menor;
        if(edad>=18){
            mayor_menor = "El usuario es mayor de edad";
        } else{
            mayor_menor = "El usuario es menor de edad";
        }
        return mayor_menor;
    }
}
