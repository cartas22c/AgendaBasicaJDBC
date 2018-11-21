package com.capgemini.agendaPesadilla;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 import com.capgemini.business.PersonaManagerService;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )  
    {
    	final ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
    	System.out.println( "---Agenda---!" );
 		
		PersonaManagerService myPersona = (PersonaManagerService) contexto.getBean("personaManagerService");
		try {
			myPersona.showPersonas();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
