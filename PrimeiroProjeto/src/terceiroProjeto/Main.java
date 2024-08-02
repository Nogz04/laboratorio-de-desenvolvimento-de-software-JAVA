/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceiroProjeto;

import java.util.Scanner;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a marca do carro: ");
        String marca = sc.nextLine();
        
        System.out.println("Informe o modelo do carro: ");
        String modelo = sc.nextLine();
        
        Carro c = new Carro(marca, modelo);
        c.mostrarDados();
        c.alugar();
        c.devolver();
        
    }
}
