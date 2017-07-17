package excelpages;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import aspire.com.util.EnvironmentVariables;
import jo.aspire.automation.logger.EnvirommentManager;

public class ReadXLSX {
	
	public static XSSFWorkbook workbook = null;
	public static XSSFSheet sheet = null;
	public static Map<String, Object[]> data = new TreeMap<String, Object[]>();
	public static Set<String> keyset = null;
	public static int rownum = 0;
	public static String result = null;
	

	 public static String readFromSheet(int findRaw , String findCol)
 {
		try {
			FileInputStream file = new FileInputStream(new File(
					"src/test/resources/AllUsereType.xlsx"));

			// Create Workbook instance holding reference to .xlsx file  here
			workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			sheet = workbook.getSheetAt(0);

			result = getCellValueForXY(findRaw, findCol);

			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	 
	public static int colIndexForCell(String colName) {
		int colNum = 0;
		for (Row row : sheet) {
			for (Cell cell : row) {
				if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
					if (cell.getRichStringCellValue().getString().trim()
							.equals(colName)) {
						colNum = cell.getColumnIndex();
					}
				}
			}
		}
		return colNum;

	}

	public static int rawIndexForCell(String rowIndex) {
		int rowNum = 0;
		for (Row row : sheet) {
			for (Cell cell : row) {
				if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
					if (cell.getRichStringCellValue().getString().trim()
							.equals(rowIndex)) {
						rowNum = cell.getRowIndex();
					}
				}
			}
		}
		return rowNum;

	}

	public static String getCellValueForXY(int findRaw, String findCol) {

		int thisCol = colIndexForCell(findCol);

		Row raw = sheet.getRow(findRaw);
		Cell cell = raw.getCell(thisCol);

		String result = null;
		if (cell != null) {
			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
				result = Boolean.toString(cell.getBooleanCellValue()).replace(
						".0", "");
				break;
			case Cell.CELL_TYPE_NUMERIC:

				DataFormatter formatter = new DataFormatter(); // creating
																// formatter
																// using the
																// default
																// locale
				String cellString = formatter.formatCellValue(cell);

				if (cellString.contains(":")) {
					result = cellString;
					System.out.println("result   " + result);
				} else {
					System.out.println(cell.getNumericCellValue());
					result = Double.toString(cell.getNumericCellValue());

				}

				break;

			case Cell.CELL_TYPE_STRING:
				System.out.println(cell.getStringCellValue());
				result = cell.getStringCellValue();

				break;
			case Cell.CELL_TYPE_BLANK:
				result = "";
				break;
			case Cell.CELL_TYPE_ERROR:
				System.out.println(cell.getErrorCellValue());
				result = Byte.toString(cell.getErrorCellValue());
				break;

			// CELL_TYPE_FORMULA will never occur
			case Cell.CELL_TYPE_FORMULA:
				result = "FORMULA";
				break;
			}

		}
		return result;
	}

	
	public static String getCellValue(Row row, int cellIndex) {

		Cell cellValue = row.getCell(cellIndex);
		String result = "";
		if (cellValue != null) {
			switch (cellValue.getCellType()) {
			case Cell.CELL_TYPE_BOOLEAN:
				result = Boolean.toString(cellValue.getBooleanCellValue())
						.replace(".0", "");
				break;
			case Cell.CELL_TYPE_NUMERIC:
				DataFormatter formatter = new DataFormatter(); // creating
																// formatter
																// using the
																// default
																// locale
				String cellString = formatter.formatCellValue(cellValue);

				if (cellString.contains(":")) {
					result = cellString;
				} else {
					result = Double.toString(cellValue.getNumericCellValue());
				}
				break;

			case Cell.CELL_TYPE_STRING:
				result = cellValue.getStringCellValue();

				break;
			case Cell.CELL_TYPE_BLANK:
				result = "";
				break;
			case Cell.CELL_TYPE_ERROR:
				result = Byte.toString(cellValue.getErrorCellValue());
				break;

			// CELL_TYPE_FORMULA will never occur
			case Cell.CELL_TYPE_FORMULA:
				result = "FORMULA";
				break;
			}
		}
		return result;
	}

	public static boolean isValidRow(Row row) {
		return getCellValue(row, 0) != "";
	}
	
	public static XSSFWorkbook getWorkbookForRegisterUsers() {
		try {
		String nameOfSheet =EnvironmentVariables.getRegisterUserSheet();
			FileInputStream file = new FileInputStream(new File("src/test/resources/"+nameOfSheet));

			workbook = new XSSFWorkbook(file);
			file.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return workbook;
	}
	public static XSSFWorkbook getWorkbookForMemeberUsers() {
		try {
			String valueOfUsers= EnvirommentManager.getInstance().getProperty(EnvironmentVariables.local + "_AllMemberUser");
			FileInputStream file = new FileInputStream(new File(
					"src/test/resources/"+valueOfUsers));

			// Create Workbook instance holding reference to .xlsx file
			workbook = new XSSFWorkbook(file);
			file.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return workbook;
	}
	
	public static XSSFWorkbook getSKU_ForSearchOnProduct() {
		try {
			

			String valueOfUsers= EnvirommentManager.getInstance().getProperty(EnvironmentVariables.local + "_SKU");

			FileInputStream file = new FileInputStream(new File("src/test/resources/"+valueOfUsers));
			workbook = new XSSFWorkbook(file);
			file.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return workbook;
	}
	

}