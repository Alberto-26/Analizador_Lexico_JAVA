/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jorge
 */
public class Token {
    private String lexema;
    private int numero_token;
    private int fila;
    private int columna;
    private String tipo;

    public Token() {
    }

    public Token(String lexema, int numero_token, int fila, int columna, String tipo) {
        this.lexema = lexema;
        this.numero_token = numero_token;
        this.fila = fila;
        this.columna = columna;
        this.tipo = tipo;
    }

    

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public int getNumero_token() {
        return numero_token;
    }

    public void setNumero_token(int numero_token) {
        this.numero_token = numero_token;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Token{" + "lexema=" + lexema + ", numero_token=" + numero_token + ", fila=" + fila + ", columna=" + columna + ", tipo=" + tipo + '}';
    }
    
    
    
}
