package com.capgemini.persistence;

import java.sql.SQLException;
import java.util.List;

import com.capgemini.model.Persona;

public interface PersonaDataService {
	
	public List<Persona> getPersonas() throws SQLException;
}
