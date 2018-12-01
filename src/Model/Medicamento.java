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
    private int codigo;
    private String nomeComercial;
    private String nomeQuimico;
    private String laboratorio;
    private String formas;
    private int qtd;
    private double preco;
    private boolean receita;

    @Override
    public String toString() {
        return this.nomeComercial;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeComercial() {
        return nomeComercial;
    }

    public void setNomeComercial(String nomeComercial) {
        this.nomeComercial = nomeComercial;
    }

    public String getNomeQuimico() {
        return nomeQuimico;
    }

    public void setNomeQuimico(String nomeQuimico) {
        this.nomeQuimico = nomeQuimico;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getFormas() {
        return formas;
    }

    public void setFormas(String formas) {
        this.formas = formas;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isReceita() {
        return receita;
    }

    public void setReceita(boolean receita) {
        this.receita = receita;
    }

    public Medicamento(int codigo, String nomeComercial, String nomeQuimico, String laboratorio, String formas, int qtd, double preco, boolean receita) {
        this.codigo = codigo;
        this.nomeComercial = nomeComercial;
        this.nomeQuimico = nomeQuimico;
        this.laboratorio = laboratorio;
        this.formas = formas;
        this.qtd = qtd;
        this.preco = preco;
        this.receita = receita;
    }

    public Medicamento() {
    }

    
}
