package gestionesaune;

import java.util.Vector;

public class Palestra {

	private String nome;
	private Vector <Sauna> saune;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Palestra(String nome) {
		super();
		if((nome != null)&&(nome.length()>0)){
			this.nome = nome;
		}
		else 
			throw new IllegalArgumentException();
			
		saune = new Vector <Sauna>();
	}
	
	
	
	
}
