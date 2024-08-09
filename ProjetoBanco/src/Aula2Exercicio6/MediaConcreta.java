/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2Exercicio6;

/**
 *
 * @author laboratorio
 */
public class MediaConcreta implements Media{

    @Override
    public double calcularMedia(double n1, double n2) {
        double resultado = (n1+n2)/2;
        return resultado;
    }

    @Override
    public double calcularMedia(double n1, double n2, double n3) {
        double resultado = (n1+n2+n3)/3;
        return resultado;
    }

    @Override
    public double calcularMedia(double n1, double n2, double n3, double n4) {
        double resultado = (n1+n2+n3+n4)/4;
        return resultado;
    }
    
}
