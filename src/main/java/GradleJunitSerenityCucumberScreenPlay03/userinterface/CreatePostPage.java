package GradleJunitSerenityCucumberScreenPlay03.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CreatePostPage extends PageObject{


	public static final Target POST_BUTTON=Target.the("button to Post")
			.located(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[3]/a/div[3]"));

	public static final Target ADD_BUTTON=Target.the("button to Add")
			.located(By.className("page-title-action"));
	public static final Target INPUT_TITLE=Target.the("Write title Post")
			.located(By.id("post-title-0"));
	public static final Target PUBLISH_BUTTON=Target.the("Button Publish")
	//		.located(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[5]/div[1]/div/div/div/div[1]/div[2]/button"));
			.located(By.xpath("//*[@class='components-button editor-post-publish-panel__toggle is-button is-primary']"));
	
	//.located(By.className("components-button editor-post-publish-panel__toggle is-button is-primary"));	

	public static final Target PUBLISH_BUTTON2=Target.the("Button2 Publish")
			//.located(By.cssSelector("button.components-button editor-post-publish-button is-button is-default is-primary is-large"));
	.located(By.xpath("//*[@class='components-button editor-post-publish-button is-button is-default is-primary is-large']"));
	//.located(By.className("/html/body/div[1]/div[2]/div[2]/div[1]/div[5]/div[1]/div/div/div/div[3]/div/div/div[1]/div/button"));
			//.located(By.className("components-button editor-post-publish-button is-button is-default is-primary is-large"));					
	
	public static final Target CLICK_VIEW=Target.the("Click on View")
		//.located(By.xpath("//*[@class='components-button components-notice__action is-link']"));
	.located(By.xpath("//*[@class='components-button is-button is-default']"));

	public static final Target NAME_POST=Target.the("Name of Post")
	.located(By.xpath("//h1[contains(text(),'W4')]"));
}
