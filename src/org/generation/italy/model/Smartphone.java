package org.generation.italy.model;

public class Smartphone extends DispositivoElettronico {

	protected double nrPollici;
	protected int nrFotocamere;

	public Smartphone(String nome, int annoDiProduzione, double nrPollici, int nrFotocamere) {
		super(nome, annoDiProduzione);
		if (nrPollici > 0 && nrFotocamere > 0) {
			this.nrPollici = nrPollici;
			this.nrFotocamere = nrFotocamere;
		}else
			System.out.println("Inserisci un numero di fotocamere oppure numero pollici corretto");
	}

	public void accendi() {
		System.out.println("Schermo acceso mostrando il logo");
	}

	@Override
	public String toString() {
		return "Smartphone [nrPollici=" + nrPollici + ", nrFotocamere=" + nrFotocamere + ", nome=" + nome
				+ ", annoDiProduzione=" + annoDiProduzione + "]";
	}
}
