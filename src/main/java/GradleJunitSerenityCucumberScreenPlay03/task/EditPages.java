package GradleJunitSerenityCucumberScreenPlay03.task;


import GradleJunitSerenityCucumberScreenPlay03.userinterface.EditPagesPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



public class EditPages implements Task{

	public static EditPages thePages() {
		return Tasks.instrumented(EditPages.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(EditPagesPage.PAGE_BUTTON),
				Click.on(EditPagesPage.ACTIVATE_EDIT),
				Click.on(EditPagesPage.CLICK_EDIT)
				);
		
	}



}
