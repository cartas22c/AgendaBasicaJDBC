package imp.capgemini.persistence.persona;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.capgemini.model.Persona;

public class PersonaMapper implements RowMapper<Persona> {

	@Override
	public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
		Persona persona = new Persona();
		persona.setNombre(rs.getString("nombre"));
		persona.setApellidos(rs.getString("apellidos"));
		persona.setDni(rs.getString("dni"));
		persona.setTelefono(rs.getString("telefono"));
		persona.setEmail(rs.getString("email"));

	      return persona;
	}

}
