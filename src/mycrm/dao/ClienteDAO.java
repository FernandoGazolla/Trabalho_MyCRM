package mycrm.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import mycrm.model.Cliente;
import mycrm.util.ConnectBD;

public class ClienteDAO {

	private PreparedStatement ps;
	
	private Connection connect;
	
	private String CADASTRAR_CLIENTE = "INSERT INTO CLIENTE (Nome, CPF, Email, Telefone) VALUES (?,?,?,?);";
	
	public void cadastrarCliente(Cliente cliente)throws ClassNotFoundException, IOException, SQLException{
		connect = ConnectBD.getInstance().getConnection();
		//prepare statement
		ps = connect.prepareStatement(CADASTRAR_CLIENTE);
		
		ps.setString(1, cliente.getNome());
		ps.setString(2, cliente.getCpf());
		ps.setString(3, cliente.getEmail());
		ps.setInt(4, cliente.getTelefone());
		
		ps.executeUpdate();		
	}
	
	
}
