package gestionesaune;

import java.time.LocalDateTime;

public class Prenotazione {

	private int postiRichiesti;
	private LocalDateTime arrivoil;
	private LocalDateTime partenza;
	private Cliente cliente;
	private Sauna sauna;
	
	
	public int getPostiRichiesti() {
		return postiRichiesti;
	}
	public LocalDateTime getArrivoil() {
		return arrivoil;
	}
	public LocalDateTime getPartenza() {
		return partenza;
	}
	
	
	public Prenotazione(int postiRichiesti, LocalDateTime arrivoil,
			LocalDateTime partenza, Cliente cliente, Sauna sauna) {
		super();
		
		if(postiRichiesti > 0){
			this.postiRichiesti = postiRichiesti;
		}
		else
			throw new IllegalArgumentException("posti richiesti deve essere piu di 0");
		
		this.arrivoil = arrivoil;
		this.partenza = partenza;
		
		if(cliente != null)
			this.cliente = cliente;
		else 
			throw new NullPointerException();
	}
	
	
	@Override
	public String toString() {
		return "Prenotazione [postiRichiesti=" + postiRichiesti + ", arrivoil="
				+ arrivoil + ", partenza=" + partenza + "]";
	}
	public Sauna getSauna() {
		return sauna;
	}
	public void setSauna(Sauna sauna) {
		this.sauna = sauna;
	}
	
	
	public void getCostoTotale(){
		
	}
	
	
	
	
}
