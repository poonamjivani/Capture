package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import genericLib.BaseClass;

public class CreatingNewOrganizationHomePage_Pom extends BaseClass {
	
	@FindBy(name="accountname")
	private WebElement Organization_Name;
	
	@FindBy(name="website")
	private WebElement Website;
	
	@FindBy(name="phone")
	private WebElement Phone;
	
	@FindBy(name="tickersymbol")
	private WebElement Ticker_Symbol;
	
	@FindBy(name="fax")
	private WebElement Fax;
	
	@FindBy(name="otherphone")
	private WebElement Other_Phone;
	
	@FindBy(name="employees")
	private WebElement employeesl;
	
	@FindBy(name="email1")
	private WebElement Email;
	
	@FindBy(name="email2")
	private WebElement Other_Email;
	
	@FindBy(name="ownership")
	private WebElement ownership;
	
	@FindBy(name="industry")
	private WebElement Industry;
	@FindBy(name="rating")
	private WebElement Rating;
	
	@FindBy(name="accounttype")
	private WebElement Type;
	
	@FindBy(name="siccode")
	private WebElement SIC_Code;
	
	@FindBy(name="emailoptout")
	private WebElement Email_Opt_Out;
	
	@FindBy(name="annual_revenue")
	private WebElement Annual_Revenue;
	
	
	@FindBy(xpath="//input[@value='U']")
	private WebElement Assigned_To_user;
	
	@FindBy(name="assigned_user_id")
	private WebElement Assigned_To_user_dropDown;
	
	@FindBy(xpath="//input[@value='T']")
	private WebElement Assigned_To_Group;
	
	@FindBy(name="assigned_group_id")
	private WebElement Assigned_To_Group_dropdown;
	
	@FindBy(name="notify_owner")
	private WebElement Notify_Owner;

//Getters for all the elements s
	public WebElement getOrganization_Name() {
		return Organization_Name;
	}

	public WebElement getWebsite() {
		return Website;
	}

	public WebElement getPhone() {
		return Phone;
	}
	
	public WebElement getTicker_Symbol() {
		return Ticker_Symbol;
	}

	public WebElement getFax() {
		return Fax;
	}

	public WebElement getOther_Phone() {
		return Other_Phone;
	}

	public WebElement getEmployeesl() {
		return employeesl;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getOther_Emai() {
		return Other_Email;
	}

	public WebElement getOwnership() {
		return ownership;
	}

	public WebElement getIndustry() {
		return Industry;
	}

	public WebElement getRating() {
		return Rating;
	}

	public WebElement getType() {
		return Type;
	}


	public WebElement getSIC_Code() {
		return SIC_Code;
	}

	public WebElement getEmail_Opt_Out() {
		return Email_Opt_Out;
	}


	public WebElement getAnnual_Revenue() {
		return Annual_Revenue;
	}

	public WebElement getAssigned_To_user() {
		return Assigned_To_user;
	}


	public WebElement getAssigned_To_user_dropDown() {
		return Assigned_To_user_dropDown;
	}

	public WebElement getAssigned_To_Group() {
		return Assigned_To_Group;
	}

	public WebElement getAssigned_To_Group_dropdown() {
		return Assigned_To_Group_dropdown;
	}

	public WebElement getNotify_Owner() {
		return Notify_Owner;
	}
	
	//Save and Cancel WebElement 
			@FindBy(xpath="//input[@value='  Save  ']")
			private WebElement Save_Button;
			@FindBy(xpath="//input[@value='Cancel  ']")
			private WebElement CancelButton;
		
			//Business logic
			public void SelectByValue(WebElement x) throws Throwable
			{
			Select s	=new Select(x);
			if(x==Industry) {
			s.selectByValue(f.getValueFromExcelFile("CreateNewOrganizationData", 2, 5));
			}else if(x==Rating) 
			{
				s.selectByValue(f.getValueFromExcelFile("CreateNewOrganizationData", 2, 18));
			}else if(x==Type) 
			{
				s.selectByValue(f.getValueFromExcelFile("CreateNewOrganizationData", 2, 8));
			}else if(x==Assigned_To_user_dropDown) 
			{
				s.selectByValue(f.getValueFromExcelFile("CreateNewOrganizationData", 2, 11));
			}else if(x==Assigned_To_Group) 
			{
				s.selectByValue(f.getValueFromExcelFile("CreateNewOrganizationData", 2, 12));
			}
			}
	
	

}
