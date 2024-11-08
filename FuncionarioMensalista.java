package POO;

public class FuncionarioMensalista extends Funcionario {
    private double bonus;

    public FuncionarioMensalista(String nome, int idade, String id, double salarioBase, double bonus) {
        super(nome, idade, id, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularPagamento() {
        return getSalarioBase() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bônus: R$ " + bonus;
    }
}
