/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.egg_guia2;

/**
 *
 * @author elpir
 */
public class Punto10 {
public boolean primerUltimaPalabra(String palabra){
    char primer_letra;
    char ultima_letra;
    boolean correcto;
    primer_letra = palabra.charAt(0);
    ultima_letra = palabra.charAt(palabra.length()-1);
    if(primer_letra==ultima_letra){
        correcto = true;
    } else{
        correcto = false;
    }
    return correcto;
}    
}
