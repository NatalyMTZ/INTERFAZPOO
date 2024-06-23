import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class MainUserController implements Initializable {

    @FXML
    private BorderPane mainPane;

    @FXML
    private Label titulo;

    @FXML
    void handleButton1Action(ActionEvent event) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("CatalogoUser");
        mainPane.setCenter(view);

    }

    @FXML
    void handleButton2Action(ActionEvent event) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("PrestamosUser");
        mainPane.setCenter(view);
    }

    @FXML
    void handleButton3Action(ActionEvent event) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("LectoresUser");
        mainPane.setCenter(view);
    }

    @FXML
    void handleButton4Action(ActionEvent event) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("MultasUser");
        mainPane.setCenter(view);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        assert mainPane != null : "fx:id=\"mainPane\" was not injected: check your FXML file 'MainUser.fxml'.";
        System.out.println("mainPane: " + mainPane);
    }

    
}
