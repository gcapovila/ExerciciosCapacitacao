package com.gabriel.devdojo.excecoes;

import java.io.File;
import java.io.IOException;

/**
 * Created by William Suane on 6/10/2016.
 */
public class CheckedExceptionTest {
    public static void main(String[] args) {

        try {
			criarArquivo();// como este m�todo lan�a uma exce��o checked, � obrigat�rio trat�-la aqui (ou lan�ar de novo com throws)
		} catch (IOException e) {
			e.printStackTrace();
		} 
        
        System.out.println("----------------");
        
        abrirArquivo(); // este m�todo n�o tem exce��o checked, n�o preciso trat�-la

    }

    public static void criarArquivo() throws IOException { /* IOException � uma checked exeption, ou seja, obrigat�rio tratar 
     														* (try catch), ou lan�a (throws) --> no caso est� fazendo ambos*/
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
        } finally { // O finally ser� sempre executado (tendo ou n�o acontecido a exce��o)
            System.out.println("Fechar o arquivo");
        }
        return null;
    }
}
