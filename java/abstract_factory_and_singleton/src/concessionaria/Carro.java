package concessionaria;

public interface Carro {
	/**
	 *Retorna os todos os valores do obejto
	 *
	 *@return String
	 */
	default public String getValues(){
		return "Tabela fip do carro é: "+this.tabelaFipCarro()+"\n"
				+ "Informações adicionais: "+ this.getInfo();
	};
	public float tabelaFipCarro() ;
	public String getInfo();
}
