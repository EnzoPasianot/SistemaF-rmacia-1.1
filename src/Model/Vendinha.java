/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Fernas
 */
public class Vendinha {
    private String remedio;
    private int qtd;
    private double precounit;

    public String getRemedio() {
        return remedio;
    }

    public void setRemedio(String remedio) {
        this.remedio = remedio;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPrecounit() {
        return precounit;
    }

    public void setPrecounit(double precounit) {
        this.precounit = precounit;
    }

    public double getPrecototal() {
        return precototal;
    }

    public void setPrecototal(double precototal) {
        this.precototal = precototal;
    }
    private double precototal;
}