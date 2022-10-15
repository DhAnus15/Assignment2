package Assignment2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Login extends Application {
	String usrString= "dhanush";
	String passwordString="1234";

	Label usr;
	TextField us;
	Label pass;
	TextField pwd;
	GridPane grid ;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage myStage) {
				myStage.setTitle("Login Screen");
				
				grid = new GridPane();
				
				FlowPane rootNode = new FlowPane(10, 10);
				
				// Center the controls in the scene.
				rootNode.setAlignment(Pos.CENTER);
				
				// Create a scene.
				Scene myScene = new Scene(rootNode, 300, 300);
				
				// Set the scene on the stage.
				myStage.setScene(myScene);
				
				usr = new Label("Username");
				us = new TextField();
				us.setPrefColumnCount(15);
				
				pass = new Label("Password ");
				pwd = new TextField();
				pwd.setPrefColumnCount(15);
				
				Button btnGetText = new Button("Submit");
				
				Label outLabel = new Label("Output: ");
				TextField buttField = new TextField();
				
			
				btnGetText.setOnAction(new EventHandler<ActionEvent>() {				
				@Override
				public void handle(ActionEvent arg0) {
					String str1 = us.getText();
					String str2 = pwd.getText();
					
						if(str1.equalsIgnoreCase(usrString)&&str2.equals(passwordString)) {
							buttField.setText("Login Succesful");
						}else {
							buttField.setText("Login Failed");
						}

					}
					
				
			});
			
			rootNode.getChildren().addAll(usr,us,pass,pwd,outLabel,buttField,btnGetText);
				
			myStage.show();		
			
		}
	}
		


	