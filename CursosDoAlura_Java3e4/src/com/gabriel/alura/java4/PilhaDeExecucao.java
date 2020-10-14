package com.gabriel.alura.java4;

import com.gabriel.alura.java3.polimorfismo.Gerente;

public class PilhaDeExecucao {

    public static void main(String[] args) {
    	System.out.println("");
    	System.out.println("Testando pilha de execução");
    	System.out.println("");
        System.out.println("Início do método main - isto deve ser impresso primeiro");
        metodo1(); // main chama o método 1, então aqui saímos do main
        System.out.println("Fim do main - isto deve ser impresso por último");
    }

    private static void metodo1() {
        System.out.println("Início do metodo1");
        metodo2(); // método 1 chama o método 2, então aqui saímos do 1
        System.out.println("Fim do metodo1 - aqui deve voltar para o main");
    }

    private static void metodo2() {
        System.out.println("Início do metodo2");
        System.out.println("------------------------------");
        
        try {
        	
			//int a = 6 / 0; // vai dar ArithmeticException
			Gerente gerente = null;
			gerente.aumentaSalario(); // vai dar NullPointer
			
		} catch (ArithmeticException /* | NullPointerException */ // usar pipe para separar mais de um tipo de exceção
				e) {
			
			System.out.println("Impossível executar um: " + e.getMessage());
			
		} catch (NullPointerException e){ // ou fazer mais de um catch ao invés de separa por pipe
			
			System.out.println("Gerente não existe");
			e.printStackTrace();
			
		  /* Para tratar ao mesmo tempo mais de uma exceção, além das duas formas apresentadas acima (usando pipe
		   * ou fazendo um catch para cada exceção), uma outra forma é fazer um único catch, para a exceção mais genérica
		   * catch (Exception e) --> pois todas as exceções extendem a classe Exception */
        
    	} finally {
    		System.out.println("");
    		System.out.println("Este bloco sempre é executado independente se houver erro ou não");
    	}
        
        System.out.println("");
        System.out.println("");
        for(int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("Fim do metodo2 - aqui deve voltar para o método 1");
    }
} 
