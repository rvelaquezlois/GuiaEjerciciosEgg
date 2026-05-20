/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona.servicio;

import persona.entidad.Persona;
import java.util.Scanner;
/**
 *
 * @author elpir
 */
public class ServicioPersona {
    private Scanner sc = new Scanner(System.in);
    
    public Persona crearPersona(){
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad");
        short edad = sc.nextShort();
        System.out.println("Ingrese su sexo por letra\nH: Hombre\nM: Mujer\n O: Otros");
        char sexo = sc.next().charAt(0);
        sexo = Character.toUpperCase(sexo);
        while(sexo!='H' && sexo!='M' && sexo!='O'){
            System.out.println("Ha ingresado mal el valor de sexo.\nIngrese su sexo por letra\nH: Hombre\nM: Mujer\n O: Otros");
            sexo = sc.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
        }
        System.out.println("Ingrese su peso:");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura en centimetros:");
        int altura = sc.nextInt();
        sc.nextLine();
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public short calcularIMC(Persona p){
        short var=-5;
        double alturaMt = p.getAltura()/100;
        double IMC = p.getPeso()/(Math.pow(alturaMt, 2));
        
        if(IMC<20){
            var = -1;
        }else if(IMC>=20 && IMC<=25){
            var = 0;
        } else if(IMC>25){
            var = 1;
        }
            return var;
    }
    
    public boolean esMayor(Persona p){
        boolean mayor=false;
        if(p.getEdad()>=18){
            mayor = true;
        }
        return mayor;
    }
}
