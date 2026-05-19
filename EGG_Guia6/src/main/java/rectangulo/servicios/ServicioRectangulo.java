package rectangulo.servicios;


import java.util.Scanner;
import rectangulo.entidad.Rectangulo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elpir
 */
public class ServicioRectangulo {
    private Scanner sc = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese la base del rectangulo:");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura del rectangulo:");
        double altura = sc.nextDouble();
        return new Rectangulo(altura, base);
    }
    
    public double superficie(Rectangulo r){
        double superficie = r.getBase()*r.getAltura();
        return superficie;
    }
    
    public double perimetro(Rectangulo r){
        double perimetro = (r.getBase()+r.getAltura())*2;
        return perimetro;
    }
}
