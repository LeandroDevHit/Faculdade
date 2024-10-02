package listencadeada;

public class ListaEncadeada {

    // ponto de entrada
    private No head;

    // inserir no início
    public void inserirNoInicio(String nome) {
        No novoNo = new No(nome);
        novoNo.setNome(nome);
        novoNo.setProximo(head);
        head = novoNo;
    }

    // inserir no final
    public void inserirNoFim(String nome) {
        No novoNo = new No(nome);
        novoNo.setNome(nome);

        if (head == null) {
            head = novoNo;
        } else {
            No atual = head;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
    }

    // método pra remover
    public boolean remover(String nome) {
        if (head == null) {
            return false;
        }
        if (head.nome == nome) {
            head = head.proximo;
            return true;
        }
        No atual = head;
        while (atual.proximo != null) {
            if (atual.nome == nome) {
                atual.proximo = atual.proximo.proximo;
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    // método pra buscar
    public boolean buscar(String nome) {
        No atual = head;
        while (atual != null) {
            if (atual.nome == nome) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    // método pra imprimir
    public void imprimir() {
        No atual = head;
        while (atual != null) {
            System.out.print(atual.nome + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
