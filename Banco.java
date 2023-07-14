/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Cesar Perez
 */

//Clase main que llamara a los metodos de cuenta
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        //Se crea un objeto a partir de Cuenta con dos parametros
        Cuenta cuenta1= new Cuenta("Cesar", 5000);
        
        System.out.printf("Saldo de %s: $%.2f%n", cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
        
        
        //Recibe de teclado 
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Deposito=1     Retirar=0");
        int numero= entrada.nextInt();
        
        //Sentencia que avanzara a la instruccion establecida por el usuario
        if(numero==1){
            System.out.println("Escribe monto");
                double montoDeposito= entrada.nextDouble();
            System.out.printf("Deposito de: $%.2f a la cuenta de %s%n ", montoDeposito,
                                cuenta1.obtenerNombre());   //Se guarda en el parametro montoDeposito la cantidad ingresada
                cuenta1.depositar(montoDeposito);         //Llama al metodo depositar para obtener el nuevo saldo
            System.out.println("Saldo:"+ cuenta1.obtenerSaldo());    
                        
                }
        else{
            System.out.println("Escribe monto a retirar");
                double retiro= entrada.nextDouble();
            System.out.println("Retiro de: "+ retiro);      //Se guarda en el parametro retiro la cantidad ingresada
                cuenta1.retirar(retiro);                    //Llama al metodo depositar para obtener el nuevo saldo       
            System.out.println("Saldo: "+ cuenta1.obtenerSaldo());
                        
            } 
        
    }
    
}
