package com.gabriel.devdojo.introducao;

public class ForComContinue {
    public static void main(String[] args) {
    	// Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Porém o valor de cada parcela não pode ser menor que 1000

    	double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) { /* Lógica inversa do outro exercício: da maior quantidade
        																	de parcelas para a menor */
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
               continue; // Continue não sai do loop, só volta para o começo dele (interrompe a iteração atual)
            }
            System.out.println("Pode pagar em: " + parcela + " parcela(s) de R$" + valorParcela);
        }
    }
}
