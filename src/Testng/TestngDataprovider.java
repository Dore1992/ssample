package Testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDataprovider {
@DataProvider
public  Object[][] getData(){
	Object  a[][]=new Object[3][2];
	a[0][0]="User1";
	a[0][1]=1;
	a[1][0]="User2";
	a[1][1]=2;
	a[2][0]="User3";
	a[2][1]=3;
	return a;
}
@Test(dataProvider="getData")
public void userDetails(String name, int no)
{
	Reporter.log(name+" : "+no, true);

}
}


