/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.crud;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.unipampa.categorias.Imovel;
import java.util.List;
import org.unipampa.categorias.Apartamento;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author junin
 */
public class ListaImoveisCrud implements ListaImoveis {

    private ArrayList<Imovel> imoveis = new ArrayList();
    private String tipo;
    
    public ListaImoveisCrud(String tipo){
        this.tipo = tipo;
    }
    

  

    @Override
    public boolean incluir(Imovel im) {
        imoveis.add(im);
        return true;
    }

    @Override
    public Imovel consultar(int codigo) {
        for (Imovel imovei : imoveis) {
            if (imovei.getCodig() == codigo) {
                return imovei;
            }
        }
        return null;
    }

    @Override
    public boolean editar(int codigo, Imovel im) {
        for (Imovel submissao1 : this.imoveis) {
            if (submissao1.getCodig() == codigo) {
                im.setCodig(submissao1.getCodig());
                int index = imoveis.indexOf(submissao1);
                imoveis.set(index, im);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean excluir(int codigo) {
        for (Imovel imovei : imoveis) {
            if (imovei.getCodig() == codigo) {
                imoveis.remove(imovei);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Imovel> ordenarCodigo() {
        for (int i = 0; i < imoveis.size() - 1; i++) {
            int aux = i;
            for (int j = i + 1; j < imoveis.size(); j++) {
                if (imoveis.get(j).getCodig() < imoveis.get(aux).getCodig()) {
                    aux = j;
                }
            }

            Imovel menor = imoveis.get(aux);
            // imoveis.get(aux) = imoveis.get(i);
            // imoveis.get(i) = menor;
        }
        return imoveis;

    }

    @Override
    public List<Imovel> ordenarValor() {
        for (int i = 0; i < imoveis.size() - 1; i++) {
            int aux = i;
            for (int j = i + 1; j < imoveis.size(); j++) {
                if (imoveis.get(j).getValor() < imoveis.get(aux).getValor()) {
                    aux = j;
                }
            }

            Imovel menor = imoveis.get(aux);
            //  imoveis.get(aux) = imoveis.get(i);
            // imoveis.get(i) = menor;
        }
        return imoveis;
    }

    @Override
    public List<Imovel> ordenarArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imovel> pesquisaValor(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Imovel> pesquisaBairro(String bairro) {
        ArrayList<Imovel> imoveisBairro = new ArrayList();
        for (Imovel imovei : imoveis) {
            if (imovei.getBairro().equalsIgnoreCase(bairro)) {
                imoveisBairro.add(imovei);
            }
        }
        return imoveisBairro;
    }

    @Override
    public boolean escreverArquivo() {
    try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+System.getProperty("file.separator")+this.tipo+".csv"));
        
            for (Imovel imovel : imoveis) {
                bw.write(imovel.writeFile());
            }
            
            bw.close();
            
            return true;
        } catch (IOException ex) {
            Logger.getLogger(ListaImoveisCrud.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }}
    

    @Override
    public boolean lerArquivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Imovel> getLista(){
        return this.imoveis;
    
    }
}
