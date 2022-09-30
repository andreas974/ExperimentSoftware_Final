package edu.kit.exp.client.gui.screens.question.questionnaire;

import javax.swing.*;
import javax.swing.border.Border;
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
	public static final Dimension textsize = new Dimension(500, 15);

	public static final String SPLIT_SIGN = ";";

	/**
	 * The answer text.
	 */
	private ArrayList<String> answerText;

	/**
	 * The answer text.
	 */
	private ArrayList<String> questionText;

	/**
	 * The answer option.
	 */
	private ArrayList<AbstractButton> answerOption;


	/**
	 * Indicates whether multiple answers where selected.
	 */
	private boolean selectMultiple;

	private ArrayList<String> Text;

	private ArrayList<JTextArea> questions;

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
	 * @param selectMultiple A boolean which regulates whether multiple or just one answer
	 *                       can be selected.
	 */
	public void setSelectMultiple(boolean selectMultiple) {
		this.selectMultiple = selectMultiple;
	}

	/**
	 * This constructor instantiates a new multiple choice quiz item.
	 *
	 * @param question A String which contains the question that will be displayed to
	 *                 the client.
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
	 * @param text A String which contains the client answer.
	 */
	public void addAnswer(String text) {
		answerText.add(text);
	}

	public void addQuestion(String text) {
		questionText.add(text);
	}

	public void addText(String text) {
		Text.add(text);
	}


	@Override
	public JPanel getAnswerPanel() {
		JPanel basePanel = new JPanel();
		//basePanel.setLayout(new GridLayout(2,2));
		basePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		basePanel.setBackground(Color.white);
		JPanel returnPanel = basePanel;
		returnPanel.setLayout(new BoxLayout(basePanel, BoxLayout.Y_AXIS));
		int i = 0;
		for (String anAnswerText : answerText) {
			i++;
		}
		////GridBagConstraints c = new GridBagConstraints();
		returnPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		Border blackline;
		blackline = BorderFactory.createLineBorder(Color.black);

		JPanel textpanel = new JPanel();
		returnPanel.add(textpanel);
		//textpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		textpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		textpanel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		textpanel.setBackground(returnPanel.getBackground());
		textpanel.setPreferredSize(textsize);
		//textpanel.setLayout(new GridLayout(1,6));
		textpanel.setLayout(new GridBagLayout());
		GridBagConstraints f = new GridBagConstraints();
		JTextArea text01 = new JTextArea();
		JTextArea text02 = new JTextArea();
		JTextArea text03 = new JTextArea();
		JTextArea text04 = new JTextArea();
		JTextArea text05 = new JTextArea();
		//text.insert("                                                                                                                           Ich stimme voll und ganz zu            Ich stimme zu            Ich stimme weder zu noch lehne ab            Ich stimme nicht zu            Ich stimme überhaupt nicht zu", 0);
		text01.insert("1... Ich stimme voll und ganz zu,  ", 0);
		text02.insert("2... Ich stimme zu,  ", 0);
		text03.insert("3... Ich stimme weder zu noch lehne ab,  ", 0);
		text04.insert("4... Ich Ich stimme nicht zu,  ", 0);
		text05.insert("5... Ich stimme überhaupt nicht zu,  ", 0);
		textpanel.add(text01);
		f.gridx = 6;
		textpanel.add(text02);
		f.gridx = 7;
		textpanel.add(text03);
		f.gridx = 8;
		textpanel.add(text04);
		f.gridx = 9;
		textpanel.add(text05);
		f.gridx = 10;

		answerOption = new ArrayList<>();
		AbstractButton answer1;
		AbstractButton answer2;
		AbstractButton answer3;
		AbstractButton answer4;
		AbstractButton answer5;
		JTextArea QuestionText;

		JPanel answerListPanel = new JPanel();
		answerListPanel.setLayout(new GridBagLayout());
		GridBagConstraints d = new GridBagConstraints();

		JTextArea text1 = new JTextArea("  1");
		d.gridx = 1;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel.add(text1, d);

		JTextArea text2 = new JTextArea("  2");
		d.gridx = 2;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel.add(text2, d);

		JTextArea text3 = new JTextArea("  3");
		d.gridx = 3;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel.add(text3, d);

		JTextArea text4 = new JTextArea("  4");
		d.gridx = 4;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel.add(text4, d);

		JTextArea text5 = new JTextArea("  5");
		d.gridx = 5;
		d.gridy = 0;
		d.anchor = GridBagConstraints.WEST;
		answerListPanel.add(text5, d);

		//ButtonGroup answerGroup = new ButtonGroup();
		int j = 1;
		for (String anAnswerText : answerText) {

			System.out.println(anAnswerText + ". j: " + j);
			ButtonGroup answerGroup = new ButtonGroup();
			QuestionText = new JTextArea(anAnswerText);
			QuestionText.setAlignmentX(0);
			d.gridx = 0;
			d.gridy = j;
			d.anchor = GridBagConstraints.WEST;
			//questions.add(QuestionText);

			answerListPanel.add(QuestionText, d);

			answerListPanel.setBackground(returnPanel.getBackground());

			if (selectMultiple) {
				answer1 = new JCheckBox("      ", false);
				answer2 = new JCheckBox("      ", false);
				answer3 = new JCheckBox("      ", false);
				answer4 = new JCheckBox("      ", false);
				answer5 = new JCheckBox("      ", false);
			} else {
				answer1 = new JRadioButton("1", false);
				//answer1.setAlignmentX(Component.CENTER_ALIGNMENT);
				answer1.setForeground(Color.WHITE);
				answer1.setHorizontalTextPosition(SwingConstants.RIGHT);
				answer1.setVerticalTextPosition(SwingConstants.TOP);
				d.gridx = 1;
				d.gridy = j;
				answerGroup.add(answer1);
				answerListPanel.add(answer1, d);
				answer2 = new JRadioButton("2", false);
				answer2.setHorizontalTextPosition(SwingConstants.RIGHT);
				answer2.setVerticalTextPosition(SwingConstants.TOP);
				answer2.setForeground(Color.WHITE);
				answerGroup.add(answer2);
				d.gridx = 2;
				d.gridy = j;
				answerListPanel.add(answer2, d);
				answer3 = new JRadioButton("3", false);
				answer3.setHorizontalTextPosition(SwingConstants.RIGHT);
				answer3.setVerticalTextPosition(SwingConstants.TOP);
				answer3.setForeground(Color.WHITE);
				answerGroup.add(answer3);
				d.gridx = 3;
				d.gridy = j;
				answerListPanel.add(answer3, d);
				answer4 = new JRadioButton("4", false);
				answer4.setHorizontalTextPosition(SwingConstants.RIGHT);
				answer4.setVerticalTextPosition(SwingConstants.TOP);
				answer4.setForeground(Color.WHITE);
				answerGroup.add(answer4);
				d.gridx = 4;
				d.gridy = j;
				answerListPanel.add(answer4, d);
				answer5 = new JRadioButton("5", false);
				answer5.setHorizontalTextPosition(SwingConstants.RIGHT);
				answer5.setVerticalTextPosition(SwingConstants.TOP);
				answer5.setForeground(Color.WHITE);
				answerGroup.add(answer5);
				d.gridx = 5;
				d.gridy = j;
				answerListPanel.add(answer5, d);
				answerListPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
			}
			//answer.setFont(ANSWER_FONT);
			//questions.add(QuestionText);
			answerOption.add(answer1);
			answerOption.add(answer2);
			answerOption.add(answer3);
			answerOption.add(answer4);
			answerOption.add(answer5);

			answerListPanel.setAlignmentX(returnPanel.LEFT_ALIGNMENT);
			returnPanel.add(answerListPanel);

			j++;
		}

		/*JTextArea options1 = new JTextArea("1..." + "Ich stimme voll und ganz zu");
		JTextArea options2 = new JTextArea("2..." + "Ich stimme zu");
		JTextArea options3 = new JTextArea("3..." + "Ich stimme weder zu noch lehne ab");
		JTextArea options4 = new JTextArea("4..."+"Ich Ich stimme nicht zu");
		JTextArea options5 = new JTextArea("5..."+"Ich stimme überhaupt nicht zu");
		//options.setText("1..." + "Ich stimme voll und ganz zu" + "2..." + "Ich stimme zu" + "3..." + "Ich stimme weder zu noch lehne ab" + "4..."+"Ich Ich stimme nicht zu" + "5..."+"Ich stimme überhaupt nicht zu");
		d.gridy = 7;
		d.gridwidth = 5;
		basePanel.add(options1, d);
		basePanel.add(options2, d);
		basePanel.add(options3, d);
		basePanel.add(options4, d);
		basePanel.add(options5, d);*/
		returnPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		return returnPanel;
	}


	@Override
	public boolean isValid() {
		int i = 0;
		for (String anAnswerText : answerText) {
			i++;
		}
		int j=0;
		for (AbstractButton anAnswerOption : answerOption) {
			if (anAnswerOption.isSelected()) {
				j++;
			}
		}
		for (AbstractButton anAnswerOption : answerOption) {
			if (anAnswerOption.isSelected() && i==j) {
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
