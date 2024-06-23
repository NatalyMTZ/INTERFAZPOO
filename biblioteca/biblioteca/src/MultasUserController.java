import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class MultasUserController {

    @FXML
    private JFXButton btnBuscar;

    @FXML
    private JFXComboBox<?> cmbFiltro;

    @FXML
    private TableColumn<?, ?> colCorreo;

    @FXML
    private TableColumn<?, ?> colCosto;

    @FXML
    private TableColumn<?, ?> colEstado;

    @FXML
    private TableColumn<?, ?> colIdCliente;

    @FXML
    private TableColumn<?, ?> colLibro;

    @FXML
    private TextField tfBuscar;

}

