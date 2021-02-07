package application;

import java.io.IOException;

import javafx.util.Duration;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AddQuestionController {

    @FXML
    private Button btnCheckupOne;
    
    
    @FXML
    void initialize() {
    	btnCheckupOne.setOnAction(event -> {
    		try {
				changeScene(event);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	});
    }
    
    public void changeScene(javafx.event.ActionEvent event) throws IOException {
    	Parent questionChooserParent = FXMLLoader.load(getClass().getResource("/application/IntroPatientUI.fxml"));
    	FadeTransition ft = new FadeTransition();
    	ft.setDuration(Duration.millis(1000));
    	ft.setNode(questionChooserParent);
    	ft.setFromValue(0.0);
    	ft.setToValue(1.0);
    	ft.play();
    	Scene questionChooserScene = new Scene(questionChooserParent);
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	
		window.setScene(questionChooserScene);
		window.show();
    	
    }

    
}

