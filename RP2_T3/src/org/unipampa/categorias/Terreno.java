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
    
    private float dimensaoFrente;
    private float dimensaoLado;

    public Terreno(int codigo, String logradouro, int numero, String bairro, String cidade,
          String descricao, double areaTotal, double valor, float dimensaoFrente, float dimensaoLado) {
        super(codigo, logradouro, numero, bairro, cidade, descricao, areaTotal, valor);
        this.dimensaoFrente = dimensaoFrente;
        this.dimensaoLado = dimensaoLado;
    }

    /**
     * @return the dimensaoFrente
     */
    public float getDimensaoFrente() {
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
    public float getDimensaoLado() {
        return dimensaoLado;
    }

    /**
     * @param dimensaoLado the dimensaoLado to set
     */
    public void setDimensaoLado(float dimensaoLado) {
        this.dimensaoLado = dimensaoLado;
    }
    
    
    
}
