package com.gabriel.devdojo.introducao;

public class ForComBreak {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Porém o valor de cada parcela não pode ser menor que 1000

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break; // se o valor da parcela for menor que 1000, vai sair do loop e não vai fazer mais nada
            }
            System.out.println("Pode pagar em: " + parcela + " parcela(s) de R$" + valorParcela);
        }


    }
}
