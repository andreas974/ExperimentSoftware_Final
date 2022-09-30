package edu.kit.exp.impl.continuousCompetition.client.Questionnaire;

import edu.kit.exp.client.gui.screens.question.questionnaire.*;
import java.util.Locale;
import java.util.Arrays;

import javax.swing.*;

/**
 * Created by tondaroder on 30.01.17.
 */
public class ContinuousCompetitionQuestionnaireDemographics extends QuestionnaireScreen {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8841977439730389225L;

		public ContinuousCompetitionQuestionnaireDemographics(String gameId, ParamObject parameter, String screenId, Long showUpTime) {
		super(gameId, parameter, screenId, showUpTime);

		/*this.setTitleText("Zusätzlicher Fragebogen");
		this.setPreText("Klicken Sie \"Weiter\", um mit dem Fragebogen zu beginnen.");
		this.setPostText("Sie haben die Fragen erfolgreich abgeschlossen.<br>Klicken Sie \"Weiter\", um das Experiment zu beenden.");*/

			QuestionnaireLikert liker = new QuestionnaireLikert("Geben Sie an inwiefern Sie den folgenden Aussagen über sich selbst zustimmen.");
			//<br><i><br>1... Ich stimme überhaupt nicht zu<br>2... Ich stimme eher nicht zu</i>");
			/*liker.addAnswer("Ich mag den Wettbewerb.                                                                                                ");
			liker.addAnswer("Ich genieße es, gegen Andere anzutreten.                                                                       ");
			liker.addAnswer("Im Wettbewerb zu verlieren, hat kaum Auswirkungen auf mich.                                     ");
			liker.addAnswer("Ich bin jemand, der gerne gewinnt und es hasst zu verlieren.                                         ");
			liker.addAnswer("Ich versuche oft, andere zu übertrumpfen.                                                                      ");
			liker.addAnswer("Mein Ziel im Experiment war, besser als mein Gegenüber abzuschneiden.                     ");
			liker.addAnswer("Mein Ziel im Experiment war, den höchstmöglichen Gesamtgewinn zu erzielen.            ");*/
			liker.addAnswer("Ich mag den Wettbewerb.");
			liker.addAnswer("Ich genieße es, gegen Andere anzutreten.");
			liker.addAnswer("Im Wettbewerb zu verlieren, hat kaum Auswirkungen auf mich.");
			liker.addAnswer("Ich bin jemand, der gerne gewinnt und es hasst zu verlieren.");
			liker.addAnswer("Ich versuche oft, andere zu übertrumpfen.");
			liker.addAnswer("Mein Ziel im Experiment war, besser als mein Gegenüber abzuschneiden.");
			liker.addAnswer("Mein Ziel im Experiment war, den höchstmöglichen Gesamtgewinn zu erzielen.");
			this.addQuestionnaireItem(liker);

		QuestionnaireMultipleChoice question;
		question = new QuestionnaireMultipleChoice("Welches Geschlecht haben Sie?");
		question.addAnswer("männlich");
		question.addAnswer("weiblich");
		question.addAnswer("nicht-binär");
		this.addQuestionnaireItem(question);

		QuestionnaireNumberInput numberInput = new QuestionnaireNumberInput("Bitte geben Sie Ihr Alter an:");
		this.addQuestionnaireItem(numberInput);

		QuestionnaireDropDown questionDD;
		questionDD = new QuestionnaireDropDown("Welches ist das höchste Bildungsniveau, das Sie bisher erreicht haben?");
		//questionDD.answerText = new String[]{"Test 1", "Test 2", "Test3"};
		String[] answer = new String[]{"Bitte auswählen...", "Abitur", "Bachelor", "Master"};
		questionDD.answerText = answer;
		this.addQuestionnaireItem(questionDD);

		questionDD = new QuestionnaireDropDown("Welche Staatsangehörigkeit haben Sie?");
		//questionDD.answerText = new String[]{"Test 1", "Test 2", "Test3"};
		String[] countries = new String[]{"Bitte auswählen...", "Afghanistan", "Albanien", "Algerien", "Amerikanisch-Samoa", "Andorra", "Angola", "Anguilla", "Antarktis", "Antigua und Barbuda", "Argentinien", "Armenien", "Aruba", "Australien", "Österreich", "Aserbaidschan", "Bahamas", "Bahrain", "Bangladesch", "Barbados", "Belarus", "Belgien", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivien", "Bosnien und Herzegowina", "Botswana", "Bouvetinsel", "Brasilien", "Britisches Territorium im Indischen Ozean", "Brunei Darussalam", "Bulgarien", "Burkina Faso", "Burundi", "Kambodscha", "Kamerun", "Kanada", "Kap Verde", "Kaimaninseln", "Zentralafrikanische Republik", "Tschad", "Chile", "China", "Weihnachtsinsel", "Kokosinseln (Keeling)", "Kolumbien", "Komoren", "Kongo", "Kongo, Demokratische Republik", "Cookinseln", "Costa Rica", "Elfenbeinküste", "Kroatien (Hrvatska)", "Kuba", "Zypern", "Tschechische Republik", "Dänemark", "Dschibuti", "Dominica", "Dominikanische Republik", "Osttimor", "Ecuador", "Ägypten", "El Salvador", "Äquatorialguinea", "Eritrea", "Estland", "Äthiopien", "Falklandinseln (Malwinen)", "Färöer-Inseln", "Fidschi", "Finnland", "Frankreich", "France Metropolitan", "Französisch-Guayana", "Französisch-Polynesien", "Französische Südterritorien", "Gabun", "Gambia", "Georgien", "Deutschland", "Ghana", "Gibraltar", "Griechenland", "Grönland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard- und Mc Donald-Inseln", "Heiliger Stuhl (Vatikanstadt)", "Honduras", "Hongkong", "Ungarn", "Island", "Indien", "Indonesien", "Iran (Islamische Republik)", "Irak", "Irland", "Israel", "Italien", "Jamaika", "Japan", "Jordanien", "Kasachstan", "Kenia", "Kiribati", "Korea, Demokratische Volksrepublik", "Korea, Republik", "Kuwait", "Kirgisistan", "Laos, Demokratische Volksrepublik", "Lettland", "Libanon", "Lesotho", "Liberia", "Libysch-Arabische Dschamahirija", "Liechtenstein", "Litauen", "Luxemburg", "Macau", "Mazedonien, ehemalige jugoslawische Republik", "Madagaskar", "Malawi", "Malaysia", "Malediven", "Mali", "Malta", "Marshallinseln", "Martinique", "Mauretanien", "Mauretanien", "Mauritius", "Mayotte", "Mexiko", "Mikronesien, Föderierte Staaten von", "Moldawien, Republik", "Monaco", "Mongolei", "Montserrat", "Marokko", "Mosambik", "Myanmar", "Namibia", "Nauru", "Nepal", "Niederlande", "Niederländische Antillen", "Neukaledonien", "Neuseeland", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolkinsel", "Nördliche Marianen", "Norwegen", "Oman", "Pakistan", "Palau", "Panama", "Papua-Neuguinea", "Paraguay", "Peru", "Philippinen", "Pitcairn", "Polen", "Portugal", "Puerto Rico", "Katar", "Reunion", "Rumänien", "Russische Föderation", "Ruanda", "St. Kitts und Nevis", "St. Lucia", "St. Vincent und die Grenadinen", "Samoa", "San Marino", "Sao Tome und Principe", "Saudi-Arabien", "Senegal", "Seychellen", "Sierra Leone", "Singapur", "Slowakei (Slowakische Republik)", "Slowenien", "Salomonen", "Somalia", "Südafrika", "Südgeorgien und die Südlichen Sandwichinseln", "Spanien", "Sri Lanka", "St. Helena", "St. Pierre und Miquelon", "Sudan", "Surinam", "Svalbard und Jan Mayen Inseln", "Swasiland", "Schweden", "Schweiz", "Syrische Arabische Republik", "Taiwan, Provinz China", "Tadschikistan", "Tansania, Vereinigte Republik", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad und Tobago", "Tunesien", "Türkei", "Turkmenistan", "Turks- und Caicosinseln", "Tuvalu", "Uganda", "Ukraine", "Vereinigte Arabische Emirate", "Vereinigtes Königreich", "Vereinigte Staaten", "United States Minor Outlying Islands", "Uruguay", "Usbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U. S.)", "Wallis und Futuna", "Westsahara", "Jemen", "Jugoslawien", "Sambia", "Simbabwe", "Palästina"};
		Arrays.sort(countries);
		questionDD.answerText = countries;
		this.addQuestionnaireItem(questionDD);

		questionDD = new QuestionnaireDropDown("Welchen Studiengang studieren Sie aktuell (oder haben Sie als letztes studiert)?");
		//questionDD.answerText = new String[]{"Test 1", "Test 2", "Test3"};
		String[] studies = new String[]{"Bitte auswählen...", "Bachelor Winfo", "Bachelor BAE"};
		questionDD.answerText = studies;
		this.addQuestionnaireItem(questionDD);

		numberInput = new QuestionnaireNumberInput("Wie oft haben Sie bereits an PAULA-Experimenten teilgenommen?");
		this.addQuestionnaireItem(numberInput);


	}
}
