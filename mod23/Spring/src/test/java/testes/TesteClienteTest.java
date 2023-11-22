package testes;

import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {

	@Test
	public void testeClasseCliente() {
		testeCliente cli = new testeCliente();
		cli.adicionarNome("Rodrigo");
		
		Assert.assertEquals("Rodrigo", cli.getNome());
				
		
	}
}
