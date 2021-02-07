package application;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class checkupController {
	

    @FXML
    private Button btnCheckupTwo;

    @FXML
    private Button btnCheckupThree;

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
    	Parent questionChooserParent = FXMLLoader.load(getClass().getResource("/application/Lisinopril.fxml"));
    	Scene questionChooserScene = new Scene(questionChooserParent);
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	
		window.setScene(questionChooserScene);
		window.show();
    	
    }
	

}
