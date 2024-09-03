import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EMICalculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Loan Calculator");

        Label lb1 = new Label("Annual Interest Rate:");
        Label lb2 = new Label("Number of Years:");
        Label lb3 = new Label("Loan Amount:");
        Label lb4 = new Label("Monthly Payment:");
        Label lb5 = new Label("Total Payment:");

        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        TextField tf4 = new TextField();
        TextField tf5 = new TextField();

        tf4.setEditable(false);
        tf5.setEditable(false);

        Button calculate = new Button("Calculate");

        GridPane root = new GridPane();
        root.setPadding(new Insets(20));
        root.setHgap(10);
        root.setVgap(10);

        root.add(lb1, 0, 0);
        root.add(tf1, 1, 0);
        root.add(lb2, 0, 1);
        root.add(tf2, 1, 1);
        root.add(lb3, 0, 2);
        root.add(tf3, 1, 2);
        root.add(lb4, 0, 3);
        root.add(tf4, 1, 3);
        root.add(lb5, 0, 4);
        root.add(tf5, 1, 4);
        root.add(calculate, 1, 5);

        calculate.setOnAction(e -> {
            try {
                double annualInterestRate = Double.parseDouble(tf1.getText());
                int numberOfYears = Integer.parseInt(tf2.getText());
                double loanAmount = Double.parseDouble(tf3.getText());

                double monthlyInterestRate = annualInterestRate / 1200;
                int numberOfMonths = numberOfYears * 12;

                double monthlyPayment = (loanAmount * monthlyInterestRate) /
                        (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfMonths));
                double totalPayment = monthlyPayment * numberOfMonths;

                tf4.setText(String.format("%.2f", monthlyPayment));
                tf5.setText(String.format("%.2f", totalPayment));
            } catch (NumberFormatException ex) {
                tf4.setText("Invalid input");
                tf5.setText("Invalid input");
            }
        });

        Scene scene = new Scene(root, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
