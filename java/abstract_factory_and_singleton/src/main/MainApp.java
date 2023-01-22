package main;

import concessionaria.Carro;
import enums.CarEnums;
import factory.FactoryCar;
import factory.FactoryCarNew;
import factory.FactoryCarOld;

public class MainApp {
	public static void main(String args[]) {
		Carro c = FactoryCarOld.getInstance().getFactoryCar(CarEnums.FUSCA);
		System.out.println(c.getValues());
		c = FactoryCarNew.getInstance().getFactoryCar(CarEnums.CIVIC);
		System.out.println(c.getValues());
		c = FactoryCarNew.getInstance().getFactoryCar(CarEnums.CORROLA);
		System.out.println(c.getValues());
	}
}
