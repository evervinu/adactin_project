package com.helper;

public class File_Reader_Manager {
	public File_Reader_Manager() {

	}
  public static File_Reader_Manager getInstance() {
  File_Reader_Manager helper = new File_Reader_Manager();
  return helper;	  
} 
	public static Configuration_reader getInstanceCR() throws Throwable {

		Configuration_reader reader = new Configuration_reader();
		return reader;
	}
	
	
	
}
