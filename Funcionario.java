package POO;

public abstract class Funcionario {
    private String nome;
    private int idade;
    private String id;
    private double salarioBase;

    public Funcionario(String nome, int idade, String id, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calcularPagamento();

    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Idade: " + idade + ", Salário Base: R$ " + salarioBase;
    }
}
