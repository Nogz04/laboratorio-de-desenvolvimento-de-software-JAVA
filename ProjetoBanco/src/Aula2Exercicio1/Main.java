/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2Exercicio1;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Ricardo", 5);
        System.out.println("Nome: " +p.getNome());
        System.out.println("Idade: " +p.getIdade() );
        
        
        p.setNome("Matheus");
        p.setIdade(-1);
        System.out.println("\nNome: " +p.getNome());
        System.out.println("Idade: " +p.getIdade() );
    }
}
