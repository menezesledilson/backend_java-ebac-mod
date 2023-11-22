package dao;

import model.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private static final String URL = "jdbc:postgresql://localhost:5432/clientesdb";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "admin";

    // Método para estabelecer a conexão com o banco de dados
    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }

    // Métodos CRUD
    public void adicionarCliente(Cliente cliente) {
        // Implemente a lógica para adicionar um cliente ao banco de dados
        try (Connection conn = conectar();
             PreparedStatement pst = conn.prepareStatement("INSERT INTO clientes (nome, email) VALUES (?, ?)")) {

            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEmail());
            pst.executeUpdate();  // Execute a inserção no banco de dados
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Cliente obterCliente(int clienteId) {
        try (Connection conn = conectar();
             PreparedStatement pst = conn.prepareStatement("SELECT * FROM clientes WHERE id = ?")) {

            pst.setInt(1, clienteId);

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setId(rs.getInt("id"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setEmail(rs.getString("email"));
                    return cliente;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();

        try (Connection conn = conectar();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM clientes")) {

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientes;
    }

    public void atualizarCliente(Cliente cliente) {
        try (Connection conn = conectar();
             PreparedStatement pst = conn.prepareStatement("UPDATE clientes SET nome = ?, email = ? WHERE id = ?")) {

            pst.setString(1, cliente.getNome());
            pst.setString(2, cliente.getEmail());
            pst.setInt(3, cliente.getId());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirCliente(int clienteId) {
        try (Connection conn = conectar();
             PreparedStatement pst = conn.prepareStatement("DELETE FROM clientes WHERE id = ?")) {

            pst.setInt(1, clienteId);

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
