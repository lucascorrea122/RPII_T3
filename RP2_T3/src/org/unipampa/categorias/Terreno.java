/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.categorias;

/**
 *
 * @author luh-l
 */
public class Terreno extends Imovel{
    
    private double dimensaoFrente;
    private double dimensaoLado;

    public Terreno(int codigo, String logradouro, int numero, String bairro, String cidade,
          String descricao, double areaTotal, double valor, double dimensaoFrente, double dimensaoLado) {
        super(logradouro, numero, bairro, cidade, descricao, areaTotal, valor);
        this.dimensaoFrente = dimensaoFrente;
        this.dimensaoLado = dimensaoLado;
    }

    /**
     * @return the dimensaoFrente
     */
    public double getDimensaoFrente() {
        return dimensaoFrente;
    }

    /**
     * @param dimensaoFrente the dimensaoFrente to set
     */
    public void setDimensaoFrente(float dimensaoFrente) {
        this.dimensaoFrente = dimensaoFrente;
    }

    /**
     * @return the dimensaoLado
     */
    public double getDimensaoLado() {
        return dimensaoLado;
    }

    /**
     * @param dimensaoLado the dimensaoLado to set
     */
    public void setDimensaoLado(float dimensaoLado) {
        this.dimensaoLado = dimensaoLado;
    }

    @Override
    public String toString() {
        String dados = super.toString();
        dados+= "Terreno{" + "dimensaoFrente=" + dimensaoFrente + ", dimensaoLado=" + dimensaoLado + '}';
        return dados;
    }
    
    
    
}
