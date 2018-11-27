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
        pst.setString(2, obj.getDataNasc());
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
