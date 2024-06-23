import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class NuevoPrestamoController {

    @FXML
    private FontAwesomeIcon btnAgregarLector;

    @FXML
    private Button btnAgregarLibro;

    @FXML
    private JFXButton btnCancelar;

    @FXML
    private Button btnEliminarLibro;

    @FXML
    private JFXButton btnGuardar;

    @FXML
    private JFXComboBox<?> cmbCorreo;

    @FXML
    private JFXComboBox<?> cmbLibro;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label lblDate;

    @FXML
    private TextField tfCorreo;

    @FXML
    private TextField tfLibro;

    @FXML
    private TextArea txtLibros;

    @FXML
    private void initialize() {
        // Añadir el manejador de eventos para el botón btnAgregarLector
        btnAgregarLector.setOnMouseClicked(event -> {
            try {
                abrirNuevoLector();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        btnGuardar.setOnAction(event -> {
            // Implement the save action
        });

        btnCancelar.setOnAction(event -> {
            // Close the modal
            btnCancelar.getScene().getWindow().hide();
        });
    }

    private void abrirNuevoLector() throws IOException {
        // Cerrar el modal actual
        Stage currentStage = (Stage) btnAgregarLector.getScene().getWindow();
        currentStage.close();

        // Cargar el nuevo FXML y abrir el nuevo modal
        FXMLLoader loader = new FXMLLoader(getClass().getResource("NuevoLector.fxml"));
        AnchorPane pane = loader.load();

        Stage newStage = new Stage();
        newStage.setTitle("Nuevo Lector");
        newStage.initModality(Modality.APPLICATION_MODAL);
        newStage.setScene(new Scene(pane));
        newStage.show();
    }

    
}

