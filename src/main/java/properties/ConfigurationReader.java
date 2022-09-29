package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public Properties p;
	public ConfigurationReader() throws IOException {
		File f= new File("C:\\Users\\WELCOME\\eclipse-workspace\\zoho\\src\\main\\java\\properties");
		FileInputStream fis= new FileInputStream(f);
		
//		Properties p= new Properties();
		p= new Properties();
		
		p.load(fis);
		
	}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;

	}


}
