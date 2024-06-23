import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditarLectorController {

    @FXML
    private JFXButton btnCancelar;

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
            try {
                // Load the VerLibro.fxml file
                FXMLLoader loader = new FXMLLoader(getClass().getResource("VerLector.fxml"));
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
    }
}
