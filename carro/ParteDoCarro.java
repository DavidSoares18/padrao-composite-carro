package carro;

/**
 * Componente do Composite: qualquer parte do carro,
 * seja uma peca simples ou um conjunto de pecas.
 */
public abstract class ParteDoCarro {
    private final String nome;

    protected ParteDoCarro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    /**
     * Soma o peso desta parte ao total acumulado ate agora e devolve o novo total.
     * O total parcial "viaja" pela arvore inteira, entao a mensagem impressa
     * sempre mostra a soma global, e nao a soma de um unico conjunto.
     */
    public abstract int somarPeso(int totalParcial);
}
