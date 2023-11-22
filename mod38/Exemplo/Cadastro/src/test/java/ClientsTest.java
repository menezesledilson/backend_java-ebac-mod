import Controller.ClienteController;
import model.Cliente;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class ClientsTest {
//   @Test
//    public void testAdicionarListarClientes() {
//        ClienteController clienteController = new ClienteController();
//
//        // Teste de adição de cliente
//        Cliente novoCliente = new Cliente();
//        novoCliente.setNome("Sales");
//        novoCliente.setEmail("Sales@example.com");
//
//        clienteController.adicionarCliente(novoCliente);
//
//        // Teste de listagem de clientes
//        List<Cliente> clientes = clienteController.listarClientes();
//
//        // Verifique se o cliente adicionado está na lista
//        boolean clienteEncontrado = false;
//        for (Cliente cliente : clientes) {
//            if (cliente.getNome().equals("Sales") && cliente.getEmail().equals("Sales@example.com")) {
//                clienteEncontrado = true;
//                break;
//            }
//        }
//        assertTrue(clienteEncontrado);
//    }
//
//    @Test
//    public void testAtualizarCliente() {
//        ClienteController clienteController = new ClienteController();
//
//        // Adicione um cliente para atualização
//        Cliente clienteParaAtualizar = new Cliente();
//        clienteParaAtualizar.setNome("Carlos");
//        clienteParaAtualizar.setEmail("Carlos@example.com");
//        clienteController.adicionarCliente(clienteParaAtualizar);
//
//        // Inserir o id do cliente adicionado
//        clienteParaAtualizar = clienteController.obterCliente(9);
//
//        // Atualize o nome e o e-mail do cliente
//        if (clienteParaAtualizar != null) {
//            clienteParaAtualizar.setNome("Carlos");
//            clienteParaAtualizar.setEmail("Carlos@example.com");
//            clienteController.atualizarCliente(clienteParaAtualizar);
//        }
//
//        // Verifique se o cliente foi atualizado corretamente
//        Cliente clienteAtualizado = clienteController.obterCliente(9);
//        assertNotNull(clienteAtualizado);
//        assertEquals("Carlos", clienteAtualizado.getNome());
//        assertEquals("Carlos@example.com", clienteAtualizado.getEmail());
//    }

//    @Test
//    public void testExcluirCliente() {
//        ClienteController clienteController = new ClienteController();
//
//        // Adicione um cliente para exclusão
//        Cliente clienteParaExcluir = new Cliente();
//        clienteParaExcluir.setNome("Rei");
//        clienteParaExcluir.setEmail("Rei@example.com");
//        clienteController.adicionarCliente(clienteParaExcluir);
//
//        //Excluir o cliente
//        clienteController.excluirCliente(14);
//
//        //Verifique se o cliente foi excluído
//        assertNull(clienteController.excluirCliente(24));
//    }
}
