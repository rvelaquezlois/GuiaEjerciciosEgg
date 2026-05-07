/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.egg_guia2;

/**
 *
 * @author elpir
 */
public class Punto4 {
    public boolean letraCorrecta(char letra){
        boolean correcto;
        if(letra=='S' || letra=='N'){
            correcto = true;
        }else{
            correcto = false;
        }
        return correcto;
    }
}
