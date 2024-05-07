package controller.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.RegisterUser;
import model.droneModel;
import view.droneStringView;

/**
 * Servlet implementation class registerServlet
 */
@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final RegisterUser RegisterUser;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public registerServlet() {
		this.RegisterUser = new RegisterUser();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printOut = response.getWriter();
		response.setContentType("text/html");
		printOut.print("HELLO WORLD");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		// Retrieve parameters from the request

		String fullName = request.getParameter("fullName");
		String userName = request.getParameter("userName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		// String retypePassword = request.getParameter("retypePassword");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phoneNumber");
		String province = request.getParameter("province");
		String city = request.getParameter("city");
		String street = request.getParameter("street");

		System.out.println(fullName);
		System.out.println(email);
		System.out.println(password);
		System.out.println(phone);
		System.out.println(gender);
		System.out.println(userName);
		System.out.println(street);

		// Create a droneModel object with the retrieved parameters
		droneModel drone = new droneModel(fullName, email, password, gender, phone, province, city, userName, street);

		// Register the user using the droneDBController
		int result = RegisterUser.registeruser(drone);

		// Redirect based on the result
		if (result == 1) {
			// String successRegisterMessage = "Sucessfully Registered";
			request.setAttribute(droneStringView.MESSAGE_SUCCESS, droneStringView.MESSAGE_SUCCESS_REGISTER);
			response.sendRedirect(request.getContextPath() + droneStringView.PAGE_URL_LOGIN);

			// response.sendRedirect(request.getContextPath() + "/pages/login.jsp");
		} else if (result == 0) {
			request.setAttribute(droneStringView.MESSAGE_ERROR, droneStringView.MESSAGE_ERROR_REGISTER);
			request.getRequestDispatcher(droneStringView.PAGE_URL_REGISTER).forward(request, response);

		} else {
			// String errorMessage = "An unexpected server error occured.";
			request.setAttribute(droneStringView.MESSAGE_ERROR, droneStringView.MESSAGE_ERROR_SERVER);
			request.getRequestDispatcher(droneStringView.PAGE_URL_REGISTER).forward(request, response);
		}
	}
}
