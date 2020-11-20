package GradleJunitSerenityCucumberScreenPlay03.stepdefinitions;

import java.util.List;

import GradleJunitSerenityCucumberScreenPlay03.model.OpenSourceData;
import GradleJunitSerenityCucumberScreenPlay03.questions.AnswerPage;
import GradleJunitSerenityCucumberScreenPlay03.questions.AnswerPost;
import GradleJunitSerenityCucumberScreenPlay03.task.CreatePages;
import GradleJunitSerenityCucumberScreenPlay03.task.CreatePost;
import GradleJunitSerenityCucumberScreenPlay03.task.EditPages;
import GradleJunitSerenityCucumberScreenPlay03.task.EditPost;
import GradleJunitSerenityCucumberScreenPlay03.task.Login;
import GradleJunitSerenityCucumberScreenPlay03.task.OpenUp;
import GradleJunitSerenityCucumberScreenPlay03.task.UpdatePages;
import GradleJunitSerenityCucumberScreenPlay03.task.UpdatePost;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class opensourcestepdefinition {
	
	 @Before
	 public void setStage() {
	  OnStage.setTheStage(new OnlineCast());
	 }

	@Given("^than Fanny is on opensourcecms$")
	public void than_Fanny_is_on_opensourcecms(List<OpenSourceData> openSourceData) {
	OnStage.theActorCalled("Fanny").wasAbleTo(OpenUp.thePage(),(Login.
		onThePage(openSourceData.get(0).getUser(),openSourceData.get(0).getPassword())));
	}
	

	@When("^she creates a new Post called$")
	public void she_creates_a_new_Post_called(List<OpenSourceData> openSourceData) {
		OnStage.theActorInTheSpotlight().attemptsTo(CreatePost.thePost(openSourceData.get(0).getPostTitle()));
	}

	@Then("^she could visualized the created Post$")
	public void she_coud_visualized_the_created_Post(List<OpenSourceData> openSourceData) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerPost.toThe(openSourceData.get(0).getPostTitle())));
	}

	@When("^she creates a new Page called$")
	public void she_creates_a_new_Page_called(List<OpenSourceData> openSourceData) {
		OnStage.theActorInTheSpotlight().attemptsTo(CreatePages.thePage(openSourceData.get(0).getPageTitle()));
	}

	@Then("^she could visualized the created Page$")
	public void she_coud_visualized_the_created_Page(List<OpenSourceData> openSourceData) {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerPage.toThe(openSourceData.get(0).getPageTitle())));
	}	
	
	@When("^she Edit a Post$")
	public void sheEditAPost() throws InterruptedException {

		OnStage.theActorInTheSpotlight().attemptsTo(EditPost.thePost());
		Thread.sleep(10000);
	}

	@Then("^she update the post with note$")
	public void sheUpdateThePost(List<OpenSourceData> openSourceData) throws InterruptedException {
		OnStage.theActorInTheSpotlight().attemptsTo(UpdatePost.thePost(openSourceData.get(0).getNotePost()));
		Thread.sleep(10000);
	}
	@When("^she Edit a Page$")
	public void sheEditAPage() throws InterruptedException {

		OnStage.theActorInTheSpotlight().attemptsTo(EditPages.thePages());
		Thread.sleep(10000);
	}

	@Then("^she update the page with note$")
	public void sheUpdateThePage(List<OpenSourceData> openSourceData) throws InterruptedException {
		OnStage.theActorInTheSpotlight().attemptsTo(UpdatePages.thePages(openSourceData.get(0).getNotePages()));
		Thread.sleep(10000);
	}

	
}
