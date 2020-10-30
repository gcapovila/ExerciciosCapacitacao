package com.gabriel.devdojo.excecoes;

/**
 * Created by William Suane on 6/22/2016.
 */
public class CustomException {
    public static void main(String[] args) {
        try {
            logar();
        } catch (CustomExceptionLoginInvalido e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void logar() throws CustomExceptionLoginInvalido{
        String usuarioBancoDeDados = "Goku";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";
        if(!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)){
            throw new CustomExceptionLoginInvalido();
        }else{
            System.out.println("Logado");
        }
    }
}
