package abstratas;

public class Programa {

    public static void main(String args[]) {

        assalariado empregado = new assalariado();

        empregado.setCpf("1");

        empregado.setNome("Ana");

        empregado.setSobreNome("Perez");

        empregado.setSalario(100d);

        imprimir(empregado);


        Comissionado comissionado = new Comissionado();

        comissionado.setCpf("2");

        comissionado.setNome("Ana2");

        comissionado.setSobreNome("Perez2");

        comissionado.setTotalVenda(2000d);

        comissionado.setTotalComissao(0.1d);

        imprimir(comissionado);

        horista Horista = new horista();

        Horista.setCpf("13");

        Horista.setNome("Ana13");

        Horista.setSobreNome("Perez13");

        Horista.setPrecoHora(100d);

        Horista.setHorasTrabalhadas(60d);
        imprimir(Horista);
    }

    public static void imprimir(Empregado empregado) {
        if (empregado instanceof horista) {
            horista hor = (horista) empregado;
            System.out.println(hor.getPrecoHora());
        }
        empregado.imprimirSobrenome();
        empregado.imprimirValores();
        System.out.println(empregado.getNome() + " Tem salário: " + empregado.vencimento());
    }

}
