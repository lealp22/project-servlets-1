package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Bienvenido!!</h1>");
	}

	protected void doPost(HttpServletRequest request,
						  HttpServletResponse response) throws ServletException, IOException {

		// Obtener el nombre del formulario
		String nombre = request.getParameter("nombre");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Generar página HTML con el mensaje de bienvenida
		out.println("<html>");
		out.println("<head><title>Bienvenida</title></head>");
		out.println("<body>");
		out.println("<h1>Bienvenido " + nombre + "!</h1>");
		out.println("</body></html>");
	}

}