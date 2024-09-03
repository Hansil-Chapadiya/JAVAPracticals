import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CircleInScene extends Application{
    public void start(Stage primaryStage){

        primaryStage.setTitle(STYLESHEET_CASPIAN);

        Circle cr = new Circle(12.00);
        cr.setFill(Color.web("Red"));

        // Color cl = new Color(0, 0, 0, 0);
        // Color.valueOf("pink");
        // Color.rgb(0, 0, 0);
        // Color.web("RED")

        StackPane root = new StackPane();
        root.getChildren().add(cr);

        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String args[])
    {
        launch(args);
    }
}