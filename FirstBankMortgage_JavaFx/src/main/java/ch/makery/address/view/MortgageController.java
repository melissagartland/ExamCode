package ch.makery.address.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.UUID;

import base.RateDAL;
import ch.makery.address.MainApp;
import ch.makery.address.model.Rate;


public class MortgageController {
	
	//FXML attributes

	@FXML
	private TextField txtIncome;
	@FXML
	private TextField txtExpenses;
	@FXML
	private TextField txtCreditScore;
	@FXML
	private TextField txtHouse;
	@FXML
	private ComboBox<Integer> cmbTerm;
	@FXML
	private ContextMenu ctmTerm;
	@FXML
	private Label lblMortgagePayment;
	@FXML
	private Label lblIncome;
	@FXML
	private Label lblExpenses;
	@FXML
	private Label lblCreditScore;
	@FXML
	private Label lblHouse;
	@FXML
	private Label lblcmbTerm;
	@FXML
	private MenuItem years15;
	@FXML
	private MenuItem years30;

	//calculation attributes
	private int creditScore;
	private int yearlyIncome;
	private int monthlyExpenses;
	private int house; 
	private int chosenTerm;
	private int mortgage; 

	// Reference to the main application.
	private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public MortgageController() {
    	
    	
    	
    }

    
    @FXML
    private void initialize() {
    	//result label made not visible
    	lblMortgagePayment.setVisible(false);
    	
    	//sync data from UI to calculation attributes
    	this.creditScore = Integer.valueOf(txtCreditScore.getText());
    	this.yearlyIncome = Integer.valueOf(txtIncome.getText());
    	this.monthlyExpenses = Integer.valueOf(txtExpenses.getText());
    	this.house = Integer.valueOf(txtHouse.getText());
    	//this.chosenTerm =  getting the value from the chosen term?
    	
		
    }

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }
    
   
}