# Uso de IA nesta questão

## Prompt utilizado

Ferramenta: Claude (Anthropic). Anexo: `Lista Avaliativa I.pdf` (enunciado).

> Contexto: um carro é composto por carroceria e chassi; a carroceria por para-lamas, portas, painéis,
> porta-malas e capô; o chassi por trem de força e suspensão; e o trem de força por motor, transmissão,
> diferencial e rodas. Toda parte tem nome e peso.
>
> Objetivo: modelar e implementar em Java, com o padrão Composite, um programa que calcula o peso total do
> carro, tratando uma peça isolada e um conjunto de peças de forma uniforme. Sempre que o peso de uma parte
> for contabilizado, o programa deve imprimir "Somando agora o peso de NOME: PESO. Total parcial: SOMA",
> em que a soma parcial é acumulada ao longo de toda a árvore, e não reiniciada dentro de cada conjunto.
> Os artefatos devem ser tão simples quanto possível.
>
> Não me dê a solução pronta. Me dê um passo a passo (tutorial) incremental para eu implementar, seguindo
> estas condições:
> 1. comece pela árvore de composição e pelo diagrama de classes, antes de qualquer código;
> 2. cada etapa deve deixar o projeto compilando, para virar um commit isolado, indicando quais arquivos
>    são criados ou alterados;
> 3. diga qual é o papel de cada classe no padrão (componente, folha, composto) e por que o cliente deve
>    chamar a operação apenas na raiz;
> 4. discuta como a operação precisa ser assinada para que o total parcial atravesse a recursão, e termine
>    com a conferência do total impresso contra a soma feita à mão.

## Passo a passo (tutorial) sugerido pela IA para esta questão

| Passo | O que fazer | Commit correspondente |
|---|---|---|
| 1 | Desenhar a árvore do carro e o diagrama de classes do Composite. | `Passo 1` |
| 2 | Criar o **Componente** abstrato `ParteDoCarro` (nome + `getPeso()`). | `Passo 2` |
| 3 | Criar a **Folha** `Peca`, que tem um peso fixo. | `Passo 3` |
| 4 | Criar o **Composto** `ConjuntoDePecas`, que guarda filhos `ParteDoCarro` e soma o peso deles recursivamente. | `Passo 4` |
| 5 | Montar a árvore do carro no `Main` e imprimir o peso total. | `Passo 5` |
| 6 | Imprimir a mensagem "Somando agora o peso de ..." a cada parte contabilizada. | `Passo 6` |

## Ajustes feitos sobre o que a IA sugeriu
Cada ajuste está num commit que começa com **"Ajuste:"**, com o motivo na mensagem. Resumo:

1. **Total parcial zerando a cada conjunto** — imprimir dentro do laço de `getPeso()` fazia cada conjunto
   ter seu próprio total local (ao entrar no Trem de força a saída voltava para 180) e os conjuntos também
   apareciam como partes somadas. A operação passou a ser `somarPeso(int totalParcial)`: o total acumulado
   percorre a árvore inteira, só a folha imprime, e o total parcial cresce até o peso final.
