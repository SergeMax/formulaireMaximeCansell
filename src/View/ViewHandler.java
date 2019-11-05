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
    private ViewAffichageUtilisateur pro;
    private Menu model;
    private  VBox root;

    public ViewAffichageUtilisateur getPro() {
        return pro;
    }

    public ViewConnexion getMc() {
        return mc;
    }

    public void setMc(ViewConnexion mc) {
        this.mc = mc;
    }

    public Controler getControlerInscr() {
        return controlerInscr;
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        System.out.println("hello");
       primaryStage.setTitle("Formulaire d'inscription pour le site de M. Boutboul");


        this.primaryStage = primaryStage;

        root = new VBox();

        root.setPadding(new Insets(50, 50, 50, 50));
        root.setSpacing(10);
        root.setMinWidth(500);

        Scene inscritpion = new Scene(root, Color.WHITE);

        model = new Menu();

        mi = new ViewInscription(model, root);
        mc = new ViewConnexion(model, root);

        controlerInscr = new Controler(this, model);

        afficherInscription();

        primaryStage.setScene(inscritpion);
        primaryStage.setResizable(true);
        primaryStage.show();

    }

    private void afficherInscription() {
        mi.setVueCompleteInscription();
        System.out.println("ca passer par la");
    }

    public void setEventHandlerInscription(Controler inscr) {
        mi.setEvents(inscr);
        mc.setEvents(inscr);

    }


    public ViewInscription getMi() {
        return mi;
    }

    public void afficherConnexion() {
        mc.setVueCompleteConnexion();
    }

    public void afficherProfil() {
        pro = new ViewAffichageUtilisateur(model, root);

        pro.setVueCompleteProfil();
    }

}