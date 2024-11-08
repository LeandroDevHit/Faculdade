package POO;

public class Main {
    public static void main(String[] args) {
        SistemaGestaoFuncionarios sistema = new SistemaGestaoFuncionarios();

        // registrar os funcionários horistas
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("João", 30, "F001", 0, 160, 25.0);
        sistema.registrarFuncionario(funcionarioHorista);

        // registrar os funcionários mensalistas
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista("Maria", 28, "F002", 3000, 500);
        sistema.registrarFuncionario(funcionarioMensalista);

        // exibir os funcionários
        System.out.println("Exibindo todos os funcionários:");
        sistema.exibirTodosFuncionarios();

        // exibir algum funcionário especifico
        System.out.println("\nExibindo funcionário com ID F001:");
        sistema.exibirFuncionario("F001");
    }
}