import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

//import java.awt.event.ActionEvent;

import static javafx.application.Application.launch;

public class ActionBouton implements EventHandler<ActionEvent> {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent e){
        System.out.println("Clic!");
    }
    public void start(Stage primaryStage) {

    }
}
