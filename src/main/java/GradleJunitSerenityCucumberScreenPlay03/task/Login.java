package GradleJunitSerenityCucumberScreenPlay03.task;



import GradleJunitSerenityCucumberScreenPlay03.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{
	private String user;
	private String password;
	
	

	public Login(String user, String password) {
		this.user = user;
		this.password = password;
	}



	public static Login onThePage(String user, String password) {
		return Tasks.instrumented(Login.class, user, password);
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(user).into(LoginPage.INPUT_USER),
				Enter.theValue(password).into(LoginPage.INPUT_PASSWORD),
				Click.on(LoginPage.ENTER_BUTTON)
		);
		
	}






}
