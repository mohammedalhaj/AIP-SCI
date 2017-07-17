package excelpages;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;

//import gherkin.formatter.model.Row;
import jo.aspire.generic.StateHelper;

public class ReadeExcelSheet extends FluentWebDriverPage  {
	public ReadeExcelSheet(WebDriverProvider webDriverProvider) {
		super(webDriverProvider);
	}
	public String userName;
	public String passWord ;
	public String SKU ;
	public static String user ;
	public static String pass ;
	public static String sku;
	
	public String getUser(){
		 System.err.println(user);
			return user;
		}
	
	 public String getPass(){
		 System.err.println(pass);
			return pass;
		}  

 
	 public String getSKU(){
		 System.err.println(sku);
			return sku;
		}  
		
		public void selectRandomRegisterUser() {
			try {
				
				 int min = 1,max = 1;  
				 
				XSSFWorkbook workbook = ReadXLSX.getWorkbookForRegisterUsers() ;  
				XSSFSheet sheet = workbook.getSheetAt(0);
				int totalRows = sheet.getLastRowNum() - 1 ;
				max = totalRows; 
				int randomNum = 0  ;
				randomNum  = min + (int)(Math.random() * ((max - min) + 1)) ; 
				for (Row row : sheet) {
						if (row.getRowNum() > 0 && ReadXLSX.isValidRow(row) && (row.getRowNum() == randomNum)) {
							
							String userName = ReadXLSX.getCellValue(row, 0);
							String password = ReadXLSX.getCellValue(row, 1);
								System.err.println(userName);
							System.err.println(password);
							user = userName;
							pass = password;
							break;
							
						}
					}
						}

	      catch (Exception e1) { 
	          e1.printStackTrace();
	      }}
		
		public void selectRandomMemberUser() {
			try {
				
				 int min = 1,max = 1;  
				 
				XSSFWorkbook workbook = ReadXLSX.getWorkbookForMemeberUsers() ;  
				XSSFSheet sheet = workbook.getSheetAt(0);
				int totalRows = sheet.getLastRowNum() - 1 ;
				max = totalRows; 
				int randomNum = 0  ;
				randomNum  = min + (int)(Math.random() * ((max - min) + 1)) ; 
				for ( Row row : sheet) {
						if (row.getRowNum() > 0 && ReadXLSX.isValidRow(row) && (row.getRowNum() == randomNum)) {
							
							String userName = ReadXLSX.getCellValue(row, 0);
							String password = ReadXLSX.getCellValue(row, 1);
								System.err.println(userName);
							System.err.println(password);
							user = userName;
							pass = password;
							break;
							
						}
					}
						}

	      catch (Exception e1) { 
	          e1.printStackTrace();
	      }}
		
		public void selectSKU_ForSearch() {
			try {
				
				 int min = 1,max = 1;  
				 
				XSSFWorkbook workbook = ReadXLSX.getSKU_ForSearchOnProduct() ;  
				XSSFSheet sheet = workbook.getSheetAt(0);
				int totalRows = sheet.getLastRowNum() - 1 ;
				max = totalRows; 
				int randomNum = 0  ;
				randomNum  = min + (int)(Math.random() * ((max - min) + 1)) ; 
				for (Row row : sheet) {
						if (row.getRowNum() > 0 && ReadXLSX.isValidRow(row) && (row.getRowNum() == randomNum)) {
							String SKU = ReadXLSX.getCellValue(row, 0);
							System.err.println(SKU);
							sku = SKU;
							break;
							
						}
					}
						}

	      catch (Exception e1) { 
	          e1.printStackTrace();
	      }}
		
		public void selectSKU() {
			try {
				XSSFWorkbook workbook = ReadXLSX.getSKU_ForSearchOnProduct() ;  
				XSSFSheet sheet = workbook.getSheetAt(0);
				int totalRows = sheet.getLastRowNum()  ;
				for (int i = 1; i <totalRows ; i++) {
					String SKU = ReadXLSX.getCellValue(sheet.getRow(i),0);
					System.err.println(SKU);
				
					sku = SKU;
				}
//				 
						}

	      catch (Exception e1) { 
	          e1.printStackTrace();
	      }}
				
		public void selectOnceOfUserQAT2() {
			 int RawPointerForUsersSheet = 1;
				try {
					System.err.println("Inside the try: "+RawPointerForUsersSheet);
					if ((String) StateHelper.getStoryState("RawPointerForUsersSheet") != null) {
						RawPointerForUsersSheet = Integer.parseInt((String) StateHelper.getStoryState("RawPointerForUsersSheet"));
						System.err.println(RawPointerForUsersSheet);
						RawPointerForUsersSheet++;
					}
					XSSFWorkbook workbook = ReadXLSX.getWorkbookForRegisterUsers();
					XSSFSheet sheet = workbook.getSheetAt(0);
					//int totalRows = sheet.getLastRowNum() - 1;

					for (Row row : sheet) {
						if (row.getRowNum() > 0 && ReadXLSX.isValidRow(row)
								&& (row.getRowNum() == RawPointerForUsersSheet)) {
							String userName = ReadXLSX.getCellValue(row, 0);
							String password = ReadXLSX.getCellValue(row, 1);
							System.err.println(userName);
							System.err.println(password);
							user = userName;
							pass = password;
							break;
						}
					}
				
					StateHelper.setStoryState("RawPointerForUsersSheet" , String.valueOf(RawPointerForUsersSheet)) ; 
				}

		      catch (Exception e1) { 
		          e1.printStackTrace();
		      }
		 	 
		}
		
		public void selectOnceOfSKU() {
			 int RawPointerForUsersSheet = 1;
				try {
					System.err.println("Inside the try: "+RawPointerForUsersSheet);
					if ((String) StateHelper.getStoryState("RawPointerForUsersSheet") != null) {
						RawPointerForUsersSheet = Integer.parseInt((String) StateHelper.getStoryState("RawPointerForUsersSheet"));
						System.err.println(RawPointerForUsersSheet);
						RawPointerForUsersSheet++;
					}
					XSSFWorkbook workbook = ReadXLSX.getSKU_ForSearchOnProduct();
					XSSFSheet sheet = workbook.getSheetAt(0);
					for (Row row : sheet) {
						if (row.getRowNum() > 0 && ReadXLSX.isValidRow(row)
								&& (row.getRowNum() == RawPointerForUsersSheet)) {
							String SKU = ReadXLSX.getCellValue(row, 0);
							System.err.println("im in "+SKU);
							
							sku = SKU;
						 
							break;
						}
					}
				
					StateHelper.setStoryState("RawPointerForUsersSheet" , String.valueOf(RawPointerForUsersSheet)) ; 
				}

		      catch (Exception e1) { 
		          e1.printStackTrace();
		      }
		 	 
		}
		
}