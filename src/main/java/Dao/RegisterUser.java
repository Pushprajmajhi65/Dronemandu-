package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.LoginModel;
import model.droneModel;
import view.droneStringView;

public class RegisterUser {

	public int registeruser(droneModel drone) {

		try {
			// Prepare a statement using the predefined query for student registration
			PreparedStatement stmt = DBConnection.getConnection().prepareStatement(droneStringView.INSERT_USER);

			// Set the student information in the prepared statement
			stmt.setString(1, drone.getFullName());
			stmt.setString(2, drone.getEmail());
			stmt.setString(3, drone.getPassword());
			stmt.setString(4, drone.getGender());
			stmt.setString(5, drone.getPhone());
			stmt.setString(6, drone.getProvince());
			stmt.setString(7, drone.getCity());
			stmt.setString(8, drone.getUserName());
			stmt.setString(9, drone.getStreet());

			// stmt.setString(9, PasswordEncryptionWithAes.encrypt(
			// student.getUsername(), student.getPassword()));
			// stmt.setString(10, student.getImageUrlFromPart());

			// Execute the update statement and store the number of affected rows
			int result = stmt.executeUpdate();

			// Check if the update was successful (i.e., at least one row affected)
			if (result > 0) {
				return 1; // Registration successful
			} else {
				return 0; // Registration failed (no rows affected)
			}

		} catch (ClassNotFoundException | SQLException ex) {
			// Print the stack trace for debugging purposes
			ex.printStackTrace();
			return -1; // Internal error
		}
	}

	/**
	 * This method attempts to validate a student login by checking the username and
	 * password against a database.
	 * 
	 * @param username The username provided by the user attempting to log in.
	 * @param password The password provided by the user attempting to log in.
	 * @return An integer value indicating the login status: - 1: Login successful -
	 *         0: Username or password mismatch - -1: Username not found in the
	 *         database - -2: Internal error (e.g., SQL or ClassNotFound exceptions)
	 * @throws SQLException           if a database access error occurs.
	 * @throws ClassNotFoundException if the JDBC driver class is not found.
	 */

	public int getUserLoginInfo(LoginModel loginModel) {
		try (Connection con = DBConnection.getConnection()) {
			PreparedStatement st = con.prepareStatement(droneStringView.QUERY_LOGIN_STUDENT_INFO);

			// Set the username in the first parameter of the prepared statement
			st.setString(1, loginModel.getEmail());

			// Execute the query and store the result set
			ResultSet result = st.executeQuery();

			// Check if there's a record returned from the query
			if (result.next()) {
				// Get the username from the database
				String emailDb = result.getString(droneStringView.EMAIL);

				// Get the password from the database
				String passwordDb = result.getString(droneStringView.PASSWORD);

				// Check if the username and password match the credentials from the database
				if (emailDb.equals(loginModel.getEmail()) && passwordDb.equals(loginModel.getPassword())) {
					// Login successful, return 1
					return 1;
				} else {
					// Username or password mismatch, return 0
					return 0;
				}
			} else {
				// Username not found in the database, return -1
				return -1;
			}

			// Catch SQLException and ClassNotFoundException if they occur
		} catch (SQLException | ClassNotFoundException ex) {
			// Print the stack trace for debugging purposes
			ex.printStackTrace();
			// Return -2 to indicate an internal error
			return -2;
		}
	}

	public Boolean checkEmailIfExists(String email) {
		// TODO: Implement logic to check if the provided email address exists in the
		// database
		// This method should likely query the database using DBController and return
		// true if the email exists, false otherwise.
		return false;
	}

	public Boolean checkNumberIfExists(String number) {
		// TODO: Implement logic to check if the provided phone number exists in the
		// database
		// This method should likely query the database using DBController and return
		// true if the phone number exists, false otherwise.
		return false;
	}

	public Boolean checkUsernameIfExists(String username) {
		// TODO: Implement logic to check if the provided username exists in the
		// database
		// This method should likely query the database using DBController and return
		// true if the username exists, false otherwise.
		return false;
	}

}
