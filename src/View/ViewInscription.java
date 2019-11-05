package View;

import Controler.Controler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;

import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class ViewInscription {

    private final Menu model;
    private Stage primaryStage;
    private VBox root;
    private Label titreFormulaire ;
    private TextField login;
    private TextField mdp;
    private TextField nom;
    private TextField prenom;
    private TextField adresse;
    private TextField codePostale;
    private TextField ville;
    private TextField adresseEmail;

    private Label  loginLabel;
    private Label  mdpLabel;
    private Label  nomLabel;
    private Label  prenomLabel;
    private Label  adresseLabel;
    private Label  codePostaleLabel;
    private Label  villeLabel;
    private Label  adresseEmailLabel;


    private Button buttonValider;

     /*   vb = new VBox();
        vb.setPadding(new Insets(10, 50, 50, 50));
        vb.setSpacing(10);
        vb.setMinWidth(500);

    Label titreFormulaire = new Label("Formulaire d'inscription");
        titreFormulaire.setFont(Font.font("Amble CN", FontWeight.BOLD, 24));
        vb.getChildren().add(titreFormulaire);

    TextField login = new TextField("Login");
        login.setMinWidth(120);
        vb.getChildren().add(login);

    TextField mdp = new TextField("Mots de passe");
        mdp.setMinWidth(120);
        vb.getChildren().add(mdp);

    TextField nom = new TextField("Nom");
        nom.setMinWidth(120);
        vb.getChildren().add(nom);

    TextField prenom = new TextField("Prenom");
        prenom.setMinWidth(120);
        vb.getChildren().add(prenom);

    TextField adresse = new TextField("Adresse");
        adresse.setMinWidth(120);
        vb.getChildren().add(adresse);

    TextField codePostale = new TextField("Code Postal");
        codePostale.setMinWidth(120);
        vb.getChildren().add(codePostale);

    TextField ville = new TextField("Ville");
        ville.setMinWidth(120);
        vb.getChildren().add(ville);

    TextField adresseEmail = new TextField("Adresse Email");
        adresseEmail.setMinWidth(120);
        vb.getChildren().add(adresseEmail);

    // Buttons
    Button btn1 = ajoutBoutton("Valider l'inscription");*/


    public ViewInscription(Menu model, VBox vb) {

        this.root = vb;
        this.model = model;

        initTitreFormulaire();
        initLogin();
        initMdp();
        initNom();
        initPrenom();
        initAdresse();
        initCodePostale();
        initVille();
        initAdresseEmail();
        initButtonValider();

        initLoginLabel();
        initMdpLabel();
        initNomLabel();
        initPrenomLabel();
        initAdresseLabel();
        initCodePostaleLabel();
        initVilleLabel();
        initAdresseEmailLabel();


        setVueCompleteInscription();

        //  initListeImage();
        // initVaisseauxCoin();
     //   setVueCompleteMenu();

    }

    private void initLoginLabel() {
        loginLabel = new Label("Login");
        loginLabel .setFont(Font.font("Amble CN", 15));
    }

    private void initMdpLabel() {
        mdpLabel = new Label("Mots de passe");
        mdpLabel.setFont(Font.font("Amble CN",15));
    }

    private void initNomLabel() {
        nomLabel = new Label("Nom");
        nomLabel.setFont(Font.font("Amble CN", 15));
    }

    private void initPrenomLabel() {
        prenomLabel = new Label("Prenom");
        prenomLabel.setFont(Font.font("Amble CN", 15));
    }

    private void initAdresseLabel() {
        adresseLabel = new Label("Adresse");
        adresseLabel.setFont(Font.font("Amble CN", 15));
    }

    private void initCodePostaleLabel() {
        codePostaleLabel = new Label("Code Postale");
        codePostaleLabel.setFont(Font.font("Amble CN", 15));
    }

    private void initVilleLabel() {
        villeLabel = new Label("Ville");
        villeLabel.setFont(Font.font("Amble CN", 15));
    }

    private void initAdresseEmailLabel() {
        adresseEmailLabel = new Label("Adresse Email");
        adresseEmailLabel.setFont(Font.font("Amble CN",15));
    }


    private void initTitreFormulaire() {
        titreFormulaire = new Label("Formulaire d'inscription");
        titreFormulaire.setFont(Font.font("Amble CN", FontWeight.BOLD, 24));
    }


    private void initLogin() {
        login = new TextField("");
        login.setMinWidth(120);
    }

    private void initMdp() {
        mdp = new TextField("");
        mdp.setMinWidth(120);
    }

    private void initNom() {
        nom = new TextField("");
        nom.setMinWidth(120);

    }

    private void initPrenom() {
        prenom = new TextField("");
        prenom.setMinWidth(120);

    }

    private void initAdresse() {
        adresse = new TextField("");
        adresse.setMinWidth(120);

    }

    private void initCodePostale() {

        codePostale = new TextField("");
        codePostale.setMinWidth(120);

    }

    private void initVille() {
        ville = new TextField("");
        ville.setMinWidth(120);
    }

    private void initAdresseEmail() {
        adresseEmail = new TextField("");
        adresseEmail.setMinWidth(120);
    }

    private void initButtonValider() {

        buttonValider = new Button();
        buttonValider.setText("Vous inscrire maintenant");


    }

    public void setVueCompleteInscription() {
        root.getChildren().clear();
        root.getChildren().add(titreFormulaire);

        root.getChildren().add(loginLabel);
        root.getChildren().add(login);

        root.getChildren().add(mdpLabel);
        root.getChildren().add(mdp);

        root.getChildren().add(nomLabel);
        root.getChildren().add(nom);

        root.getChildren().add(prenomLabel);
        root.getChildren().add(prenom);

        root.getChildren().add(adresseLabel);
        root.getChildren().add(adresse);

        root.getChildren().add(codePostaleLabel);
        root.getChildren().add(codePostale);

        root.getChildren().add(villeLabel);
        root.getChildren().add(ville);

        root.getChildren().add(adresseEmailLabel);
        root.getChildren().add(adresseEmail);


        root.getChildren().add(buttonValider);
    }

    public void setEvents(Controler inscr) {
        buttonValider.setOnMouseClicked(inscr);

    }




    public Button getButtonValider() {
        return buttonValider;
    }

}
