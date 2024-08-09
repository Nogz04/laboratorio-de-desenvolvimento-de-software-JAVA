/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobanco;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args) {
        
    

        ContaCorrente novaConta = new ContaCorrente();
        
        novaConta.definirSaldoInicial(1000);
        novaConta.sacar(500);
        novaConta.depositar(50);
        novaConta.sacar(600);
      
        
    }
}