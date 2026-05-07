/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.egg_guia2;

/**
 *
 * @author elpir
 */
public class Punto8 {
    public boolean notas(int n1, int n2, int n3){
        boolean notasCorrectas;
        if((n1>=1 && n1<=10) && (n2>=1 && n2<=10) && (n3>=1 && n3<=10)){
            notasCorrectas = true;
        } else{
            notasCorrectas = false;
        }
        return notasCorrectas;
    }
}
