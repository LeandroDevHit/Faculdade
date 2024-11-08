package POO;

import java.util.ArrayList;
import java.util.List;

public class SistemaGestaoFuncionarios {
    private List<Funcionario> funcionarios;

    public SistemaGestaoFuncionarios() {
        funcionarios = new ArrayList<>();
    }

    public void registrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void exibirFuncionario(String id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId().equals(id)) {
                System.out.println(funcionario);
                System.out.println("Pagamento Total: R$ " + funcionario.calcularPagamento());
                return;
            }
        }
        System.out.println("Funcionário não encontrado!");
    }

    public void exibirTodosFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
            System.out.println("Pagamento Total: R$ " + funcionario.calcularPagamento());
        }
    }
}
