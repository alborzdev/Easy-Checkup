package application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    		System.out.println("Clicked");
    	});
    	
    }


}
