import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VerLibroController {

    @FXML
    private JFXButton btnAgregarEdicion;

    @FXML
    private JFXButton btnCancelar;

    @FXML
    private JFXButton btnEditar;

    @FXML
    private JFXButton btnEliminar;

    @FXML
    private Label lblLibroTitulo;

    @FXML
    private TextField tfCantidad;

    @FXML
    private TextField tfTitulo;

    @FXML
    private TextArea txtAreaAutor;

    @FXML
    private TextArea txtAreaCategoria;

    @FXML
    private void initialize() {

        btnCancelar.setOnAction(event -> {
            // Close the modal
            btnCancelar.getScene().getWindow().hide();
        });

        btnEliminar.setOnAction(event -> {
            // Implement the save action
        });

        btnEditar.setOnAction(event -> {
            try {
                openEditarLibroModal();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        btnAgregarEdicion.setOnAction(event -> {
            try {
                openAgregarEdicionModal();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private void openEditarLibroModal() throws IOException {
        // Cerrar el modal actual
        Stage currentStage = (Stage) btnEditar.getScene().getWindow();
        currentStage.close();

        // Cargar el nuevo FXML y abrir el nuevo modal
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditarLibro.fxml"));
        AnchorPane pane = loader.load();

        Stage newStage = new Stage();
        newStage.setTitle("Libro");
        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.setScene(new Scene(pane));
        newStage.show();
    }

    private void openAgregarEdicionModal() throws IOException {
        // Cerrar el modal actual
        Stage currentStage = (Stage) btnEditar.getScene().getWindow();
        currentStage.close();

        // Cargar el nuevo FXML y abrir el nuevo modal
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AgregarEdicion.fxml"));
        AnchorPane pane = loader.load();

        Stage newStage = new Stage();
        newStage.setTitle("Agregar Edición");
        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.setScene(new Scene(pane));
        newStage.show();
    }
}
