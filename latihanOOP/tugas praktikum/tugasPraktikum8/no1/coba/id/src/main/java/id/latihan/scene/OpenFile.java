package id.scene;

import java.io.*;

import javafx.event.*;
import javafx.scene.control.*;
import javafx.stage.*;

class OpenFile implements EventHandler<ActionEvent>{

    private Button button;
	private Stage window;
    private TextArea textArea;
    
	public OpenFile(Button button, TextArea textArea, Stage window){
		this.button = button;
		this.window = window;
		this.textArea = textArea;
	}

	@Override
	public void handle(ActionEvent event){
		button.setDisable(true);
		textArea.setText("");

		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Select UTF-8 Text File");
		fileChooser.getExtensionFilters().addAll(
			new FileChooser.ExtensionFilter("TXT Files", "*.txt"),
			new FileChooser.ExtensionFilter("All Files", "*.*")
		);
		File file = fileChooser.showOpenDialog(window);

		if (file == null){
			button.setDisable(false);
			return;
		}

		
		try{
			textArea.setText(no3.readFile(file));
		}
		catch (IOException e){
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Error to read file.");
			alert.setContentText(e.getMessage());
		}
		catch (Exception e){
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Unknown Error.");
			alert.setContentText(e.getMessage());
		}

		button.setDisable(false);
	}


}
