package com.gabriel.alura.java7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * CONCEITOS:
 *
 * Temos os termos Stream e Reader. Eles existem tanto para entrada quanto sa�da, mas por enquanto focaremos somente na entrada
 * 
 * Primeiro, temos uma Stream, capaz de ler bits e bytes, um "input stream of bytes". Em contrapartida, h� o Reader, que tamb�m
 * faz uma leitura, s� que esta � focada nos caracteres, "reading character streams". Se precisamos ler uma imagem ou um PDF,
 * por exemplo, utilizamos sempre o Stream, j� se trabalhamos com um arquivo de texto, devemos utilizar o Reader
 * 
 * Al�m disso, h� algo ainda mais geral que o FileInputStream, um conceito que representa o fluxo de dados bin�rios, que � a
 * classe (abstrata) InputStream
 * 
 * No mundo Reader, vimos duas classes, a InputStreamReader e BufferedReader. O que ambas t�m em comum � que s�o Readers,
 * ou seja, compete � elas a leitura de caracteres. Assim, o Reader tamb�m � um conceito, uma classe abstrata, que tem estas
 * duas classes como filhos concretos
 * 
 */

public class LeituraDeArquivo {
	
	// LEMBRETE: PARA LER UM ARQUIVO, ELE DEVE ESTAR SOLTO NO PROJETO, E !!!FORA!!! DA PASTA SRC

    public static void main(String[] args) throws IOException {
    	
            //Fluxo de Entrada com Arquivo
            FileInputStream fis = new FileInputStream("lorem.txt"); // Este construtor recebe String que � o nome do arquivo
            //fis.read(); // N�o existe na classe FileInputStream um m�todo que retorna texto... este retorna int
            
            // Ent�o usamos a classe InputStreamReader:
            InputStreamReader isr = new InputStreamReader(fis); //Construtor recebe classe InputStream (FileInputStream extende ela)
            //isr.read(); // Por�m ela tamb�m n�o possui m�todo que retorna o texto do arquivo...
            
            // Vamos usar agora BufferedReader
            BufferedReader br = new BufferedReader(isr); // Construtor que recebe um Reader (InputStreamReader extende Reader)
            String linha = br.readLine(); // agora conseguimos ler uma linha do arquivo
            
            // Lendo e exibindo linhas at� que n�o exista mais linha
            while (linha != null){
            	System.out.println(linha);
            	linha = br.readLine();
            }
            
            // Sempre depois de abrir um arquivo, � boa pr�tica fechar
            br.close(); // Fechando o Buffered reader, automaticamente fecha o InputStreamReader e o FileInputStream tamb�m
            
    }
    
}
