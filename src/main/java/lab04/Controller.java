//Pakapol Sanarge 5810405223

package lab04;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.awt.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.io.InputStream;

public class Controller{

    private int totalMoney = 100;
    //private int income;
    //private int expense;

    //private InputStream inputS;

    @FXML
    private TextArea textArea;

    @FXML
    private TextField incomeField;

    @FXML
    private TextField  expenseField;

    @FXML
    private Label showTotal;

    @FXML
    public void onIncomeHandler(ActionEvent actionEvent) {
        if (!incomeField.getText().equals("Add Income")){
            if (incomeField.getText().equals("")){
                addText("Please fill all blank field.");
            }
            else if (isNumeric(incomeField.getText())){
                totalMoney += toNum(incomeField.getText());
                addText("Income = "+incomeField.getText());
                addText("Your total money = " + totalMoney+".");
            }

        }else{
            addText("Wow.");
        }


        addLineSeparator();
    }


    @FXML
    public void addExpenseHandler(ActionEvent actionEvent) {
        if (!expenseField.getText().equals("Add Expense")){
            if (expenseField.getText().equals("")){
                addText("Please fill all blank field");
            }
            else if (isNumeric(expenseField.getText())){
                totalMoney += toNum(expenseField.getText());
                addText("Expense = " + expenseField.getText());
                addText("Your total money = " + totalMoney);
            }else{
                addText("Add numberic please.");
            }

        }else{
            addText("Wow.");
        }

        addLineSeparator();

    }







    private boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    private int toNum(String come){
        return (Integer.valueOf(come));
    }

    private void addText(String line) {
        textArea.appendText(line+'\n');
    }



    private void addLineSeparator() {
        textArea.appendText("--------------------------------\n");
    }



}
