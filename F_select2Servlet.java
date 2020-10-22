package todo.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.dao.TodoDAO;
import todo.dto.Todo;

/**
 * Servlet implementation class F_select2Servlet
 */
@WebServlet("/todo/select2")
public class F_select2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public F_select2Servlet() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try(TodoDAO dao = new TodoDAO()) {

			List<Todo> list = dao.Select2();

			request.setAttribute("selectList",list);
		}catch (Exception e) {
			throw new ServletException(e);
		}

		RequestDispatcher rd = request.getRequestDispatcher("/select.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}