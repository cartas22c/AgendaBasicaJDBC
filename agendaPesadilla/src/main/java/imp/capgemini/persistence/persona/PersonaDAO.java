package imp.capgemini.persistence.persona;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.capgemini.model.Persona;
import com.capgemini.persistence.PersonaDataService;
import com.mysql.jdbc.Statement;

public class PersonaDAO implements PersonaDataService {
	DataSource dataSource = null;



	Connection conn = null;

	public Connection getConexion() throws ClassNotFoundException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/agenda","scartas","Temp2018$$");
			System.out.println("Conectado a la BBDD Agenda!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public List<Persona> getPersonas() throws SQLException {
		// TODO Auto-generated method stub
		List<Persona> personas = new ArrayList<Persona>();
 
		try {
			conn = getConexion();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		String query = "SELECT * FROM personas";
		java.sql.Statement stmt = conn.createStatement();
		ResultSet data = stmt.executeQuery(query);

		while(data.next()) {
			Persona p = new Persona(data.getString("nombre"), data.getString("apellidos"), data.getString("dni"), data.getString("telefono"), data.getString("email"));
			personas.add(p);
		}
		conn.close();
		return personas;
	}

}
