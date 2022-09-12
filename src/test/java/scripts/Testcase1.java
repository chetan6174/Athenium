package scripts;

import org.testng.annotations.Test;

import PomPages.AddtocartPage;
import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import genericLib.BaseClass;

public class Testcase1 extends BaseClass {
	@Test
	public void tc1() {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		driverUtilies.switchtabs(driver);
		driverUtilies.mouseHover(driver, sd.getCoursebtn());
		sd.seleniumtrainingtab();
		
		AddtocartPage a=new AddtocartPage(driver);
		driverUtilies.doubleclick(driver, a.getAddbtn());
		a.addtocartbtn();
		driverUtilies.alertpopup(driver);
		
		
	}
	

}
