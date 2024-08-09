/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula2Exercicio3;

/**
 *
 * @author laboratorio
 */
public class PessoaJuridica extends Pessoa{

    private String CNPJ;
    private String socio;
    private String dataAbertura;

    public PessoaJuridica(String CNPJ, String socio, String dataAbertura, String nome, int idade) {
        super(nome, idade);
        this.CNPJ = CNPJ;
        this.socio = socio;
        this.dataAbertura = dataAbertura;
    }
    
    public void exibeDadosPJ(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("CNPJ: " +this.CNPJ);
        System.out.println("Socio: " +this.socio);
        System.out.println("Data de Abertura: " +this.dataAbertura);
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getSocio() {
        return socio;
    }

    public void setSocio(String socio) {
        this.socio = socio;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    
    
}
