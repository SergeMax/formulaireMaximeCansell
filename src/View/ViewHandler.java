package View;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ViewHandler extends Application {

    private Stage primaryStage;
    private   VBox vb;


    @Override
    public void start(Stage primaryStage) throws Exception {

        System.out.println("hello");
       primaryStage.setTitle("Formulaire d'inscription pour le site de M. Boutboul");

        // VBox
         vb = new VBox();
        vb.setPadding(new Insets(10, 50, 50, 50));
        vb.setSpacing(10);
        vb.setMinWidth(500);

        Label titreFormulaire = new Label("Formulaire d'inscription");
        titreFormulaire.setFont(Font.font("Amble CN", FontWeight.BOLD, 24));
        vb.getChildren().add(titreFormulaire);

        // Buttons
        Button btn1 = ajoutBoutton("validation 1");

        Button btn2 = new Button();
        btn2.setText("Button2");
        vb.getChildren().add(btn2);

        Button btn3 = new Button();
        btn3.setText("Button3");
        vb.getChildren().add(btn3);

        Button btn4 = new Button();
        btn4.setText("Button4");
        vb.getChildren().add(btn4);

        // Adding VBox to the scene
        Scene scene = new Scene(vb);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public Button ajoutBoutton(String setText){

        Button nomBouton = new Button();
        nomBouton.setText(setText);
        vb.getChildren().add(nomBouton);

        return nomBouton;

    }

}