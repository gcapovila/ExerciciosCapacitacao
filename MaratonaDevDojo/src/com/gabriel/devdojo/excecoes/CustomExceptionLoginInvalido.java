package com.gabriel.devdojo.excecoes;

/**
 * Created by William Suane on 6/22/2016.
 */
public class CustomExceptionLoginInvalido extends Exception {

    public CustomExceptionLoginInvalido(){
        super("Usuário ou senha inválidos");
    }
}
