import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleSceneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a circle
        Circle circle = new Circle(100, Color.RED);

        // Create a layout pane (StackPane) and add the circle to it
        StackPane root = new StackPane(circle);

        // Create a scene with the layout pane as the root node
        Scene scene = new Scene(root, 300, 300);

        // Set the scene in the stage
        primaryStage.setScene(scene);

        // Set stage title
        primaryStage.setTitle("Circle Scene Example");

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
