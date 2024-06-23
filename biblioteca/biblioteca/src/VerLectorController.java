import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VerLectorController {

    @FXML
    private JFXButton btnCancelar;

    @FXML
    private JFXButton btnEditar;

    @FXML
    private JFXButton btnEliminar;

    @FXML
    private JFXButton btnGuardar;

    @FXML
    private TextField tfCorreo;

    @FXML
    private TextField tfNombre;

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

        btnEditar.setOnAction(event -> {
            try {
                openEditarLectorModal();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private void openEditarLectorModal() throws IOException {
        // Cerrar el modal actual
        Stage currentStage = (Stage) btnEditar.getScene().getWindow();
        currentStage.close();

        // Cargar el nuevo FXML y abrir el nuevo modal
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditarLector.fxml"));
        AnchorPane pane = loader.load();

        Stage newStage = new Stage();
        newStage.setTitle("Lector");
        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.setScene(new Scene(pane));
        newStage.show();
    }
}
