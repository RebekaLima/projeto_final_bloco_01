package ecommerce.model;

public class EcommerceLivroAlugavel extends Ecommerce{
	
	private float taxa;
	private int dias;

	public EcommerceLivroAlugavel(String titulo, int id, String autor, int ano, int tipo) {
		super(titulo, id, autor, ano, tipo);
		this.taxa = taxa;
		this.dias = dias;

	}
	
	public float getTaxaAluguel() {
        return taxa;
    }

    public void setTaxaAluguel(float taxaAluguel) {
        this.taxa = taxa;
    }

    public int getDuracaoDias() {
        return dias;
    }

    public void setDuracaoDias(int duracaoDias) {
        this.dias = duracaoDias;
    }

    public float calcularCustoAluguel() {
        return taxa * dias;
    }

    @Override
    public String toString() {
        return super.toString() + ", Taxa de Aluguel: " + taxa + ", Duração: " + dias + " dias";
    }
}