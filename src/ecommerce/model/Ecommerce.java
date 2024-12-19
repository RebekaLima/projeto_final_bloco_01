package ecommerce.model;

public abstract class Ecommerce {
		
		private String titulo;
		private int id;
		private String autor;
		private int ano;
		private int tipo;
		
		public Ecommerce(String titulo, int id, int tipo, String autor) {
			this.titulo = titulo;
			this.id = id;
			this.autor = autor;
			this.tipo = tipo;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public int getTipo() {
			return tipo;
		}

		public void setTipo(int tipo) {
			this.tipo = tipo;
		}
		
		public String verificarTipoLivro() {
		    if (this.tipo == 1) {
		        return "Livro Comprável";
		    } else if (this.tipo == 2) {
		        return "Livro Alugável";
		    } else {
		        return "Tipo desconhecido.  :/";
		    }
		}

		public abstract void visualizar();
}