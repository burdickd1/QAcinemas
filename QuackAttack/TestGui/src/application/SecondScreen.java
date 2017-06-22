package application;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

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

public class SecondScreen extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			GridPane root = new GridPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			ColumnConstraints col1 = new ColumnConstraints();
			ColumnConstraints col2 = new ColumnConstraints();
			col1.setPercentWidth(50);
			col2.setPercentWidth(50);
			
			Label loginStage = new Label("Register Stage");
			root.getColumnConstraints().addAll(col1,col2);
			
			
			Label firstNameLabel = new Label("First Name");
			TextField firstNameIn = new TextField("");
			Label lastNameLabel = new Label("Last Name");
			TextField lastNameIn = new TextField("");
			
			Label emailLabel = new Label("Enter Email");
			TextField emailIn = new TextField("");
			Label pswdLabel = new Label("Enter Password");
			PasswordField pswdin = new PasswordField();
			
			Button submitButt = new Button("Register");
			submitButt.addEventHandler(ActionEvent.ACTION, 
					new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent event) {
							try (FileWriter out = new FileWriter("userdata.txt", true);){
								
								String email = emailIn.getText();
								String firstName = firstNameIn.getText();
								String lastName = lastNameIn.getText();
								String pswd = pswdin.getText();
								
								if(email != null && email.length() != 0
										&& firstName != null && firstName.length() != 0
										&& lastName != null && lastName.length() != 0
										&& pswd != null && pswd.length() != 0){
									out.append(String.join(",", firstName, lastName,email, pswd));
								}else{
									new JOptionPane("Some of your fields are empty");
								}
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							
						}
			});
			
			Button resetButt = new Button("Reset");
			resetButt.addEventHandler(ActionEvent.ACTION, 
					new EventHandler<ActionEvent>() {

						@Override
						public void handle(ActionEvent event) {
							firstNameIn.setText("");
							lastNameIn.setText("");
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
							primaryStage.close();
							new Main().start(new Stage());
							
						}
					});
			
			root.add(loginStage, 0, 0);
			root.add(firstNameLabel, 0, 1);
			root.add(firstNameIn, 1, 1);
			root.add(lastNameLabel, 0, 2);
			root.add(lastNameIn, 1, 2);
			root.add(emailLabel, 0, 3);
			root.add(emailIn, 1, 3);
			root.add(pswdLabel, 0, 4);
			root.add(pswdin, 1, 4);
			root.add(submitButt, 0, 5);
			root.add(resetButt, 1, 5);
			root.add(newULabel, 0, 6);
			root.add(newUButt, 1, 6);
			
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
