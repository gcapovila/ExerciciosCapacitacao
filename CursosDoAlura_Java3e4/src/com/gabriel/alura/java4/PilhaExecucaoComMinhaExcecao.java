package com.gabriel.alura.java4;

import com.gabriel.alura.java3.polimorfismo.Gerente;

public class PilhaExecucaoComMinhaExcecao {

    public static void main(String[] args) {
        System.out.println("In�cio do m�todo main - isto deve ser impresso primeiro");
        
        try{
        	metodo1();
        } catch (MinhaExcecao e){
        	System.out.println(e.getMessage()); // pega a mensagem da MinhaExcecao recebida abaixo
        }
        
        System.out.println("------------------------------");  
        System.out.println("Fim do main - isto deve ser impresso por �ltimo");
    }

    private static void metodo1() throws MinhaExcecao { /* Se a exce��o extende RuntimeException, n�o � necess�rio declarar o
		   												 * "throws" ao declarar o m�todo. Por�m, se extende Exception, precisa */
        System.out.println("In�cio do metodo1");
        
        try{
        	metodo2();
        } catch (ArithmeticException e){
        	throw new MinhaExcecao(e.getMessage() + " na minha exce��o"); // pega a mensagem da ArithmeticException recebida abaixo
        }
        
        System.out.println("Fim do metodo1 - aqui deve voltar para o main");
    }

    private static void metodo2() {
        System.out.println("In�cio do metodo2");
        System.out.println("------------------------------");       
        throw new ArithmeticException("Deu erro"); // se n�o colocar nada nos par�ntesis, o getMessage da exce��o vai retornar null
    }
} 
