package com.gabriel.alura.java7;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class UsarArquivoCSV {

	public static void main(String[] args) throws Exception {

		// Lendo o arquivo CSV 
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		// Enquanto o CSV tiver uma pr�xima linha, impreme a pr�xima linha no console
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			/** 
			 * A seguir, duas formas de pegar individualmente cada elemento separado por v�rgula no CSV
			 */
			
			// FORMA 1:
			// Salvar em um vetor[] e obter pelo �ndice do vetor
			String[] valores = linha.split(","); // Separar por v�rgulas
			System.out.println(valores[3]);
			
			// FORMA 2:
			// Criar um novo Scanner, que recebe a linha atual
            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US); // Local US: para que aceite 210.0 como 210,0 (o ponto separando casas decimais)
            linhaScanner.useDelimiter(","); // Separar por v�rgulas

            String valor1 = linhaScanner.next();
            int valor2 = linhaScanner.nextInt(); // Recebe um int
            int valor3 = linhaScanner.nextInt();
            String valor4 = linhaScanner.next();
            double valor5 = linhaScanner.nextDouble(); // Recebe um double

            	// Exibindo no console (de forma concatenada)
            System.out.println(valor1 + " | " + valor2 + " | " + valor3 + " | " + valor4 + " | " + valor5);
            
            	// Exibindo no console (de forma otimizada)
            String valorFormatado = String.format(
            		Locale.US, // Locale.US for�a a usar ponto e n�o v�rgula para casas decimais
            		//new Locale("pt","BR"), // Criar um novo locale, pt BR, for�a a usar v�rgula e n�o pontos para casas decimais
            		"%s | %d | %d | %s | %.2f", valor1, valor2, valor3, valor4, valor5); //Construtor recebe locale e depois strings
            System.out.println(valorFormatado);

            // Fechando o novo scanner
            linhaScanner.close();
			
		}

		// Fechando o arquivo CSV
		scanner.close();

	}

}
