package com.kiarash.ahorcado.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Palabra implements Serializable{
    private String texto;
    private String categoria;
    private String pista;

    public Palabra(String texto, String categoria, String pista) {
        this.texto = texto;
        this.categoria = categoria;
        this.pista = pista;
    }

    public String getTexto() {
        return texto;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPista() {
        return pista;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Palabra palabra = (Palabra) o;
        return Objects.equals(texto, palabra.texto) && Objects.equals(categoria, palabra.categoria) && Objects.equals(pista, palabra.pista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(texto, categoria, pista);
    }
}
