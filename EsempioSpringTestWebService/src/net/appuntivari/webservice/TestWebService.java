package net.appuntivari.webservice;

import net.appuntivari.model.dto.Persona;
import net.appuntivari.model.dto.Utente;


public interface TestWebService {

	public String getTime();	

	public Persona getPersona();
		
	public Persona[] getListaPersone() throws Exception;
	
	public void createUtente(Utente utente);
	
}
