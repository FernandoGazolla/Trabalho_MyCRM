package mycrm.service;

import java.io.IOException;
import java.sql.SQLException;

import mycrm.dao.AtendenteDAO;
import mycrm.model.Atendente;

public class AtendenteService {
	
	
	public void cadastrarAtendente(Atendente atendente)throws ClassNotFoundException, IOException, SQLException{
		
		new AtendenteDAO().cadastrarAtendente(atendente);
	}
}
