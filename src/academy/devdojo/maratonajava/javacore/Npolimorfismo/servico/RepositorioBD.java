package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBD implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("BANCO DE DADOS");
    }
}
