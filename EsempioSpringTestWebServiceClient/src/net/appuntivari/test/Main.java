package net.appuntivari.test;

import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import javax.xml.rpc.ServiceException;

import net.appuntivari.model.dto.Persona;
import net.appuntivari.model.dto.Utente;
import net.appuntivari.webservice.WebserviceSOAP;
import net.appuntivari.webservice.WebserviceSOAPLocator;



public class Main {

	public static void main(String[] args) throws RemoteException, ServiceException {
		
		WebserviceSOAP locator = new WebserviceSOAPLocator();
		Persona[] persone = locator.getwebserviceSOAPHttpPort().getListaPersone();		
		for(int g=0; g < persone.length;g++){
			System.out.println(persone[g].getNome());			
		}
		
		Persona persona = new Persona();
		persona.setNome("Nome1PersonaWS");
		persona.setCognome("Cognome1PersonaWS");
		persona.setDataNascita(new GregorianCalendar());
		
			Utente ut = new Utente();
			ut.setPassword("Pwd2UtenteWS");
			ut.setUsername("Una555U33t2enteWS");
			ut.setProfilo("Prof12iloUtWS");
			ut.setPersona(persona);
		
		
		locator.getwebserviceSOAPHttpPort().createUtente(ut);	
		
		persone = locator.getwebserviceSOAPHttpPort().getListaPersone();	
		for(int g=0; g < persone.length;g++){
			System.out.println(persone[g].getNome());			
		}
	}
	
}
