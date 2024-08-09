/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2Exercicio4;

/**
 *
 * @author laboratorio
 */


/*Sobrecarga*/

public class Calculadora {
    
    public void somar(double n1, double n2){
        double resultado = n1+n2;
        System.out.println("Resultado: " +resultado);
    }
    
    public void somar(double n1, double n2, double n3){
        double resultado = n1+n2+n3;
        System.out.println("Resultado: " +resultado);
    }
}
