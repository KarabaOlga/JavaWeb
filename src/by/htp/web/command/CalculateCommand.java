package by.htp.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String page = "/error.jsp";
		
		String val1 = request.getParameter("val1");
		String val2 = request.getParameter("val2");

		if (validate(val1, val2)) {
			int result = calculate(val1, val2);
			request.setAttribute("result", result);
			page = "/user.jsp";
		} 
		return page;
	}

	private int calculate(String val1, String val2){
		int a = Integer.parseInt(val1);
		int b = Integer.parseInt(val2);
		
		int c = a + b;
		return c;
	}

	private boolean validate(String val1, String val2) {
		if (val1 != null && !val1.isEmpty() && val2 != null && !val2.isEmpty()) {
			return true;
		}
		return false;
	}

}
