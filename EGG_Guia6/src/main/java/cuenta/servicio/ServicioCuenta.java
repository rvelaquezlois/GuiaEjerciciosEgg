/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta.servicio;

import cuenta.entidad.Cuenta;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author elpir
 */
public class ServicioCuenta {
    private Scanner sc = new Scanner(System.in);
    public Cuenta creaCuenta(){
        int noCuenta = ThreadLocalRandom.current().nextInt(1000,50000);
        long DNI = ThreadLocalRandom.current().nextLong(1000000, 40000000);
        double saldo = ThreadLocalRandom.current().nextDouble(900000, 2000000);
        double interes = 0;
        return new Cuenta(noCuenta, DNI, saldo, interes);
        
    }
    
    public void ingreso(Cuenta c){
        System.out.println("Ingrese la suma que quiera ingresar:");
        double ingreso = sc.nextDouble();
        c.setSaldo(c.getSaldo()+ingreso);
    }
    
    public void retiro(Cuenta c){
        System.out.println("Ingrese la suma que quiera retirar");
        double retiro = sc.nextDouble();
        if((c.getSaldo()-retiro)>=0){
            c.setSaldo(c.getSaldo()-retiro);
        } else{
            System.out.println("ERROR. No tiene fondos suficientes");
        }
    }
    
    public void extraccionRapida(Cuenta c){
        double retiro = (c.getSaldo()*0.20);
        c.setSaldo(c.getSaldo()-retiro);
        System.out.println("El monto de su retiro es de $"+retiro);
    }
    
    public void muestraSaldo(Cuenta c){
        System.out.println("SU SALDO ES DE $"+c.getSaldo());
    }
    
    public void muestraDatos(Cuenta c){
        System.out.println("LOS DATOS DE SU CUENTA SON:");
        System.out.println("Numero de cuenta: "+c.getNumeroCuenta());
        System.out.println("Saldo $"+ c.getSaldo());
        System.out.println("DNI de la cuenta "+c.getDNI());
    }
}
