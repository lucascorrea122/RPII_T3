/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unipampa.frames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.unipampa.crud.ListaImoveisCrud;

/**
 *
 * @author Esther Favero
 */
public class ChacaraView {

    ListaImoveisCrud listaI = new ListaImoveisCrud();
    
    //MENU MINICURSO
    public void menuChacara() {
        Scanner ler = new Scanner(System.in);
        int opcao = 10;
        String titulo = null;
        while (opcao != 0) {
            System.out.println("-------------------------------------------------------------------------------------------------------- ");
            System.out.println("                      Bem vindo ao menu da Chácara!  Escolha uma opção abaixo:                           ");
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.println("  [1]Incluir um artigo                                                                                                         ");
            System.out.println("  [2]Excluir um artigo                                                                                                       ");
            System.out.println("  [3]Editar um artigo                                                                                                         ");
            System.out.println("  [4]Pesquisar artigo por titulo                                                                                      ");
            System.out.println("  [5]Pesquisar artigo por autor                                                                                      ");
            System.out.println("  [6]Voltar ao menu  de categorias!!                                                                             ");
            System.out.println("--------------------------------------------------------------------------------------------------------");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1://CADASTRAR 
                    popularArrayArtigo();

                    break;

                case 2://EXCLUIR 
                    System.out.println("Titulo da artigo que deseja excluir");
                    titulo = ler.next();
                    ler.nextLine();
                    if (!lsub.excluir(titulo)) {
                        System.out.println("Nao foi possivel excluir o artigo");
                    } else {
                        System.out.println("Excluido com sucesso");
                    }

                    break;
                case 3://EDITAR 
                    System.out.println("Titulo do artigo que deseja editar");
                    titulo = ler.next();
                    ler.nextLine();
                    Submissao sub = lsub.consultarTitulo(titulo);
                    Artigo editArtigo = (Artigo) sub;
                    if (editArtigo == null) {
                        System.out.println("Edição não concluida ou artigo não encontrado");
                    } else {
                        editarArtigoIndividual(editArtigo);
                    }
                    break;

                case 4://PESQUISAR  POR TITULO
                    System.out.println("Pesquisar por titulo:");
                    Submissao aux = null;
                    aux = lsub.consultarTitulo(ler.next());
                    if (aux != null) {
                        mostra(aux);
                    } else {
                        System.out.println("Nao foi possivel encontrar o artigo");
                    }
                    break;

                case 5://PESQUISAR  POR AUTOR
                    List<Submissao> listAux = new ArrayList();
                    System.out.println("Pesquisar por autor:");
                    listAux = lsub.consultarAutor(ler.next());
                    if (listAux.size() == 0) {
                        System.out.println("Nao foi possivel encontrar");
                    } else {
                        mostra(listAux);
                    }
                    break;
                case 6://FINALIZAR O PROGRAMA
                    return;
                default:
                    System.out.println("Comando Invalido");
                    break;
            }
        }
    }

}
