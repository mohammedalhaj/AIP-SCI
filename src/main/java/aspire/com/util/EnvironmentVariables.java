package aspire.com.util;

import jo.aspire.automation.logger.EnvirommentManager;

public class EnvironmentVariables  {
	public static String local;
	
	
	public static String getAspireReportName(){
		String value = EnvirommentManager.getInstance().getProperty(EnvironmentVariables.local+"_AspireReportName");
		System.err.println("AspireReportName:" +value );
		return value; 
		
	}
	public static String getAspireReportType(){
		String value = EnvirommentManager.getInstance().getProperty(EnvironmentVariables.local+"_AspireReportType");
		System.err.println("AspireReportType:" +value );
		return value; 
		
	}
	 public static boolean getDimention()
	    {
	    	String value = EnvirommentManager.getInstance().getProperty("DIMENSION"); 
	    	if(value.equals("${dimension}"))
	    	{
	    		return false;
	    	}
	    	
	    	return Boolean.parseBoolean(value);
	    }

	 public static String getSKU_Sheet(){ 
			String value = EnvirommentManager.getInstance().getProperty(EnvironmentVariables.local + "_SKU");
			
			System.err.println("Sheet of QAT2 SKU'S :" +value );
			return value;
			
		}
	 

		public static String getURL(){
			System.err.println("local is " +EnvironmentVariables.local + "_URL" );
			
			String value = EnvirommentManager.getInstance().getProperty(EnvironmentVariables.local + "_URL");
			
			System.err.println("getURL():" +value );
		return value ; 
		}
		
		public static String getRegisterUserSheet(){ 
			String value = EnvirommentManager.getInstance().getProperty(EnvironmentVariables.local + "_AllRegisterUser");
			System.err.println("SheetType_AllRegisterUser():" +value );
			return value;
			
		}
		
		public static String getMemberUserSheet(){ 
			String value =EnvirommentManager.getInstance().getProperty(EnvironmentVariables.local + "_AllMemberUser");
			System.err.println("SheetType_AllRegisterUser()" +value );
			return value;

			
		}
		
		
		public static String getCMXURL(){
			String value = EnvirommentManager.getInstance().getProperty(EnvironmentVariables.local+"_CMXURL");
			System.err.println("getCMXURL:" + value );
			return value; 
			
		}
		
		
		public static String getRegressionFolderNameForRun(){
			String value = EnvirommentManager.getInstance().getProperty(EnvironmentVariables.local+"_RegressionFolderName");
			System.err.println("getRegressionFolderNameForRun():" +value );
			return value; 
			
		}
		
		
		
}
