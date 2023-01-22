package factory;

import concessionaria.Carro;
import concessionaria.Fusca;
import enums.CarEnums;

public class FactoryCarOld extends FactoryCar{
	
	private static FactoryCarOld instance = null;
	
	public FactoryCarOld() {
		//content
	}
	
	public static FactoryCarOld getInstance() {
		if (instance == null) {
			instance = new FactoryCarOld();
		}
		return instance;
	}
	public Carro getFactoryCar(CarEnums car){
		switch (car) {
		case FUSCA:
			return new Fusca();
		default:
			return null;
		}
	}
}
