package fiuba.algo3.algoFormers.vista.botones.personajes;

import fiuba.algo3.algoFormers.modelo.juego.Juego;

public class BotonRatchet extends BotonPersonaje {

	private final static String imagen = "file:src/fiuba/algo3/algoFormers/vista/imagenes/Ratchet.png";	
	
	public BotonRatchet(Juego juego){
		super(juego, imagen, 60, 60,juego.getAlgoformer("Ratchet"));
	}
}