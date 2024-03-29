package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;


public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Given("my browser is open")
    public void my_browser_is_open() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("i navigate to google")
    public void i_navigate_to_google() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("i search for selinume webdriver")
    public void i_search_for_selinume_webdriver() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("result state would not be empty")
    public void result_state_would_not_be_empty() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        Assertions.assertEquals(expectedAnswer, actualAnswer);
    }

    class IsItFriday {
        static String isItFriday(String today) {
            return "Friday".equals(today) ? "TGIF" : "Nope";
        }
    }


    


}
