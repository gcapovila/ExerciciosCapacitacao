package com.gabriel.devdojo.excecoes;

/**
 * Created by William Suane on 6/22/2016.
 */
public class Leitor2 implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Fechando leitor 2"); // Obrigatório implementar método da interface AutoClosable
    }
}
