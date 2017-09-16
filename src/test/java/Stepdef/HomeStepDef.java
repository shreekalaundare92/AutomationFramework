package Stepdef;

import PageObjects.Homepage;
import cucumber.api.java.en.*;

public class HomeStepDef extends Homepage{

	@Given("^\"([^\"]*)\" browser is launched$")
	public void browser_is_launched(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("This is browser_is_launched method");
		
		this.launchBrowser(arg1);
		
	}

	@Then("^open URL \"([^\"]*)\"$")
	public void open_URL(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("This is open_URL method");
	   this.openUrl(arg1);
	}

	@Then("^Verify \"([^\"]*)\" page$")
	public void verify_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("This is verify_page method");
	}

	@Then("^Click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("This is click_on_link method");
	}
	
	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		this.closeBrowser();
	    
	}
}
