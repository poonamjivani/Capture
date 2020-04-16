package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationHp_Pom {
		@FindBy(xpath="//img[@alt='Create Organization...']")
		private WebElement CreatNewOrganization_Icon;
		@FindBy(xpath="//img[@alt='Search in Organizations...']")
		private WebElement Search_icon;
		@FindBy(className="'txtBox")
		private WebElement SearchFor_Field;
		@FindBy(name="search_field")
		private WebElement SearchIn_Field;
		@FindBy(name="submit")
		private WebElement Search_Button;
	
		public WebElement getCreatNewOrganization_Icon() {
			return CreatNewOrganization_Icon;
		}
	
		public WebElement getSearch_icon() {
			return Search_icon;
		}
	
		public WebElement getSearchFor_Field() {
			return SearchFor_Field;
		}

		public WebElement getSearchIn_Field() {
			return SearchIn_Field;
		}
		public WebElement getSearch_Button() {
			return Search_Button;
		}

}
