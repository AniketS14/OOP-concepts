package desrialozation;

//import java.io.FileInputStream;
//import java.io.ObjectInputStream;
import java.io.*;

import serialization.User;

public class Desrialize {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\User\\adesale\\eclipse-workspace\\Practice\\temp.json");
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
