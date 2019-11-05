package Controler;

import View.ViewHandler;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.input.MouseEvent;

public class Controler implements EventHandler<MouseEvent> {

    private ViewHandler viewHandler;
    private Menu model;

    public Controler(ViewHandler viewHandler, Menu model) {
        this.model = model;
        this.viewHandler = viewHandler;
        this.viewHandler.setEventHandlerInscription(this);

    }


    @Override
    public void handle(MouseEvent mouseEvent) {

        if (mouseEvent.getSource().equals(viewHandler.getMi().getButtonValider())) {

            viewHandler.afficherConnexion();
            // viewHandler.getMp().setRandomColorForTitle();
        }


    }
}