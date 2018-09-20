/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionenclase3;

/**
 *
 * @author david
 */
import java.util.Scanner;
public class Movimiento {
    private double saldoAnterior;
    private double cantidad;
    private Tipo[] tipo;
    private Fecha fecha;
    
    public Movimiento(Fecha fecha, double saldoAnterior, double cantidad){
        this.fecha=fecha;
        this.saldoAnterior=saldoAnterior;
        this.cantidad=cantidad;
        this.tipo=new Tipo[2];
            //Preguntar al profe porque aquii es composicion y se especifica unicamente relacion de asociacion
        Scanner leer = new Scanner(System.in);
        System.out.println("Tipo de movimiento? ");
        System.out.println("1-Transaccion ");
        System.out.println("2-Retiro ");
        int seleccion = leer.nextInt();
        switch(seleccion){
            case 1: this.tipo[1] = new Tipo("Transaccion");
            break;
            case 2: this.tipo[1] = new Tipo("Retiro");
            break;
            default: break;
        }
    }
    
    public Fecha getFecha(){
        return fecha;
    }
    
    public void setFecha(Fecha fecha){
        this.fecha=fecha;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }
    
    
    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getCantidad() {
        return cantidad;
    }
    
    
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo[] getTipo() {
        return tipo;
    }
    
    
    public void setTipo(Tipo[] tipo) {
        this.tipo = tipo;
    }
}
