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
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
        System.out.println("-------------------Datos del movimiento---------------");
        System.out.println("Fecha de creacion: ");
        System.out.println("Dia:  ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Año: ");
        int annio = leer.nextInt();
        Fecha fecha = new Fecha(dia,mes,annio);
        System.out.println("Saldo anterior: ");
        double saldo =  leer.nextDouble();
        System.out.println("Cantidad: ");
        double cantidad = leer.nextDouble();
        this.movimientos[i]=new Movimiento(fecha, saldo, cantidad);
        }
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
