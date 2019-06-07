package br.com.zup.modelo;

public class Veiculos {

	private int numCartao;
	private String tipoDoVeiculo;

	public Veiculos(int numCartao, String tipoDoVeiculo) {
		super();
		this.numCartao = numCartao;
		this.tipoDoVeiculo = tipoDoVeiculo;
	}

	public int getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}

	public String getTipoDoVeiculo() {
		return tipoDoVeiculo;
	}

	public void setTipoDoVeiculo(String tipoDoVeiculo) {
		this.tipoDoVeiculo = tipoDoVeiculo;
	}

}
