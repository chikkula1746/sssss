package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readingdata {
      Properties pro;
      
      public Readingdata() {
    	  File file=new File("./Configuration/Sathish.properties");
    	  try {
    		FileInputStream fis=new  FileInputStream(file);
    		pro=new Properties();
    		pro.load(fis);
    	  }
    	  catch(Exception e) {
    		  System.out.println("exception is:"+e.getMessage());
    	  }
      }
      public String getapplicationURL() {
    	  String url=pro.getProperty("baseURL");
    	 return url;
    	  
      }
      public String getUsername() {
    	  String username=pro.getProperty("username");
    	  return username;
      }
      public String getpassword() {
    	  String password=pro.getProperty("password");
    	  return password;
      }
      public String getchromepath() {
    	  String cpath=pro.getProperty("cpath");
    	  return cpath;
      }
}
