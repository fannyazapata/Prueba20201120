package GradleJunitSerenityCucumberScreenPlay03.task;


import GradleJunitSerenityCucumberScreenPlay03.userinterface.EditPagesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class UpdatePages implements Task{
	private String notePages;

	public UpdatePages(String notePages) {
		this.notePages = notePages;

	}
	public static UpdatePages thePages(String notePages) {
		return Tasks.instrumented(UpdatePages.class, notePages);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(notePages).into(EditPagesPage.EDIT_HEADER),
				Click.on(EditPagesPage.UPDATE_BUTTON)
				);
		
	}



}
