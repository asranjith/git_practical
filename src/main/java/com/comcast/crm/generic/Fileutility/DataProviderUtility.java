package com.comcast.crm.generic.Fileutility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class DataProviderUtility {
	ExcelUtility exutils;
       @DataProvider
       public Object[][] data2Sender() throws EncryptedDocumentException, IOException {
   		exutils = new ExcelUtility();
   		int rowCount = exutils.getRowCount("phone");
   		Object[][] obj = new Object[rowCount][2];
   		for (int i = 0; i < rowCount; i++) {
   			obj[i][0] = exutils.readDataFromExcel("phone", i + 1, 0);
   			obj[i][1] = exutils.readDataFromExcel("phone", i + 1, 1);
   		}
   		return obj;
       }
       
     
}
