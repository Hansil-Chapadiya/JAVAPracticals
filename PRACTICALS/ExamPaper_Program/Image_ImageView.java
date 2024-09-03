import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

public class Image_ImageView extends Application {
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Image_ImageView Example");

        // Ensure the image path is correct
        Image image = new Image("file:./2.jpj.jpg");
        ImageView imageView = new ImageView(image);

        // Create a scroll bar
        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setOrientation(javafx.geometry.Orientation.HORIZONTAL);
        scrollBar.setMin(0);
        scrollBar.setMax(image.getWidth());
        scrollBar.valueProperty().addListener((obs, oldVal, newVal) -> {
            imageView.setTranslateX(-newVal.doubleValue());
        });

        // Create a layout
        BorderPane root = new BorderPane();
        root.setCenter(imageView);
        root.setBottom(scrollBar);

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
