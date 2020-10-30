package com.gabriel.alura.java6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TipoOrdenacaoDeListasComClasseAnonima {
	
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
        
        // Isto é uma classe anônima: na hora que passo o objeto para o método, já crio uma classe dentro dos () de parâmetro
        lista.sort(new Comparator<Conta>() { /* Chamando new Comparator<Conta>() - com () - estou criando aqui dentro um objeto
         									  * que implementa a interface Comparator 
         									  * 
         									  * Chama classe anônima, porque ela não tem um nome*/
        	
        		// Porque só precisaria desse objeto para poder chamar uma implementação do método compare
	            @Override
	            public int compare(Conta c1, Conta c2) {
	            	String nomeC1 = c1.getTitular();
	                String nomeC2 = c2.getTitular();
	                return nomeC1.compareTo(nomeC2);
	            }
        	}
        
        );
        
        // Outra forma de fazer classe anônima
        Comparator<Conta> comparator = new Comparator<Conta>() { 
        	
        	@Override
        	public int compare(Conta c1, Conta c2) {
        		String nomeC1 = c1.getTitular();
        		String nomeC2 = c2.getTitular();
        		return nomeC1.compareTo(nomeC2);
        	}
        	
        };
        
        System.out.println("Lista de contas, ordenada por titular:");
        System.out.println("");
        for (Conta conta : lista) {
            System.out.println(conta);
        }
	}
}



