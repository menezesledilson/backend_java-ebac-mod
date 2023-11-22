package App;

import Controller.ClienteController;
import model.Cliente;

import java.util.List;

import java.util.List;

public class AppClients {
    public static void main(String[] args) {
        // Criar instância do ClienteController
        ClienteController clienteController = new ClienteController();
        try {
            // adição de cliente
            Cliente novoCliente = new Cliente();
            novoCliente.setNome("Ramires");
            novoCliente.setEmail("Ramires@example.com");

            clienteController.adicionarCliente(novoCliente);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Teste de listagem de clientes
        List<Cliente> clientes = clienteController.listarClientes();
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome() + " - " + cliente.getEmail());
        }
//
        // Teste de atualização de cliente
        Cliente clienteParaAtualizar = clienteController.obterCliente(43);
        if (clienteParaAtualizar != null) {
            clienteParaAtualizar.setNome("Saulo");
            clienteParaAtualizar.setEmail("Saulo@example.com");
            clienteController.atualizarCliente(clienteParaAtualizar);
        }

        // Teste de exclusão de cliente
        clienteController.excluirCliente(2);
    }
}
