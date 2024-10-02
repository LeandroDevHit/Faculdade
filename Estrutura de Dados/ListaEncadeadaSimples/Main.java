package listencadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserirNoInicio("Leandro");
        lista.inserirNoFim("Roger");
        lista.inserirNoInicio("Clodovaldo");
        lista.inserirNoInicio("João");
        lista.imprimir();
        lista.remover("João");
        lista.imprimir();
        System.out.println(lista.buscar("João"));
        System.out.println(lista.buscar("Leandro"));
    }
}
