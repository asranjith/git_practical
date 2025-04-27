package com.comcast.crm.generic.Fileutility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtility {
	public String readDataFromJsonFile(String filePath,String key) throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(filePath));
		JSONObject map = (JSONObject) obj;
		String data = (String) map.get(key);
		return data;
	}

	public Object readDataFromJsonFile(String filePath, String page, String key)
			throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(new FileReader(filePath));
		JSONObject pageData = (JSONObject) obj.get(page);
		String data = (String) pageData.get(key);
		return data;
	}
}
