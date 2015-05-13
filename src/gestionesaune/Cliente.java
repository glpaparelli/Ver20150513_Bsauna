package gestionesaune;

import java.util.Vector;

public class Cliente {

	private String nome;
	private String cognome;
	private String email;
	private String id;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	
	
	public Cliente(String nome, String cognome, String email, String id) {
		super();
		
		if((nome != null)&&(nome.length()>0)){
			this.nome = nome;
		}
		else 
			throw new IllegalArgumentException("nome non valido");
		
		if((cognome!=null)&&(cognome.length()>0)){
			this.cognome = cognome;
		}
		else 
			throw new IllegalArgumentException("cognome non valido");
		
		if((email != null)&&(email.length()>0)){
			this.email = email;
		}
		else 
			throw new IllegalArgumentException("email non valida");
		
		if((id != null)&&(id.length()>0)){
			this.id = id;
		}
		else 
			throw new IllegalArgumentException("id non valido");
	
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", email="
				+ email + ", id=" + id + "]";
	}

	
	
		
		
	
	
	
}
