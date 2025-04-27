package com.comcast.crm.generic.Webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
      public int getRandomNumber() {
    	  Random random = new Random();
    	  int num = random.nextInt(5000);
    	  return num;
      }
      
      public String getSystemDateYYYY_MM_dd() {
    	  Date dateobj = new Date();
    	  SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
    	  String date = sim.format(dateobj);
    	  return date;
      }
      public String getRequiredDateYYYY_MM_dd(int days) {
    	  Date dateobj = new Date();
    	  SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
    	  sim.format(dateobj);
    	  Calendar cal = sim.getCalendar();
    	  cal.add(Calendar.DAY_OF_MONTH,days);
    	  String reqDate = sim.format(cal.getTime());
    	  return reqDate;
      }
}
