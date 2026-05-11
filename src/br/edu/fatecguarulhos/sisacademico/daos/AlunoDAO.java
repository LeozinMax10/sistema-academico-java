package br.edu.fatecguarulhos.sisacademico.daos;

import br.edu.fatecguarulhos.sisacademico.models.Aluno;

public class AlunoDAO {
	
	public void deletarAluno(Aluno aluno) {
		deletarNotas();
	}
	private void deletarNotas() {}
}
