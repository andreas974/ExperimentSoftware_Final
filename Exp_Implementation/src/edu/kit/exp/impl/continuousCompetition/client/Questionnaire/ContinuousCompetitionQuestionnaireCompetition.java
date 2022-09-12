package edu.kit.exp.impl.continuousCompetition.client.Questionnaire;

import edu.kit.exp.client.gui.screens.question.questionnaire.*;

/**
 * Created by tondaroder on 30.01.17.
 */
public class ContinuousCompetitionQuestionnaireCompetition extends QuestionnaireScreen {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8841977439730389225L;

	public ContinuousCompetitionQuestionnaireCompetition(String gameId, ParamObject parameter, String screenId, Long showUpTime) {
		super(gameId, parameter, screenId, showUpTime);

		/*this.setTitleText("Zusätzlicher Fragebogen");
		this.setPreText("Klicken Sie \"Weiter\", um mit dem Fragebogen zu beginnen.");
		this.setPostText("Sie haben die Fragen erfolgreich abgeschlossen.<br>Klicken Sie \"Weiter\", um das Experiment zu beenden.");*/
		QuestionnaireMultipleChoice question;

		question = new QuestionnaireMultipleChoice("<i>Wie würden Sie sich selbst beschreiben?</i><br>Ich sehe mich selbst als jemanden, der gerne gewinnt und es hasst zu verlieren.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		question = new QuestionnaireMultipleChoice("<i>Wie würden Sie Ihr Verhalten während des Experiments beschreiben?</i><br>Mein Ziel war es, besser als mein Gegenüber abzuschneiden.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		question = new QuestionnaireMultipleChoice("<i>Wie würden Sie Ihr Verhalten während des Experiments beschreiben?</i><br>Mein Ziel war es, den größtmöglichen Gewinn zu erzielen.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		question = new QuestionnaireMultipleChoice("<i>Wie würden Sie sich selbst beschreiben?</i><br>Mein Gegenüber hat versucht, besser als ich abzuschneiden.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		//Cooperation

		question = new QuestionnaireMultipleChoice("<i>Beschreiben Sie inwiefern die folgende Aussage zutrifft.</i><br>Bei diesem Experiment musste man versuchen, mit anderen zusammenzuarbeiten, damit alle am Ende mehr Gewinn haben.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		question = new QuestionnaireMultipleChoice("<i>Beschreiben Sie inwiefern die folgende Aussage über Ihr Verhalten zutrifft.</i><br>Ich habe versucht, mit meinem Gegenüber zusammenzuarbeiten.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		question = new QuestionnaireMultipleChoice("<i>Beschreiben Sie inwiefern die folgende Aussage über das Verhalten Ihres Gegenüber zutrifft.</i><br>Mein Gegenüber hat verstanden, auf welches Ziel ich hinarbeiten wollte.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		question = new QuestionnaireMultipleChoice("<i>Beschreiben Sie inwiefern die folgende Aussage zutrifft.</i><br>Ich konnte zusammen mit meinem Gegenüber ein gemeinsames Ziel erreichen.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		QuestionnaireTextInput textInput = new QuestionnaireTextInput("Wie würden Sie Ihre Strategie zum Erreichen dieses Ziels beschreiben?");
		this.addQuestionnaireItem(textInput);

		//Perception of Competitor

		question = new QuestionnaireMultipleChoice("<i>Beschreiben Sie inwiefern die folgende Aussage zutrifft.</i><br>Mein Gegenüber verhielt sich intelligent.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		question = new QuestionnaireMultipleChoice("<i>Beschreiben Sie inwiefern die folgende Aussage zutrifft.</i><br>Mein Gegenüber war bemüht ein vorgegebenes Ziel zu erreichen.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		question = new QuestionnaireMultipleChoice("<i>Beschreiben Sie inwiefern die folgende Aussage zutrifft.</i><br>Mein Gegenüber verhielt sich fair.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		question = new QuestionnaireMultipleChoice("<i>Beschreiben Sie inwiefern die folgende Aussage zutrifft.</i><br>Mein Gegenüber und ich haben gut zusammengearbeitet.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		question = new QuestionnaireMultipleChoice("<i>Beschreiben Sie inwiefern die folgende Aussage zutrifft.</i><br>Ich konnte meinem Gegenüber in seinen Aktionen vertrauen.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		question = new QuestionnaireMultipleChoice("<i>Beschreiben Sie inwiefern die folgende Aussage zutrifft.</i><br>Mein Gegenüber hat sich angenehm verhalten.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		question = new QuestionnaireMultipleChoice("<i>Beschreiben Sie inwiefern die folgende Aussage zutrifft.</i><br>Ich konnte das Verhalten meines Gegenübers nachvollziehen.");
		question.addAnswer("Ich stimme voll und ganz zu");
		question.addAnswer("Ich stimme zu");
		question.addAnswer("Ich stimme weder zu noch lehne ab");
		question.addAnswer("Ich stimme nicht zu");
		question.addAnswer("Ich stimme überhaupt nicht zu");
		this.addQuestionnaireItem(question);

		textInput = new QuestionnaireTextInput("Wie würden Sie die Strategie Ihres Gegenübers beschreiben?");
		this.addQuestionnaireItem(textInput);

		textInput = new QuestionnaireTextInput("Haben Sie weitere Anmerkungen allgemein zum Experiment?");
		this.addQuestionnaireItem(textInput);
	}
}
