package exceptions;

public class ClienteDAO {

    public static void consultarCliente(String codigo) throws ClienteNaoEncontradoExcepetion{

        //Buscar no banco
        boolean isCadastro = false;

        if(!isCadastro){
            throw new ClienteNaoEncontradoExcepetion("Cliente não foi  encontrado");
        }
    }
}
