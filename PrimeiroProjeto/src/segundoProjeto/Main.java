/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundoProjeto;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args) {
        
        Livro livro = new Livro();
        
        livro.titulo = "O Pequeno Príncipe";
        livro.autor = "Antoine de Saint-Exupéry";
        livro.anoPublicacao = "6 de abril de 1943";
        
        System.out.println("\n      ==== LIVRO ====\n");
        System.out.println("Título: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Ano de Publicação: " +livro.anoPublicacao);
    }
    
    
}
