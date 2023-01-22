package factory;

import concessionaria.Carro;
import concessionaria.Civic;
import concessionaria.Corolla;
import enums.CarEnums;

public class FactoryCarNew extends FactoryCar{
	
	private static FactoryCarNew instance = null;
	
	public FactoryCarNew() {
		//content
	}
	
	public static FactoryCarNew getInstance() {
		if (instance == null) {
			instance = new FactoryCarNew();
		}
		return instance;
	}
	
	@Override
	public Carro getFactoryCar(CarEnums car){
		switch (car) {
		case CORROLA:
			return new Corolla();
		case CIVIC:
			return new Civic();
		default:
			return null;
		}
	}
}
