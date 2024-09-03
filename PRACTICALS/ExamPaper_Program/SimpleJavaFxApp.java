import java.util.Collections;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
public class SimpleJavaFxApp extends Application{
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Basic Application");

        Button btn = new Button();
        btn.setText("Click Me");
        btn.setTextFill(Color.web("Purple"));
        StackPane root = new StackPane();
        root.getChildren().addAll(btn);

        Scene scene = new Scene(root, 300.0, 300.0);
        primaryStage.setScene(scene);
        primaryStage.show();

        btn.setOnAction(e -> openNewWindow(primaryStage));
    }

    public void openNewWindow(Stage stage_)
    {
        stage_.close();
        Stage stage = new Stage();
        stage.setTitle("New Window");

        TextField tf = new TextField();
        tf.setFont(new Font("Time New Roman", 10));
        tf.setStyle("-fx-text-inner-color: red;");


        tf.setOnKeyTyped(e-> WriteInterminal(tf.getText()));

        StackPane root = new StackPane();
        root.getChildren().addAll(tf);

        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

    public void WriteInterminal(String string)
    {
        StringBuffer sb = new StringBuffer(string);
        System.out.println(sb.reverse());
    }
    public static void main(String[] args) {
        launch(args);
    }
}
