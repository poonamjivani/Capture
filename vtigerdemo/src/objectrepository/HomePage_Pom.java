package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage_Pom {
// Initialize WebElements
		@FindBy(linkText="More")
		private WebElement More_Link;
		@FindBy(linkText="Organizations")
		private WebElement Organization_Link;
		@FindBy(linkText="Leads")
		private WebElement Leads_Link;
		@FindBy(linkText="Calendar")
		private WebElement Calendar_Link;
		@FindBy(linkText="Contacts")
		private WebElement Contacts_Link;
		@FindBy(linkText="Opportunities")
		private WebElement Opportunities_Link;
		@FindBy(linkText="Products")
		private WebElement Products_Link;
		@FindBy(linkText="Documents")
		private WebElement Documents_Link;
		@FindBy(linkText="Email")
		private WebElement Email_Link;
		@FindBy(linkText="Trouble Tickets")
		private WebElement TroubleTickets_Link;
		@FindBy(linkText="Dashboard")
		private WebElement Dashboard_Link;
		@FindBy(linkText="Campaigns")
		private WebElement Campaigns_link;
		@FindBy(xpath="//span[@class='userName']/../following-sibling::td")
		private WebElement User_Icon;
		@FindBy(linkText="Sign Out")
		private WebElement Sign_Out;

		//Getters For WebElement
		public WebElement getUser_Icon() {
			return User_Icon;
		}
		
		public WebElement getCalendar_Link() {
			return Calendar_Link;
		}
		
		public WebElement getContacts_Link() {
			return Contacts_Link;
		}
		
		public WebElement getCampaigns_link() {
			return Campaigns_link;
		}
		
		public WebElement getOpportunities_Link() {
			return Opportunities_Link;
		}
		
		public WebElement getProducts_Link() {
			return Products_Link;
		}
		
		public WebElement getDocuments_Link() {
			return Documents_Link;
		}
		
		public WebElement getEmail_Link() {
			return Email_Link;
		}
		
		public WebElement getTroubleTickets_Link() {
			return TroubleTickets_Link;
		}
		
		public WebElement getDashboard_Link() {
			return Dashboard_Link;
		}
		
		public WebElement getMore_Link() {
			return More_Link;
		}
		
		public WebElement getOrganization_Link() {
			return Organization_Link;
		}
		
		public WebElement getLeads_Link() {
			return Leads_Link;
		}


		//Business Logic
		public void moveToWebLink(WebElement baseLink,WebElement targetLink)
		{
			Actions act = new Actions(genericLib.BaseClass.driver);
			act.moveToElement(baseLink).perform();
			act.click(targetLink).perform();
		}
		public void SucessfullSign_Out()
		 {
		    Actions act = new Actions(genericLib.BaseClass.driver);
			act.moveToElement(User_Icon).perform();
			Sign_Out.click();
				
		  }

}
