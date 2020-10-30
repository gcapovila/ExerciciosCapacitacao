package com.gabriel.devdojo.excecoes;

import java.io.File;
import java.io.IOException;

/**
 * Created by William Suane on 6/10/2016.
 */
public class CheckedExceptionTest {
    public static void main(String[] args) {

        try {
			criarArquivo();// como este método lança uma exceção checked, é obrigatório tratá-la aqui (ou lançar de novo com throws)
		} catch (IOException e) {
			e.printStackTrace();
		} 
        
        System.out.println("----------------");
        
        abrirArquivo(); // este método não tem exceção checked, não preciso tratá-la

    }

    public static void criarArquivo() throws IOException { /* IOException é uma checked exeption, ou seja, obrigatório tratar 
     														* (try catch), ou lança (throws) --> no caso está fazendo ambos*/
        File file = new File("Teste.txt");
        try {
            System.out.println("Arquivo criado? : " + file.createNewFile());
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static String abrirArquivo() {
        try {
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando a leitura do arquivo");
            System.out.println("Escrevendo no arquivo");
            return "valor";
        } catch (Exception e) {
            System.out.println("Dentro do catch");
            e.printStackTrace();
        } finally { // O finally será sempre executado (tendo ou não acontecido a exceção)
            System.out.println("Fechar o arquivo");
        }
        return null;
    }
}
