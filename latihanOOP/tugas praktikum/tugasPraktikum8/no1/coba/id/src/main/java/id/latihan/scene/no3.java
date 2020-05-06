package id.scene;

import java.io.*;

import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class no3 extends Application{
    public static void main(String[] a){
		Application.launch(a);
	}
	
	@Override
	public void start(Stage stage){
		
		Button selectFileButton = new Button("Choose File");
		

		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setPrefHeight(800);

		selectFileButton.setOnAction(new OpenFile(selectFileButton, textArea, stage));
		
		VBox rootPane = new VBox();
		VBox.setMargin(selectFileButton, new Insets(24, 16, 16, 16));
		VBox.setMargin(textArea, new Insets(8, 8, 8, 8));
		rootPane.setAlignment(Pos.TOP_CENTER);
		rootPane.getChildren().addAll(selectFileButton, textArea);

		Scene scene = new Scene(rootPane, 640, 480);
		stage.setScene(scene);
		stage.setTitle("File Reader");
		stage.show();
	}

	static String readFile(File file) throws IOException{
		//max byte read
		final int size = 4096;

		FileInputStream input = new FileInputStream(file);
		ByteArrayOutputStream tempOut = new ByteArrayOutputStream();

		byte[] buf = new byte[size];
		int readed = 0;
		do{
			readed = input.read(buf);
			tempOut.write(buf, 0, readed);
		} while (readed == size);
		String out = tempOut.toString("UTF-8");
		input.close();
		return out;
	}
}
