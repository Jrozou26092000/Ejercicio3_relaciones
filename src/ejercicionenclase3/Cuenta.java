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
public class Cuenta {
    private int numeroDeCuenta;
    private double cuentaCorriente;
    private Fecha fechaDeCreacion;
    private String nomCliente;
    private Movimiento[] movimientos;
    
    public Cuenta(int numeroDeCuenta, double cuentaCorriente, Fecha fechaDeCreacion, String nomCliente){
        this.cuentaCorriente=cuentaCorriente;
        this.fechaDeCreacion= fechaDeCreacion;
        this.nomCliente=nomCliente;
        this.numeroDeCuenta=numeroDeCuenta;
        this.movimientos= new Movimiento[5];
    }
    
    public int getNumeroDeCuenta(){
        return numeroDeCuenta;
    }
    
    public void setNumeroDeCuenta(int ndc){
        this.numeroDeCuenta=ndc;
    }

    public double getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(double cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    public Fecha getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Fecha fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimiento[] movimientos) {
        this.movimientos = movimientos;
    }
    
    
}
