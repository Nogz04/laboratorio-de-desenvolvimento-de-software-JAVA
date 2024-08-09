/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata;

/**
 *
 * @author laboratorio
 */
public class Cachorro extends Animal{

    @Override
    public void emiteSom() {
        System.out.println("Au au au au");
    }

    @Override
    public void movimentar() {
        System.out.println("O cachorro " +especie+" esta se movimentando...");
    }
    
    
    
}
