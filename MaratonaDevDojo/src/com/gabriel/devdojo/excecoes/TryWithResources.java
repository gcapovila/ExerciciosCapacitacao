package com.gabriel.devdojo.excecoes;

import java.io.*;

public class TryWithResources {
	
    public static void main(String[] args) {
    	lerArquivoClasseLeitor();
    }

    /**
     * Este método é "feio", pois tem um if == null dentro de try que está dentro de outro try
     */
    public static void lerArquivoOld() {
    	Reader reader = null;
    	try {
    		reader = new BufferedReader(new FileReader("text.txt"));
    	} catch (FileNotFoundException e) {
    		e.printStackTrace();
    	} finally {
    		try {
    			if (reader != null) {
    				reader.close();
    			}
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    }
    
    /**
     * Try with resources --> conceito
     */
    public static void lerArquivo() {
        try (Reader reader = new BufferedReader(new FileReader("text.txt"))) { /* No try with resources, declaramos o objeto
         																		* dentro do try 
         																		* 
         																		* Porém, tem que ser um objeto de uma classe
         																		* que implemente a interface AutoClosable
         																		* 
         																		* Se tiver mais de um objeto,
         																		* separar por ponto-e-vírgula */
            
        } catch (IOException e) {
            e.printStackTrace(); // E no try with resources, não é obrigatório colocar o catch se não desejar (má prática)
        } 
    }

    /**
     * Try with resources --> uso na prática
     * 
     * Quando passamos recursos no try (ou seja, passamos um objeto de classe que implementa AutoCloseable), o próprio
     * java se encarrega de fechar a conexão após sair do try catch (isso tira a necessidade de fazer aquele monte de 
     * try dentro de try do método "feio")
     */
    public static void lerArquivoClasseLeitor() {
        try (Leitor2 leitor2 = new Leitor2(); Leitor1 leitor1 = new Leitor1()) { /* Estamos passando dois objetos de clsses que
        																		  * implementam a interface AutoClosable */
        	// Invertemos (primeiro 2 depois 1) porque o AutoCloseable sempre fecha em ordem inversa do que foi aberto
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
