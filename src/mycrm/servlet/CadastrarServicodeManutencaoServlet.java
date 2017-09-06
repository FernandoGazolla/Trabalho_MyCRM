package mycrm.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mycrm.model.ServicodeManutencao;
import mycrm.service.ServicodeManutencaoService;

/**
 * Servlet implementation class CadastrarServicodeManutencaoServlet
 */
@WebServlet("/CadastrarServicodeManutencaoServlet")
public class CadastrarServicodeManutencaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarServicodeManutencaoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage = "/Entrada.jsp";
		
		String produto = request.getParameter("produto");
		String cliente = request.getParameter("cliente");
		String data = request.getParameter("data");
		String hora = request.getParameter("hora");
		String status = request.getParameter("status");
		
		try {
			ServicodeManutencao servico = new ServicodeManutencao(produto, cliente, data, hora, status);
			
			ServicodeManutencaoService servicoservice = new ServicodeManutencaoService();
			servicoservice.cadastrarServico(servico);
			
			nextPage = "/CadastrarServico.jsp";
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(nextPage);
		rd.forward(request, response);
		
	}

}
