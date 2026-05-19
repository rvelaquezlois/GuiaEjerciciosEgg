/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circunferencia.servicios;

import circunferencia.entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author elpir
 */
public class ServicioCircunferencia {
    private Scanner sc = new Scanner(System.in);
    
    public Circunferencia creaCircunferencia(){
        System.out.println("Ingrese el radio de la circunferencia:");
        double radio = sc.nextDouble();
        return new Circunferencia(radio);
    }
    
   public double area(Circunferencia c){
       return Math.PI*Math.pow(c.getRadio(), 2);
   }
   
   public double perimetro(Circunferencia c){
       return 2*Math.PI*c.getRadio();
   }
}
