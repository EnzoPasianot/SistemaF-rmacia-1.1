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
public class Venda {
    private int idVenda;
    private String data;
    private float valorVenda;
    private String  nomeCliente;
    private String nomeProduto;
    private int qtdItem;

    public Venda(int idVenda, String data, float valorVenda, String nomeCliente, String nomeProduto, int qtdItem) {
        this.idVenda = idVenda;
        this.data = data;
        this.valorVenda = valorVenda;
        this.nomeCliente = nomeCliente;
        this.nomeProduto = nomeProduto;
        this.qtdItem = qtdItem;
    }
    
    public Venda(){
        
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }
    
    
    
}
