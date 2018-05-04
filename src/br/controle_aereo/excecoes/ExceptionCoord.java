package br.controle_aereo.excecoes;


public class ExceptionCoord extends Exception {

    public ExceptionCoord() {
        super("Erro Geral.");
    }

    public ExceptionCoord(String message) {
        super(message);
    }

}
