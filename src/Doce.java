
public class Doce extends ItemSobremesa {

	private int peso;
	private int precoPorQuilo;
	public int custo;
	
	//
	
	public void setPeso(double peso) {
        System.out.printf("Digite o peso da compra: ", peso);
        this.peso = (int) peso;
    }

    public int getPeso() {
        return peso;
    }
    
    //
	
	public void setPrecoPorQuilo(double precoPorQuilo) {
        System.out.printf("Digite o preco por quilo do doce: ", precoPorQuilo);
        this.precoPorQuilo = (int) precoPorQuilo;
    }

    public int getPrecoPorQuilo() {
        return precoPorQuilo;
    }
    
    //
	
    public void setCusto() {
    	custo = peso * precoPorQuilo;
    	int imposto;
    	imposto = custo / 100 * 2;
    	custo = custo + imposto;
    }
    
	@Override
	public int getCusto() {
		
		return custo;
	}
	
	@Override
	public String toString() {
	  return String.format("%.2f g @ %s /kg\n%-25s %6s", getPeso(), 
	    Sorveteria.centavos2ReaisECentavos(precoPorQuilo), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}

}
