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
public class Enum {

    public enum Tipo {
        R("Residencial"), C("Comercial");
        private String tipo;

        Tipo(String tipo) {
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }
    }
}
