package by.htp.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.htp.web.command.Command;
import by.htp.web.command.CommandChooser;
import by.htp.web.domen.Book;
import by.htp.web.domen.User;

/**
 * Servlet implementation class firstServlet
 */
public class firstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public firstServlet() {
    	
        super();
        
        System.out.println("servlet constructor");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		 System.out.println("servlet init method");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		 System.out.println("servlet destroy method");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("servlet service method");
		 super.service(request, response);
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("servlet doGet method");
		 proccesRequest(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 System.out.println("servlet dopost method");
		 proccesRequest(request,response);
	/*	 String login = request.getParameter("login2");
		String password = request.getParameter("pass2");
		
				if("TAT" .equals(login) & "TAT" .equals(password)) {
				    User user = new User(login, password,true);
				    
				    HttpSession session = request.getSession();
				    session.setAttribute("user", user);
				    
				    
					System.out.println("true user" + login + password);
					PrintWriter writer = response.getWriter();
					List<Book> list = new ArrayList<Book>();
					list.add(new Book("title1","author1",1.11));
					list.add(new Book("title2","author2",2.22));
					list.add(new Book("title3","author3",3.33));
					list.add(new Book("title4","author4",4.44));
					request.setAttribute("books", list);
					forward(request, response, "/welcome.jsp");
				//	String html = "<html>"
				//			+"<head>"
				//			+"<body> <H1 color='red'>Success</H1>"
				//			+"</body>"
				//			+"</head>"
				//			+"</html>";
					
				//	writer.println(html);
				//	response.sendRedirect("user.html");
					
				}else{
					System.out.println("false" + login + password);
					request.setAttribute("ERROR", "wrong user login or password");
					
					forward(request,response,"/welcome.jsp");
				//	RequestDispatcher disp = request.getRequestDispatcher("/user1.jsp");
				//	disp.forward(request, response);
				}
				*/
	       }
	
	      public void forward(HttpServletRequest request, HttpServletResponse response, String page) throws ServletException, IOException{
		  RequestDispatcher disp =request.getRequestDispatcher(page);
		  disp.forward(request, response);
		 }
	      
	     public void proccesRequest(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
	    	String action = request.getParameter("action");
	    	Command command = CommandChooser.chooseCommand(action);
            String page = command.execute(request, response);
            forward(request, response, page);
	 		/*
	 				if("TAT" .equals(login) & "TAT" .equals(password)) {
	 				    User user = new User(login, password,true);
	 				    
	 				    HttpSession session = request.getSession();
	 				    session.setAttribute("user", user);
	 				    
	 				    
	 					System.out.println("true user" + login + password);
	 					PrintWriter writer = response.getWriter();
	 					List<Book> list = new ArrayList<Book>();
	 					list.add(new Book("title1","author1",1.11));
	 					list.add(new Book("title2","author2",2.22));
	 					list.add(new Book("title3","author3",3.33));
	 					list.add(new Book("title4","author4",4.44));
	 					request.setAttribute("books", list);
	 					forward(request, response, "/welcome.jsp");
	 				//	String html = "<html>"
	 				//			+"<head>"
	 				//			+"<body> <H1 color='red'>Success</H1>"
	 				//			+"</body>"
	 				//			+"</head>"
	 				//			+"</html>";
	 					
	 				//	writer.println(html);
	 				//	response.sendRedirect("user.html");
	 					
	 				}else{
	 					System.out.println("false" + login + password);
	 					request.setAttribute("ERROR", "wrong user login or password");
	 					
	 					forward(request,response,"/welcome.jsp");
	 				//	RequestDispatcher disp = request.getRequestDispatcher("/user1.jsp");
	 				//	disp.forward(request, response);
	 				}
	 				*/
	     }

}