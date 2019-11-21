package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {


		String path = "text.properties";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			Properties properties = new Properties();
			properties.load(reader);
			String name = properties.getProperty("name");
			String company = properties.getProperty("company");
			String gf = properties.getProperty("gf");
			
			System.out.println("Name: "+name);
			System.out.println("Company: "+company);
			System.out.println("Gf: ");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}
