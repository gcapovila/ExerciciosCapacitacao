package com.gabriel.devdojo.conceitos.strings;

public class PerformanceDeStrings {
	
    public static void main(String[] args) {
    	
        long inicio = System.currentTimeMillis(); // Hora do sistema ao iniciar o processo
        concatString(70000); // Se fazemos uma String processar um for tantas vezes, leva muito tempo
        long fim = System.currentTimeMillis(); // Hora do sistema ao terminar o processo
        System.out.println("Tempo gasto String " + (fim - inicio) + " ms"); // Tempo gasto para processar o for dentro do m�todo

        inicio = System.currentTimeMillis();
        concatStringBuilder(1000000); // J� com o builder, n�o h� esse problema
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer " + (fim - inicio) + " ms");
        
    }

    // Quando fazemos um processamento grande como esse, a String demora muito, e podemos ter probelmas de performance
    private static void concatString(int tam) {
        String string = "";
        for (int i = 0; i < tam; i++) {
            string += i;
        }
    }

    // Podemos, ent�o, ao inv�s de String, usar a classe StringBuilder, que � bem mais otimizada
    private static void concatStringBuilder(int tam) {
        StringBuilder sb = new StringBuilder(tam);
        for (int i = 0; i < tam; i++) {
            sb.append(i);
        }
    }

    // J� a classe StringBuffer � pouco menos otimizada que a builder, por�m permote trabalhar com multi-threads de processamento
    private static void concatStringBuffer(int tam) {
        StringBuffer sb = new StringBuffer(tam);
        for (int i = 0; i < tam; i++) {
            sb.append(i);
        }
    }
    
}
