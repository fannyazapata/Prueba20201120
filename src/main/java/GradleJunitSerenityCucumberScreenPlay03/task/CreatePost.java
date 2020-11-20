package GradleJunitSerenityCucumberScreenPlay03.task;

import GradleJunitSerenityCucumberScreenPlay03.userinterface.CreatePostPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class CreatePost implements Task{
	private String postTitle;

	public CreatePost(String postTitle) {
		this.postTitle = postTitle;

	}
	public static CreatePost thePost(String postTitle) {
		return Tasks.instrumented(CreatePost.class, postTitle);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(CreatePostPage.POST_BUTTON),
				Click.on(CreatePostPage.ADD_BUTTON),
				Enter.theValue(postTitle).into(CreatePostPage.INPUT_TITLE),
				Click.on(CreatePostPage.PUBLISH_BUTTON),
				Click.on(CreatePostPage.PUBLISH_BUTTON2),
				Click.on(CreatePostPage.CLICK_VIEW)
				
				);
		
	}



}
