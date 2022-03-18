package entities;

public class PessoaFisica extends Contribuinte{
	
	private Double gastosComSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double imposto() {
		double renda = getRendaAnual();
		if(renda <= 2000) {
			return((renda * 15)/100)- (gastosComSaude/2);
		}else {
			return((renda * 25)/100)- (gastosComSaude/2);
		}
		
	}
	

}
