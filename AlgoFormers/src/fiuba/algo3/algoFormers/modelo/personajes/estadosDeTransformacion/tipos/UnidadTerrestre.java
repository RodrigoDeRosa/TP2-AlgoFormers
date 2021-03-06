package fiuba.algo3.algoFormers.modelo.personajes.estadosDeTransformacion.tipos;

import fiuba.algo3.algoFormers.modelo.mapa.superficies.SuperficieAerea;
import fiuba.algo3.algoFormers.modelo.mapa.superficies.SuperficieTerrestre;
import fiuba.algo3.algoFormers.modelo.personajes.AlgoFormer;

public class UnidadTerrestre extends TipoDeUnidad{

	@Override
	public void afectarConSuperficie(SuperficieTerrestre superficie, AlgoFormer algoformer) {
		superficie.aplicarEfecto(algoformer);
	}

	@Override
	public void afectarConSuperficie(SuperficieAerea superficie, AlgoFormer algoformer) {
	}

}
