package aspire.ecommerce.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class User  {
	public String userName;
	public String password;
	public String userRole;
	public String welcomeName;
	private static final String USERS_FILE_PATH = "src/main/resources/users.json";
	
	public static User getUserByUserRole(String userRole) {
		Gson jsonUsers = new Gson();
		try {
			BufferedReader userList = new BufferedReader(new FileReader(USERS_FILE_PATH));
			User[] users;
			users = jsonUsers.fromJson(userList, User[].class);
			User matchingUser = null;
			for (User user : users) {
				if (userRole.equalsIgnoreCase(user.userRole)) {
					matchingUser = user;
					break;
				}
			}
			return matchingUser;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}