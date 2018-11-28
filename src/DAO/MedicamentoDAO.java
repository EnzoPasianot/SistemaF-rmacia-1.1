/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Banco.Banco;
import Model.Medicamento;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author enzop
 */
public class MedicamentoDAO implements DAO<Medicamento>{
    private Medicamento medicamento;
     private java.sql.PreparedStatement pst; 
    //recebera estrutura com dados das tabelas
    private java.sql.ResultSet rs;
    
    @Override
    public boolean inserir(Medicamento obj) throws SQLException, ClassNotFoundException {
        String sql;
        Banco.abrir();
        sql = "INSERT INTO Medicamentos values (?,?,?,?,?,?,?,?);";
        pst = Banco.getConexao().prepareStatement(sql);
        //Atribuir os dados do model para o pst
        pst.setInt(1, obj.getCodigo());
        pst.setString(2, obj.getNomeComercial());
        pst.setString(3, obj.getNomeQuimico());
        pst.setString(4, obj.getLaboratorio());
        pst.setString(5, obj.getFormas());
        pst.setInt(6, obj.getQtd());
        pst.setDouble(7, obj.getPreco());
        pst.setInt(8, obj.isReceita() ? 1 : 0);
        
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
    public boolean alterar(Medicamento obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Medicamento obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Medicamento buscar(Medicamento obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Medicamento> listar(String criterio) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
