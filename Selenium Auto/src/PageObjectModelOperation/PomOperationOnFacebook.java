package PageObjectModelOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PomOperationOnFacebook {
	WebDriver driver;
	
	@FindBy(name = "firstname")
	WebElement firstname;
	
	@FindBy(name = "lastname")
	WebElement lastname;
	
	@FindBy(name="reg_email__")
	WebElement email;
	
	@FindBy(name="reg_passwd__")
	WebElement password;
	
	@FindBy(id = "day")
	WebElement birthdate;
	
	@FindBy(id = "month")
	WebElement birthmonth;
	
	@FindBy(id = "year")
	WebElement birthyear;
	
	@FindBy(xpath="//label[text()=\"Male\"]")
	WebElement malegender;
	
	public PomOperationOnFacebook(WebDriver d) {
	 driver=d;
		PageFactory.initElements(d, this);
	}
	
	
	public void FirstName(String fstname) {
		firstname.sendKeys(fstname);
		
			}
	
	public void Surename(String surename) {
		lastname.sendKeys(surename);
		
		}
	public void Email(String mail) {
		email.sendKeys(mail);
	}
	
	public void RegPassword(String regpassword) {
		password.sendKeys(regpassword);
	}
	
	public void BirthDate() {
		Select s1=new Select(birthdate);
		s1.selectByVisibleText("18");
	}
	
	public void BirthMonth() {
		Select s1=new Select(birthmonth);
		s1.selectByValue("1");
	}
	public void BirthYear() {
		Select s1=new Select(birthyear);
		s1.selectByVisibleText("1993");
	}
	
	public void Gender() {
		malegender.click();
		
	}

}
