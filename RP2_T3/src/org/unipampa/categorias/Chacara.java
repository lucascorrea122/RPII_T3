/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.categorias;



/**
 *
 * @author Esther Favero
 */
public class Chacara extends Imovel{
    
    private double areaConstruida;
    private int nroQuartos;
    private int anoConstrucao;
    private double distanciaCidade;
    
    public Chacara(String logradouro, int numero, String bairro,
            String cidade, String descricao, double areaTotal, double valor,
            double areaConstruida, int nroQuartos, int anoConstrucao, double distanciaCidade) {
        
        super(logradouro, numero, bairro, cidade, descricao, areaTotal, valor);
        this.areaConstruida = areaConstruida;
        this.nroQuartos = nroQuartos;
        this.anoConstrucao = anoConstrucao;
        this.distanciaCidade = distanciaCidade;
        
    }

    /**
     * @return the areaConstruida
     */
    public double getAreaConstruida() {
        return areaConstruida;
    }

    /**
     * @param areaConstruida the areaConstruida to set
     */
    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    /**
     * @return the nroQuartos
     */
    public int getNroQuartos() {
        return nroQuartos;
    }

    /**
     * @param nroQuartos the nroQuartos to set
     */
    public void setNroQuartos(int nroQuartos) {
        this.nroQuartos = nroQuartos;
    }

    /**
     * @return the anoConstrucao
     */
    public int getAnoConstrucao() {
        return anoConstrucao;
    }

    /**
     * @param anoConstrucao the anoConstrucao to set
     */
    public void setAnoConstrucao(int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }

    /**
     * @return the distanciaCidade
     */
    public double getDistanciaCidade() {
        return distanciaCidade;
    }

    /**
     * @param distanciaCidade the distanciaCidade to set
     */
    public void setDistanciaCidade(double distanciaCidade) {
        this.distanciaCidade = distanciaCidade;
    }
    
    public String toString(){
    String dados = super.getCodig()+" - Chácara";
        return dados;
    }
    
}
