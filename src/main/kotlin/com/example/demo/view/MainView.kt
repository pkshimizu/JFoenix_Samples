package com.example.demo.view

import com.jfoenix.controls.JFXDialog
import com.jfoenix.controls.JFXDialogLayout
import javafx.event.ActionEvent
import javafx.scene.control.Alert
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.scene.layout.VBox
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root: VBox by fxml("/MainView.fxml")

    init {
    }

    fun openJavaFXDialog() {
        val dialog = Alert(Alert.AlertType.INFORMATION)
        dialog.contentText = "JavaFX Dialog"
        dialog.show()
    }

    fun openJFXDialog(e: ActionEvent) {
        val content = JFXDialogLayout()
        val stackpane = StackPane()
        val dialog = JFXDialog(stackpane, content, JFXDialog.DialogTransition.CENTER)
        dialog.show(stackpane)
    }
}