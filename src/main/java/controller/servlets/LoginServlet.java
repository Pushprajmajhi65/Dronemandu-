package controller.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.RegisterUser;
import model.LoginModel;


import view.droneStringView;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/LoginServlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       RegisterUser dbController = new RegisterUser();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 
	    }

	

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String email = request.getParameter(droneStringView.EMAIL);
        String password = request.getParameter(droneStringView.PASSWORD);
        
        System.out.println(email);
        System.out.println(password);
        
        //When match to admin credent
        if ("admin@admin.com".equals(email) && "admin".equals(password)) {
        	System.out.println("Admin Page");
            // Successful login, redirect to a dashboard or another page
        	response.sendRedirect(request.getContextPath() + droneStringView.PAGE_URL_ADMIN);
        }
        else {
            // Failed login, redirect back to the login page with an error message
            response.sendRedirect("login.jsp?error=1");
        }
        
        
//        else {
//        	// Create a LoginModel object to hold user credentials
//            LoginModel loginModel = new LoginModel(email, password);
//
//            // Call DBController to validate login credentials
//            int loginResult = dbController.getUserLoginInfo(loginModel);
//
//            // Handle login results with appropriate messages and redirects
//            if (loginResult == 1) {
//                // Login successful
//                request.setAttribute(droneStringView.MESSAGE_SUCCESS, droneStringView.MESSAGE_SUCCESS_LOGIN);
//                response.sendRedirect(request.getContextPath() + droneStringView.PAGE_URL_HOME);
//            } else if (loginResult == 0) {
//                // Username or password mismatch
//                request.setAttribute(droneStringView.MESSAGE_ERROR, droneStringView.MESSAGE_ERROR_LOGIN);
//                request.getRequestDispatcher(droneStringView.PAGE_URL_LOGIN).forward(request, response);
//            } else if (loginResult == -1) {
//                // Username not found
//                request.setAttribute(droneStringView.MESSAGE_ERROR, droneStringView.MESSAGE_ERROR_REGISTER);
//                request.getRequestDispatcher(droneStringView.PAGE_URL_LOGIN).forward(request, response);
//            } else {
//                // Internal server error
//                request.setAttribute(droneStringView.MESSAGE_ERROR, droneStringView.MESSAGE_ERROR_SERVER);
//                request.getRequestDispatcher(droneStringView.PAGE_URL_LOGIN).forward(request, response);
//            }}

        
    }




	}


