package com.gabriel.alura.java4;

import com.gabriel.alura.java3.polimorfismo.Gerente;

public class PilhaExecucaoComUmError {

    public static void main(String[] args) {
        System.out.println("Início do método main - isto deve ser impresso primeiro");
        
        try{
        	metodo1();
        } catch (ArithmeticException e){
        	System.out.println(e.getMessage());
        }
        
        System.out.println("------------------------------");  
        System.out.println("Fim do main - isto deve ser impresso por último");
    }

    private static void metodo1() {
        System.out.println("Início do metodo1");
        metodo2();
        System.out.println("Fim do metodo1 - aqui deve voltar para o main");
    }

    private static void metodo2() {
    	System.out.println("Início do metodo 2");
    	/*metodo2();*/ /* Um método se auto-chamar eternamente causa stack overflow na pilha de execução
    	 				* Stack overflow é um tipo de Error, e não Exception. Tanto Error quanto Exception extendem a classe Throwable
    	 				* mas Error são coisas mais internas, para quem desenvolve a máquina virtual Java */
    	System.out.println("Fim do metodo 2");
    }
} 
