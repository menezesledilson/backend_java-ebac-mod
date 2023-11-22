package exceptions;

public class ClienteService {
    public static void consultarCliente(String codigo) throws ClienteNaoEncontrado2Exception {

       try {
           ClienteDAO.consultarCliente(codigo);
       } catch (ClienteNaoEncontradoExcepetion e){
            throw new ClienteNaoEncontrado2Exception(e.getMessage(), e);
       }
    }
}
