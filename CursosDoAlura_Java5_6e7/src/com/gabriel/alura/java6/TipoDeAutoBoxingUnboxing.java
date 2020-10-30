package com.gabriel.alura.java6;

import java.util.ArrayList;
import java.util.List;

public class TipoDeAutoBoxingUnboxing {
	
	public static void main(String[] args) {

        int idade = 29;
        List<Integer> numeros = new ArrayList<Integer>();// OBS: a classe Integer � do pacote java.lang e List � do java.util 
        
        numeros.add(idade); /* Teoricamente isso n�o seria poss�vel, pois ArrayList recebe uma refer�ncia a um objeto, e n�o uma 
         					 * vari�vel de tipo primitivo. Por�m, internamente, o Java transforma o primitivo em um objeto */
        
        numeros.add(12); // Tamb�m funciona, pois da mesma forma, 12 � automaticamente transformado em Integer
        
        /** Esta transforma��o, que ocorre automaticamente, de um primitivo em objeto � chamada de AUTOBOXING */
        
        Integer idadeRef1 = new Integer(29); /* Internamente, o java faz isso: converte int para objeto da classe wrapper Integer
         									  * Se eu fa�o isso explicitamente, o compilador acusa que est� depricated */
        
        Integer idadeRef2 = Integer.valueOf(29); // Forma correta de fazer o mesmo da linha acima
        
        int valor = idadeRef2.intValue(); /** Este m�todo converte valor de Integer (refer�ncia a objeto) para int (tipo primitivo)
        								    * Esta transforma��o (objeto para primitivo) se chama UNBOXING*/
        
        String s = "10";
        Integer numeroInteger = Integer.valueOf(s); // Funciona inclusive com Strings --> transforma em objeto da classe Integer
        System.out.println(numeroInteger);
        
        int numeroInt = Integer.parseInt(s); // Mesma coisa que a linha acima, mas se quisermos passar String para tipo primitivo   
        System.out.println(numeroInt);
        
        System.out.println(idadeRef1.doubleValue()); // Converte objeto da classe Integer para tipo primitivo double
        System.out.println("");
        
        /** Propriedades da classe Integer (valor m�ximo e m�nimo suportados, e quantidade de bits e bytes suportada por um int)*/
        System.out.println("------------- Propriedades da classe Integer -------------");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

	}
}
