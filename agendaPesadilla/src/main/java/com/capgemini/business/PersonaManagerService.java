package com.capgemini.business;

import java.sql.SQLException;
import java.util.List;

import com.capgemini.model.Persona;

public interface PersonaManagerService {

	public List<Persona> getPersonas() throws SQLException;
	public void showPersonas() throws SQLException;

}
