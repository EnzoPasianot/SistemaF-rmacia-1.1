/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Banco.Banco;
import Model.Caixa;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

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
        if (alo == 0){
            Date horario = new Date();
            java.sql.Timestamp dataSql = new java.sql.Timestamp(horario.getTime());
            sql = "INSERT INTO controleCaixa (idFunc, abertura, fechamento, status) values (?,?,?,?);";
            Banco.abrir();
            pst = Banco.getConexao().prepareStatement(sql);
            pst.setInt(1, 500); //"-- COLOCAR O LBL DO ID FUNCIONARIO NO LUGAR DO 500-NÃO SEI COLOCAR ENZO ME AJUDA"
            pst.setTimestamp(2, dataSql); //na hora de fechar o banco tem que colocar o ultimo valor (de fechamento)
            pst.setTimestamp(3, dataSql);
            pst.setInt(4,1);
        }else{
            Date horario = new Date();
            java.sql.Timestamp dataSql = new java.sql.Timestamp(horario.getTime());
            sql = "update controleCaixa set fechamento = ?, status = ? where idFunc = ? and status = ?;";
            Banco.abrir();
            pst = Banco.getConexao().prepareStatement(sql);
            pst.setTimestamp(1, dataSql);
            pst.setInt(2, 0);
            pst.setInt(3, 500); 
            pst.setInt(4, 1);
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
