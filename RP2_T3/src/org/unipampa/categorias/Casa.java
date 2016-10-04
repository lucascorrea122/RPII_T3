/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.categorias;

/**
 *
 * @author tobia
 */
public class Casa extends Imovel {

    private int tipo;
    private double arconst;
    private int nquartos;
    private int ngaragem;
    private int anoc;

    public Casa(int codigo, String logradouro, int numero, String bairro, String cidade, String descricao, double areaTotal, double valor, int tipo, double arconst, int nquartos, int ngaragem, int anoc) {
        super(codigo, logradouro, numero, bairro, cidade, descricao, areaTotal, valor);
        this.tipo = tipo;
        this.arconst = arconst;
        this.nquartos = nquartos;
        this.ngaragem = ngaragem;
        this.anoc = anoc;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the arconst
     */
    public double getArconst() {
        return arconst;
    }

    /**
     * @param arconst the arconst to set
     */
    public void setArconst(double arconst) {
        this.arconst = arconst;
    }

    /**
     * @return the nquartos
     */
    public int getNquartos() {
        return nquartos;
    }

    /**
     * @param nquartos the nquartos to set
     */
    public void setNquartos(int nquartos) {
        this.nquartos = nquartos;
    }

    /**
     * @return the ngaragem
     */
    public int getNgaragem() {
        return ngaragem;
    }

    /**
     * @param ngaragem the ngaragem to set
     */
    public void setNgaragem(int ngaragem) {
        this.ngaragem = ngaragem;
    }

    /**
     * @return the anoc
     */
    public int getAnoc() {
        return anoc;
    }

    /**
     * @param anoc the anoc to set
     */
    public void setAnoc(int anoc) {
        this.anoc = anoc;
    }
    
    @Override
    public String toString() {
        String tip = "";

        switch (this.tipo) {
            case 0:
                tip = Enum.Tipo.R.getTipo();
                break;
            case 1:
                tip = Enum.Tipo.C.getTipo();
                break;
            
        }
        

        return super.toString() + "Tipo:"+tipo+"\nÁrea Construída:"+arconst+"\nNúmero de quartos:"+nquartos+"\nNúmero de vagas na garagem:"+ngaragem+"\nAno de construção"+anoc;
    }

}
