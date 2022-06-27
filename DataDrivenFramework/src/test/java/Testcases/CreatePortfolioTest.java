package Testcases;

import org.testng.annotations.Test;

import Keywords.Applicationkeywords;

public class CreatePortfolioTest {
	
	
	
	@Test
	public void createPortfolioTest() {
		Applicationkeywords appkey = new Applicationkeywords();
		 appkey.openBrowser("Chrome");
		 appkey.navigate("https://portfolio.rediff.com/portfolio-login");
		
	}
	

}
