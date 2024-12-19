package ecommerce.respository;

import ecommerce.model.Ecommerce;

public interface EcommerceRepository {
		public void buscarPorID(int id);
		public void listagemCompleta();
		public void cadastrar (Ecommerce titulo);
		public void atualizar (Ecommerce titulo);
		public void deletar (int id);
		
		public void comprar (int id, float preco);
		public void alugar (int id, float taxa);
}
