package jp.ac.hirosimacu.test1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTest8
 */
@WebServlet("/SessionTest8")
public class SessionTest8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionTest8() {
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

        }else{
            out.println("<p>セッション中です</p>");
        }

        String session_id = session.getId();

        out.println("<p>");
        out.println("セッションIDは" + session_id + "です<br>");
        out.println("</p>");

        String url = "/tomct_test/SessionTest8";
        String eURL = response.encodeURL(url);

        out.println("<p>");
        out.println("書き換え前: " + url + "<br>");
        out.println("書き換え後: " + eURL);
        out.println("</p>");

        out.println("<a href=\"" + eURL + "\">再表示</a>");

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
