package com.gabriel.alura.java7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscritaECopiaDeArquivo {
	
    public static void main(String[] args) throws IOException {
    	
            FileInputStream fis = new FileInputStream("lorem.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            
            /* Vamos copiar os dados do arquivo lorem para um novo arquivo lorem3 (poderia usar um arquivo existente,
             * por exemplo, o lorem2, ao invés de criar o novo) */
            OutputStream fos = new FileOutputStream("lorem3.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            
            String linha = br.readLine();
            
            // Copiando os dados do lorem pro lorem3
            while (linha != null){
            	bw.write(linha);
            	bw.newLine();
            	linha = br.readLine();
            }
            
            // Devemos fechar tanto o reader quanto o writer
            br.close();
            bw.close();
            
    }
    
}
