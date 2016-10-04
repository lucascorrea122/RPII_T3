/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.categorias;

/**
 *
 * @author junin
 */
public class SalaComercial extends Imovel {

    private int Nbanheiros;
    private String nome;
    private int andar;
    private int Nsala;
    private double valorCondominio;

    public SalaComercial(int codigo, String lagradouro, int numero, String bairro, String cidade,
            String descricao, double areaTotal, double valor, int Nbanheiros, String nome, int andar, int Nsala,
            double valorCondominio) {
        super(codigo, lagradouro, numero, bairro, cidade, descricao, areaTotal, valor);
        this.Nbanheiros = Nbanheiros;
        this.Nsala = Nsala;
        this.nome = nome;
        this.andar = andar;
        this.valorCondominio = valorCondominio;

    }

    public int getNbanheiros() {
        return Nbanheiros;
    }

    public String getNome() {
        return nome;
    }

    public int getAndar() {
        return andar;
    }

    public int getNsala() {
        return Nsala;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setNbanheiros(int Nbanheiros) {
        this.Nbanheiros = Nbanheiros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public void setNsala(int Nsala) {
        this.Nsala = Nsala;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    @Override
    public String toString() {
        String dados =  "Nome do Edificio: " + nome + "\n" + "\n" + "\n";

        dados += super.toString() + "\n";

        dados += "Numero de Banheiros: " + Nbanheiros + "\n"
                + "Andar: " + andar + "\n"
                + "Numero de Salas: " + Nsala + "\n"
                + "Valor do Condominio: " + valorCondominio + "\n" + "\n";
        return dados;
    }

}
