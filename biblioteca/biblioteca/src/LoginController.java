import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Button btnEntrar;

    @FXML
    private PasswordField tfPassword;

    @FXML
    private TextField tfUsuario;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Parent mainUserParent = FXMLLoader.load(getClass().getResource("MainUser.fxml"));
        Scene mainUserScene = new Scene(mainUserParent);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        appStage.setScene(mainUserScene);
        
        // Centrar la ventana
        appStage.centerOnScreen();
        
        appStage.show();
    }
}
