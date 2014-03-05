package net.appuntivari.webservice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import net.appuntivari.model.dao.UtenteDAO;
import net.appuntivari.model.dto.Persona;
import net.appuntivari.model.dto.Utente;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;




public class TestWebServiceImpl implements TestWebService{
		
	/*UtenteDAO privo di gestione transazioni*/
	private UtenteDAO utenteDAO;
	
	/*UtenteDAO con gestione transazioni*/	
	private UtenteDAO utenteDAOtr;			
	
	public UtenteDAO getUtenteDAO() {
		return utenteDAO;
	}

	public void setUtenteDAO(UtenteDAO utenteDAO) {
		this.utenteDAO = utenteDAO;
	}
		
	public UtenteDAO getUtenteDAOtr() {
		return utenteDAOtr;
	}

	public void setUtenteDAOtr(UtenteDAO utenteDAOtr) {
		this.utenteDAOtr = utenteDAOtr;
	}

	@Override
	public String getTime() {		
		return new java.util.Date().toString();		
	}

	@Override
	public Persona getPersona() {
		Persona persona = new Persona();
		persona.setNome("NomeWS");
		persona.setCognome("CognomeWS");
		persona.setDataNascita(new Date());
		return persona;
	}

	@Override
	public Persona[] getListaPersone() throws Exception{
	
		Persona[] persone = new Persona[]{};		
		return utenteDAO.listaPersone().toArray(persone);
				
	}

	public void createUtente(Utente utente) {
		utenteDAOtr.createUtente(utente);			
	};

}
