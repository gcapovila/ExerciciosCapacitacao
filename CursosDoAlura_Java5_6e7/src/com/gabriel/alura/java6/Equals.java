package com.gabriel.alura.java6;

import java.util.ArrayList;

public class Equals {

	public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new Conta(22, 11, "João");
        lista.add(cc);

        Conta cc2 = new Conta(22, 22, "Maria");
        lista.add(cc2);

        Conta cc3 = new Conta(22, 22, "Ana");
        Conta cc4 = cc2;
        
        System.out.println("Já existe CC2? " + lista.contains(cc2));
        
        /* Embora os valores dos atributos de cc2 e cc3 sejam iguais, eles referenciam objetos diferentes (porque escrevemos
         * "new" para criar nova conta em cada um). O método contains como está vai apenas ver se cc2 e cc3 referenciam o mesmo
         * objeto, e nete caso, não */
        System.out.println("Já existe CC3? " + lista.contains(cc3));
        
        // Já CC4 referencia o mesmo objeto que CC2, então retorna true, mesmo sem que tenhamos feito lista.add(cc4);
        System.out.println("Já existe CC4? " + lista.contains(cc4));
        
        /**
         * PARA CONTORNAR O PROBLEMA DO CC3, E FAZER O contains(cc3) RETORNAR TRUE, É NECESSÁRIO IMPLEMENTAR O MÉTODO
         * EQUALS NA CLASSE CONTA, PORQUE AÍ VAI COMPARAR VALOR POR VALOR DE CADA ATRIBUTO, E NÃO O OBJETO EM SI
         */
        
    }
	
}