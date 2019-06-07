package br.com.zup.modelo;

public class Vagas {

	// Atributos das vagas
	private String tipoVaga;
	private boolean livre;
	private int vagasCarro;
	private int vagasMoto;
	
	// Construtor
	public Vagas(String tipoVaga, boolean livre, int vagasCarro, int vagasMoto) {
		super();
		this.tipoVaga = tipoVaga;
		this.livre = livre;
		this.vagasCarro = vagasCarro;
		this.vagasMoto = vagasMoto;
	}

	// Getters & Setters
	public String getTipoVaga() {
		return tipoVaga;
	}

	public void setTipoVaga(String tipoVaga) {
		this.tipoVaga = tipoVaga;
	}

	public boolean isLivre() {
		return livre;
	}

	public void setLivre(boolean livre) {
		this.livre = livre;
	}

	public int getVagasCarro() {
		return vagasCarro;
	}

	public void setVagasCarro(int vagasCarro) {
		this.vagasCarro = vagasCarro;
	}

	public int getVagasMoto() {
		return vagasMoto;
	}

	public void setVagasMoto(int vagasMoto) {
		this.vagasMoto = vagasMoto;
	}
	
	@Override
	public String toString() {
		
		String modelo = "";
		
		modelo += "Tipo da vaga -> " + this.getTipoVaga() + "\n";
		modelo += "Disponibilidade da vaga -> " + this.isLivre() + "\n";
		
		return modelo;
	}
			
}
