/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeros.servicio;

import java.util.Scanner;
import numeros.entidad.Numeros;

/**
 *
 * @author elpir
 */
public class ServicioNumeros {
    private Scanner sc = new Scanner(System.in);
    
    public Numeros crearOperacion(){
        System.out.println("Ingrese el primer numero");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int n2 = sc.nextInt();
        return new Numeros(n1, n2);
    }
    
    public int suma(Numeros n){
        int suma = n.getN1()+n.getN2();
        return suma;
    }
    
    public int resta(Numeros n){
        int resta = n.getN1()-n.getN2();
        return resta;
    }
    
    public String multiplica(Numeros n){
        int mult = 0;
        String multiplicacion;
        if((n.getN1()*n.getN2())!=0){
           mult = n.getN1()*n.getN2(); 
           multiplicacion = String.valueOf(mult);
        } else{
            multiplicacion = "ERROR";
        }
      
        return multiplicacion;
    }
    
    public String divide(Numeros n){
        String dividir;
        if((n.getN1()/n.getN2())!=0){
        int div = n.getN1()/n.getN2();  
        dividir = String.valueOf(div);
        } else{
            dividir = "ERROR";
        }
        
        return dividir;
    }
}
