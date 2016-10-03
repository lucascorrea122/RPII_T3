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
public class Imovel {
    
  private int codigo; 
  private String logradouro;
  private int numero;
  private String bairro;
  private String cidade;
  private String descricao;
  private double areaTotal;
  private double valor;
  
  
  public Imovel(int codigo, String logradouro, int numero, String bairro, String cidade,
          String descricao, double areaTotal, double valor){
      this.codigo = codigo;
      this.logradouro = logradouro;
      this.numero = numero;
      this.bairro = bairro;
      this.cidade = cidade;
      this.descricao = descricao;
      this.areaTotal = areaTotal;
      this.valor = valor;
  
  }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the areaTotal
     */
    public double getAreaTotal() {
        return areaTotal;
    }

    /**
     * @param areaTotal the areaTotal to set
     */
    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }
    
  @Override
    public String toString(){
        return "Código"+codigo+"\nLogradouro:"+logradouro;
    
        
    }
    
}
