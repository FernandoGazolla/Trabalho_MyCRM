package mycrm.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.eclipse.jdt.internal.compiler.util.GenericXMLWriter;

import mycrm.util.ConnectBD;
import mycrm.model.Atendente;

public class AtendenteDAO {

		private GenericDAO genericDao = new GenericDAO();
	private PreparedStatement ps;
	
	private Connection connect;
	
	private String CADASTRAR_ATENDENTE = "INSERT INTO ATENDENTE (id, nome, cpf, email) VALUES (?,?,?,?);";
	
	public void cadastrarAtendente(Atendente atendente)throws ClassNotFoundException, IOException, SQLException{
		
		genericDao.openConnection();
		connect = ConnectBD.getInstance().getConnection();
		
		//prepare statement
		ps = connect.prepareStatement(CADASTRAR_ATENDENTE);
		ps.setInt(1, atendente.getId());
		ps.setString(2, atendente.getNome());
		ps.setString(3, atendente.getCpf());
		ps.setString(4, atendente.getEmail());
		ps.executeUpdate();
		genericDao.closeConnection();
	}
}
