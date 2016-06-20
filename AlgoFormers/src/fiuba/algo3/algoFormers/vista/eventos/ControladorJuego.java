package fiuba.algo3.algoFormers.vista.eventos;

import fiuba.algo3.algoFormers.modelo.juego.Juego;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

public class ControladorJuego {

	private Juego juego;
	
    @FXML
    private Button Mover;

    @FXML
    private Button Atacar;

    @FXML
    void FinalzarTurno(ActionEvent event) {

    }

    @FXML
    void atacar(ActionEvent event) {

    }

	public void initData(Juego juego) {
		this.juego = juego;
		
	}

	public void setMoverBackground() {
		ImageView imagen = new ImageView(new Image("file:src/fiuba/algo3/algoFormers/vista/imagenes/2704.jpg"));
		imagen.setFitWidth(70);
		imagen.setFitHeight(30);
		Mover.setGraphic(imagen);
		
	}

}
