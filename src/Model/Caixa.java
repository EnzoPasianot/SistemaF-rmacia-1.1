/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author enzop
 */
public class Caixa {
    private int idFunc;
    private Date DataAbertura;
    private Date DataFechamento;
    private int status;

    public Caixa(int idFunc, Date DataAbertura, Date DataFechamento, int status) {
        this.idFunc = 0;
        this.DataAbertura = null;
        this.DataFechamento = null;
        this.status = 0;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public Date getDataAbertura() {
        return DataAbertura;
    }

    public void setDataAbertura(Date DataAbertura) {
        this.DataAbertura = DataAbertura;
    }

    public Date getDataFechamento() {
        return DataFechamento;
    }

    public void setDataFechamento(Date DataFechamento) {
        this.DataFechamento = DataFechamento;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }   
}
