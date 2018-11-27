/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author enzop
 */
public class Medicamento {
    private String nome;
    private String  nomeFabricante;
    private String qtdMedicamento;

    public Medicamento(String nome, String nomeFabricante, String qtdMedicamento) {
        this.nome = nome;
        this.nomeFabricante = nomeFabricante;
        this.qtdMedicamento = qtdMedicamento;
    }

    public Medicamento() {
       
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }

    public String getQtdMedicamento() {
        return qtdMedicamento;
    }

    public void setQtdMedicamento(String qtdMedicamento) {
        this.qtdMedicamento = qtdMedicamento;
    }
    
    
    
}
