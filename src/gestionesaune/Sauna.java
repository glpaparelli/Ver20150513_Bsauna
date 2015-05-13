package gestionesaune;

import java.util.Vector;

public class Sauna {

	private int id;
	private int capienza;
	private double costoOrario;
	private Sauna sauna;
	private Vector <Prenotazione> prenotazioni;
	
	public int getId() {
		return id;
	}
	
	public int getCapienza() {
		return capienza;
	}
	public double getCostoOrario() {
		return costoOrario;
	}
	
	
	public Sauna(int id, int capienza, double costoOrario) {
		super();
		this.id = id;
		this.capienza = capienza;
		this.costoOrario = costoOrario;
		this.prenotazioni = new Vector<Prenotazione>();
	}
	
	@Override
	public String toString() {
		return "Sauna [id=" + id + ", capienza=" + capienza + ", costoOrario="
				+ costoOrario + "]";
	}
	
	public Sauna getSauna() {
		return sauna;
	}

	public void setSauna(Sauna sauna) {
		this.sauna = sauna;
	}

	public void addPrenotazione(Prenotazione p){
		
		if(p.getPostiRichiesti() < this.getCapienza()){
			p.setSauna(this);
			prenotazioni.addElement(p);
		}
		else 
			throw new IllegalArgumentException();
	
	}
	/*
	public int getOreTotali(){
		int x=0;
		for (int i=0;i<prenotazioni.size();i++){
			
		}
		
		
		return x;
	}*/
}
