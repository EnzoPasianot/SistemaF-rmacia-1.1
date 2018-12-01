/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Banco.Banco;
import Model.Medicamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import views.MenuPrincipal;

/**
 *
 * @author enzop
 */
public class VendaDAO implements DAO {
    
    public void preencherComboBox(){
          
    }

    @Override
    public boolean inserir(Object obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterar(Object obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Object obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object buscar(Object obj) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Medicamento> listar(String criterio) throws SQLException, ClassNotFoundException {
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        String sql = "SELECT * FROM medicamentos;";       
        Banco.abrir();
        PreparedStatement pst = Banco.getConexao().prepareStatement(sql);
        //Executa a PESQUISA no banco
        ResultSet rs = pst.executeQuery();
        //le os proximos registros
        while(rs.next()) { 
            //mover os dados do resultSet para o objeto filme
            Medicamento medicamento = new Medicamento();
            medicamento.setNomeComercial(rs.getString("nomeComercial"));
            medicamento.setPreco(rs.getDouble("preco"));
            medicamento.setQtd(rs.getInt("quantidade"));
            medicamento.setCodigo(rs.getInt("codigo"));
            //adiciona o objeto Filme dentro da colecao
            medicamentos.add(medicamento);
        } //end while()
        //fecha o resultSet
        rs.close();
        Banco.fechar();
        //devolve a colecao
        return medicamentos;              
    }
    
}
