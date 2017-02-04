package net.tecgurus.servlets;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.tecgurus.business.CatalogoBusiness;
import net.tecgurus.common.dto.CataDTO;

/**
 * Servlet implementation class CatalogoGeneralServlet
 */
public class CatalogoGeneralServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private CatalogoBusiness serviceCata;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<CataDTO> list = serviceCata.findAllDTO_1();
		if(list == null){
			response.getWriter().write("No data");
		}else{
			for(CataDTO dto : list){
				response.getWriter().println("Catalogo: "+dto.getDscCorCat());
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
