/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Banco.Banco;
import Model.Cliente;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author enzop
 */
public class ClienteDAO implements DAO<Cliente>{
    private Cliente cliente;
    private java.sql.PreparedStatement pst; 
    //recebera estrutura com dados das tabelas
    private java.sql.ResultSet rs;
    @Override
    public boolean inserir(Cliente obj) throws SQLException, ClassNotFoundException {
        String sql;
        Banco.abrir();
        sql = "INSERT INTO Clientes values (?,?,?,?,?);";
        pst = Banco.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        pst.setString(1, obj.getCpf());
        pst.setDate(2, new java.sql.Date(obj.getDataNasc().getTime()));
        pst.setString(3, obj.getSexo());
        pst.setString(4, obj.getNome());
        pst.setString(5, obj.getTipo());
        
        //vamos executar o comando
        if(pst.executeUpdate() > 0) {
            Banco.fechar();
            return true;
        }
        else {
            Banco.fechar();
            return false;
        }
        
        
    }

    @Override
    public boolean alterar(Cliente obj) throws SQLException, ClassNotFoundException {
       String sql;
        //cria o comando DML
        sql = "UPDATE clientes SET cpf = ?, datanasc = ?, "
            + "sexo = ?, nome = ?, tipo = ? "
            + "WHERE cpf = ?;";
        //Cria o pst com base na conexao e no comando DML
        Banco.abrir();
        pst = Banco.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        pst.setString(1, obj.getCpf());
        pst.setDate(2, new java.sql.Date(obj.getDataNasc().getTime()));
        pst.setString(3, obj.getSexo());
        pst.setString(4, obj.getNome());
        pst.setString(5, obj.getTipo());
        
        //vamos executar o comando
        if(pst.executeUpdate() > 0) {
            Banco.fechar();
            return true;
        }
        else {
            Banco.fechar();
            return false;
        }
    }

    @Override
    public boolean excluir(Cliente obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente buscar(Cliente obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> listar(String criterio) throws SQLException, ClassNotFoundException {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
