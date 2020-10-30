package com.gabriel.alura.java7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteLerUsandoFileWriterEPrintStream {
	
	public static void main(String[] args) throws IOException {
		
		// Mesma coisa da classe TesteEscritaDeArquivo, por�m usando FileWriter ao inv�s de OutputStreamWriter
		FileWriter fw = new FileWriter("lorem2.txt");
        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        fw.write(System.lineSeparator());
        fw.write(System.lineSeparator());
        fw.write("asfasdfsafdas dfs sdf asf assd�");

        fw.close();
        
        // Mesma coisa de novo, por�m usando BufferedWriter junto com FileWriter
        FileWriter fw2 = new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(fw2); // Ou passa direto new FileWriter("lorem2.txt")
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("asfasdfsafdas dfs sdf asf assd�");

        bw.close();
        
        // Ainda mesma coisa, por�m usando PrintStream

        PrintStream ps = new PrintStream("lorem2.txt");
        // PrintStream ps = new PrintStream(new File("lorem2.txt")); // Outra forma da linha acima, outro construtor do PrintStream
        // PrintWriter ps = new PrintWriter("lorem2.txt"); // Ainda outra forma da linha acima, usando agora PrintWriter n�o Stream

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println("asfasdfsafdas dfs sdf asf assd�");

        ps.close();

		
	}

}
