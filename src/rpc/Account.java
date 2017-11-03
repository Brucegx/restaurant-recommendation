package rpc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import db.DBConnection;
import db.DBConnectionFactory;

/**
 * Servlet implementation class Account
 */
@WebServlet("/login")
public class Account extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DBConnection conn = DBConnectionFactory.getDBConnection();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Account() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.setCharacterEncoding("UTF-8");  
//        response.setContentType("text/html;charset=UTF-8");  
        PrintWriter out = response.getWriter();  
        
        String name = request.getParameter("user_id");
		String psw = request.getParameter("psw");
		String method = request.getParameter("method");
//		if (method.equals("Register")){
//			if(!conn.checkUser(name)) {
//				conn.setUser(name, psw);
//				Cookie ck = new Cookie("userId", name);
//				ck.setMaxAge(-1);
//				Cookie status = new Cookie("status", "new");
//				response.addCookie(ck);
//				response.addCookie(status);
//				response.sendRedirect(request.getContextPath() + "/welcome.html");
//			} else {
//				// should return exit info
//			}
//		}
		String dbPsw = conn.getPsw(name);
		if(dbPsw == null) {
			conn.setUser(name, psw);
			Cookie ck = new Cookie("userId", name);
			response.addCookie(ck);
			response.sendRedirect(request.getContextPath() + "/welcome.html");
		} else if(psw.equals(dbPsw)) {
			//System.out.print("here" + request.getContextPath());
			Cookie ck = new Cookie("userId", name);
			response.addCookie(ck);
			response.sendRedirect(request.getContextPath() + "/welcome.html");
			return;
		}
		
		System.out.print(psw == dbPsw);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
