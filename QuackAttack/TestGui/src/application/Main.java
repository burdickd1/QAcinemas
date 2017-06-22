package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			ColumnConstraints col1 = new ColumnConstraints();
			ColumnConstraints col2 = new ColumnConstraints();
			col1.setPercentWidth(50);
			col2.setPercentWidth(50);
			
			Label loginStage = new Label("Login Stage");
			root.getColumnConstraints().addAll(col1,col2);
			
			
			Label emailLabel = new Label("Enter Email");
			TextField emailIn = new TextField("");
			Label pswdLabel = new Label("Enter Password");
			PasswordField pswdin = new PasswordField();
			
			Button submitButt = new Button("Submit");
			
			Button resetButt = new Button("Reset");
			resetButt.addEventHandler(ActionEvent.ACTION, 
					new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent event) {
							emailIn.setText("");
							pswdin.setText("");
						}
			});
			
			Label newULabel = new Label("New User?");
			Button newUButt = new Button("Register");
			newUButt.addEventHandler(ActionEvent.ACTION, 
					new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent event) {
							// TODO Auto-generated method stub
								try {
									primaryStage.close();
									new SecondScreen().start(new Stage());
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								};
						}
			});
			
			root.add(loginStage, 0, 0);
			root.add(emailLabel, 0, 1);
			root.add(emailIn, 1, 1);
			root.add(pswdLabel, 0, 2);
			root.add(pswdin, 1, 2);
			root.add(submitButt, 0, 3);
			root.add(resetButt, 1, 3);
			root.add(newULabel, 0, 4);
			root.add(newUButt, 1, 4);
			
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
