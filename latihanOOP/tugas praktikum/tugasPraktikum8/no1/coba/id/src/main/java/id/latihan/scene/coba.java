package id.latihan.scene;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * scene
 */
public class coba extends Application {
    Scene scene1, scene2, scene3;
    Button button1;
    Text welcome;
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;
        window.setTitle("restaurant");

        Label label = new Label("welcome to restaurant");
        button1 = new Button("klik it");

        VBox vBox = new VBox(20);
        vBox.getChildren().addAll(label, button1);
        vBox.setAlignment(Pos.CENTER);

        scene1 = new Scene(vBox, 200, 200);

        window.setScene(scene1);
        window.show();

    }
}