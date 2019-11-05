package View;


import Controler.Controler;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ViewHandler extends Application {

    private Stage primaryStage;
    private VBox vb;
    private Controler controlerInscr;
    private ViewInscription mi;
    private ViewConnexion mc;


    @Override
    public void start(Stage primaryStage) throws Exception {

        System.out.println("hello");
       primaryStage.setTitle("Formulaire d'inscription pour le site de M. Boutboul");


        this.primaryStage = primaryStage;
        // root représente le panel qui va être affiché : tout ce qui doit être affiché doit lui être ajouté
        VBox root = new VBox();

        root.setPadding(new Insets(50, 50, 50, 50));
        root.setSpacing(10);
        root.setMinWidth(500);

        Scene inscritpion = new Scene(root, Color.WHITE);

        Menu model = new Menu();

        mi = new ViewInscription(model, root);
        mc = new ViewConnexion(model, root);

        //  mo = new ViewChoixVaisseaux(model, root);
        //game = new ViewGame(model, root);
        controlerInscr = new Controler(this, model);
      //  controllerJeux = new ControllerJeux(this, model);
        afficherInscription();
        /*Button btn4 = new Button();
        btn4.setText("Button4");
        vb.getChildren().add(btn4);*/

        // Adding VBox to the scene

        primaryStage.setScene(inscritpion);
        //primaryStage.show();
        //   primaryStage.setFullScreenExitHint("");
        primaryStage.setResizable(true);
        // primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();

    }

    private void afficherInscription() {
        mi.setVueCompleteInscription();
        System.out.println("ca passer par la");
    }

    public void setEventHandlerInscription(Controler inscr) {
        mi.setEvents(inscr);
        // game.setEvents(cm);
    }



   /* public Button ajoutBoutton(String setText){

        Button nomBouton = new Button();
        nomBouton.setText(setText);
        vb.getChildren().add(nomBouton);

        return nomBouton;

    }*/

    public ViewInscription getMi() {
        return mi;
    }

    public void afficherConnexion() {
        mc.setVueCompleteConnexion();
    }
}