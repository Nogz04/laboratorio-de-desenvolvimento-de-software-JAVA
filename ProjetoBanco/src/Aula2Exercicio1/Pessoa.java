/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2Exercicio1;

/**
 *
 * @author laboratorio
 */
public class Pessoa {
        
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
        else{
            System.out.print("\nIdade negativa, impossivel atribuicao");
        }
        
    }

    public Pessoa(String nome, int idade) {
        
        this.nome = nome;
        
        if (idade >= 0) {
            this.idade = idade;
        }
        else{
            System.out.print("\nIdade negativa, impossivel atribuicao");
        }
        
    }
    
}
