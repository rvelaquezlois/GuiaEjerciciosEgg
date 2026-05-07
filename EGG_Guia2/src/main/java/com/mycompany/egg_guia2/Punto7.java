/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.egg_guia2;

/**
 *
 * @author elpir
 */
public class Punto7 {
    public String palabraCorrecta(String palabra){
        if(palabra.length()==4){
            palabra = palabra.concat("!");
        } else{
            palabra = palabra.concat("?");
        }
        return palabra;
    }
}
