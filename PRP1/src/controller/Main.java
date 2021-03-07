package controller;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

	
	public class Main extends Application {
		private Stage primaryStage;
		MainWindowController contr;
		
		@Override
		public void start(Stage primaryStage) {
			
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/view/MainWindowView.fxml"));
				Scene scene = new Scene(root,400,600);
				primaryStage.setTitle("Calculator");
				primaryStage.setScene(scene);
			//	contr.setCalc(new Calculate());
				primaryStage.show();
				
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

		public static void main(String[] args) {
			launch(args);
		}
	}