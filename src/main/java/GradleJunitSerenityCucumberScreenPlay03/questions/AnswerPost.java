package GradleJunitSerenityCucumberScreenPlay03.questions;
import GradleJunitSerenityCucumberScreenPlay03.userinterface.CreatePostPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerPost  implements Question<Boolean>  {
	private String question;
	
	public AnswerPost(String question) {	
		this.question=question;
	}
	public static AnswerPost toThe(String question) {	
		return new AnswerPost(question);
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		boolean result;
		String namePost=Text.of(CreatePostPage.NAME_POST).viewedBy(actor).asString();
		
		if (question.equals(namePost)) {
			result=true;
		}else {
			result=false;
		}
		return result;
	}


}
