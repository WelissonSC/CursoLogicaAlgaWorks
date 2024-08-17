package algoritimoavancado;

public class AlgoritimoAvancado {

	public static void main(String[] args) {
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		lista.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Maria";
		lista.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Welisson";
		lista.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Alex";
		lista.adicionar(aluno4);
		
		Aluno aluno5 = new Aluno();
		aluno5.nome = "Norma";
		lista.adicionar(aluno5);
		
		Aluno aluno6 = new Aluno();
		aluno6.nome = "Thiago";
		lista.adicionar(aluno6);
		
		lista.imprimeLista(lista);
		
		System.out.println("---------------------------------------------");
		
		lista.remove(aluno3);
		
		lista.imprimeLista(lista);
		
	}

}
