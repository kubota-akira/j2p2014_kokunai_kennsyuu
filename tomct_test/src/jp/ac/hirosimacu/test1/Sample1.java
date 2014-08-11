package jp.ac.hirosimacu.test1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample1
 */
@WebServlet("/Sample1")
public class Sample1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sample1() {
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

        out.println(createHTML("GET"));

        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println(createHTML("POST"));

        out.close();
	}
	protected String createHTML(String methodType){
        StringBuffer sb = new StringBuffer();

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>サンプル</title>");
        sb.append("</head>");
        sb.append("<body>");

        sb.append("<p>");
        sb.append(methodType);
        sb.append("メソッドで呼び出されました");

        sb.append("<p><a href=\"/tomct_test/Sample1\">リンク</a></p>");

        sb.append("<form action=\"/tomct_test/Sample1\" method=\"get\">");
        sb.append("<input type=\"submit\" value=\"GETで送信\">");
        sb.append("</form>");

        sb.append("<form action=\"/tomct_test/Sample1\" method=\"post\">");
        sb.append("<input type=\"submit\" value=\"POSTで送信\">");
        sb.append("</form>");

        sb.append("</body>");
        sb.append("</html>");

        return (new String(sb));
    }
}
