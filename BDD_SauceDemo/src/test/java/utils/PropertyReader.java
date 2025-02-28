package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	static String fileName = ".\\src\\test\\resources\\config\\config.properties";
	static FileInputStream fis;
	static Properties prop;

	public static Properties readProperty() {
		try {
			fis = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			System.out.println("File Path or File Name is Incorrect");
			e.printStackTrace();
		}
		return prop;
	}

}
