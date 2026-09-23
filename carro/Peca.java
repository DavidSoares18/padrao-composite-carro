package carro;
/**
 * Folha do Composite: parte simples, que tem um peso proprio.
 * E aqui que o peso e de fato contabilizado (e impresso).
 */
public class Peca extends ParteDoCarro {
    private final int peso;

    public Peca(String nome, int peso) {
        super(nome);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public int somarPeso(int totalParcial) {
        int novoTotal = totalParcial + peso;
        System.out.println("Somando agora o peso de " + getNome() + ": "
                + peso + ". Total parcial: " + novoTotal);
        return novoTotal;
    }
}
