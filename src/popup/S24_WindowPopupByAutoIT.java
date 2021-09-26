package popup;




import java.io.IOException;

public class S24_WindowPopupByAutoIT
{
	//Handling windows popup using AutoIT
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//Open Notepad
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(3000);
		//Run AutoIT script
		Runtime.getRuntime().exec(".//AutoIT//notepad1");

	}

}
