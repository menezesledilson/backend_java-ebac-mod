package Controller;

import dao.ClienteDAO;
import model.Cliente;

import java.util.List;

public class ClienteController {
    private ClienteDAO clienteDAO;

    public ClienteController() {
        this.clienteDAO = new ClienteDAO();
    }

    public void adicionarCliente(Cliente cliente) {
        clienteDAO.adicionarCliente(cliente);
    }

    public Cliente obterCliente(int id) {
        return clienteDAO.obterCliente( id);
    }
    public void atualizarCliente(Cliente cliente) {
        clienteDAO.atualizarCliente(cliente);
    }

    public Object excluirCliente(int id) {
        clienteDAO.excluirCliente(id);
        return null;
    }

    public List<Cliente> listarClientes() {
        return clienteDAO.listarClientes();
    }

}

