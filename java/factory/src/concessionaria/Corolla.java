package concessionaria;

public class Corolla implements Carro {
	
	public static String modelo = "Corolla";
	
	@Override
	public float tabelaFipCarro() {
		// TODO Auto-generated method stub
		return 60000.00f;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "Carro de veio, obs.: o pai tem logo pai é veio";
	}

}
