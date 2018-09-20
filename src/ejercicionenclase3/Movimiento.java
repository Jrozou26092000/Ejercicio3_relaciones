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
public class Movimiento {
    private double saldoAnterior;
    private double cantidad;
    private Tipo tipo;
    private Fecha fecha;
    
    public Movimiento(Fecha fecha, double saldoAnterior, double cantidad, Tipo tipo){
        this.fecha=fecha;
        this.saldoAnterior=saldoAnterior;
        this.cantidad=cantidad;
        this.tipo=tipo;
    }
    
    public Fecha getFecha(){
        return fecha;
    }
    
    public void setFecha(Fecha fecha){
        this.fecha=fecha;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
