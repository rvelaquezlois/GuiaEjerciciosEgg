/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafetera.entidad;

/**
 *
 * @author elpir
 */
public class Cafetera {
    private final int cantidadMaxima = 1000;
    private int cantidadActual;

    public Cafetera(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
}
