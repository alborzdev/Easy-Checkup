package application;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AnswerQuestionController {

    @FXML
    private Button btnYes;

    @FXML
    private Button btnNo;

    @FXML
    private Label lblSymptom;
    
    @FXML
    void initialize() {
    	btnYes.setOnAction(event -> {
    		System.out.println("Clicked");
    	});
    	
    	btnNo.setOnAction(event -> {
    		System.out.println("Clicked");
    	});
    	
    }

}