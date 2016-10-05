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
public enum Tipo {

    RESIDENCIAL("Residencial"),
    COMERCIAL("Comercial");

    private final String tipo;

    Tipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

