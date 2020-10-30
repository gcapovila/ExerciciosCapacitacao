package com.gabriel.alura.java6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TipoOrdenacaoDeListas {
	
	public static void main(String[] args) {

		// Criando 4 contas e adicionando em um ArrayList de contas
        Conta cc1 = new Conta(22, 33, "Alberto");
        Conta cc2 = new Conta(22, 44, "Paula");
        Conta cc3 = new Conta(22, 11, "Rodrigo");
        Conta cc4 = new Conta(22, 22, "Marta");

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        /* Quero ordenar as contas por "n�mero da conta" (segundo atributo). Para isso, posso usar o m�todo "sort"
         * Por�m, ele exige que seja passado um objeto de uma classe que implemente a interface Comparator 
         * 
         * Para isto, foi criada a nova Classe NumeroDaContaComparator, abaixo */
        
        NumeroDaContaComparator comparatorNumero = new NumeroDaContaComparator();
        
        /* O m�todo sort representa o crit�rio de ordena��o, e serve para comparar duas refer�ncias de objeto
         * por meio de um m�todo presente na interface Comparator (esta interface � do pacote Java.util) */
        
        lista.sort(comparatorNumero);
        
        // Com isso, estamos ordenando nossa lista, com base em nosso crit�rio - que � o n�mero das contas
        System.out.println("Lista de contas, ordenada por n�mero:");
        System.out.println("");
        for (Conta conta : lista) {
            System.out.println(conta);
        }
        
        System.out.println("------------------------------");
        
        // Classe TitularDaContaComparator que ordena por titular, em ordem alfab�tica

        lista.sort(new TitularDaContaComparator());
        
        System.out.println("Lista de contas, ordenada por titular:");
        System.out.println("");
        for (Conta conta : lista) {
            System.out.println(conta);
        }
	}
}

/**
 * 
 * CRIANDO UMA NOVA CLASSE, QUE VAI IMPLEMENTAR A INTERFACE COMPARATOR (PORTANTO, SER� UMA CLASSE COMPARADORA)
 *   
 * A interface Comparator exige que seja passado o tipo de Objeto que ser� comparado, e obriga implementar o m�todo "compare"
 * No caso, estamos criando um comparador que vai comparar dois objetos da classe conta, a partir de seu atributo n�mero
 */
class NumeroDaContaComparator implements Comparator<Conta> {

	/**
	 * 
	 * O retorno do m�todo compare deve ser:
	 * = 0 - caso o n�mero das contas for id�ntico
	 * < 0 - caso o n�mero da conta c1 for inferior ao da c2
	 * > 0 - caso o n�mero da conta c2 for inferior ao da c1
	 * 
	 */
	
    @Override
    public int compare(Conta c1, Conta c2) {

        if(c1.getNumero() < c2.getNumero()) {
            return -1;
        }

        if(c1.getNumero() > c2.getNumero()) {
            return 1;
        }

        return 0;
        
    }
    
}

/**
 * 
 * Esta classe vai tamb�m implementar a interface Comparator, e vai comparar dois objetos da classe conta,
 * a partir de seu atributo "Titular"
 *
 */
class TitularDaContaComparator implements Comparator<Conta> {

	/**
	 * Compara��o de Strings: a pr�pria classe String j� possui um m�todo "compareTo", que retorna da mesma forma que queremos:
	 * 
	 * = 0 - caso as duas Strings sejam iguais
	 * < 0 - caso uma seja menor que a outra
	 * > 0 - caso uma seja maior que a outra
	 * 
	 */
    @Override
    public int compare(Conta c1, Conta c2) {
    	String nomeC1 = c1.getTitular();
        String nomeC2 = c2.getTitular();
        return nomeC1.compareTo(nomeC2); // podemos retornar diretamente o valor mesmo retornado pelo copareTo
    }
    
}



