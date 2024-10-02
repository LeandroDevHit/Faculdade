package listencadeada;

public class No {
    String nome;
    No proximo;

    public No(String nome) {
        this.nome = nome;
        this.proximo = null;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;

    }
}
