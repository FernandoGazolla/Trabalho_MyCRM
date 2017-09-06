package mycrm.service;

import java.io.IOException;
import java.sql.SQLException;

import mycrm.dao.ServicodeManutencaoDAO;
import mycrm.model.ServicodeManutencao;

public class ServicodeManutencaoService {
	
	public void cadastrarServico(ServicodeManutencao servico)throws ClassNotFoundException, IOException, SQLException{
		new ServicodeManutencaoDAO().cadastrarServico(servico);
	}
}
