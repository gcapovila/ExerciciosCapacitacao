package com.gabriel.devdojo.trabalhandoComJavaIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AcessarArquivos {

	public static void main(String[] args) {

		// Especificando que ser� criado arquivo no caminho informado (duas barras pq uma � do java e uma do windows) 
		File file = new File("C:\\Users\\capovila\\capacitacao\\MaratonaDevDojo\\src\\com\\gabriel\\devdojo\\javaIO\\Arquivo.txt");
		try {
			// Criando o arquivo no diret�rio especificado acima
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// M�todos da classe File: .exists(); .delete(); .canRead() --> permiss�o de leitura; .getPath(); getAbsolutePath(); etc
		
		// Escrevendo no arquivo (outras formas de fazer isso, ver curso 7 java do alura)
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("\nMensagem teste sendo escrita no arquivo\n\nLinha de baixo");
			// Descarregar tudo que est� no stream (t�nel de sa�da)
			fileWriter.flush();
			// Fechar o arquivo (pode-se usar tbm autocloasable, ver aula TryWithResources no pacote execoes)
			fileWriter.close();
			
			// Agora vamos ler o arquivo
			FileReader fileReader = new FileReader(file);
			// M�todo read retorna um int, precisamos converter para char (ver abaixo) ou BufferedReader (ver curso java 7 do alura)
			char[] conteudo = new char[500];
			int tamanho = fileReader.read(conteudo);
			
			// For que imprime caracter por caracter do conteudo do arquivo
			for (int i = 0; i < tamanho; i++){
				char caractereAtual = conteudo[i];
				System.out.print(caractereAtual);
			}
			
			// Fechando arquivo
			fileReader.close();
			
			//PARA FAZER O BLOCO ACIMA, MUITO MELHOR USAR BUFFEREDREADER (JAVA 7 DO ALURA ou AULA 100 DA MARATONA NO YOUTUBE)
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
