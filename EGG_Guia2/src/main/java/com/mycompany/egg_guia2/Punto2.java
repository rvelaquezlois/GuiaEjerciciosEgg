/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.egg_guia2;

/**
 *
 * @author elpir
 */
public class Punto2 {
    public boolean sueldo(double sueldo_actual, double sueldo_minimo){
        boolean mayor;
        if(sueldo_actual>sueldo_minimo){
            mayor = true;    
        }
        else{
            mayor = false;
        }
        return mayor;
    }
}
