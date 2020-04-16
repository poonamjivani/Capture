package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_Pom {
   @FindBy(name="user_name")
	private WebElement user_name;
   @FindBy(name="user_password")
   private WebElement user_password;  
   @FindBy(id="submitButton")
   private WebElement submitButton;
   @FindBy(className="errorMessage")
   private WebElement Invalid_credentials;

public WebElement getUser_name() {
	return user_name;
}
public WebElement getUser_password() {
	return user_password;
}
public WebElement getSubmitButton() {
	return submitButton;
}
public WebElement getInvalid_credentials() {
	return Invalid_credentials;
}
public void successfullLogin(String un,String pwd) 
{
	user_name.sendKeys(un);
	user_password.sendKeys(pwd);
	submitButton.click();
}
    
}
