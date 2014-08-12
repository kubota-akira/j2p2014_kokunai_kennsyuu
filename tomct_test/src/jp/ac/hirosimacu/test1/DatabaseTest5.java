package jp.ac.hirosimacu.test1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatabaseTest5
 */
@WebServlet("/DatabaseTest5")
public class DatabaseTest5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DatabaseTest5() {
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
        out.println("<title>データベーステスト</title>");
        out.println("</head>");
        out.println("<body>");

        Connection conn = null;
        String url = "jdbc:postgresql://localhost/testdb";
        String user = "postgres";
        String password = "password";

        try {
            Class.forName("org.postgresql.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();

            String sql = "delete from test where id = 5";
            int num = stmt.executeUpdate(sql);

            sql = "select * from test";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                int code = rs.getInt("id");
                String name = rs.getString("name");
                out.println("<p>");
                out.println("コード:" + code + ", 名前:" + name);
                out.println("</p>");
            }

            rs.close();
            stmt.close();

        }catch (ClassNotFoundException e){
            out.println("ClassNotFoundException:" + e.getMessage());
        }catch (SQLException e){
            out.println("SQLException:" + e.getMessage());
        }catch (Exception e){
            out.println("Exception:" + e.getMessage());
        }finally{
            try{
                if (conn != null){
                    conn.close();
                }
            }catch (SQLException e){
                out.println("SQLException:" + e.getMessage());
            }
        }

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
