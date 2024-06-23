import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class CatalogoUserController {

    @FXML
    private JFXButton btnBuscar;

    @FXML
    private JFXComboBox<?> cmbFiltro;

    @FXML
    private TableColumn<?, ?> colAutor;

    @FXML
    private TableColumn<?, ?> colCategoria;

    @FXML
    private TableColumn<?, ?> colDisponible;

    @FXML
    private TableColumn<?, ?> colEdicion;

    @FXML
    private TableColumn<?, ?> colLibro;

    @FXML
    private TextField tfBuscar;
}
