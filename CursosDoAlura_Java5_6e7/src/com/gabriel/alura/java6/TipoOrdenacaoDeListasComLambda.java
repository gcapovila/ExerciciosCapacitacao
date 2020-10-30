package com.gabriel.alura.java6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TipoOrdenacaoDeListasComLambda {
	
	public static void main(String[] args) {

        Conta cc1 = new Conta(22, 33, "Alberto");
        Conta cc2 = new Conta(22, 44, "Paula");
        Conta cc3 = new Conta(22, 11, "Rodrigo");
        Conta cc4 = new Conta(22, 22, "Marta");

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        /**
         * Otimização da classe TipoOrdenacaoDeListasComClasseAnonima: usando lâmbda ao invés de classe anônima
         * 
         * -----------> NÃO FUNCIONA NO JAVA 7!!!!!!!!!!!!
         * 
         */
        
        // Isto é um LÂMBDA
        lista.sort( (Conta c1, Conta c2) -> {
	            	String nomeC1 = c1.getTitular();
	                String nomeC2 = c2.getTitular();
	                return nomeC1.compareTo(nomeC2);
	            }        
        );
        
        // Outra forma de fazer LÂMBDA
        Comparator<Conta> comparator = (Conta c1, Conta c2) -> {
        		String nomeC1 = c1.getTitular();
        		String nomeC2 = c2.getTitular();
        		return nomeC1.compareTo(nomeC2);
        };
        
        // Forma mais enxuta possível de fazer o LÂMBDA feito acima (ordenar por titular)
        lista.sort( (c1, c2)/*java sabe q são duas contas*/ -> /*n precisa return*/ c1.getTitular().compareTo(c2.getTitular()));
        
        // Forma mais enxuta possível de ordenar a conta por seu número
        lista.sort( (c1, c2) -> Integer.compare(c1.getNumero(),c2.getNumero()));
        
        System.out.println("Lista de contas ordenada:");
        System.out.println("");
        for (Conta conta : lista) {
            System.out.println(conta);
        }
	}
}



