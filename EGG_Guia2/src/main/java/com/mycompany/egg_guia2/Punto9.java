/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.egg_guia2;

/**
 *
 * @author elpir
 */
public class Punto9 {
    public boolean PrimerLetra(String palabra){
        char letra = palabra.charAt(0);
        boolean correcto;
        letra = Character.toUpperCase(letra);
        if(letra=='A'){
            correcto=true;
        }else {
            correcto = false;
        }
        return correcto;
    }
}
