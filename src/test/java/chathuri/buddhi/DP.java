package chathuri.buddhi;

import org.testng.annotations.DataProvider;

import chathuri.buddhi.lib.ReadExcelLib;

public class DP {
  @DataProvider
  public Object[][] dp() {
	  ReadExcelLib excel = new ReadExcelLib();
	  String filename = "C:\\Users\\CHATHURIBUDDHI\\eclipse-workspace\\SeleniumDemo\\TestData\\Search_Data.xlsx";
	  return excel.Get_Excel_Data(filename, "Sheet1", 2);
	  
  }
}
