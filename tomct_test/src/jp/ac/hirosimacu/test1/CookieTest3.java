package jp.ac.hirosimacu.test1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieTest3
 */
@WebServlet("/CookieTest3")
public class CookieTest3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieTest3() {
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

        out.println("<html>");
        out.println("<head>");
        out.println("<title>クッキーテスト</title>");
        out.println("</head>");
        out.println("<body>");

        Cookie cookie[] = request.getCookies();
        Cookie visitedCookie = null;

        if (cookie != null){
            for (int i = 0 ; i < cookie.length ; i++){
                if (cookie[i].getName().equals("visited")){
                    visitedCookie = cookie[i];
                }
            }

            if (visitedCookie != null){
                int visited = Integer.parseInt(visitedCookie.getValue()) + 1;

                out.println("<p>");
                out.println(visited);
                out.println("回目の訪問です。</p>");

                visitedCookie.setValue(Integer.toString(visited));
                visitedCookie.setMaxAge(10);
                response.addCookie(visitedCookie);
            }else{
                out.println("<p>初回の訪問です。</p>");

                Cookie newCookie = new Cookie("visited", "1");
                newCookie.setMaxAge(10);
                response.addCookie(newCookie);
            }
        }else{
            out.println("<p>初回の訪問です。</p>");

            Cookie newCookie = new Cookie("visited", "1");
            newCookie.setMaxAge(10);
            response.addCookie(newCookie);
        }

        out.println("<a href=\"/tomct_test/CookieTest3\">再表示</a>");

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
