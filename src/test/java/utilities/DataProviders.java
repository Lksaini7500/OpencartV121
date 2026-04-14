package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	// DataProvider 1

	@DataProvider(name = "LoginData")
	public String [][] getData() throws IOException {
		String path = ".\\testData\\TestLoginData.xlsx"; // taking xl file from testData

		ExcelUtility xlutil = new ExcelUtility(path); // creating a object for XLUtility

		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getCellCount("Sheet1", 1);

		String logindata[][] = new String[totalrows][totalcols]; // create for 2 dimensional array which stores login
																	// data

		for (int i = 1; i <= totalrows; i++) // read the data from xl storing in 2 dimensional array
		{
			for (int j = 0; j < totalcols; j++) {
				logindata[i-1][j] = xlutil.getCellData("Sheet1", i, j); // 1,0
			}
		}

		return logindata; // returning two dimension array
	}

	// DataProvider 2

	// DataProvider 3

	// DataProvider 4

}
