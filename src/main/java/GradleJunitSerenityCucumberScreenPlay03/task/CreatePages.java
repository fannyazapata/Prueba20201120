package GradleJunitSerenityCucumberScreenPlay03.task;

import GradleJunitSerenityCucumberScreenPlay03.userinterface.CreatePagesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class CreatePages implements Task{
	private String postTitle;

	public CreatePages(String postTitle) {
		this.postTitle = postTitle;

	}
	public static CreatePages thePage(String postTitle) {
		return Tasks.instrumented(CreatePages.class, postTitle);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(CreatePagesPage.PAGES_BUTTON),
				Click.on(CreatePagesPage.ADD_BUTTON),
				Enter.theValue(postTitle).into(CreatePagesPage.INPUT_TITLE),
				Click.on(CreatePagesPage.PUBLISH_BUTTON),
				Click.on(CreatePagesPage.PUBLISH_BUTTON2),
				Click.on(CreatePagesPage.CLICK_VIEW)
				
				);
		
	}



}
