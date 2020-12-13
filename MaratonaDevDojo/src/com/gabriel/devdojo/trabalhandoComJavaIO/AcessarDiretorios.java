package com.gabriel.devdojo.trabalhandoComJavaIO;

import java.io.File;
import java.io.IOException;

public class AcessarDiretorios {

	public static void main(String[] args) {

		// Criando uma pasta
		File pasta = new File(
				"C:\\Users\\capovila\\capacitacao\\MaratonaDevDojo\\src\\com\\gabriel\\devdojo\\javaIO\\MinhaPasta");
		pasta.mkdir();

		// Criando um arquivo na pasta já criada
		File file1 = new File(
				// "C:\\Users\\capovila\\capacitacao\\MaratonaDevDojo\\src\\com\\gabriel\\devdojo\\javaIO\\MinhaPasta\\teste.txt");
				pasta,"teste1.txt"); // forma mais simples de fazer a linha acima
		try {
			// Criando o arquivo no diretório especificado acima
			file1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Criando outro arquivo na pasta já criada
		File file2 = new File(
				// "C:\\Users\\capovila\\capacitacao\\MaratonaDevDojo\\src\\com\\gabriel\\devdojo\\javaIO\\MinhaPasta\\teste.txt");
				pasta,"teste2.txt"); // forma mais simples de fazer a linha acima
		try {
			// Criando o arquivo no diretório especificado acima
			file2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		listarArquivos();

	}
	
	// Percorrendo/listando arquivos de uma pasta
	public static void listarArquivos(){
		
		File pasta = new File("C:\\Users\\capovila\\capacitacao\\MaratonaDevDojo\\src\\com\\gabriel\\devdojo\\javaIO\\MinhaPasta");
		
		// Método .list() retorna um vetor de strings com o nome dos arquivos presentes em uma pasta
		String[] listaDeArquivos = pasta.list();
		
		// ForEach que mostra o nome de cada arquivo
		for (String arquivo : listaDeArquivos){
			System.out.println(arquivo);
		}
		
	}

}
