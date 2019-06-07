package br.com.zup.modelo;

public class Estacionamento {
	
	// Atributos do estacionamento
	private double horaEntrada;
	private double horaSaida;
	private double valorTotal;
	
	// Construtor
	public Estacionamento(double horaEntrada, double horaSaida, double valorTotal) {
		super();
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
		this.valorTotal = valorTotal;
	}

	// Getters & Setters
	public double getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(double horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public double getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(double horaSaida) {
		this.horaSaida = horaSaida;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	@Override
	public String toString() {
		
		String modelo = "";
		
		modelo += "Hora de entrada do veículo -> " + this.getHoraEntrada() + "\n";
		modelo += "Hora de saída do veículo -> " + this.getHoraSaida() + "\n";
		modelo += "Valor à pagar: R$ " + this.getValorTotal() + "\n";
		
		return modelo;
		
	}
	
	
}
