package net.appuntivari.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import net.appuntivari.model.dto.Persona;
import net.appuntivari.model.dto.Utente;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class UtenteDAO {

	/* JdbcTemplate: gestore delle connessione al mio DB,
	   iniettato tramite bean di Spring quando dal contesto 
	   viene recuperato il bean corrispondente alla classe UtenteDAO */
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

		
	
	public List<Persona> listaPersone(){
		
		String sqlStatement = "select * from persona";
						
				
			List<Persona> listaPersone = jdbcTemplate.query(sqlStatement,
							new Object[]{},
								new RowMapper(){			
									@Override
									public Object mapRow(ResultSet rs,int arg1) throws SQLException {
										
										Persona pe = new Persona();										
										pe.setCognome(rs.getString("COGNOME"));
										pe.setNome(rs.getString("NOME"));
										pe.setDataNascita(rs.getDate("DATA_NASCITA"));
										
										return pe;
									}});
		
		return listaPersone;
		
	}
	
	
	public void createUtente(Utente ut){
				
		/* Creazione dell'utente utilizzando i metodi della classe JdbcTemplate */
		
		String personaSql = "insert into persona (nome,cognome,data_nascita) values(?,?,?)"; 						
		jdbcTemplate.update(personaSql,new Object[]{ut.getPersona().getNome(),
														ut.getPersona().getCognome(),
															new java.sql.Date(ut.getPersona().getDataNascita().getTime())});
		
		String getMaxIdStatement = "select max(id) as maxid from persona";
		Long maxid = (Long)jdbcTemplate.query(getMaxIdStatement, 
								new Object[]{},
									new RowMapper(){			
						@Override
						public Object mapRow(ResultSet rs,
								int arg1) throws SQLException {							
							return rs.getLong("maxid");
						}
		}).get(0);
		
		String utenteSql = "insert into utente (username,password,profilo,id_persona) values(?,?,?,?)";		
		jdbcTemplate.update(utenteSql,new Object[]{ut.getUsername(),ut.getPassword(),ut.getProfilo(),maxid});
				
	}
	
	
	
}
