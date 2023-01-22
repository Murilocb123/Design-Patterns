package factory;

import concessionaria.Carro;
import enums.CarEnums;

public abstract class FactoryCar {
	
	public abstract Carro getFactoryCar(CarEnums car);
}
