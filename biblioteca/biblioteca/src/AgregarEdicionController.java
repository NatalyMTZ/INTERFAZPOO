import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AgregarEdicionController {

    @FXML
    private JFXButton btnEliminar;

    @FXML
    private JFXButton btnAgregar;

    @FXML
    private JFXButton btnCancelar;

    @FXML
    private JFXButton btnGuardar;

    @FXML
    private Spinner<?> spnCantidad;

    @FXML
    private TextField tfEdicion;

    @FXML
    private TextField tfISBN;

    @FXML
    private TextField tfTitulo;

    @FXML
    private TextArea txtEdiciones;

    @FXML
    private void initialize() {
        btnGuardar.setOnAction(event -> {
            // Implement the save action
        });

        btnEliminar.setOnAction(event -> {
            // Implement the save action
        });

        btnCancelar.setOnAction(event -> {
            try {
                // Load the VerLibro.fxml file
                FXMLLoader loader = new FXMLLoader(getClass().getResource("VerLibro.fxml"));
                Parent root = loader.load();

                // Get the current stage
                Stage stage = (Stage) btnCancelar.getScene().getWindow();

                // Set the scene with the new root
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        btnAgregar.setOnAction(event -> {
            // Implement the save action
        });

    }

}
