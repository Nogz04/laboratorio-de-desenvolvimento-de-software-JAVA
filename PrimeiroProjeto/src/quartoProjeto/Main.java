/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quartoProjeto;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();
             
        c.somar(10, 10);
        
        double retorno;
        retorno = c.somar2(100, 100);
        System.out.println("Resultado da soma: " + retorno);
    }
    
    
}
