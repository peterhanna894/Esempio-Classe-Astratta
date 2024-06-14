package org.generation.italy.model;



public abstract class DispositivoElettronico {
	protected String nome;
	protected int annoDiProduzione;
	
	public DispositivoElettronico(String nome, int annoDiProduzione) {
		super();
		if(!nome.isBlank())
			this.nome = nome;
		else
			System.out.println("Nome non valido");
		this.annoDiProduzione = annoDiProduzione;
	}

	public void accendilo() {
		System.out.println("Dispositivo acceso");
	}
}
