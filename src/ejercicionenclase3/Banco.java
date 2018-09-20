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
public class Banco {
    private String codigo;
    private Tipo[] tipo;
    private Cuenta[] cuenta;
    
    //preguntar porqeu ahi seria agregacion
    public Banco(String codigo,Cuenta[] cuenta){
        this.codigo=codigo;
        this.tipo= new Tipo[2];
        this.cuenta= cuenta;
    }
    
    public void InformacionCunetas(){
        for (int i = 0; i < 2; i++) {
            System.out.println("----------------Cuenta "+(i+1)+"--------------------");
            System.out.println("Nombre del cliente: "+this.cuenta[i].getNomCliente());
            System.out.println("Numero de cuenta: "+this.cuenta[i].getNumeroDeCuenta());
            System.out.println("Slado corriente: "+this.cuenta[i].getCuentaCorriente());
            System.out.println("Fecha de creacion: ");
            System.out.println("Dia: "+this.cuenta[i].getFechaDeCreacion().getDia());
            System.out.println("Mes: "+this.cuenta[i].getFechaDeCreacion().getMes());
            System.out.println("Año: "+this.cuenta[i].getFechaDeCreacion().getAnnio());
            Movimiento[] movimiento = this.cuenta[i].getMovimientos(); 
            for (int j = 0; j < 2; j++) {
                Tipo[] tipo = movimiento[j].getTipo();
                System.out.println("Movimiento: "+(i+1));
                System.out.println("Tipo de movimineto: "+tipo[1]);
                System.out.println("Fecha: ");
                System.out.println("Dia: "+movimiento[j].getFecha().getDia());
                System.out.println("Mes: "+movimiento[j].getFecha().getMes());
                System.out.println("Año: "+movimiento[j].getFecha().getAnnio());
                System.out.println("Saldo anterior: "+movimiento[j].getSaldoAnterior());
                System.out.println("Cantidad: "+movimiento[j].getCantidad());
            }
        }
    }
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }

    public Tipo[] getTipo() {
        return tipo;
    }

    public void setTipo(Tipo[] tipo) {
        this.tipo = tipo;
    }

    public Cuenta[] getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta[] cuenta) {
        this.cuenta = cuenta;
    }
    
    
}
