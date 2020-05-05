package id.scene;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Insets;

/**
 * no2
 */
public class no2 extends Application {

    Stage window;
    Label kelompok, data, lNim, lNama, lJenisKelamin;
    TextField tNim, tNama, tJenisKelamin;
    Scene scene1, scene2;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;

        BorderPane borderPane = new BorderPane();
        GridPane gridPane = new GridPane();
        GridPane gridPane2 = new GridPane();

        kelompok = new Label("Kelompok");
        kelompok.setFont(new Font("Comic Sans MS", 12));

        data = new Label("Data");
        data.setFont(new Font("Comic Sans MS", 12));

        VBox vBox = new VBox();
        vBox.getChildren().add(kelompok);
        vBox.setAlignment(Pos.CENTER);

        VBox vBox2 = new VBox();
        vBox2.getChildren().add(data);
        vBox2.setAlignment(Pos.CENTER);

        RadioButton radioButton1 = new RadioButton("Kelompok 1");
        RadioButton radioButton2 = new RadioButton("Kelompok 2");
        RadioButton radioButton3 = new RadioButton("Kelompok 3");
        RadioButton radioButton4 = new RadioButton("Kelompok 4");
        RadioButton[] arrKelompok = { radioButton1, radioButton2, radioButton3, radioButton4 };
        ToggleGroup toogleKelompok = new ToggleGroup();

        radioButton1.setToggleGroup(toogleKelompok);
        radioButton2.setToggleGroup(toogleKelompok);
        radioButton3.setToggleGroup(toogleKelompok);
        radioButton4.setToggleGroup(toogleKelompok);
        

        // kiri
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);
        GridPane.setConstraints(vBox, 2, 0);
        GridPane.setConstraints(radioButton1, 1, 3);
        GridPane.setConstraints(radioButton2, 3, 3);
        GridPane.setConstraints(radioButton3, 1, 4);
        GridPane.setConstraints(radioButton4, 3, 4);
        gridPane.getChildren().addAll(vBox, radioButton1, radioButton2, radioButton3, radioButton4);

        // kanan

        lNim = new Label("NIM");
        tNim = new TextField();
        tNim.setMaxWidth(200);

        lNama = new Label("Nama");
        tNama = new TextField();
        tNama.setMaxWidth(200);

        lJenisKelamin = new Label("Jenis Kelamin");
        ToggleGroup gnderGroup = new ToggleGroup();
        RadioButton radioButton5 = new RadioButton("Laki - laki");
        RadioButton radioButton6 = new RadioButton("Perempuan");
        RadioButton []arrGender = {radioButton5, radioButton6};
        
        radioButton5.setToggleGroup(gnderGroup);
        radioButton6.setToggleGroup(gnderGroup);


        gridPane2.setHgap(10);
        gridPane2.setVgap(10);
        gridPane2.setAlignment(Pos.CENTER);
        GridPane.setConstraints(vBox2, 2, 0);
        GridPane.setConstraints(lNim, 1, 1);
        GridPane.setConstraints(tNim, 3, 1);
        GridPane.setConstraints(lNama, 1, 2);
        GridPane.setConstraints(tNama, 3, 2);
        GridPane.setConstraints(lJenisKelamin, 1, 3);
        GridPane.setConstraints(radioButton5, 2, 3);
        GridPane.setConstraints(radioButton6, 2, 4);
        gridPane2.getChildren().addAll(vBox2, lNim, tNim, lNama, tNama, lJenisKelamin, radioButton5, radioButton6);

        // var ref = new Object(){
        // Label gender = new Label();

        // };

        

        
        Button btnSave = new Button("SAVE");
        btnSave.setPadding(new Insets(5, 5, 5, 5));

        // btnSave.setOnAction(p->AlertSave.detail("Info", tNim.getText(),
        // tNama.getText(), toogle.getSelectedToggle().toString()));
        // btnSave.setOnAction(e ->
        // {
        // if(radioButton1.isSelected()) System.out.println("kelompok 1");
        // else if(radioButton2.isSelected()) System.out.println("kelompok 2");
        // else if(radioButton3.isSelected()) System.out.println("kelompok 3");
        // else if(radioButton4.isSelected()) System.out.println("kelompok 4");

        // if(radioButton5.isSelected()) System.out.println("laki2");
        // else if(radioButton6.isSelected()) System.out.println("perempuan");
        // });
        btnSave.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Toggle togglegGroup = toogleKelompok.getSelectedToggle();
                if(togglegGroup == null){
                    showWarning("Error", "Tidak ada kelompok yang di pilih", null);
                    return;
                }

                int groupIndex = -1;
                for (int i = 0; i < arrKelompok.length; i++) {
                    if(arrKelompok[i] == togglegGroup){
                        groupIndex = i;
                        break;
                    }
                }

                if(groupIndex == -1){
                    showWarning("Error", "kesalahan internal", "groupIndex == -1");
                    return;
                }

                String id = tNim.getText();
                if(id == null || id.length() == 0){
                    showWarning("Error", "Nim Kosong", null);
                }

                String name = tNama.getText();
                if(name == null || name.length() == 0){
                    showWarning("Error", "Nama Kosong", null);
                }

                Toggle toggleGender = gnderGroup.getSelectedToggle();
                String gender = null;

                if(toggleGender == arrGender[0]){
                    gender = "Laki-laki";
                }else if(toggleGender == arrGender[1]){
                    gender = "Perempuan";
                }else{
                    showWarning("Error", "Gender tidak ada","gender kosong");
                }

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                StringBuilder builder = new StringBuilder();
                builder.append("Nama: ");
				builder.append(name);
				builder.append("\n");
				builder.append("NIM: ");
				builder.append(id);
				builder.append("\n");
				builder.append("Jenis Kelamin: ");
				builder.append(gender);
				builder.append("\n");
				builder.append("Kelompok: ");
				builder.append(groupIndex + 1);
				builder.append("\n");
				alert.setTitle("Informasi");
				alert.setHeaderText("Informasi Data");
				alert.setContentText(builder.toString());
				alert.showAndWait();
                
            }
        });

        BorderPane.setAlignment(btnSave, Pos.TOP_RIGHT);
        BorderPane.setMargin(gridPane, new Insets(10, 10, 10, 10));
        BorderPane.setMargin(gridPane2, new Insets(10, 10, 10,10));
        BorderPane.setMargin(btnSave, new Insets(10, 10, 10, 10));

        borderPane.setLeft(gridPane);
        borderPane.setRight(gridPane2);
        borderPane.setBottom(btnSave);

        scene1 = new Scene(borderPane, 800, 260);
        window.setScene(scene1);
        window.show();

        

    }

    public static void showWarning(String title, String header, String content){
		Alert alert = new Alert(Alert.AlertType.WARNING);
		alert.setTitle(title);
		alert.setHeaderText(header);

		if (content != null)
			alert.setContentText(content);
		
		alert.showAndWait();
	}

    
}