/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2Exercicio2;

/**
 *
 * @author laboratorio
 */
public class Onibus extends Carro{
    
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void exibeDadosOnibus(){
        System.out.println("\nNome: " +this.nome);
        System.out.println("Modelo: " +this.modelo);
    }
  
    
}
