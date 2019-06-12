package Config;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	static String projectpath = System.getProperty("user.dir");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getProperties();
	}
	public static void getProperties() {
		try {
			Properties prop = new Properties();

			InputStream input = new FileInputStream(projectpath+"/src/test/java/Config/Config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
		}
		catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void setProperties() {

		try {
			OutputStream out = new FileOutputStream (projectpath+"/src/test/java/Config/Config.properties");
			prop.load()
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}