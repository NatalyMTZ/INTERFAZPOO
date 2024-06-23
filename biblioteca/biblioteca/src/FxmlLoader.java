import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;;

public class FxmlLoader {
    private Pane view;

    public Pane getPage(String fileName){
        try{
            URL fileUrl = MainUserController.class.getResource(fileName + ".fxml");
            if(fileUrl == null){
                throw new java.io.FileNotFoundException("FXML file cant be found");
            }
            
            view = new FXMLLoader().load(fileUrl);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("No page "+ fileName + " please check FxmlLoader.");
        }
        return view;
    }
}
