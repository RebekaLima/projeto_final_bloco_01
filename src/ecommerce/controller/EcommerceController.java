package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Ecommerce;
import ecommerce.respository.EcommerceRepository;

public class EcommerceController implements EcommerceRepository {

	private ArrayList<Ecommerce> listagemCompleta = new ArrayList<Ecommerce>();
	int numero = 0;
	
	@Override
	public void buscarPorID(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listagemCompleta() {
		for (var titulo : listagemCompleta) {
			titulo.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Ecommerce titulo) {
		listagemCompleta.add(titulo);
		System.out.println("\nO livro: " + titulo.getTitulo() + " Foi cadastrado com sucesso!");
		
	}

	@Override
	public void atualizar(Ecommerce titulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprar(int id, float preco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alugar(int id, float taxa) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarid() {
		return ++ numero;
	}
}
