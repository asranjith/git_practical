package com.comcast.crm.generic.Fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
    public String readDataFromPropertyFile(String key) throws IOException {
    	FileInputStream file = new FileInputStream("./src/test/resources/configo.properties");
    	Properties pro = new Properties();
    	pro.load(file);
    	String data = pro.getProperty(key);
    	return data;
    }
}
