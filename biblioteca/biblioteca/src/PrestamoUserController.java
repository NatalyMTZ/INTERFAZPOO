import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PrestamoUserController {

    @FXML
    private JFXButton btnBuscar;

    @FXML
    private JFXButton btnNuevo;

    @FXML
    private JFXComboBox<?> cmbFiltro;

    @FXML
    private TableColumn<?, ?> colCorreo;

    @FXML
    private TableColumn<?, ?> colDevolucion;

    @FXML
    private TableColumn<?, ?> colEstado;

    @FXML
    private TableColumn<?, ?> colLector;

    @FXML
    private TableColumn<?, ?> colLibro;

    @FXML
    private TextField tfBuscar;

    @FXML
    public void initialize() {
        btnNuevo.setOnAction(event -> {
            try {
                openNuevoPrestamoModal();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    private void openNuevoPrestamoModal() throws IOException {
        // Load the FXML file for the modal
        FXMLLoader loader = new FXMLLoader(getClass().getResource("NuevoPrestamo.fxml"));
        Parent root = loader.load();

        // Create a new scene with the loaded layout
        Scene scene = new Scene(root);

        // Create a new stage for the modal
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Nuevo Prestamo");

        // Make the modal block input to other windows (optional)
        stage.initModality(Modality.APPLICATION_MODAL);

        // Show the modal and wait for it to be closed before returning to the caller
        stage.showAndWait();
    }
}
