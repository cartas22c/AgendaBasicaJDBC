package imp.capgemini.business.personamanager;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.capgemini.business.PersonaManagerService;
import com.capgemini.model.Persona;
import com.capgemini.persistence.PersonaDataService;

public class PersonaManager implements PersonaManagerService {

	private PersonaDataService personaData;
	
	public List<Persona> getPersonas() throws SQLException {
		// TODO Auto-generated method stub
		List<Persona> data = null;
		try{
			  data = personaData.getPersonas();
		}
		catch(SQLException err){
			Logger.getLogger(PersonaManager.class.getName()).log(Level.INFO, "Error", err.getMessage());
		}
		
		return data;
	}

	public void setPersonaData(PersonaDataService personaData) {
		this.personaData = personaData;
	}

	@Override
	public void showPersonas() throws SQLException {
		// TODO Auto-generated method stub
		List<Persona> listado = getPersonas();
		listado.stream().forEach(p -> System.out.println(p.getNombre() + " " + p.getApellidos()));
	
	}

	
	
	
}
