package primeiro_programa;

import primeiro_programa.model.Gato;

public class Primeiro_Programa {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livro = new Livros();
		System.out.println(gato);
		System.out.println(livros);
	}
	
}
class Livros {
	
	private String nome;
	private String npag;
}