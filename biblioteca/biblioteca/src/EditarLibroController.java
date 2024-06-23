import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditarLibroController {

    @FXML
    private Spinner<?> SpnCantidad;

    @FXML
    private FontAwesomeIcon btnAgregarAutor;

    @FXML
    private Button btnAgregarCategoria;

    @FXML
    private Button btnAgregarLibro;

    @FXML
    private JFXButton btnCancelar;

    @FXML
    private Button btnEliminarAutor;

    @FXML
    private FontAwesomeIcon btnEliminarCategoria;

    @FXML
    private Button btnEliminarLibro1;

    @FXML
    private JFXButton btnGuardar;

    @FXML
    private JFXComboBox<?> cmbAutor;

    @FXML
    private JFXComboBox<?> cmbCategoria;

    @FXML
    private Label lblCantidad;

    @FXML
    private Label lblLibro;

    @FXML
    private TextField tfCategoria;

    @FXML
    private TextField tfLibro;

    @FXML
    private TextField tfTitulo;

    @FXML
    private TextArea txtAreaAutor;

    @FXML
    private TextArea txtAreaCategoria;

    @FXML
    private void initialize() {
        btnGuardar.setOnAction(event -> {
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
    }

}
