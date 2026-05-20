/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.egg_guia6;

import circunferencia.entidad.Circunferencia;
import circunferencia.servicios.ServicioCircunferencia;
import cuenta.entidad.Cuenta;
import cuenta.servicio.ServicioCuenta;
import java.util.Scanner;
import libro.entidades.Libro;
import libro.servicios.ServicioLibro;
import numeros.entidad.Numeros;
import numeros.servicio.ServicioNumeros;
import persona.entidad.Persona;
import persona.servicio.ServicioPersona;
import rectangulo.entidad.Rectangulo;
import rectangulo.servicios.ServicioRectangulo;

/**
 *
 * @author elpir
 */
public class EGG_Guia6 {
    public static void main(String[] args) {
        int ej;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que desea realizar:");
        ej = sc.nextInt();
        switch (ej) {
            case 1:
                ServicioLibro sl = new ServicioLibro();
                Libro l = sl.CreaLibro();

                System.out.println("El ISBN del libro es: " + l.getISBN());
                System.out.println("El título del libro es: " + l.getTitulo());
                System.out.println("El autor del título es: " + l.getAutor());
                System.out.println("La cantidad de paginas es de: " + l.getPaginas());
                
                break;
                
            case 2:
                ServicioCircunferencia scir = new ServicioCircunferencia();
                Circunferencia c = scir.creaCircunferencia();
                
                System.out.println("El área de la circunferencia es de :"+scir.area(c));
                System.out.println("El perímetro de la circunferencia es de: "+scir.perimetro(c));
                break;
                
            case 3:
                ServicioNumeros sn = new ServicioNumeros();
                Numeros n = sn.crearOperacion();
                
                System.out.println("Suma: "+n.getN1()+"+"+n.getN2()+"="+sn.suma(n));
                System.out.println("Resta: "+n.getN1()+"-"+n.getN2()+"="+sn.resta(n));
                System.out.println("Multiplicacion: "+n.getN1()+"*"+n.getN2()+"="+sn.multiplica(n));
                System.out.println("Division: "+n.getN1()+"/"+n.getN2()+"="+sn.divide(n));
                break;
            case 4:
                ServicioRectangulo sr = new ServicioRectangulo();
                Rectangulo r = sr.crearRectangulo();
                
                System.out.println("La superficie del rectangulo es de: "+sr.superficie(r));
                System.out.println("El perimetro del rectangulo es de: "+sr.perimetro(r));
                break;
            case 5:
                ServicioCuenta scuenta = new ServicioCuenta();
                Cuenta cuenta = scuenta.creaCuenta();
                
                System.out.println("Ingrese que desea hacer:\n 1) INGRESAR DINERO\n 2) RETIRAR DINERO\n3) EXTRACCION RAPIDA\n 4) CONSULTA SALDO\n 5) CONSULTA DATOS");
                int opcion = sc.nextInt();
                
                switch(opcion){
                    case 1:
                        System.out.println("INGRESAR");
                        scuenta.ingreso(cuenta);
                    break;
                    case 2: 
                        System.out.println("RETIRO");
                        scuenta.retiro(cuenta);
                        break;
                    case 3:
                        System.out.println("EXTRACCIÓN RÁPIDA");
                        scuenta.retiro(cuenta);
                        break;
                    case 4:
                        System.out.println("CONSULTA SALDO");
                        scuenta.muestraSaldo(cuenta);
                        break;
                    case 5:
                        System.out.println("CONSULTA DATOS");
                        scuenta.muestraDatos(cuenta);
                        break;
                        
                }
                break;
            case 6:
                
                break;
            case 7:
                ServicioPersona sp = new ServicioPersona();
                Persona p1 = sp.crearPersona();
                Persona p2 = sp.crearPersona();
                Persona p3 = sp.crearPersona();
                Persona p4 = sp.crearPersona();
                
                Persona[] personas={p1, p2, p3, p4};
                
                int bajoPeso=0;
                int pesoIdeal=0;
                int sobrepeso=0;
                int mayores=0;
                int menores=0;
                
                for(Persona p:personas){
                    int resultadoIMC = sp.calcularIMC(p);
                    
                    if(resultadoIMC==-1){
                        bajoPeso++;
                    }else if(resultadoIMC==0){
                        pesoIdeal++;
                    }else if(resultadoIMC==1){
                        sobrepeso++;
                    }
                    
                    boolean esMayor = sp.esMayor(p);
                    
                    if(esMayor==true){
                        mayores++;
                    }else{
                        menores++;
                    }
                }
                
                double porcentajeBajo = (bajoPeso*100)/personas.length;
                double porcentajeIdeal = (pesoIdeal*100)/personas.length;
                double porcentajeSobrepeso = (sobrepeso*100)/personas.length;
                
                System.out.println("El "+porcentajeBajo+"% tiene bajo peso\nEl "+porcentajeIdeal+"% tiene un peso ideal"
                        + "\nEl "+porcentajeSobrepeso+"% tiene sobrepeso");
                
                double porcentajeMayor = (mayores*100)/personas.length;
                double porcentajeMenor = (menores*100)/personas.length;
                
                System.out.println("El "+porcentajeMayor+"% es mayor de edad\nEl "+porcentajeMenor+"% es menor de edad");
                break;
                
                
        }
            
        
    }
}
