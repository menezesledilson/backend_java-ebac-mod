/**
 * 
 */
package br.com.pires;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.pires.dao.CursoDao;
import br.com.pires.dao.ICursoDao;
import br.com.prires.domain.Curso;

/**
 * 
 */
public class CursoTest {

	private ICursoDao cursoDao;

	public CursoTest() {
		cursoDao = new CursoDao();
	}

	@Test
	public void cadastrar() {
		Curso curso = new Curso();
		curso.setCodigo("A1");
		curso.setDescricao("Curso TESTE");
		curso.setNome("Curos de Java backend");

		cursoDao.cadastrar(curso);

		assertNotNull(curso);
		assertNotNull(curso.getId());

	}

}
