package com.gabriel.alura.java7;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscritaDeArquivo {
	
	public static void main(String[] args) throws IOException {
    	
            //Fluxo de Saída com Arquivo
            OutputStream fos = new FileOutputStream("lorem2.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            
            bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
            bw.newLine(); // Equivale a um enter; estamos dando dois newLine pra pular uma linha e depois ir para a de baixo
            bw.newLine();
            bw.write("asfasdfsafdas dfs sdf asf assdß");

            bw.close(); // Fechando o Buffered reader, automaticamente fecha o InputStreamReader e o FileInputStream também
            
    }
    
}
