package mycrm.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mycrm.model.ServicodeManutencao;
import mycrm.util.ConnectBD;

public class ServicodeManutencaoDAO {
	private GenericDAO genericDao = new GenericDAO();
	private PreparedStatement ps;
	
	private Connection connect;
	
	private String CADASTRAR_SERVICO = "INSERT INTO SERVICO (produto, cliente, data, hora, status) VALUES (?,?,?,?,?);";
	
	public void cadastrarServico(ServicodeManutencao servico)throws ClassNotFoundException, IOException, SQLException{
		genericDao.openConnection();
		connect = ConnectBD.getInstance().getConnection();
		
		//prepare statement
		ps = connect.prepareStatement(CADASTRAR_SERVICO);
		ps.setString(1, servico.getProduto());
		ps.setString(2, servico.getCliente());
		ps.setString(3, servico.getData());
		ps.setString(4, servico.getHora());
		ps.setString(5, servico.getStatus());
	
		ps.executeUpdate();
		genericDao.closeConnection();
		
	}
	
}
