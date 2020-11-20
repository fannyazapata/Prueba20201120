package GradleJunitSerenityCucumberScreenPlay03.questions;
import GradleJunitSerenityCucumberScreenPlay03.userinterface.CreatePagesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerPage  implements Question<Boolean>  {
	private String question;
	
	public AnswerPage(String question) {	
		this.question=question;
	}
	public static AnswerPage toThe(String question) {	
		return new AnswerPage(question);
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		boolean result;
		  String namePage=Text.of(CreatePagesPage.NAME_PAGE).viewedBy(actor).asString();
		if (question.equals(namePage)) {
			result=true;
		}else {
			result=false;
		}
		return result;
	}


}
