/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Banco.Banco;
import Model.Caixa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import views.MenuPrincipal;

/**
 *
 * @author enzop
 */
public class CaixaDAO implements DAO<Caixa>{
    
    private java.sql.PreparedStatement pst; 
    //recebera estrutura com dados das tabelas
    private java.sql.ResultSet rs;
    private int contador;
       
    
    @Override
    public boolean inserir(Caixa obj) throws SQLException, ClassNotFoundException {
        String sql;
        String count;
        Banco.abrir();
        count = "SELECT count(*) as contador from controleCaixa where status = 1;";
        pst = Banco.getConexao().prepareStatement(count);
        rs = pst.executeQuery();
        rs.next();
        int alo = rs.getInt("contador");
        int id = 0;
        sql = "SELECT idFunc as id from Funcionarios where logado = 1;";
        try {
            Banco.abrir();
            PreparedStatement pst = Banco.getConexao().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            rs.next();
            id = rs.getInt("id");
            Banco.fechar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        if (alo == 0){
            sql = "INSERT INTO controleCaixa (idFunc, abertura, status) values (?, NOW() ,?);";
            Banco.abrir();
            pst = Banco.getConexao().prepareStatement(sql);
            pst.setInt(1, id);
            pst.setInt(2,1);
        }else{
            sql = "update controleCaixa set fechamento = NOW(), status = ? where idFunc = ? and status = ?;";
            Banco.abrir();
            pst = Banco.getConexao().prepareStatement(sql);
            pst.setInt(1, 0);
            pst.setInt(2, id); 
            pst.setInt(3, 1);
        }
        
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
    public boolean alterar(Caixa obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Caixa obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Caixa buscar(Caixa obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Caixa> listar(String criterio) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
