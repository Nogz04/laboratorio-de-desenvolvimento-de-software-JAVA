/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeiroprojeto;

/**
 *
 * @author laboratorio
 */
public class Disciplina {
    public static void main(String[] args) {
        
        Professor professor = new Professor();
        Laboratorio lab = new Laboratorio();
        
        professor.nome = "Ricardo";
        lab.local = "SALA 108 - Laboratório de Desenvolvimento de Software";
        
        System.out.println("Nome do Professor: " + professor.nome);
        System.out.println("Local do Laboratório: " + lab.local);
        
    }
    
}
