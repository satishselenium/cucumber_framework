package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import driverfactory.BasePage;

public class LoginPage extends BasePage {

	@FindBy(xpath="//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    public WebElement ClickToLogin;
	
	@FindBy(xpath="//*[@id='email']")
    public WebElement userName;
	
	@FindBy(xpath="//*[@id='passwd']")
	public WebElement passWord;
	
	@FindBy(xpath="//*[@id='SubmitLogin']/span")
	public WebElement Submit;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void NavigateToLogin() {
		//driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		ClickToLogin.click();
	}
	
	
	public void login(String UserName, String Password) {
		userName.sendKeys(UserName);
		passWord.sendKeys(Password);
		Submit.click();	
	}
	

	
}
