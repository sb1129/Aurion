package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageclasses.LeavePage;

public class LeaveSteps extends DriverFactory {
	
	@When("^I am on a new leave page$")
	public void i_am_on_a_new_leave_page() throws Throwable {
        new LeavePage(driver).new_leave_page();
    }
	
	@When("^I click apply for leave button$")
	public void i_click_apply_for_leave_button() throws Throwable {
		new LeavePage(driver).apply_for_leave_button();
	}
	
	@When("^I select the leave type as \"([^\"]*)\"$")
	public void i_select_the(String ltype) throws Throwable {
		new LeavePage(driver).select_leave_type(ltype);
	}
	
	@When("^I select the duration as \"([^\"]*)\"$")
	public void i_select_the_duration_as(String dur) throws Throwable {
		new LeavePage(driver).select_duration(dur);
	}
	
	@When("^I select the start date$")
	public void i_select_the_start_date() throws Throwable {
		new LeavePage(driver).select_startdate();
	}
	
	@When("^I select the end date$")
	public void i_select_the_end_date() throws Throwable {
		new LeavePage(driver).select_enddate();
	}
	
	@When("^I enter the message as \"([^\"]*)\"$")
	public void i_enter_the_message_as(String msg) throws Throwable {
		new LeavePage(driver).enter_message(msg);
	}
	
	@When("^I click submit button$")
	public void i_click_submit_button() throws Throwable {
		new LeavePage(driver).submit();
	}
	
	@Then("^I should see the success message is displayed$")
	public void I_should_see_the_success_message_is_displayed() throws Throwable {
		new LeavePage(driver).success();
	}
	
}