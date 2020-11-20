package GradleJunitSerenityCucumberScreenPlay03.task;


import GradleJunitSerenityCucumberScreenPlay03.userinterface.EditPostPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class UpdatePost implements Task{
	private String notePost;

	public UpdatePost(String notePost) {
		this.notePost = notePost;

	}
	public static UpdatePost thePost(String notePost) {
		return Tasks.instrumented(UpdatePost.class, notePost);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(notePost).into(EditPostPage.EDIT_HEADER),
				Click.on(EditPostPage.UPDATE_BUTTON)
				);
		
	}



}
