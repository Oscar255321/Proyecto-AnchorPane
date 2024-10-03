package com.example.ejemplo_anchorpane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController
    {
        @FXML
        private TextField tituloNota;
        @FXML
        private TextArea contenidoNota;

        @FXML
        public void guardarNota(ActionEvent actionEvent)
        {

            String titulo = tituloNota.getText();     // Obtener el texto del título
            String contenido = contenidoNota.getText(); // Obtener el texto del contenido

            // Aquí puedes agregar la lógica para guardar la nota
            System.out.println("Título: " + titulo);
            System.out.println("Contenido: " + contenido);

            // Limpiar los campos después de guardar
            tituloNota.clear();
            contenidoNota.clear();
        }
    }
