package carro;
import java.util.ArrayList;
import java.util.List;

/**
 * Composto do Composite: parte formada por outras partes
 * (que podem ser pecas ou outros conjuntos).
 */
public class ConjuntoDePecas extends ParteDoCarro {
    private final List<ParteDoCarro> partes = new ArrayList<>();

    public ConjuntoDePecas(String nome) {
        super(nome);
    }

    public void adicionar(ParteDoCarro parte) {
        partes.add(parte);
    }

    // O conjunto nao tem peso proprio: repassa o total para cada filho (recursivo)
    @Override
    public int somarPeso(int totalParcial) {
        int total = totalParcial;
        for (ParteDoCarro parte : partes) {
            total = parte.somarPeso(total);
        }
        return total;
    }
}
