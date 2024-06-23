import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class VerPrestamoController {

    @FXML
    private JFXButton btnCancelar;

    @FXML
    private JFXButton btnEliminar;

    @FXML
    private JFXButton btnGuardar;

    @FXML
    private TextField tfCorreo;

    @FXML
    private TextField tfDate;

    @FXML
    private TextField tfEstado;

    @FXML
    private TextField tfLector;

    @FXML
    private TextArea txtLibros;

    @FXML
    private void initialize() {
        btnGuardar.setOnAction(event -> {
            // Implement the save action
        });

        btnCancelar.setOnAction(event -> {
            // Close the modal
            btnCancelar.getScene().getWindow().hide();
        });

        btnEliminar.setOnAction(event -> {
            // Implement the save action
        });

    }

}
