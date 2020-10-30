package com.gabriel.alura.java7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * CONCEITOS:
 *
 * Temos os termos Stream e Reader. Eles existem tanto para entrada quanto saída, mas por enquanto focaremos somente na entrada
 * 
 * Primeiro, temos uma Stream, capaz de ler bits e bytes, um "input stream of bytes". Em contrapartida, há o Reader, que também
 * faz uma leitura, só que esta é focada nos caracteres, "reading character streams". Se precisamos ler uma imagem ou um PDF,
 * por exemplo, utilizamos sempre o Stream, já se trabalhamos com um arquivo de texto, devemos utilizar o Reader
 * 
 * Além disso, há algo ainda mais geral que o FileInputStream, um conceito que representa o fluxo de dados binários, que é a
 * classe (abstrata) InputStream
 * 
 * No mundo Reader, vimos duas classes, a InputStreamReader e BufferedReader. O que ambas têm em comum é que são Readers,
 * ou seja, compete à elas a leitura de caracteres. Assim, o Reader também é um conceito, uma classe abstrata, que tem estas
 * duas classes como filhos concretos
 * 
 */

public class LeituraDeArquivo {
	
	// LEMBRETE: PARA LER UM ARQUIVO, ELE DEVE ESTAR SOLTO NO PROJETO, E !!!FORA!!! DA PASTA SRC

    public static void main(String[] args) throws IOException {
    	
            //Fluxo de Entrada com Arquivo
            FileInputStream fis = new FileInputStream("lorem.txt"); // Este construtor recebe String que é o nome do arquivo
            //fis.read(); // Não existe na classe FileInputStream um método que retorna texto... este retorna int
            
            // Então usamos a classe InputStreamReader:
            InputStreamReader isr = new InputStreamReader(fis); //Construtor recebe classe InputStream (FileInputStream extende ela)
            //isr.read(); // Porém ela também não possui método que retorna o texto do arquivo...
            
            // Vamos usar agora BufferedReader
            BufferedReader br = new BufferedReader(isr); // Construtor que recebe um Reader (InputStreamReader extende Reader)
            String linha = br.readLine(); // agora conseguimos ler uma linha do arquivo
            
            // Lendo e exibindo linhas até que não exista mais linha
            while (linha != null){
            	System.out.println(linha);
            	linha = br.readLine();
            }
            
            // Sempre depois de abrir um arquivo, é boa prática fechar
            br.close(); // Fechando o Buffered reader, automaticamente fecha o InputStreamReader e o FileInputStream também
            
    }
    
}
