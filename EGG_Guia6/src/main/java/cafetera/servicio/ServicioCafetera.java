/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafetera.servicio;

import cafetera.entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author elpir
 */
public class ServicioCafetera {
    private Scanner sc = new Scanner(System.in);
    
    public void llenarCafetera(Cafetera c){
        c.setCantidadActual(c.getCantidadMaxima());
        System.out.println("CAFETERA LLENA");
    }
    
    public void servirTaza(Cafetera c){
        System.out.println("Ingrese el tamaño de la taza");
        
    }
}
