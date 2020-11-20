package GradleJunitSerenityCucumberScreenPlay03.task;


import GradleJunitSerenityCucumberScreenPlay03.userinterface.EditPostPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



public class EditPost implements Task{

	public static EditPost thePost() {
		return Tasks.instrumented(EditPost.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(EditPostPage.POST_BUTTON),
				Click.on(EditPostPage.ACTIVATE_EDIT),
				Click.on(EditPostPage.CLICK_EDIT)
				);
		
	}



}
