/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2Exercicio2;

/**
 *
 * @author laboratorio
 */
public class Carro {
    
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void exibeMsg(){
        System.out.println("Estou na classe Carro");
        System.out.println("Carro: " +nome);
    }
    
}
