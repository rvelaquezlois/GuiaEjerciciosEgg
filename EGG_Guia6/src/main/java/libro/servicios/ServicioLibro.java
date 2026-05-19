/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.servicios;

import java.util.Scanner;
import libro.entidades.Libro;

/**
 *
 * @author elpir
 */
public class ServicioLibro {
    
    private Scanner sc = new Scanner(System.in);
    
    public Libro CreaLibro(){
        System.out.println("Ingrese el ISBN:");    
        long ISBN = sc.nextLong();
        sc.nextLine();
        System.out.println("Ingrese el título:");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor: ");
        String Autor = sc.nextLine();
        System.out.println("Ingrese la cantidad de paginas:");
        int paginas = sc.nextInt();
        return new Libro(ISBN, titulo, Autor, paginas);
    }
}
