
public class Sorvete extends ItemSobremesa {

	public int custo;
	
	public void setCusto(int custo) {
        System.out.printf("Digite o custo do sorvete: ", custo);
        int imposto;
    	imposto = custo / 100 * 2;
    	custo = custo + imposto;
        this.custo = (int) custo;
    }
	
	@Override
	public int getCusto() {
		
		return custo;
	}
	
	@Override
	public String toString() {
	  return String.format("%-25s %6s", getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}

}
