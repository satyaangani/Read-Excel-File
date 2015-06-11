package caly.readexcel;

public class PoiReadExcelFile {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("G://read//test9.xls");
			HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
			HSSFSheet worksheet = workbook.getSheet("Sheet1");
			HSSFRow row1 = worksheet.getRow(0);
			@SuppressWarnings("deprecation")
			HSSFCell cellA1 = row1.getCell((short) 0);
			String a1Val = cellA1.getStringCellValue();
			@SuppressWarnings("deprecation")
			HSSFCell cellB1 = row1.getCell((short) 1);
			String b1Val = cellB1.getStringCellValue();
			@SuppressWarnings("deprecation")
			HSSFCell cellC1 = row1.getCell((short) 2);
			boolean c1Val = cellC1.getBooleanCellValue();
			@SuppressWarnings("deprecation")
			HSSFCell cellD1 = row1.getCell((short) 3);
			Date d1Val = cellD1.getDateCellValue();

			System.out.println("A1: " + a1Val);
			System.out.println("B1: " + b1Val);
			System.out.println("C1: " + c1Val);
			System.out.println("D1: " + d1Val);
			System.out.println("execel file read done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
   }
}

}
