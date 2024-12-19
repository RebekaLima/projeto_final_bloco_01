package ecommerce.model;

public class EcommerceLivroCompravel extends Ecommerce{
	
	private float preco;
	private int estoque;

	public EcommerceLivroCompravel(String titulo, int id, int tipo, String autor) {
		super(titulo, id, tipo, autor);
		this.preco = preco;
		this.estoque = estoque;

	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float f) {
		this.preco = f;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public boolean podeComprar() {
        return estoque > 0;
    }

    @Override
    public String toString() {
    	if (estoque > 0) {
            return super.toString() + ", Preço: " + preco + ", Estoque: " + estoque;
        } else {
            return super.toString() + ", Preço: " + preco + ", Estoque: Indisponível no momento";
        }
    }

	@Override
	public void visualizar() {
		// TODO Auto-generated method stub
		
	}
}
			
