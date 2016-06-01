package fiuba.algo3.algoFormers.modelo.mapa.superficies;

import fiuba.algo3.algoFormers.modelo.interfaces.Atacable;

public abstract class SuperficieTerrestre extends Superficie{

	public SuperficieTerrestre(){
		super();
	}
	
	public void afectar(Atacable atacable){
		atacable.afectarseConSuperficie(this);
	}
	
}