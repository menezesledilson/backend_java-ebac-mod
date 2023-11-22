package Facade;

public class ApartamentoService implements IApartamentoService {
    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado = isPartamentoCadastrado(apartamento);
        Boolean isCamposvalidos = isPartamentoCadastrado(apartamento);
        if (isCadastrado && !isCamposvalidos) {
            return false;
        }
        return cadastrarNoBanco(apartamento);

    }

    private Boolean cadastrarNoBanco(Apartamento apartamento) {
       //lógica de cadastro
        return true;
    }

    private Boolean isPartamentoCadastrado(Apartamento apartamento) {
        //Ir no banco de dados e verifica se esta casdatrado
        return null;
    }

    private Boolean isCamposvalidos(Apartamento apartamento) {
        return true;
    }
}
