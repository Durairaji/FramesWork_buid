package propertiesReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReading {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("C:\\Users\\DURAIRAJ\\eclipse-workspace\\MavanFrame\\src\\test\\java\\propertiesReading\\Login.properties"));
		String property = properties.getProperty("password");
		System.out.println(property);
		
		
		
		
		
		
		
		
		
		
	}

}
