package application;

import org.apache.commons.lang3.StringUtils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class MainController {

	private Double firstOperand = 0D;
	private Double secondOperand = 0D;
	private int operation = -1;

	private boolean plusOpDone = false;
	private boolean minusOpDone = false;
	private boolean multiplicationOpDone = false;
	private boolean divisionOpDone = false;

	@FXML
	private AnchorPane rootPane;

	@FXML
	private Button one;

	@FXML
	private Button two;

	@FXML
	private Button four;

	@FXML
	private Button dot;

	@FXML
	private Button zero;

	@FXML
	private Button eight;

	@FXML
	private Button seven;

	@FXML
	private Button division;

	@FXML
	private Button equals;

	@FXML
	private Button multiplication;

	@FXML
	private Button minus;

	@FXML
	private Button nine;

	@FXML
	private Button six;

	@FXML
	private Button plus;

	@FXML
	private Button three;

	@FXML
	private Button five;

	@FXML
	private Button clear;

	@FXML
	private Button root;

	@FXML
	private Button deleteOneNumber;

	@FXML
	private Button clearOnlyNum2;

	@FXML
	private Button powX2;

	@FXML
	private Button powX3;

	@FXML
	private Button powXY;

	@FXML
	private Button factorial;

	@FXML
	private TextField display;

	@FXML
	private Label num1;

	@FXML
	private MenuItem aboutMenuItem;

	@FXML
	private void handleButtons(ActionEvent event) {

		if (event.getSource() == one) {
			display.setText(display.getText() + "1");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "1");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getSource() == two) {
			display.setText(display.getText() + "2");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "2");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getSource() == three) {
			display.setText(display.getText() + "3");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "3");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getSource() == four) {
			display.setText(display.getText() + "4");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "4");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getSource() == five) {
			display.setText(display.getText() + "5");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "5");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getSource() == six) {
			display.setText(display.getText() + "6");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "6");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getSource() == seven) {
			display.setText(display.getText() + "7");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "7");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getSource() == eight) {
			display.setText(display.getText() + "8");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "8");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getSource() == nine) {
			display.setText(display.getText() + "9");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "9");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getSource() == zero) {
			display.setText(display.getText() + "0");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "0");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getSource() == clear) {
			num1.setText("");
			display.setText("");
		} else if (event.getSource() == plus) {
			firstOperand = Double.parseDouble(display.getText());
			operation = 1; // addition
			num1.setText(display.getText() + " + ");
			display.setText("");
		} else if (event.getSource() == minus) {
			firstOperand = Double.parseDouble(display.getText());
			operation = 2; // Subtraction
			num1.setText(display.getText() + " - ");
			display.setText("");
		} else if (event.getSource() == multiplication) {
			firstOperand = Double.parseDouble(display.getText());
			operation = 3; // Multiplication
			num1.setText(display.getText() + " * ");
			display.setText("");
		} else if (event.getSource() == division) {
			firstOperand = Double.parseDouble(display.getText());
			operation = 4; // division
			num1.setText(display.getText() + " / ");
			display.setText("");
		} else if (event.getSource() == equals) {
			secondOperand = Double.parseDouble(display.getText());

			switch (operation) {
			case 1:
				Double answer = firstOperand + secondOperand;
				num1.setText(num1.getText() + display.getText());
				display.setText(String.valueOf(answer));
				plusOpDone = true;
				break;
			case 2:
				answer = firstOperand - secondOperand;
				num1.setText(num1.getText() + display.getText());
				display.setText(String.valueOf(answer));
				minusOpDone = true;
				break;
			case 3:
				answer = firstOperand * secondOperand;
				num1.setText(num1.getText() + display.getText());
				display.setText(String.valueOf(answer));
				multiplicationOpDone = true;
				break;
			case 4:
				try {
					answer = 0D;
					answer = firstOperand / secondOperand;
					num1.setText(num1.getText() + display.getText());
					display.setText(String.valueOf(answer));
					divisionOpDone = true;
				} catch (Exception e) {
					display.setText("Error"); // if tries division with 0.
				}
				break;
			case 5:
				answer = Math.pow(firstOperand, secondOperand);
				num1.setText(num1.getText() + display.getText());
				display.setText(String.valueOf(answer));
				break;

			default:
				return;

			}

		} else if (event.getSource() == dot) {
			display.setText(display.getText() + ".");
		} else if (event.getSource() == root) {
			Double num = Double.parseDouble(display.getText());
			Double result = Math.sqrt(num);
			display.setText(String.valueOf(result));
		} else if (event.getSource() == clearOnlyNum2) {
			display.setText("");
		} else if (event.getSource() == powX2) {
			Double num = Double.parseDouble(display.getText());
			Double result = Math.pow(num, 2);
			display.setText(String.valueOf(result));
		} else if (event.getSource() == powX3) {
			Double num = Double.parseDouble(display.getText());
			Double result = Math.pow(num, 3);
			display.setText(String.valueOf(result));
		} else if (event.getSource() == powXY) {
			firstOperand = Double.parseDouble(display.getText());
			operation = 5; // x^y
			num1.setText(display.getText() + " ^ ");
			display.setText("");
		} else if (event.getSource() == deleteOneNumber) {
			display.setText(StringUtils.chop(display.getText()));
		} else if (event.getSource() == factorial) {
			num1.setText("fact(" + display.getText() + ")");
			Double num = Double.parseDouble(display.getText());
			Double result = calculateFactorial(num);
			display.setText(String.valueOf(result));
		}
	}

	public static Double calculateFactorial(Double number) {
		if (number <= 1)
			return 1D;
		else
			return number * calculateFactorial(number - 1);
	}

	@FXML
	private void handlePressedKeys(KeyEvent event) {

		if (event.getCode() == KeyCode.NUMPAD0 || event.getCode() == KeyCode.DIGIT0) {
			display.setText(display.getText() + "0");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "0");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getCode() == KeyCode.NUMPAD1 || event.getCode() == KeyCode.DIGIT1) {
			display.setText(display.getText() + "1");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "1");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getCode() == KeyCode.NUMPAD2 || event.getCode() == KeyCode.DIGIT2) {
			display.setText(display.getText() + "2");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "2");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getCode() == KeyCode.NUMPAD3 || event.getCode() == KeyCode.DIGIT3) {
			display.setText(display.getText() + "3");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "3");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getCode() == KeyCode.NUMPAD4 || event.getCode() == KeyCode.DIGIT4) {
			display.setText(display.getText() + "4");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "4");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getCode() == KeyCode.NUMPAD5 || event.getCode() == KeyCode.DIGIT5) {
			display.setText(display.getText() + "5");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "5");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getCode() == KeyCode.NUMPAD6 || event.getCode() == KeyCode.DIGIT6) {
			display.setText(display.getText() + "6");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "6");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getCode() == KeyCode.NUMPAD7 || event.getCode() == KeyCode.DIGIT7) {
			display.setText(display.getText() + "7");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "7");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getCode() == KeyCode.NUMPAD8 || event.getCode() == KeyCode.DIGIT8) {
			display.setText(display.getText() + "8");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "8");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getCode() == KeyCode.NUMPAD9 || event.getCode() == KeyCode.DIGIT9) {
			display.setText(display.getText() + "9");
			if (plusOpDone || minusOpDone || multiplicationOpDone || divisionOpDone) {
				num1.setText("");
				display.setText("");
				display.setText(display.getText() + "9");
				plusOpDone = false;
				minusOpDone = false;
				multiplicationOpDone = false;
				divisionOpDone = false;
			}
		} else if (event.getCode() == KeyCode.DELETE) {
			num1.setText("");
			display.setText("");
		} else if (event.getCode() == KeyCode.PLUS) {
			firstOperand = Double.parseDouble(display.getText());
			operation = 1; // addition
			num1.setText(display.getText() + " + ");
			display.setText("");
		} else if (event.getCode() == KeyCode.MINUS) {
			firstOperand = Double.parseDouble(display.getText());
			operation = 2; // addition
			num1.setText(display.getText() + " - ");
			display.setText("");
		} else if (event.getCode() == KeyCode.MULTIPLY) {
			firstOperand = Double.parseDouble(display.getText());
			operation = 3; // addition
			num1.setText(display.getText() + " * ");
			display.setText("");
		} else if (event.getCode() == KeyCode.DIVIDE) {
			firstOperand = Double.parseDouble(display.getText());
			operation = 4; // addition
			num1.setText(display.getText() + " / ");
			display.setText("");
		} else if (event.getCode() == KeyCode.ENTER) {
			secondOperand = Double.parseDouble(display.getText());

			switch (operation) {
			case 1:
				Double answer = firstOperand + secondOperand;
				num1.setText(num1.getText() + display.getText());
				display.setText(String.valueOf(answer));
				plusOpDone = true;
				break;
			case 2:
				answer = firstOperand - secondOperand;
				num1.setText(num1.getText() + display.getText());
				display.setText(String.valueOf(answer));
				minusOpDone = true;
				break;
			case 3:
				answer = firstOperand * secondOperand;
				num1.setText(num1.getText() + display.getText());
				display.setText(String.valueOf(answer));
				multiplicationOpDone = true;
				break;
			case 4:
				try {
					answer = 0D;
					answer = firstOperand / secondOperand;
					num1.setText(num1.getText() + display.getText());
					display.setText(String.valueOf(answer));
					divisionOpDone = true;
				} catch (Exception e) {
					display.setText("Error");// if tries division with 0.
				}
				break;

			default:
				return;

			}
		} else if (event.getCode() == KeyCode.PERIOD) {
			display.setText(display.getText() + ".");
		} else if (event.getCode() == KeyCode.BACK_SPACE) {
			display.setText(StringUtils.chop(display.getText()));
		}
	}
	
	@FXML
    private void handleAboutMenuItem(ActionEvent event) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("ABOUT");
		alert.setHeaderText("About TLC's Calculator: ");
		alert.setContentText("TLC's Calculator - TheLordCoder's Calculator is made using Java and JavaFX technology."
				+ "TLC's Calculator is not prefect, about his flaws you can read more by clicking show details.\n"
				+ "Application is free to use.\n"
				+ "Contact: thelordcoder@gmail.com\n"
				+ "~TheLordCoder.");
		
		StringBuilder sb = new StringBuilder();
		sb.append("Flaws of TLC's Calculator:\n")
		.append("- For example it cannot calculate: 4+5*6.\n")
		.append("-It cannot calculate precise factorial of decimal numbers.\n")
		.append("-On keyboard where are numpads, the '+' and '-' symbol does not work, but other keys are ok.");
		
		TextArea area = new TextArea(sb.toString());
		
		DialogPane dialogPane = alert.getDialogPane();
		dialogPane.setExpandableContent(area);
		dialogPane.getStylesheets().add(getClass().getResource("InformationDialogTheme.css").toExternalForm());
		dialogPane.getStyleClass().add("InformationDialogTheme.css");
		alert.showAndWait();
	}
}