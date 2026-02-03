package pagePkg;

import java.awt.event.ActionEvent;
import java.net.HttpURLConnection;
import java.net.URI;
import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class PageClass {
	WebDriver driver;
	int count=0;
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	//@FindBy(xpath="/html/body/div[4]/header/div[1]/div[2]/div[3]/div[1]/div/ul/li[2]/a")
	//WebElement homepage;
	@FindBy(xpath="/html/body/div[4]/header/div[1]/div[2]/div[3]/div[1]/div/ul/li[2]/a")
	WebElement myAccount;
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement uname;
	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement pwd;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/div[3]/div/button")
	WebElement loginBtn;
	@FindBy(xpath="//*[@id=\"logo\"]/a/img")
	WebElement logo;
	@FindBy(tagName="a")
	List<WebElement> li;
	@FindBy(xpath="//*[@id=\"search\"]/div/div/span/input[2]")
	WebElement search;
	@FindBy(xpath="//*[@id=\"search\"]/div/div/button")
	WebElement searchbtn;
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/div[6]/div/div[1]/a/div")
	WebElement AlmondWhiteChoc;
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[2]/div[6]/div/div[2]/div[5]/div/div[1]/a/span")
	WebElement addToCart;
	@FindBy(xpath="//*[@id=\"input-option744\"]")
	WebElement weight;
	@FindBy(xpath="//*[@id=\"product\"]/div[4]/div[2]/div/span/button/i")
	WebElement date;
	@FindBy(xpath="/html/body/div[6]/div/div[1]/table/thead/tr[1]/th[2]")
	WebElement month;
	@FindBy(xpath="/html/body/div[6]/div/div[1]/table/thead/tr[1]/th[3]")
	WebElement nextBtn;
	@FindBy(xpath="/html/body/div[6]/div/div[1]/table/tbody/tr/td")
	List<WebElement> dates;
    @FindBy(xpath="//*[@id=\"input-option746\"]")
    WebElement msg;
    @FindBy(xpath="//*[@id=\"input-option747\"]")
    WebElement timeslot;
    @FindBy(xpath="//*[@id=\"button-cart\"]")
    WebElement addCartBtn;
   @FindBy(xpath="/html/body/div[4]/ul/li[1]/a/i")   
    WebElement home;
   @FindBy(xpath="//*[@id=\"content-top\"]/div/div/div/div/div/div/div/a")
   WebElement logout;
   @FindBy(xpath="//*[@id=\"content\"]/div/div/a")
   WebElement confirmLogout;
	public PageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setValues(String userName,String password)
	{
		myAccount.click();
		uname.clear();
		pwd.clear();
		uname.sendKeys(userName);
		pwd.sendKeys(password);	
	}
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	public void successLogin() throws InterruptedException
	{
		titleVerification();
	}

	public void titleVerification() throws InterruptedException
	{
		String actTitle=driver.getTitle();
		String expTitle="My Account";
		Assert.assertEquals(expTitle, actTitle);
		home.click();
		//aboutUs();
		cakeAdd();
	}
	private void aboutUs() 
	{
		
		
	}
	public void logoVerification()
	{
		if(logo.isDisplayed())
			System.out.println("Logo displayed");
		else 
			System.out.println("Logo not displayed");
	}
	public void brokenLinks()
	{
		for(WebElement linkdtls:li)
		{
			String link=linkdtls.getAttribute("href");
			verifyLink(link);
			//System.out.println(count);
		}
		
		System.out.println("No. of broken links : "+count);
	}
	private void verifyLink(String link) {
		try
		{	
		URI obj=new URI(link);
		HttpURLConnection con=(HttpURLConnection)obj.toURL().openConnection();
		int responseCode=con.getResponseCode();
		
		if(responseCode==404)
		{
			count++;
			System.out.println(link+"------->Broken link");
		}
	
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		
		}
	
	public void cakeAdd() throws InterruptedException 
	{
		search.sendKeys("Chocolate");
		searchbtn.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Actions act=new Actions(driver);
		act.moveToElement(AlmondWhiteChoc).perform();
		addToCart.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)");
		Select wt=new Select(weight);
		wt.selectByIndex(1);
		date.click();
		datePickMethod("February 2026","16");
		msg.sendKeys("Happy Birthday");
		Select time=new Select(timeslot);
		time.selectByVisibleText("6 PM - 9 PM");
		js.executeScript("window.scrollBy(0,100)");
		addCartBtn.click();
		myAccount.click();
		logout.click();
		confirmLogout.click();
		
	}
	private void datePickMethod(String expMonth, String expdate)
	{
		while(true)
		{
			 String actMonth=month.getText();
														
			//System.out.println(month);
			//break;
			if(actMonth.equals(expMonth))
			{
				break;
			}
			else
			{
				nextBtn.click();
			}
		}
		
		for(WebElement d:dates)
		{
			String datetext=d.getText();
			if(datetext.equals(expdate))
			{
				d.click();
				break;
			}
		}
	}
	
}
	
		
	
	
	

