/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Banco.Banco;
import DAO.VendaDAO;
import Model.Medicamento;
import Model.Venda;
import Model.Vendinha;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author enzop
 */
public class TelaVenda extends javax.swing.JFrame {
    DefaultComboBoxModel<Medicamento> model = new DefaultComboBoxModel<>();
    /**
     * Creates new form TelaVenda
     */
        double valorparcial = 0;
    public TelaVenda() throws ParseException {
        initComponents();
        preenchercmbMedicamentos();
        txtValorTotal.setEnabled(false);
        try{
            MaskFormatter form = new MaskFormatter("##/##/####");
            txtCPF.setFormatterFactory(new DefaultFormatterFactory(form));
        } catch (ParseException ex) {
            Logger.getLogger(TelaVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtQtdVenda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtValorItem = new javax.swing.JTextField();
        txtValorTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnFinalizaVenda = new javax.swing.JButton();
        btnCancelaVenda = new javax.swing.JButton();
        btnADDItem = new javax.swing.JButton();
        txtData1 = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        cmbMedicamentos = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Venda");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Formulário de Vendas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Nome do Cliente: ");

        jLabel3.setText("Data da Venda:");

        jLabel4.setText("Medicamento:");

        jLabel5.setText("Quantidade:");

        jLabel6.setText("Valor:");

        jLabel10.setText("Valor Total:");

        btnFinalizaVenda.setText("Finalizar Venda");
        btnFinalizaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizaVendaActionPerformed(evt);
            }
        });

        btnCancelaVenda.setText("Cancelar Venda");
        btnCancelaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaVendaActionPerformed(evt);
            }
        });

        btnADDItem.setText("Adicionar");
        btnADDItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDItemActionPerformed(evt);
            }
        });

        jLabel7.setText("CPF:");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela);

        cmbMedicamentos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMedicamentosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(176, 176, 176)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(194, 194, 194)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnADDItem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)
                        .addGap(4, 4, 4)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinalizaVenda)
                    .addComponent(btnCancelaVenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnADDItem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFinalizaVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelaVenda))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(671, 495));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizaVendaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnFinalizaVendaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void cmbMedicamentosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMedicamentosItemStateChanged
        // TODO add your handling code here:
        Medicamento med = (Medicamento) evt.getItem();
        txtValorItem.setText(med.getNomeComercial());
        txtValorItem.setText(String.valueOf(med.getPreco()));
    }//GEN-LAST:event_cmbMedicamentosItemStateChanged
    List<Vendinha> vendinha = new ArrayList<>();
    private void btnADDItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDItemActionPerformed
        // TODO add your handling code here:
        Medicamento med = (Medicamento)cmbMedicamentos.getSelectedItem();
        if(med.getQtd() >= Integer.valueOf(txtQtdVenda.getText()) || Integer.valueOf(txtQtdVenda.getText()) < 0){
            int qtd = Integer.valueOf(txtQtdVenda.getText());
            double valoritem = Double.valueOf(txtValorItem.getText());
            valorparcial += qtd*valoritem;
            double valorparte = qtd*valoritem;
            txtValorTotal.setText(String.valueOf(valorparcial));
            
            Vector<String> header = new Vector<>(4);
            Vector registro;
            Vector linhas = new Vector();
            header.add("Remédio");
            header.add("Quantidade");
            header.add("Preço Unitário");
            header.add("Preço Total");
            
            Vendinha auxiliar = new Vendinha();
            auxiliar.setPrecototal(valorparte);
            auxiliar.setPrecounit(valoritem);
            auxiliar.setQtd(qtd);
            auxiliar.setRemedio(med.getNomeComercial());
            vendinha.add(auxiliar);
            
            for(Vendinha vnd : vendinha){
                registro = new Vector(4);
                registro.add(vnd.getRemedio());
                registro.add(vnd.getQtd());
                registro.add(vnd.getPrecounit());
                registro.add(vnd.getPrecototal());
                linhas.add(registro);
            }
            
            DefaultTableModel tab = new DefaultTableModel(linhas,header);
            tabela.setModel(tab);
            
            //ADICIONAR NA TABELA O IAGO Q VAI FAZER PRA MIM
        }else{
            JOptionPane.showMessageDialog(null, "A quantidade requerida é maior do que a quantidade em estoque!");
            txtQtdVenda.setText("");
            txtQtdVenda.requestFocus();
        }
    }//GEN-LAST:event_btnADDItemActionPerformed

    private void btnCancelaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaVendaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }//GEN-LAST:event_btnCancelaVendaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaVenda().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(TelaVenda.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
    
    public void preenchercmbMedicamentos(){
        List<Medicamento> dados = new ArrayList<>();
        VendaDAO vendadao = new VendaDAO();
        model.addElement(new Medicamento());
        try {
            dados = vendadao.listar("");
            for(Medicamento med : dados){
                model.addElement(med);
            }
            cmbMedicamentos.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, 
                    "Erro de SQL: " + ex.getMessage(),
                    "Mensagem ao Usuario",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, 
                    "Erro de Classe " + ex.getMessage(),
                    "Mensagem ao Usuario",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADDItem;
    private javax.swing.JButton btnCancelaVenda;
    private javax.swing.JButton btnFinalizaVenda;
    private javax.swing.JComboBox cmbMedicamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabela;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JFormattedTextField txtData1;
    private javax.swing.JTextField txtQtdVenda;
    private javax.swing.JTextField txtValorItem;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
