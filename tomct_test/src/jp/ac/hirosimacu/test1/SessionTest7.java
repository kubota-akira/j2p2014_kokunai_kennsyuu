package jp.ac.hirosimacu.test1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest7
 */
@WebServlet("/SessionTest7")
public class SessionTest7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionTest7() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html; charset=UTF-8");
	        PrintWriter out = response.getWriter();

	        HttpSession session = request.getSession(false);

	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>セッションテスト</title>");
	        out.println("</head>");
	        out.println("<body>");

	        if (session == null){
	            out.println("<p>セッションを開始します</p>");
	            session = request.getSession(true);

	        }

	        String session_id = session.getId();

	        out.println("<p>");
	        out.println("セッションIDは" + session_id + "です<br>");
	        out.println("</p>");

	        Cookie cookie[] = request.getCookies();

	        out.println("<p>");
	        if (cookie != null){
	            out.println("クライアントから送信されたクッキーを表示します<br>");
	            for (int i = 0 ; i < cookie.length ; i++){
	                out.println(cookie[i].getName() + " = " + cookie[i].getValue() + "<br>");
	            }
	        }else{
	            out.println("クッキーはクライアントから送信されていません<br>");
	        }
	        out.println("</p>");

	        out.println("<a href=\"/tomct_test/SessionTest7\">再表示</a>");

	        out.println("</body>");
	        out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
