package main;

import concessionaria.Carro;
import enums.CarEnums;
import factory.FactoryCar;

public class MainApp {
	public static void main(String args[]) {
		Carro c = FactoryCar.getFactoryCar(CarEnums.FUSCA);
		System.out.println(c.getValues());
		c = FactoryCar.getFactoryCar(CarEnums.CIVIC);
		System.out.println(c.getValues());
		c = FactoryCar.getFactoryCar(CarEnums.CORROLA);
		System.out.println(c.getValues());
	}
}
