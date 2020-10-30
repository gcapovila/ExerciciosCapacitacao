package com.gabriel.alura.java6;

import java.util.ArrayList;

public class Equals {

	public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new Conta(22, 11, "Jo�o");
        lista.add(cc);

        Conta cc2 = new Conta(22, 22, "Maria");
        lista.add(cc2);

        Conta cc3 = new Conta(22, 22, "Ana");
        Conta cc4 = cc2;
        
        System.out.println("J� existe CC2? " + lista.contains(cc2));
        
        /* Embora os valores dos atributos de cc2 e cc3 sejam iguais, eles referenciam objetos diferentes (porque escrevemos
         * "new" para criar nova conta em cada um). O m�todo contains como est� vai apenas ver se cc2 e cc3 referenciam o mesmo
         * objeto, e nete caso, n�o */
        System.out.println("J� existe CC3? " + lista.contains(cc3));
        
        // J� CC4 referencia o mesmo objeto que CC2, ent�o retorna true, mesmo sem que tenhamos feito lista.add(cc4);
        System.out.println("J� existe CC4? " + lista.contains(cc4));
        
        /**
         * PARA CONTORNAR O PROBLEMA DO CC3, E FAZER O contains(cc3) RETORNAR TRUE, � NECESS�RIO IMPLEMENTAR O M�TODO
         * EQUALS NA CLASSE CONTA, PORQUE A� VAI COMPARAR VALOR POR VALOR DE CADA ATRIBUTO, E N�O O OBJETO EM SI
         */
        
    }
	
}