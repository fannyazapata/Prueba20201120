package GradleJunitSerenityCucumberScreenPlay03.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {
	public static final Target INPUT_USER=Target.the("where do we write the user")
			.located(By.id("user_login"));
	public static final Target INPUT_PASSWORD=Target.the("where do we write the password")
			.located(By.id("user_pass"));
	public static final Target ENTER_BUTTON=Target.the("button to confirm login")
			.located(By.id("wp-submit"));
}
