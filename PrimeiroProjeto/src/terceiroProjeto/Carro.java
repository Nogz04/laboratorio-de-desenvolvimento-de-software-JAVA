/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceiroProjeto;

/**
 *
 * @author laboratorio
 */
public class Carro {
    
    public String marca, modelo;
    
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void alugar(){
        System.out.println("\nCarro " + marca + " " + modelo + " alugado!");
    }
    
    public void devolver(){
        System.out.println("Carro " + marca + " " + modelo + " devolvido!");
    }
    
    public void mostrarDados(){
        System.out.println("\n  ==== CARRO ====\n");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " +this.modelo);
        
    }
}
