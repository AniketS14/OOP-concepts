package serialization;

import java.io.*;

public class Demo {

	public static void main(String[] arges) throws IOException {

		FileOutputStream fos = new FileOutputStream("temp.json");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		User user = new User();

		user.setUserName("Sam");
		user.setPassword("password123");

		oos.writeObject(user);
	//	oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("D:\\User\\adesale\\temp.json");
		ObjectInputStream oin = new ObjectInputStream(fis);
		try {
			User userFromFile = (User) oin.readObject();
			System.out.println(userFromFile.getUserName());
			System.out.println(userFromFile.getPassword());
		} catch (Exception e) {
			// handle Exception
		}

		oin.close();
	}

}