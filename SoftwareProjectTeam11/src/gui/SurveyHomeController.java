package gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class SurveyHomeController {

	// For all controllers
	@FXML
	private Button training;
	@FXML
	private Button surveyButton;
	@FXML
	private Button statisticsButton;
	@FXML
	private Button logoutButton;
	@FXML
	private Label errorText;
	
	// For Survey controllers
	@FXML
	private Button trainingsButton;
	@FXML
	private Button createButton;
	
	
	// For this
	@FXML
	private ChoiceBox<String> trainigChoice;
	@FXML
	private Button chooseButton;
	@FXML
	private ListView<String> questions;
	@FXML
	private ListView<String> answers;
	@FXML
	private Button loadButton;
	@FXML
	private Button trButton;
	
	@FXML
	public void trainingMenu(ActionEvent event) throws IOException
	{
		Parent loginParent = FXMLLoader.load(getClass().getResource("TrainingsGUI.fxml"));
		Scene loginScene = new Scene(loginParent);
		
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(loginScene);
		window.show();
	}
	
	@FXML
	public void chooseTraining()
	{
		
	}
	
	@FXML
	public void loadQuestions()
	{
		
	}
	
	
	@FXML
	public void showSurveys()
	{
		errorText.setText("You are already in this Tab");
	}
	@FXML
	public void createSurvey(ActionEvent event) throws IOException
	{
		Parent homepageParent = FXMLLoader.load(getClass().getResource("SurveyCreate.fxml"));
		Scene homepageScene = new Scene(homepageParent);
		
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(homepageScene);
		window.setResizable(true);
		window.setTitle("Homepage");


		window.show();
	}
	
	
	
	
	public void surveyMenu()
	{
		errorText.setText("You are already in Survey menu");
	}
	
	public void statisticsMenu()
	{
		errorText.setText("No statistics menu available");
	}
	
	public void logout(ActionEvent event) throws IOException
	{
		Parent loginParent = FXMLLoader.load(getClass().getResource("loginGUI.fxml"));
		Scene loginScene = new Scene(loginParent);
		
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		window.setScene(loginScene);
		window.show();
	}
}