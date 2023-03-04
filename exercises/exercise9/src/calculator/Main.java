package calculator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {
  TextField number1;
  TextField number2;
  Text result;

  @Override
  public void start(Stage primaryStage) throws Exception {

    // set title
    Text title = new Text();
    title.setFont(Font.font("verdana", FontWeight.EXTRA_BOLD, FontPosture.REGULAR, 16));
    title.setText("Please click buttons to start calculate!");

    HBox titleRow = new HBox(5, title);
    titleRow.setAlignment(Pos.CENTER);

    // create buttons
    Button plusButton = new Button("+");
    plusButton.setOnAction(actionEvent -> add());

    Button subtractButton = new Button("-");
    subtractButton.setOnAction(actionEvent -> subtract());

    Button multiplyButton = new Button("x");
    multiplyButton.setOnAction(actionEvent -> multiply());
    Button divideButton = new Button("/");
    divideButton.setOnAction(actionEvent -> divide());

    HBox functionsRow = new HBox(5);
    functionsRow.setAlignment(Pos.CENTER);
    functionsRow.getChildren().addAll(plusButton, subtractButton, multiplyButton, divideButton);


    // input field
    number1 = new TextField();
    number2 = new TextField();

    HBox numbersRow = new HBox(5);
    numbersRow.setAlignment(Pos.CENTER);
    numbersRow.getChildren().addAll(number1, number2);

    // result field
    Label resutlLabel = new Label("Result: ");
    result = new Text("");
    Button clearButton = new Button("Clear");
    clearButton.setOnAction(actionEvent -> clear());

    HBox resultRow = new HBox(5);
    resultRow.setAlignment(Pos.CENTER);
    resultRow.getChildren().addAll(resutlLabel, result);

    VBox vbox =new VBox(5, titleRow, functionsRow, numbersRow, resultRow, clearButton);
    vbox.setAlignment(Pos.CENTER);

    // create scence, set title, show
    Scene scene = new Scene(vbox, 400,300);
    primaryStage.setTitle("Simple Calculator");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  private double getNum1() {
    try {
      double num1 = Double.parseDouble(number1.getText());
      return num1;
    } catch (NumberFormatException e) {
      throw new RuntimeException(e);
    }
  }

  private  double getNum2() {
    try {
    double num2 = Double.parseDouble(number2.getText());
    return num2;
    } catch (NumberFormatException e) {
      throw new RuntimeException(e);
    }
  }
  private void add(){
     result.setText(String.valueOf(getNum1() + getNum2()));
  }

  private  void subtract() {
    result.setText(String.valueOf(getNum1() - getNum2()));
  }
  private void multiply() {
    result.setText(String.valueOf(getNum1() * getNum2()));
  }
  private void divide() {
    if ((int)getNum2() == 0) {
      result.setText("Divider cannot be 0.");
    } else {
    result.setText(String.valueOf(getNum1() / getNum2()));
    }
  }

  private void clear() {
    result.setText("");
  }



  public static void main(String[] args) {
    launch(args);
  }
}