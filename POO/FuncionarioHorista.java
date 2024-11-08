package POO;

public class FuncionarioHorista extends Funcionario {
    private double horasTrabalhadas;
    private double taxaPorHora;

    public FuncionarioHorista(String nome, int idade, String id, double salarioBase, double horasTrabalhadas,
            double taxaPorHora) {
        super(nome, idade, id, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.taxaPorHora = taxaPorHora;
    }

    public double calcularPagamento() {
        return horasTrabalhadas * taxaPorHora;
    }

    public String toString() {
        return super.toString() + ", Horas Trabalhadas: " + horasTrabalhadas + ", Taxa por Hora: R$ " + taxaPorHora;
    }
}