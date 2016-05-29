package fiuba.algo3.algoFormers.modelo.fabricas;

import fiuba.algo3.algoFormers.modelo.personajes.AutoBot;
import fiuba.algo3.algoFormers.modelo.personajes.Decepticon;
import fiuba.algo3.algoFormers.modelo.personajes.estadosDeTransformacion.Alterno;
import fiuba.algo3.algoFormers.modelo.personajes.estadosDeTransformacion.AlternoAereo;
import fiuba.algo3.algoFormers.modelo.personajes.estadosDeTransformacion.AlternoTerrestre;

public class AlgoformerFactory {
	
	//Constantes de Vida
	private int VIDA_OPTIMUS = 500;
	private int VIDA_BUMBLEBEE = 350;
	private int VIDA_RATCHET = 150;
	//Constantes de Velocidad
	private int VELOCIDAD_HUM_OPTIMUS = 2;
	private int VELOCIDAD_ALT_OPTIMUS = 5;
	private int VELOCIDAD_HUM_BUMBLEBEE = 2;
	private int VELOCIDAD_ALT_BUMBLEBEE = 5;
	private int VELOCIDAD_HUM_RATCHET = 1;
	private int VELOCIDAD_ALT_RATCHET = 8;
	//Constantes de ataque
	private int ATAQUE_HUM_OPTIMUS = 50;
	private int ATAQUE_ALT_OPTIMUS = 15;
	private int ATAQUE_HUM_BUMBLEBEE = 40;
	private int ATAQUE_ALT_BUMBLEBEE = 20;
	private int ATAQUE_HUM_RATCHET = 5;
	private int ATAQUE_ALT_RATCHET = 35;
	//Constantes de DistanciaDeAtaque
	private int DIST_ATAQUE_HUM_OPTIMUS = 2;
	private int DIST_ATAQUE_ALT_OPTIMUS = 4;
	private int DIST_ATAQUE_HUM_BUMBLEBEE = 1;
	private int DIST_ATAQUE_ALT_BUMBLEBEE = 3;
	private int DIST_ATAQUE_HUM_RATCHET = 5;
	private int DIST_ATAQUE_ALT_RATCHET = 2;
	
	//Constantes de vida
	private int VIDA_MEGATRON = 550;
	private int VIDA_FRENZY = 400;
	private int VIDA_BONECRUSHER = 200;
	//Constantes de velocidad
	private int VELOCIDAD_HUM_MEGATRON = 1;
	private int VELOCIDAD_ALT_MEGATRON = 8;
	private int VELOCIDAD_HUM_FRENZY = 2;
	private int VELOCIDAD_ALT_FRENZY = 6;
	private int VELOCIDAD_HUM_BONECRUSHER = 1;
	private int VELOCIDAD_ALT_BONECRUSHER = 8;
	//Constantes de ataque
	private int ATAQUE_HUM_MEGATRON = 10;
	private int ATAQUE_ALT_MEGATRON = 55;
	private int ATAQUE_HUM_FRENZY = 10;
	private int ATAQUE_ALT_FRENZY = 25;
	private int ATAQUE_HUM_BONECRUSHER = 30;
	private int ATAQUE_ALT_BONECRUSHER = 30;
	//Constantes de distancia de ataque
	private int DIST_ATAQUE_HUM_MEGATRON = 3;
	private int DIST_ATAQUE_ALT_MEGATRON = 2;
	private int DIST_ATAQUE_HUM_FRENZY = 5;
	private int DIST_ATAQUE_ALT_FRENZY = 2;
	private int DIST_ATAQUE_HUM_BONECRUSHER = 3;
	private int DIST_ATAQUE_ALT_BONECRUSHER = 3;
	
	private Decepticon crearDecepticon(int vida, Alterno alterno, int velocidadH, int ataqueH, int distAtaqueH){
		return new Decepticon(vida, alterno, velocidadH, ataqueH, distAtaqueH);
	}
	
	private AutoBot crearAutoBot(int vida, Alterno alterno, int velocidadH, int ataqueH, int distAtaqueH){
		return new AutoBot(vida, alterno, velocidadH, ataqueH, distAtaqueH);
	}
	
	public Decepticon getMegatron(){
		Alterno jetCibertroniano = new AlternoAereo(VELOCIDAD_ALT_MEGATRON, ATAQUE_ALT_MEGATRON, DIST_ATAQUE_ALT_MEGATRON);
		return this.crearDecepticon(VIDA_MEGATRON, jetCibertroniano, VELOCIDAD_HUM_MEGATRON, ATAQUE_HUM_MEGATRON, DIST_ATAQUE_HUM_MEGATRON);
	}
	
	public Decepticon getFrenzy(){
		Alterno buffaloHMPCV = new AlternoTerrestre(VELOCIDAD_ALT_FRENZY, ATAQUE_ALT_FRENZY, DIST_ATAQUE_ALT_FRENZY);
		return this.crearDecepticon(VIDA_FRENZY, buffaloHMPCV, VELOCIDAD_HUM_FRENZY, ATAQUE_HUM_FRENZY, DIST_ATAQUE_HUM_FRENZY);
	}
	
	public Decepticon getBonecrusher(){
		Alterno duster = new AlternoTerrestre(VELOCIDAD_ALT_BONECRUSHER, ATAQUE_ALT_BONECRUSHER, DIST_ATAQUE_ALT_BONECRUSHER);
		return this.crearDecepticon(VIDA_BONECRUSHER, duster, VELOCIDAD_HUM_BONECRUSHER, ATAQUE_HUM_BONECRUSHER, DIST_ATAQUE_HUM_BONECRUSHER);
	}
	
	public AutoBot getOptimusPrime(){
		Alterno peterbilt379 = new AlternoTerrestre(VELOCIDAD_ALT_OPTIMUS, ATAQUE_ALT_OPTIMUS, DIST_ATAQUE_ALT_OPTIMUS);
		return this.crearAutoBot(VIDA_OPTIMUS, peterbilt379, VELOCIDAD_HUM_OPTIMUS, ATAQUE_HUM_OPTIMUS, DIST_ATAQUE_HUM_OPTIMUS);
	}
	
	public AutoBot getBumblebee(){
		Alterno camaro = new AlternoTerrestre(VELOCIDAD_ALT_BUMBLEBEE, ATAQUE_ALT_BUMBLEBEE, DIST_ATAQUE_ALT_BUMBLEBEE);
		return this.crearAutoBot(VIDA_BUMBLEBEE, camaro, VELOCIDAD_HUM_BUMBLEBEE, ATAQUE_HUM_BUMBLEBEE, DIST_ATAQUE_HUM_BUMBLEBEE);
	}
	
	public AutoBot getRatchet(){
		Alterno f22raptor = new AlternoAereo(VELOCIDAD_ALT_RATCHET, ATAQUE_ALT_RATCHET, DIST_ATAQUE_ALT_RATCHET);
		return this.crearAutoBot(VIDA_RATCHET, f22raptor, VELOCIDAD_HUM_RATCHET, ATAQUE_HUM_RATCHET, DIST_ATAQUE_HUM_RATCHET);
	}
	
}
