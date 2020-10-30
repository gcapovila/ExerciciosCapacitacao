package com.gabriel.devdojo.conceitos.enumeracao;

import com.gabriel.devdojo.conceitos.enumeracao.ClienteComEnum.TipoPagamento;

public class ClienteComEnum {

	/* Ao inv�s de criar um Enum como uma classe, tamb�m � poss�vel criar dentro de uma classe normal j� existente
	 * tratando o Enum como se fosse um m�todo: */
	
	public enum TipoPagamento{
		AVISTA("� vista"), APRAZO ("� prazo");
		
		// Construtor do Enum (porque sua constante tem um atributo String -- � opcional ter atributos na constante do enum)
		private String nome;
		private TipoPagamento(String nome) {
			this.nome = nome;
		}
		
		// Get para pegar o atributo da constante do enum (� opcional ter atributos na constante do enum)
		public String getNome() {
			return nome;
		}
	}
	
	private String nome;
	private TipoCliente tipoCliente; // atributo do tipo enum, criado como uma nova classe
	private TipoPagamento tipoPagamento; // atributo do tipo enum, criado como m�todo na classe atual
	
	public ClienteComEnum(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
		super();
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	@Override
	public String toString() {
		return "Cliente --> Nome: " + nome + ", Tipo de cliente: " + tipoCliente.getNome()
				+ ", N�mero do tipo de cliente: " + tipoCliente.getNumero() 
				+ ", Tipo de pagamento: " + tipoPagamento.getNome();
	}
	
}
