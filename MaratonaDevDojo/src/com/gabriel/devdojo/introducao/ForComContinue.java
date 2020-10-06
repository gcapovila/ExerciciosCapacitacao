package com.gabriel.devdojo.introducao;

public class ForComContinue {
    public static void main(String[] args) {
    	// Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Por�m o valor de cada parcela n�o pode ser menor que 1000

    	double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) { /* L�gica inversa do outro exerc�cio: da maior quantidade
        																	de parcelas para a menor */
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
               continue; // Continue n�o sai do loop, s� volta para o come�o dele (interrompe a itera��o atual)
            }
            System.out.println("Pode pagar em: " + parcela + " parcela(s) de R$" + valorParcela);
        }
    }
}
