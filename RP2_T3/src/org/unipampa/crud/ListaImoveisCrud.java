/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.crud;

import java.util.ArrayList;
import org.unipampa.categorias.Imovel;
import java.util.List;
import org.unipampa.categorias.Apartamento;

/**
 *
 * @author Lucascorrea
 */
public class ListaImoveisCrud implements ListaImoveis {
    
    private List<Imovel> listaImoveis = new ArrayList();
    
    //<editor-fold defaultstate="collapsed" desc="Incluir">
    @Override
    public boolean incluir(Imovel imovel) {
        listaImoveis.add(imovel);
        return true;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Consultar">
    @Override
    public Imovel consultar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Editar">
    @Override
    public boolean editar(int codigo, Imovel im) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Excluir">
     @Override
    public boolean excluir(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="Ordenar Código, Valor e Area">
    @Override
    public List<Imovel> ordenarCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public List<Imovel> ordenarValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Imovel> ordenarArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Pesquisar Valor e Bairro">
    @Override
    public List<Imovel> pesquisaValor(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imovel> pesquisaBairro(String bairro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Escrever e Ler Arquivo ">
    @Override
    public boolean escreverArquivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean lerArquivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//</editor-fold>
    
    
}
