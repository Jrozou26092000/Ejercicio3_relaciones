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
        
        //Creación del tipo de transacciones que se pueden realizar
        //Creacion de dos cuentas para el banco
        Fecha fechaDeCreacion=new Fecha(10,5,2017);
        Cuenta[] cuenta= new Cuenta[2];
        System.out.println("Cuenta 1: ");
        cuenta[0]= new Cuenta(1000, 1000.1, fechaDeCreacion, "X");
        System.out.println("Cuenta 2: ");
        cuenta[1]= new Cuenta(1001, 1000.2, fechaDeCreacion, "Y");
        Banco bank= new Banco("America", cuenta);
        bank.InformacionCunetas();
    }
    
}
