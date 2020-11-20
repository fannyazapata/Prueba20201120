package GradleJunitSerenityCucumberScreenPlay03.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class EditPagesPage extends PageObject{
	public static final Target PAGE_BUTTON=Target.the("button to Post")
			.located(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[5]/a/div[3]"));
	public static final Target ACTIVATE_EDIT=Target.the("Activate edit")
			.located(By.xpath("//*[@class='title column-title has-row-actions column-primary page-title']"));
		public static final Target CLICK_EDIT=Target.the("Click Edit")
			.located(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[5]/form[1]/table/tbody/tr/td[1]/div[3]/span[1]/a"));
	public static final Target EDIT_HEADER=Target.the("Edit Header")
			.located(By.xpath("//*[@class='editor-post-title__input']"));
	public static final Target UPDATE_BUTTON=Target.the("Button Update")
			.located(By.xpath("//*[@class='components-button editor-post-publish-button is-button is-default is-primary is-large']"));
}
