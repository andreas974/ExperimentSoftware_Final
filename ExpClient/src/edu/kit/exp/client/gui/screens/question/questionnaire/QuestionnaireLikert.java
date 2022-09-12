package edu.kit.exp.client.gui.screens.question.questionnaire;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * The Class QuestionnaireItemMultipleChoice represents an implementation of a QuestionnaireItem;
 * a multiple choice question.
 *
 * @author tonda roder
 */
public class QuestionnaireLikert extends QuestionnaireItem {

	private static final Font ANSWER_FONT = new Font("Tahoma", Font.PLAIN, 17);
	public static final Dimension PREFERRED_SIZE = new Dimension(300, 200);
	public static final Dimension textsize = new Dimension(300, 15);

	public static final String SPLIT_SIGN = ";";

	/** The answer text. */
	private ArrayList<String> answerText;

	/** The answer text. */
	private ArrayList<String> questionText;

	/** The answer option. */
	private ArrayList<AbstractButton> answerOption;

	/** Indicates whether multiple answers where selected. */
	private boolean selectMultiple;

	private ArrayList<String> Text;

	/**
	 * This method checks if multiple answers can be selected.
	 *
	 * @return true, if multiple answers can be selected.
	 */
	public boolean isSelectMultiple() {
		return selectMultiple;
	}

	/**
	 * This method sets a true or false value that indicates whether multiple
	 * answers can be selected in a quiz.
	 *
	 * @param selectMultiple
	 *            A boolean which regulates whether multiple or just one answer
	 *            can be selected.
	 */
	public void setSelectMultiple(boolean selectMultiple) {
		this.selectMultiple = selectMultiple;
	}

	/**
	 * This constructor instantiates a new multiple choice quiz item.
	 *
	 * @param question
	 *            A String which contains the question that will be displayed to
	 *            the client.
	 */
	public QuestionnaireLikert(String question) {
		super(question);

		answerText = new ArrayList<>();
		selectMultiple = false;
		Text = new ArrayList<>();
	}


	/**
	 * This method provides the experimenter with the option to add possible
	 * answers for the question.
	 *
	 * @param text
	 *            A String which contains the client answer.
	 */
	public void addAnswer(String text) {
		answerText.add(text);
	}

	public void addQuestion(String text){
		questionText.add(text);
	}

	public void addText(String text) {
		Text.add(text);
	}


	@Override
	public JPanel getAnswerPanel() {
		JPanel returnPanel = basePanel;
		returnPanel.setLayout(new BoxLayout(basePanel, BoxLayout.Y_AXIS));


		JPanel textpanel = new JPanel();
		returnPanel.add(textpanel);
		textpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		textpanel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		textpanel.setBackground(returnPanel.getBackground());
		textpanel.setPreferredSize(textsize);
		JTextArea text = new JTextArea();
		text.insert("Ich stimme voll und ganz zu      Ich stimme zu      Ich stimme weder zu noch lehne ab     Ich stimme nicht zu    Ich stimme überhaupt nicht zu", 0);
		textpanel.add(text);

		JPanel answerListPanel = new JPanel();
		returnPanel.add(answerListPanel);
		answerListPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		answerListPanel.setAlignmentY(Component.TOP_ALIGNMENT);
		answerListPanel.setBackground(returnPanel.getBackground());
		answerListPanel.setLayout(new BoxLayout(answerListPanel, BoxLayout.X_AXIS));
		answerListPanel.setPreferredSize(PREFERRED_SIZE);


		/*answerOption = new ArrayList<>();
		AbstractButton answer1;
		AbstractButton answer2;
		AbstractButton answer3;
		AbstractButton answer4;
		AbstractButton answer5;
		ButtonGroup answerGroup = new ButtonGroup();
		//javax.swing.ButtonGroup[] answerGroup = new ButtonGroup[1];
			for (String aQuestionText : questionText) {
				if (selectMultiple) {
					answer1 = new JCheckBox("<html><br></html>" + aQuestionText, false);
					answer2 = new JCheckBox("", false);
					answer3 = new JCheckBox("", false);
					answer4 = new JCheckBox("", false);
					answer5 = new JCheckBox("", false);
				} else {
					answer1 = new JRadioButton("<html><br></html>" + aQuestionText, false);
					answer1.setHorizontalTextPosition(SwingConstants.LEFT);
					answerGroup.add(answer1);
					answer2 = new JRadioButton("", false);
					answerGroup.add(answer2);
					answer3 = new JRadioButton("", false);
					answerGroup.add(answer3);
					answer4 = new JRadioButton("", false);
					answerGroup.add(answer4);
					answer5 = new JRadioButton("", false);
					answerGroup.add(answer5);
				}
				//answer.setFont(ANSWER_FONT);
				answerOption.add(answer1);
				answerOption.add(answer2);
				answerOption.add(answer3);
				answerOption.add(answer4);
				answerOption.add(answer5);

				//answer.setBackground(returnPanel.getBackground());
				answerListPanel.add(answer1);
				answerListPanel.add(answer2);
				answerListPanel.add(answer3);
				answerListPanel.add(answer4);
				answerListPanel.add(answer5);


			}*/


		answerOption = new ArrayList<>();
		AbstractButton answer1;
		AbstractButton answer2;
		AbstractButton answer3;
		AbstractButton answer4;
		AbstractButton answer5;
		//ButtonGroup answerGroup = new ButtonGroup();

		for (String anAnswerText : answerText) {
			ButtonGroup answerGroup = new ButtonGroup();
			if (selectMultiple) {
				answer1 = new JCheckBox("<html><br></html>" + anAnswerText, false);
				answer2 = new JCheckBox("", false);
				answer3 = new JCheckBox("", false);
				answer4 = new JCheckBox("", false);
				answer5 = new JCheckBox("", false);
			} else {
				answer1 = new JRadioButton("\n" +anAnswerText + "        ", false);
				answer1.setHorizontalTextPosition(SwingConstants.LEFT);
				answerGroup.add(answer1);
				answer2 = new JRadioButton("                   2", false);
				answer2.setForeground(Color.WHITE);
				answerGroup.add(answer2);
				answer3 = new JRadioButton("                   3", false);
				answer3.setForeground(Color.WHITE);
				answerGroup.add(answer3);
				answer4 = new JRadioButton("                    4", false);
				answer4.setForeground(Color.WHITE);
				answerGroup.add(answer4);
				answer5 = new JRadioButton("                    5", false);
				answer5.setForeground(Color.WHITE);
				answerGroup.add(answer5);
			}
			//answer.setFont(ANSWER_FONT);
			answerOption.add(answer1);
			answerOption.add(answer2);
			answerOption.add(answer3);
			answerOption.add(answer4);
			answerOption.add(answer5);

			//answer.setBackground(returnPanel.getBackground());
			answerListPanel.add(answer1);
			answerListPanel.add(answer2);
			answerListPanel.add(answer3);
			answerListPanel.add(answer4);
			answerListPanel.add(answer5);


		}





		return returnPanel;
	}

	@Override
	public boolean isValid() {
		for (AbstractButton anAnswerOption : answerOption) {
			if (anAnswerOption.isSelected()) {
				return true;
			}
		}
		return false;
	}

	@Override public String getAnswer() {
		String answer = "";
		int selectedCounter = 0;
		for (AbstractButton anAnswerOption : answerOption) {
			if (anAnswerOption.isSelected()) {
				if (selectedCounter == 0) {
					answer = anAnswerOption.getText();
				} else {
					answer += (SPLIT_SIGN + anAnswerOption.getText());
				}
				selectedCounter++;
			}
		}
		return answer;
	}

}
