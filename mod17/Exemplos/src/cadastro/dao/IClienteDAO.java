package cadastro.dao;

import cadastro.dao.generic.IGenericDAO;
import cadastro.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 * Interface que representa os dados de Cliente
 */
public interface IClienteDAO extends IGenericDAO<Cliente> {
    Class<Cliente> getTipoClasse();

//    public Boolean cadastrar(Cliente cliente);
//
//    public void excluir(Long cpf);
//
//    public void alterar(Cliente cliente);
//
//    public Cliente consultar(Long cpf);
//
//    public Collection<Cliente> buscarTodos();
}