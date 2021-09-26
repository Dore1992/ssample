package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robotclass {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		Runtime.getRuntime().exec("notepad");//path of exutetable file
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_L);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_E);
		r.keyPress(KeyEvent.VK_U);
		
	}

}
