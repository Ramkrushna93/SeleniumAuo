package ScreenshotOperation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.Rectangle;

public class Capture_ScreenShot_Using_Robot_Class {
	
	public static String CaptureScreenShotWithTestStepNameUsingRobotClass(String testStepsName)
	{
		try{
			
			// Creating Robot class object
			Robot robotClassObject = new Robot();
			
			// Get screen size
			Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			
			// Capturing screenshot by providing size
            BufferedImage tmp = robotClassObject.createScreenCapture(screenSize); 
            
            // Defining destination file path
            String path=System.getProperty("user.dir")+"/ScreenCapturesPNG/"+testStepsName+System.currentTimeMillis()+".png";
            
            // To copy temp image in to permanent file
            ImageIO.write(tmp, "png",new File(path)); 
            return path;
            
		}catch(Exception e)
		{
			System.out.println("Some exception occured." + e.getMessage());
			return "";
		}
	}
	
 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Practice\\InterviewQuestionsPractice\\Drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
	
		driver.get("http://makeseleniumeasy.com/");
		
		Actions act=new Actions(driver);
		Capture_ScreenShot_Using_Robot_Class.CaptureScreenShotWithTestStepNameUsingRobotClass("URL Loading");
		
	
	}
}
