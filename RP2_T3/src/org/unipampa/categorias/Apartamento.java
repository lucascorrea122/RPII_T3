/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.categorias;

/**
 *
 * @author Lucascorrea
 */
public class Apartamento extends Imovel {
    
    private int nroQuartos;
    private int nroVagasGaragem;
    private int anoConstrucao;
    private String nomeEdificio;
    private int andar;
    private int nroApt;
    private double valorCondominio;
    
    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Apartamento(int codigo, String logradouro, int numero, String bairro, String cidade,
          String descricao, double areaTotal, double valor, int nroQuartos, int nroVagasGaragem,
          int anoConstrucao, String nomeEdificio, int andar, int nroApt, double valorCondominio){
        super(codigo, logradouro, numero, bairro, cidade, descricao, areaTotal, valor);
        this.nroQuartos = nroQuartos;
        this.nroVagasGaragem = nroVagasGaragem;
        this.anoConstrucao = anoConstrucao;
        this.nomeEdificio = nomeEdificio;
        this.andar = andar;
        this.nroApt = nroApt;
        this.valorCondominio = valorCondominio;
    
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Gets/Sets/ToString">
    /**
     * @return the nroQuartos
     */
    public int getNroQuartos() {
        return nroQuartos;
    }

    /**
     * @return the nroVagasGaragem
     */
    public int getNroVagasGaragem() {
        return nroVagasGaragem;
    }

    /**
     * @param nroVagasGaragem the nroVagasGaragem to set
     */
    public void setNroVagasGaragem(int nroVagasGaragem) {
        this.nroVagasGaragem = nroVagasGaragem;
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
     * @return the nomeEdificio
     */
    public String getNomeEdificio() {
        return nomeEdificio;
    }

    /**
     * @param nomeEdificio the nomeEdificio to set
     */
    public void setNomeEdificio(String nomeEdificio) {
        this.nomeEdificio = nomeEdificio;
    }

    /**
     * @return the andar
     */
    public int getAndar() {
        return andar;
    }

    /**
     * @param andar the andar to set
     */
    public void setAndar(int andar) {
        this.andar = andar;
    }

    /**
     * @return the nroApt
     */
    public int getNroApt() {
        return nroApt;
    }

    /**
     * @param nroApt the nroApt to set
     */
    public void setNroApt(int nroApt) {
        this.nroApt = nroApt;
    }

    /**
     * @return the valorCondominio
     */
    public double getValorCondominio() {
        return valorCondominio;
    }

    /**
     * @param valorCondominio the valorCondominio to set
     */
    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }
    
    @Override
    public String toString(){
        String dados = super.getCodigo()+"Apartamento";
        return dados;
    }
//</editor-fold>
    
    
    
}
