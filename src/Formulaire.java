import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Formulaire extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setWidth(400);
        primaryStage.setHeight(200);


        Pane panneau = new Pane();
        Button bouton = new Button("Bouton 1");
        bouton.setLayoutX(50);
        bouton.setLayoutY(20);

        ActionBouton abo = new ActionBouton();
        bouton.setOnAction(abo);

        panneau.getChildren().add(bouton);


        Scene scene = new Scene(panneau);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
