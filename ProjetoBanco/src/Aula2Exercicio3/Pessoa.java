/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2Exercicio3;

/**
 *
 * @author laboratorio
 */
public class Pessoa {
    
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void exibeDados(){
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
    }
    
    
}
