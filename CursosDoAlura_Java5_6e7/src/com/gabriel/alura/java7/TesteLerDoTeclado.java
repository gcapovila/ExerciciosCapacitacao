package com.gabriel.alura.java7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteLerDoTeclado {
	
    public static void main(String[] args) throws IOException {
    	
            InputStream fis = System.in; // O tipo da classe � s� InputStream, pq n recebe um arquivo, e sim o que foi digitado
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            
            OutputStream fos = new FileOutputStream("lorem4.txt"); // Posso definir a sa�da como um arquivo
            //OutputStream fos = System.out; // Mas tamb�m posso definir a sa�da como o pr�prio console
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            
            System.out.println("Digite o texto a ser inserido no arquivo (enter duas vezes para sair):");
            
            String linha = br.readLine();
            
            // Copiando os dados lidos no teclado para o lorem4
            while (linha != null /*Garantindo o "enter duas vezes para sair": */ && !linha.isEmpty()){
            	bw.write(linha);
            	bw.newLine();
            	bw.flush(); // Se eu quiser que seja "somente um enter para sair" (ele "d� descarga" logo no primeiro linha.isEmpty)
            	linha = br.readLine();
            }
            
            // Devemos fechar tanto o reader quanto o writer
            br.close();
            bw.close();
            
    }
    
}
