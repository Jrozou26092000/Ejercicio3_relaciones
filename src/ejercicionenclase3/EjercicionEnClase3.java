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
public class EjercicionEnClase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creación del banco
        Banco bank= new Banco("America");
        //Creación del tipo de transacciones que se pueden realizar
        Tipo tipoTransaccion[]=new Tipo[2];
        tipoTransaccion[0].setCodigo("Consignación");
        tipoTransaccion[1].setCodigo("Retiro");
        //Creacion de dos cuentas para el banco
        Fecha fechaDeCreacion=new Fecha(10,5,2017);
        Cuenta cuenta[]= new Cuenta[2];
        cuenta[1]= new Cuenta(1000, 1000.1, fechaDeCreacion, "X");
        cuenta[2]= new Cuenta(1001, 1000.2, fechaDeCreacion, "Y");
        //Asignacion de los atributos de tipo de transacciones y de cuentas para el banco
        bank.setTipo(tipoTransaccion);
        bank.setCuenta(cuenta);
        
        Movimiento[] movimiento= new Movimiento[5];
        
        for (int i = 0; i < 5; i++) {
            movimiento[i]=new Movimiento(fechaDeCreacion, i, i, tipoTransaccion[0]);
        }
    }
    
}
