/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Pessoa;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author laboratorio
 */
public class PessoaDAO {
    
    private Conexao conexao; //Criando objeto conexao da classe Conexao.java
    private Connection conn; //Criando objeto a partir da função Connection que conecta no bando de dados.
    
    public PessoaDAO(){ //Criando construor vazio da classe PessoaDAO.
        
        this.conexao = new Conexao(); //instanciando o objeto conexão.
        this.conn = this.conexao.getConexao(); //dizendo que o objeto criado da função Connection esta utilizando o método da Classe Conexão chamado GetConexao.
    }
    
    
    public void inserir(Pessoa pessoa){
        
        String sql = "INSERT INTO pessoa (nome, sexo,idioma) VALUES (?,?,?);"; //Criando texto em código SQL que irá fazer com que crie as linhas de códgo que criam a tabela.
        
        try{
            
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());
            
            stmt.execute();
        }catch(SQLException ex){
            System.out.println("Erro ao inserir pessoa: " +ex.getMessage());
        }
          
    }
    
   
    
}
