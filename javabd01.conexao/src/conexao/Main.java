/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import DAO.PessoaDAO;
import beans.Pessoa;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args) {
        
        
        Conexao c = new Conexao();
        c.getConexao();
        
        
        Pessoa p = new Pessoa();
        p.setNome("Vit");
        p.setSexo("M");
        p.setIdioma("Português");
        
        PessoaDAO pDAO = new PessoaDAO();
        pDAO.inserir(p);
    }
}
