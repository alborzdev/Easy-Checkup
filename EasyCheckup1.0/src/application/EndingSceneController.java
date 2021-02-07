package application;

import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;

public class EndingSceneController {

    @FXML
    private Button btnFinish;
    
    @FXML
    void initialize() {
    	btnFinish.setOnAction(event -> {
    		System.exit(0);
    		System.out.println("OH");
    	});
    	
    }
    
   
}
