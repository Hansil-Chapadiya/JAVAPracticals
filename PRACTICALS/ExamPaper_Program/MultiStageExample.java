import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MultiStageExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Primary Stage");

        Button btn = new Button("Open New Window");
        btn.setOnAction(e -> openNewWindow());

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void openNewWindow() {
        Stage newStage = new Stage();
        newStage.setTitle("New Window");

        Button btn = new Button("Close");
        btn.setOnAction(e -> newStage.close());

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 200, 150);
        newStage.setScene(scene);
        newStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

