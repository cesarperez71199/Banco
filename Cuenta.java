/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Cesar Perez
 */

//Clase que tiene los metodos de la cuenta Bancaria

public class Cuenta {
 

    //Variables de instancia
    private String nombre;
    private double saldo;
    

    //Constructor que recibe dis parametros    
    public Cuenta(String nombre, double saldoInicial)
    {
        this.nombre=nombre;
        
        
    //Comprueba que el saldo inicial sea valido
        if(saldoInicial > 0.0)
            this.saldo= saldoInicial;  //saldo(instancia) tomara el valor de saldoInicial
        
    }

    
    //Metodo que deposita al saldo
    public void depositar(double montoDeposito)
    {
        
    //Comprueba que el deposito sea valido
        if(montoDeposito > 0.0)
            saldo= saldo + montoDeposito;    //Suma el deposito a saldo(instancia)
    }
    
    
    
    //Metodo que retira de saldo 
    public void retirar(double retiro)
    {
    
    //Comprueba que retiro sea valido
        if(retiro <= saldo )
                saldo= saldo - retiro;      //Resta de saldo la cantidad retirada
        
        else{
            System.out.println("El monto excede los fondos");
        
        }
        
    }
    
    
    //Metodo que obtiene el saldo 
    public double obtenerSaldo()
    {
        return saldo;
    }
    
    //Metodo que recibe el nombre de la cuenta
    public void establecerNombre(String nombre)
    {
        this.nombre= nombre;
    }
    
    
    //Metodo que obtiene el nombbre de la cuenta para que sea usado en la aplicacion
    public String obtenerNombre()
    {
        return nombre;
    }
    
}
