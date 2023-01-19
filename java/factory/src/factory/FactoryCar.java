package factory;

import concessionaria.Carro;
import concessionaria.Civic;
import concessionaria.Corolla;
import concessionaria.Fusca;
import enums.CarEnums;

public class FactoryCar {
	public static Carro getFactoryCar(CarEnums car){
		switch (car) {
		case CORROLA:
			return new Fusca();
		case CIVIC:
			return new Civic();
		case FUSCA:
			return new Corolla();
		default:
			return null;
		}
	}
}
