package com.tb.stp.controllers

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.Parent
import javafx.scene.control.TextArea
import javafx.scene.control.TextField
import javafx.stage.Stage



class JProHelloWorldController implements Initializable {

	public Stage    activeStage
	public Parent   currentParent
	@FXML
	       TextField nameFld
	@FXML
	       TextArea consoleArea

	@Override
	void initialize (URL location, ResourceBundle resources) {

	}

	@FXML
	void sayHello() {
		def greetings = "Hello , ${nameFld.text}"
		consoleArea.text = greetings.toString ()
	}
}
