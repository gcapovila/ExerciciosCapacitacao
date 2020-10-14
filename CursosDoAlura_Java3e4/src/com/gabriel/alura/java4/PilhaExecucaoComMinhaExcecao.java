package com.gabriel.alura.java4;

import com.gabriel.alura.java3.polimorfismo.Gerente;

public class PilhaExecucaoComMinhaExcecao {

    public static void main(String[] args) {
        System.out.println("Início do método main - isto deve ser impresso primeiro");
        
        try{
        	metodo1();
        } catch (MinhaExcecao e){
        	System.out.println(e.getMessage()); // pega a mensagem da MinhaExcecao recebida abaixo
        }
        
        System.out.println("------------------------------");  
        System.out.println("Fim do main - isto deve ser impresso por último");
    }

    private static void metodo1() throws MinhaExcecao { /* Se a exceção extende RuntimeException, não é necessário declarar o
		   												 * "throws" ao declarar o método. Porém, se extende Exception, precisa */
        System.out.println("Início do metodo1");
        
        try{
        	metodo2();
        } catch (ArithmeticException e){
        	throw new MinhaExcecao(e.getMessage() + " na minha exceção"); // pega a mensagem da ArithmeticException recebida abaixo
        }
        
        System.out.println("Fim do metodo1 - aqui deve voltar para o main");
    }

    private static void metodo2() {
        System.out.println("Início do metodo2");
        System.out.println("------------------------------");       
        throw new ArithmeticException("Deu erro"); // se não colocar nada nos parêntesis, o getMessage da exceção vai retornar null
    }
} 
