/*package todo.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.dao.TodoDAO;
import todo.dto.Todo;


@WebServlet("/todo/U_pass")
public class U_passwordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public U_passwordServlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		//リクエストパラメータを受け取り、DTOに格納する準備をする。

		String oldpassword = request.getParameter("oldpassword");
		String newpassword = request.getParameter("newpassword");
		String nampassword = request.getParameter("nampassword");

		//DTOに格納する
		Todo dto = new Todo();
		dto.setPassword(oldpassword);
		dto.setPassword(newpassword);
		dto.setPassword(nampassword);

		try(TodoDAO dao = new TodoDAO()){
			Todo dto = dao.U_pass(dto);
			request.setAttribute("dto",dto);

		boolean Admin = (dto.equals(oldpassword) && (!(oldpassword.equals(newpassword)) && newpassword.equals(nampassword);



		if(admin) {


		} else {
            request.setAttribute("error", "パスワードが間違っています。入力しなおしてください");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }


		}catch(Exception e){
			throw new ServletException(e);

		}finally {
		//変更完了→一覧画面を表示する。
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}
		private static boolean cheackPass() {
			boolean isOK = true;
			if() {

			}

}

	//JSPで表示するメッセージを設定する
	//@param request
	//    サーブレットリクエスト
	//@param message
	// 			メッセージ文字列
	protected void doGet(HttpServletRequest request,String message) {
		request.setAttribute("message", message);

}

}
*/