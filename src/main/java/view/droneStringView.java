package view;

public class droneStringView {
	// Start: DB Connection
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String LOCALHOST_URL = "jdbc:mysql://localhost:3306/dronedb";
	public static final String LOCALHOST_USERNAME = "root";
	public static final String LOCALHOST_PASSWORD = "";
	
	// End: DB Connection
	//Start SQL Queries
	public static final String INSERT_USER = "INSERT INTO useraccount"+"(fullName, email,password,gender,phone,province,city,userName,street )" +"VALUES (?, ?, ?, ?, ?, ?,?,?,?)";
	
	public static final String GET_LOGIN_USER_INFO = "SELECT * FROM register WHERE email=? and password =?";
	
	public static final String QUERY_LOGIN_STUDENT_INFO= "SELECT * FROM register WHERE email = ? AND password = ?";
	public static final String GET_ALL_STUDENTS_INFO = "SELECT * FROM register";  
	//public static final String GET_USERNAME = "SELECT COUNT(*) FROM  WHERE user_name= ? ";
	public static final String GET_PHONE = "SELECT COUNT(*) FROM register WHERE phone_number = ?";
	public static final String GET_EMAIL = "SELECT COUNT(*) FROM register WHERE email =?";		
	public static final String GET_All_Products = "SELECT productName, productDesc, mrp, discountPrice, stock, imageUrl, category FROM product;";	
	// End: Queries
	
	
	//Product Table Queries
	public static final String INSERT_PRODUCT_SQL = "INSERT INTO product (productName, productDesc, mrp, discountPrice,stock, imageUrl, category) VALUES (?, ?, ?, ?, ?, ?, ?)";
	public static final String DELETE_PRODUCT_SQL = "DELETE FROM product WHERE productId = ?";
	public static final String UPDATE_PRODUCT_SQL = "UPDATE product SET productName = ?, productDesc = ?, category = ?, mrp = ?, discountPrice = ?, stock = ?, imageUrl = ? WHERE productId = ?";
		

	// Start: DB Connection End: DB Connection

	// Start: Queries
	//public static final String QUERY_REGISTER_STUDENT = "INSERT INTO accounts "+"(fullName,email,password,gender,phone,province,city)"
		//	+ "VALUES (?, ?, ?, ?, ?, ?, ?)";

	public static final String QUERY_LOGIN_USER_CHECK = "SELECT * FROM accounts WHERE email = ?";
	// End: Queries

	// Start: Parameter names
	
	public static final String FUllName = "FullName";
	
	public static final String EMAIL = "email";
	public static final String PASSWORD = "password";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String GENDER = "gender";
	public static final String PROVINCE = "province";
	public static final String CITY = "city";
	public static final String RETYPE_PASSWORD = "retypePassword";
	// End: Parameter names

	// Start: Validation Messages
	
	// Register Page Messages
	public static final String MESSAGE_SUCCESS_REGISTER = "Successfully Registered!";
	public static final String MESSAGE_ERROR_REGISTER = "Please correct the form data.";
	public static final String MESSAGE_ERROR_SERVER = "An unexpected server error occurred.";
	public static final String MESSAGE_ERROR_USERNAME = "Username is already registered.";
	public static final String MESSAGE_ERROR_EMAIL = "Email is already registered.";
	public static final String MESSAGE_ERROR_PHONE_NUMBER = "Phone number is already registered.";
	public static final String MESSAGE_ERROR_PASSWORD_UNMATCHED = "Password is not matched.";

	// Login Page Messages
	public static final String MESSAGE_SUCCESS_LOGIN = "Successfully LoggedIn!";
	public static final String MESSAGE_ERROR_LOGIN = "Either username or password is not correct!";

	// Other Messages
	public static final String MESSAGE_SUCCESS_DELETE = "Successfully Deleted!";
	public static final String MESSAGE_ERROR_DELETE = "Cannot delete the user!";
	public static final String MESSAGE_SUCCESS = "successMessage";
	public static final String MESSAGE_ERROR = "errorMessage";
	// End: Validation Messages

	// Start: JSP Route
	public static final String PAGE_URL_LOGIN = "/pages/login.jsp";
	public static final String PAGE_URL_REGISTER = "/pages/register.jsp";
	public static final String PAGE_URL_WELCOME = "/pages/welcome.jsp";
	public static final String PAGE_URL_HOME = "/pages/home.jsp";
	public static final String PAGE_URL_ADMIN = "/pages/admin.jsp";
	
	// End: JSP Route

	// Start: Servlet Route
	public static final String SERVLET_URL_LOGIN = "/LoginServlet";
	public static final String SERVLET_URL_REGISTER = "/registerServlet";
	
	// End: Servlet Route
	
	
	//Admin Credentials
	public static final String adminPass = "admin@123";
	public static final String adminEmail = "admin@admin.com";
}

	