package cadastro.dao;

import cadastro.dao.generic.IGenericDAO;
import cadastro.domain.Produto;

/**
 * @author rodrigo.pires
 *
 * Interface que representa os dados de Produto
 */
public interface IProdutoDAO extends IGenericDAO<Produto> {

    Class<Produto> getTipoClasse();

    void atualiarDados(Produto entity, Produto entityCadastrado);
}