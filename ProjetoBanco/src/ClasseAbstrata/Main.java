/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args) {
        
        //Animal a = new Animal(); Não posso instanciar pois a classe Animal é abstrata
        
        Cachorro c = new Cachorro(); //Posso intanciar pois a classe Cachorro não é abstrata
        c.emiteSom();
        c.especie = "Vira-lata";
        c.movimentar();
        
        Rinoceronte r = new Rinoceronte();
        r.emiteSom();
        r.especie = "do Circo";
        r.movimentar();
    }
}
