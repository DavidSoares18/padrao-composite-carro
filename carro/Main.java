package carro;
/**
 * Monta a arvore de partes do carro e calcula o peso total.
 */
public class Main {
    public static void main(String[] args) {
        ConjuntoDePecas carroceria = new ConjuntoDePecas("Carroceria");
        carroceria.adicionar(new Peca("Para-lamas", 20));
        carroceria.adicionar(new Peca("Portas", 100));
        carroceria.adicionar(new Peca("Painéis", 60));
        carroceria.adicionar(new Peca("Porta-malas", 25));
        carroceria.adicionar(new Peca("Capô", 20));

        ConjuntoDePecas tremDeForca = new ConjuntoDePecas("Trem de força");
        tremDeForca.adicionar(new Peca("Motor", 180));
        tremDeForca.adicionar(new Peca("Transmissão", 90));
        tremDeForca.adicionar(new Peca("Diferencial", 40));
        tremDeForca.adicionar(new Peca("Rodas", 100));

        ConjuntoDePecas chassi = new ConjuntoDePecas("Chassi");
        chassi.adicionar(tremDeForca);
        chassi.adicionar(new Peca("Suspensão", 80));

        ConjuntoDePecas carro = new ConjuntoDePecas("Carro");
        carro.adicionar(carroceria);
        carro.adicionar(chassi);

        int pesoTotal = carro.somarPeso(0);
        System.out.println("Peso total do carro: " + pesoTotal + " kg");
    }
}
