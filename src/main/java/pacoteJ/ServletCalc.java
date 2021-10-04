package pacoteJ;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCalc
 */
@WebServlet(urlPatterns = {"/ServletCalc"})
public class ServletCalc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private float n1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCalc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' href='StyleJ.css'>");
		out.println("<title class='text'>doGet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 class='text'>Estou dentro do ServletCalc<h1/>");
		out.println("<p class='text'>O servlet recebeu uma solicitação. Clique no botão para voltar.</p>");
		n1 = Float.parseFloat(request.getParameter("n1"));
		out.println("<p> O quadrado do valor recebido "+ n1 +" vale " + (n1 * n1));
		out.println("<br/><br/>");
		out.println("<form method='post' action='Index.jsp'>");
		out.println("<input type='submit' value='Voltar'class='container'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
