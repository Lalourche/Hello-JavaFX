package fr.lalourche.hellojavafx.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloJavaFxController {
	@FXML
	private TextField result;
	@FXML
	private Button button;
	
	/**
	 * Called when the user clicks on the button.
	 */
	@FXML
	private void handleButtonClick() {
		result.setText("OK");
	}
}
