package com.gabriel.devdojo.conceitos.strings;

public class PerformanceDeStrings {
	
    public static void main(String[] args) {
    	
        long inicio = System.currentTimeMillis(); // Hora do sistema ao iniciar o processo
        concatString(70000); // Se fazemos uma String processar um for tantas vezes, leva muito tempo
        long fim = System.currentTimeMillis(); // Hora do sistema ao terminar o processo
        System.out.println("Tempo gasto String " + (fim - inicio) + " ms"); // Tempo gasto para processar o for dentro do método

        inicio = System.currentTimeMillis();
        concatStringBuilder(1000000); // Já com o builder, não há esse problema
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

    // Podemos, então, ao invés de String, usar a classe StringBuilder, que é bem mais otimizada
    private static void concatStringBuilder(int tam) {
        StringBuilder sb = new StringBuilder(tam);
        for (int i = 0; i < tam; i++) {
            sb.append(i);
        }
    }

    // Já a classe StringBuffer é pouco menos otimizada que a builder, porém permote trabalhar com multi-threads de processamento
    private static void concatStringBuffer(int tam) {
        StringBuffer sb = new StringBuffer(tam);
        for (int i = 0; i < tam; i++) {
            sb.append(i);
        }
    }
    
}
