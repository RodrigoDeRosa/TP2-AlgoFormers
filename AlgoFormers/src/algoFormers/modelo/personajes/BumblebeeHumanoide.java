package algoFormers.modelo.personajes;

public class BumblebeeHumanoide implements Estado{

	private static BumblebeeHumanoide instancia = null;
	
	private BumblebeeHumanoide(){
	}
	
	public static BumblebeeHumanoide getInstance(){
		if (instancia == null){
			instancia = new BumblebeeHumanoide();
		}
		return instancia;
	}
	
	public Estado getInstanceEstadoOpuesto(){
		return BumblebeeAlterno.getInstance();
	}
}
