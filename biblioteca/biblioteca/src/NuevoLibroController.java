import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NuevoLibroController {

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
            // Close the modal
            btnCancelar.getScene().getWindow().hide();
        });
    }

}
