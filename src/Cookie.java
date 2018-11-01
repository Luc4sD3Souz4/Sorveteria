
public class Cookie extends ItemSobremesa {

	private int numero;
	private int precoPorDuzia;
	public int custo;
	
	//
	
	public void setNumero(double numero) {
        System.out.printf("Digite o número de cookies: ", numero);
        this.numero = (int) numero;
    }

    public int getNumero() {
        return numero;
    }
    
    public void setPrecoPorDuzia(double precoPorDuzia) {
        System.out.printf("Digite o preço da duzia: ", precoPorDuzia);
        this.precoPorDuzia = (int) precoPorDuzia;
    }

    public int getPrecoPorDuzia() {
        return precoPorDuzia;
    }
	
    public void setCusto() {
    	custo = numero / 12 * precoPorDuzia;
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
	  return String.format("%d @ %s /dz\n%-25s %6s", getNumero(), 
	    Sorveteria.centavos2ReaisECentavos(getPrecoPorDuzia()), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}

}
