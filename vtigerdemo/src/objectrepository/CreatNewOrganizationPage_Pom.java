package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatNewOrganizationPage_Pom {
	//Webelements present in Organization Information Section
		@FindBy(name="accountname")
		private WebElement OrganizationName_Field;
		@FindBy(name="Website")
		private WebElement Website_Field;
		@FindBy(name="tickersymbol")
		private WebElement tickersymbol_Field;
		@FindBy(xpath="//img[@alt='Select']")
		private WebElement MemberOf_CreatIcon;
		@FindBy(xpath="//input[@alt='Clear']")
		private WebElement MemberOf_ClearIcon ;
		@FindBy(name="employees")
		private WebElement employees_Field ;
		@FindBy(name="email2")
		private WebElement  email2_Field;
		@FindBy(name="industry")
		private WebElement industry_DropDown;
		@FindBy(name="accounttype")
		private WebElement Type_DropDown;
		@FindBy(name="'emailoptout")
		private WebElement EmailOptOut_RadioButon;
		@FindBy(name="assigntype")
		private WebElement AssignedTo_User;
		@FindBy(xpath="//select[@name='assigned_user_id']")
		private WebElement AssignTo_UserDropDown;
		@FindBy(xpath="//input[@name='assigntype']")
		private WebElement AssignedTo_Group;
		@FindBy(xpath="//select[@name='assigned_group_id']")
		private WebElement AssignTo_GroupDropDown;
		
		
		@FindBy(name="account_no")
		private WebElement OrganizationNumber_Field;
		@FindBy(name="phone")
		private WebElement Phone_Field;
		@FindBy(name="fax")
		private WebElement Fax_Field ;
		@FindBy(name="otherphone")
		private WebElement Otherphone_Field ;
		@FindBy(name="email1")
		private WebElement Email1_Field;
		@FindBy(name="ownership")
		private WebElement Ownership_Filed ;
		@FindBy(name="rating")
		private WebElement Rating_DropDown;
		@FindBy(name="siccode")
		private WebElement Siccode_Field;
		@FindBy(name="annual_revenue")
		private WebElement Annual_revenue_Field;
		@FindBy(name="notify_owner")
		private WebElement Notify_owner_RadioButton;
		
		////Webelements present in Address Information
		@FindBy(xpath="//input[@name='cpy']")
		private WebElement CopyShippingAddress_RadioButton;
		@FindBy(xpath="//input[@name='cpy']/../following-sibling::td")
		private WebElement CopyBillingaddress_RadioButton;
		
		//Save and Cancel WebElement 
		@FindBy(xpath="//input[@value='  Save  ']")
		private WebElement Save_Button;
		@FindBy(xpath="//input[@value='Cancel  ']")
		private WebElement CancelButton;
		
}
