
public class Sundae extends Sorvete {
	
	private int precoDaCalda;
	private int custoSorvete;
	public int custo;
	
	//
	
	public void setPrecoDaCalda(int precoDaCalda) {
        System.out.printf("Digite o preço da calda: ", precoDaCalda);
        this.precoDaCalda = (int) precoDaCalda;
    }

    public int getPrecoDaCalda() {
        return precoDaCalda;
    }
	
    //
    
    public void setCustoSorvete(int custoSorvete) {
        System.out.printf("Digite o preço do sorvete: ", custoSorvete);
        this.custoSorvete = (int) custoSorvete;
    }

    public int getCustoSorvete() {
        return custoSorvete;
    }
	
    //
    
	public void setCusto(int custo) {
        custo = custoSorvete + precoDaCalda;
        int imposto;
    	imposto = custo / 100 * 2;
    	custo = custo + imposto;
        this.custo = (int) custo;
    }
	
	@Override
	public int getCusto() {
		
		return 0;
	}
	
	@Override
	public String toString() {
	  return String.format("Sundae de %s com\n%-25s %6s", getPrecoDaCalda(), 
	    getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}
	
}
