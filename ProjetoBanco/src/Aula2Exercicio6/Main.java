/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2Exercicio6;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args) {
        
        MediaConcreta mc = new MediaConcreta();
        
        System.out.println("Media: " + mc.calcularMedia(2, 2));
        System.out.println("Media: " + mc.calcularMedia(3, 3, 3));
        System.out.println("Media: " + mc.calcularMedia(4, 4, 4, 4));
       
    }
}
