package application;
	
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/DoctorUI.fxml"));
			Scene scene = new Scene(root,700,400);
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			FadeTransition ft = new FadeTransition();
	    	ft.setDuration(Duration.millis(1000));
	    	ft.setNode(root);
	    	ft.setFromValue(0.0);
	    	ft.setToValue(1.0);
	    	ft.play();
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
