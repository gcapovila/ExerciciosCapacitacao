package com.gabriel.alura.java4;

import com.gabriel.alura.java3.polimorfismo.Gerente;

public class PilhaDeExecucao {

    public static void main(String[] args) {
    	System.out.println("");
    	System.out.println("Testando pilha de execu��o");
    	System.out.println("");
        System.out.println("In�cio do m�todo main - isto deve ser impresso primeiro");
        metodo1(); // main chama o m�todo 1, ent�o aqui sa�mos do main
        System.out.println("Fim do main - isto deve ser impresso por �ltimo");
    }

    private static void metodo1() {
        System.out.println("In�cio do metodo1");
        metodo2(); // m�todo 1 chama o m�todo 2, ent�o aqui sa�mos do 1
        System.out.println("Fim do metodo1 - aqui deve voltar para o main");
    }

    private static void metodo2() {
        System.out.println("In�cio do metodo2");
        System.out.println("------------------------------");
        
        try {
        	
			//int a = 6 / 0; // vai dar ArithmeticException
			Gerente gerente = null;
			gerente.aumentaSalario(); // vai dar NullPointer
			
		} catch (ArithmeticException /* | NullPointerException */ // usar pipe para separar mais de um tipo de exce��o
				e) {
			
			System.out.println("Imposs�vel executar um: " + e.getMessage());
			
		} catch (NullPointerException e){ // ou fazer mais de um catch ao inv�s de separa por pipe
			
			System.out.println("Gerente n�o existe");
			e.printStackTrace();
			
		  /* Para tratar ao mesmo tempo mais de uma exce��o, al�m das duas formas apresentadas acima (usando pipe
		   * ou fazendo um catch para cada exce��o), uma outra forma � fazer um �nico catch, para a exce��o mais gen�rica
		   * catch (Exception e) --> pois todas as exce��es extendem a classe Exception */
        
    	} finally {
    		System.out.println("");
    		System.out.println("Este bloco sempre � executado independente se houver erro ou n�o");
    	}
        
        System.out.println("");
        System.out.println("");
        for(int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("Fim do metodo2 - aqui deve voltar para o m�todo 1");
    }
} 
