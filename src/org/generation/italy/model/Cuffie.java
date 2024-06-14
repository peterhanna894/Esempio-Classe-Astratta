package org.generation.italy.model;

public class Cuffie extends DispositivoElettronico {
	protected int qntdB;
	protected boolean cancellazioneRumore;
	
	
	public Cuffie(String nome, int annoDiProduzione, int qntdB, boolean cancellazioneRumore) {
		super(nome, annoDiProduzione);
		this.qntdB = qntdB;
		this.cancellazioneRumore = cancellazioneRumore;
	}
	
	public void accendi() {
		System.out.println("Parte la musica");

	}

	@Override
	public String toString() {
		return "Cuffie [qntdB=" + qntdB + ", cancellazioneRumore=" + cancellazioneRumore + ", nome=" + nome
				+ ", annoDiProduzione=" + annoDiProduzione + "]";
	}
}
