import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NuevoLectorController {

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
            // Close the modal
            btnCancelar.getScene().getWindow().hide();
        });
    }

}
