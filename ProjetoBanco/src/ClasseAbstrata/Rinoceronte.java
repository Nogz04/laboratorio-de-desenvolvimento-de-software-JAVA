/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata;

/**
 *
 * @author laboratorio
 */
public class Rinoceronte extends Animal{

    @Override
    public void emiteSom() {
        
        System.out.println("\nRUMMM-BRUMMM-RUMMM");

    }

    
    @Override
    public void movimentar() {
        System.out.println("O Rinoceronte " + especie + " esta caminhando...");
    
    }
    
    
}
