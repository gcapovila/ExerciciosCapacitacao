package com.gabriel.devdojo.conceitos.enumeracao;

import com.gabriel.devdojo.conceitos.enumeracao.ClienteComEnum.TipoPagamento;

public class ClienteComEnum {

	/* Ao invés de criar um Enum como uma classe, também é possível criar dentro de uma classe normal já existente
	 * tratando o Enum como se fosse um método: */
	
	public enum TipoPagamento{
		AVISTA("À vista"), APRAZO ("À prazo");
		
		// Construtor do Enum (porque sua constante tem um atributo String -- é opcional ter atributos na constante do enum)
		private String nome;
		private TipoPagamento(String nome) {
			this.nome = nome;
		}
		
		// Get para pegar o atributo da constante do enum (é opcional ter atributos na constante do enum)
		public String getNome() {
			return nome;
		}
	}
	
	private String nome;
	private TipoCliente tipoCliente; // atributo do tipo enum, criado como uma nova classe
	private TipoPagamento tipoPagamento; // atributo do tipo enum, criado como método na classe atual
	
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
				+ ", Número do tipo de cliente: " + tipoCliente.getNumero() 
				+ ", Tipo de pagamento: " + tipoPagamento.getNome();
	}
	
}
