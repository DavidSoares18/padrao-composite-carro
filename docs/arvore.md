# Árvore de composição do carro (pesos em kg, livres)

```
Carro                      (ConjuntoDePecas)
├── Carroceria             (ConjuntoDePecas)
│   ├── Para-lamas    20   (Peca)
│   ├── Portas       100   (Peca)
│   ├── Painéis       60   (Peca)
│   ├── Porta-malas   25   (Peca)
│   └── Capô          20   (Peca)
└── Chassi                 (ConjuntoDePecas)
    ├── Trem de força      (ConjuntoDePecas)
    │   ├── Motor        180   (Peca)
    │   ├── Transmissão   90   (Peca)
    │   ├── Diferencial   40   (Peca)
    │   └── Rodas        100   (Peca)
    └── Suspensão     80   (Peca)
```

Total esperado: 225 (carroceria) + 410 (trem de força) + 80 (suspensão) = **715 kg**.