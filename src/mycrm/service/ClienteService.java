package mycrm.service;

import java.io.IOException;
import java.sql.SQLException;

import mycrm.dao.ClienteDAO;
import mycrm.model.Cliente;

public class ClienteService {
	
	
	public void cadastrarCliente(Cliente cliente) throws ClassNotFoundException, IOException, SQLException{
		new ClienteDAO().cadastrarCliente(cliente);
	}
}
