package com.tb.stp.ui

import com.sun.javafx.application.LauncherImpl
import com.tb.stp.controllers.JProHelloWorldController
import javafx.application.Application
import javafx.application.Platform
import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.scene.Scene
import javafx.stage.Stage
import javafx.stage.StageStyle
import jfxtras.styles.jmetro.JMetro

class JProHelloWorldUILauncher {
	static void main (String[] args) {
		Platform.implicitExit = true
		LauncherImpl.launchApplication (JProHelloWorldUI)
	}
}

class JProHelloWorldUI extends Application{

	Node                     root
	JMetro                   jMetro
	JProHelloWorldController controller

	@Override
	void init () throws Exception {
		super.init ()
		def loader
//		jMetro = new JMetro ((Style.LIGHT))
//		jMetro.automaticallyColorPanes = true

		loader = new FXMLLoader (this.class.getResource (fxmlSpec ()))
		root = loader.load ()

//		root.style = JMetroStyleClass.BACKGROUND
		controller = loader.controller as JProHelloWorldController
	}

	@Override
	void start (Stage stage) throws Exception {
		stage.with {

			initStyle StageStyle.DECORATED
			title = "JPRO Hello World"
			setResizable true
			def rootScene = Scene.newInstance root

			scene = rootScene

			controller.activeStage = stage
			controller.currentParent = root


			show ()
		}

	}

	String fxmlSpec () {

		'/main.fxml'
	}
}
