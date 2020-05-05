package id.scene;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * scene
 */
public class no1 extends Application {
    Scene scene1, scene2, scene3;
    Button button1;
    TextField tfAyam, tfNasi, tfTeh, tTotal;
    Label lAyam, lNasi, lTeh, lHAyam, lHNasi, lHTeh, nameRestaurant;
    Stage window;
    //Text welcome;
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("restaurant");
        //TilePane tilePane = new TilePane();


        Label label = new Label("welcome to AiRestau");
        label.setFont(new Font("Arial", 20));
        button1 = new Button("click it to continue");

        VBox vBox = new VBox(20);
        vBox.getChildren().addAll(label, button1);
        vBox.setAlignment(Pos.CENTER);

        scene1 = new Scene(vBox, 400, 400);

        //scene 2
        button1.setOnAction(e->{
            GridPane gridPane = new GridPane();

            nameRestaurant = new Label("AiRestau");
            nameRestaurant.setFont(new Font("Comic Sans MS", 20));
            VBox vBox2 = new VBox(20);
            vBox2.getChildren().add(nameRestaurant);

            //ayam
            tfAyam = new TextField();
            //tfAyam.setPromptText();
            tfAyam.setMaxWidth(30);
            lAyam = new Label();
            lAyam.setText("Ayam");
            lHAyam = new Label();
            lHAyam.setText("Rp. 12.000");

            tfNasi = new TextField();
            //tfNasi.setPromptText("Nasi");
            tfNasi.setMaxWidth(30);
            lNasi = new Label();
            lNasi.setText("Nasi");
            lHNasi = new Label();
            lHNasi.setText("Rp. 5.000");

            tfTeh = new TextField();
            //tfTeh.setPromptText("Teh");
            tfTeh.setMaxWidth(30);
            lTeh = new Label();
            lTeh.setText("Teh");
            lHTeh = new Label();
            lHTeh.setText("Rp. 3.000");
            
            var ref = new Object(){
                Label total = new Label();
            };

            Button submit = new Button("submit");
            submit.setOnAction(p->{
                int ayam = Integer.parseInt(0 + tfAyam.getText());
                int nasi = Integer.parseInt(0 + tfNasi.getText());
                int teh = Integer.parseInt(0 + tfTeh.getText());
                int beli = ((ayam*12000) + (nasi*5000) + (teh*3000));
                
                ref.total.setTextFill(Color.BLACK);

                ref.total.setText("total " + beli);

                GridPane.setConstraints(ref.total, 1, 7);
                gridPane.getChildren().addAll(ref.total );
            });

            Button back = new Button("Back");
            back.setOnAction(j -> {
                gridPane.getChildren().removeAll(ref.total);
                window.setScene(scene1);
            });

            gridPane.setHgap(10);
            gridPane.setVgap(10);
            gridPane.setAlignment(Pos.CENTER);
            GridPane.setConstraints(vBox2, 3, 0);
            GridPane.setConstraints(tfAyam, 1, 1);
            GridPane.setConstraints(lAyam, 2, 1);
            GridPane.setConstraints(lHAyam, 6, 1);
            GridPane.setConstraints(tfNasi, 1, 2);
            GridPane.setConstraints(lNasi, 2, 2);
            GridPane.setConstraints(lHNasi, 6, 2);
            GridPane.setConstraints(tfTeh, 1, 3);
            GridPane.setConstraints(lTeh, 2, 3);
            GridPane.setConstraints(lHTeh, 6, 3);
            GridPane.setConstraints(submit, 6, 4);
            GridPane.setConstraints(back, 6, 5);
            gridPane.getChildren().addAll(vBox2 , tfAyam, lAyam, lHAyam, tfNasi, lNasi, lHNasi, tfTeh, lTeh, lHTeh, submit, back);

            scene2 = new Scene(gridPane, 600, 600);
            window.setScene(scene2);
            
        });

        window.setScene(scene1);
        window.show();

    }
}