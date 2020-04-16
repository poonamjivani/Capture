package vtigerdemo.testscript;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import objectrepository.CreatNewOrganizationPage_Pom;
import objectrepository.CreatingNewOrganizationHomePage_Pom;
import objectrepository.HomePage_Pom;
import objectrepository.OrganizationHp_Pom;

@Listeners (genericLib.ListnersImplementation.class)
@Test
public class CreatOrganazation extends BaseClass  {

	public void CreatOrganazation() throws Throwable {
	
		HomePage_Pom hp = PageFactory.initElements(driver, HomePage_Pom.class );
		OrganizationHp_Pom Ohp = PageFactory.initElements(driver, OrganizationHp_Pom .class);
		hp.getOrganization_Link().click();
		Ohp.getCreatNewOrganization_Icon().click();
		CreatingNewOrganizationHomePage_Pom Nohp = PageFactory.initElements(driver, CreatingNewOrganizationHomePage_Pom.class);
		Nohp.getOrganization_Name().sendKeys(f.getValueFromExcelFile("CreateNewOrganizationData", 2, 1));
		Nohp.getWebsite().sendKeys(f.getValueFromExcelFile("CreateNewOrganizationData", 2, 2));
		Nohp.getTicker_Symbol().sendKeys(f.getValueFromExcelFile("CreateNewOrganizationData", 2, 3));
		Nohp.getEmployeesl().sendKeys(f.getValueFromExcelFile("CreateNewOrganizationData", 2, 5));
		Nohp.getOther_Emai().sendKeys(f.getValueFromExcelFile("CreateNewOrganizationData", 2, 1));
		Nohp.SelectByValue(Nohp.getIndustry());
		
		
}
}


