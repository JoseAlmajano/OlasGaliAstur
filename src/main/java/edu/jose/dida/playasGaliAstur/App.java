package edu.jose.dida.playasGaliAstur;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import static javafx.application.Application.launch;
import javafx.scene.text.Text;

/**
 * JavaFX App
 */
public class App extends Application {

private static Scene scene;
    
@Override
 public void start(Stage primaryStage) throws Exception {
   
     scene = new Scene(loadFXML("Principal"), 700, 400);
     primaryStage.setScene(scene);
     primaryStage.show();
     
}

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load(); 
    }

    public static void main(String[] args) {
        launch();
    }

}