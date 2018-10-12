package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AlumnoDao;

/**
 * Servlet implementation class AlumnoController
 */
@WebServlet("/AlumnoController")
public class AlumnoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public AlumnoController() {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		  if (request.getParameter("type") != null) {
	            AlumnoDao alumnoDao = new AlumnoDao();
	            
	            switch (request.getParameter("type")) {
	                case "list":
	                    request.setAttribute("listadoAlumnos",alumnoDao.listarAlumnos());
	                    request.getRequestDispatcher("/views/alumnos.jsp").forward(request, response);
	                    break;
	                case "json":
	                    response.setContentType("application/json;charset=UTF-8");
	                    try (PrintWriter out = response.getWriter()) {
	                        out.println(alumnoDao.listarAlumnos().toString());
	                    }   break;
	                default:
	                    response.setContentType("application/json;charset=UTF-8");
	                    try (PrintWriter out = response.getWriter()) {
	                        out.println("{type: \"not type found\"}");
	                    }   break;
	            }
	        } else {
	            response.setContentType("application/json;charset=UTF-8");
	            try (PrintWriter out = response.getWriter()) {
	                out.println("{method: \"not method found\"}");
	            }
	        }		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
