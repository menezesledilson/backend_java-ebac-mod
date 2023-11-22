package br.com.pires;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import br.com.pires.dao.AlunoDao;
import br.com.pires.dao.ComputadorDao;
import br.com.pires.dao.CursoDao;
import br.com.pires.dao.IAlunoDao;
import br.com.pires.dao.IComputadorDao;
import br.com.pires.dao.ICursoDao;
import br.com.pires.dao.IMatriculaDao;
import br.com.pires.dao.MatriculaDao;
import br.com.prires.domain.Aluno;
import br.com.prires.domain.Computador;
import br.com.prires.domain.Curso;
import br.com.prires.domain.Matricula;

public class MatriculaTest {

	private IMatriculaDao matriculaDao;

	private ICursoDao cursoDao;

	private IAlunoDao alunoDao;
	
	private IComputadorDao computadorDao;

	public MatriculaTest() {

		matriculaDao = new MatriculaDao();
		cursoDao = new CursoDao();
		alunoDao = new AlunoDao();
		computadorDao = new ComputadorDao();

	}

	@Test
	public void cadastrar() {
		Curso curso = criarCurso("A1");
		Aluno aluno = criaAluno("A1");
		
		Matricula matricula = new Matricula();
		
		matricula.setCodigo("A1");
		matricula.setDataMatricula(Instant.now());
		matricula.setStatus("ATIVA");
		matricula.setValor(2000d);
		matricula.setCurso(curso);
		matricula.setAluno(aluno);
		
		
		aluno.setMatricula(matricula);
		matricula = matriculaDao.cadastrar(matricula);

		assertNotNull(matricula);
		assertNotNull(matricula.getId());

	}

	private Computador criarComputador(String codigo) {
		Computador comp = new Computador();
		comp.setCodigo(codigo);
		comp.setDescricao("Comp 1");
		return comp;
		//return computadorDao.cadastrar(comp);
	}

	private Aluno criaAluno(String codigo) {
		
		Computador comp = criarComputador("A1");
	//	Computador comp2 = criarComputador("A1");
		
		Aluno aluno = new Aluno();
		aluno.setCodigo(codigo);

		aluno.setNome("Rodrigo");
		aluno.add(comp);
		//aluno.add(comp2);
		return alunoDao.cadastrar (aluno);
	}

	private Curso criarCurso(String codigo) {
		Curso curso = new Curso();
		curso.setCodigo(codigo);
		curso.setDescricao("Curso TESTE");
		curso.setNome("Curos de Java backend");

		return cursoDao.cadastrar(curso);
	}
}
