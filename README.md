# Atividade III - Pilha
Este repositório armazena uma aplicação da Estrutura de Dados "Pilha", como parte da disciplina Estrutura de Dados (ESPM - Sistemas de Informação - 3° semestre) lecionada pelo Prof. Dr. Antonio Marcos Selmini.

## 🧮 Exercício 01 — Servidores sobrecarregados

📌 **Estrutura a ser utilizada:** Pilha (`Stack`)

### Enunciado

Em um data center, servidores estão alinhados, cada um com uma carga de trabalho (número inteiro).  
A regra é: se um servidor tem carga **maior que o da esquerda**, ele sofre overload e é desligado.

O processo se repete dia após dia, até que **nenhum servidor seja desligado**.

### Objetivo

Dado um vetor com as cargas iniciais, determine **quantos dias são necessários até a estabilização**, ou seja, o número de dias após os quais nenhum servidor é desligado.

### Exemplo

Suponha que tenhamos a seguinte sequência de 7 cargas:
```
[30, 25, 40, 20, 35, 50, 45]
```

#### Dia 0 (inicial):
```
[30, 25, 40, 20, 35, 50, 45]
```

Servidores que serão desligados no **Dia 1**:
- Índice 2 → 40 > 25
- Índice 4 → 35 > 20
- Índice 5 → 50 > 35

#### Dia 1:
Após os desligamentos:
```
[30, 25, 20, 45]
```

Servidor que será desligado no **Dia 2**:
- Índice 3 → 45 > 20

#### Dia 2:
Após os desligamentos:
```
[30, 25, 20]
```

⚠️ Agora, nenhum servidor tem carga maior que o da esquerda.  
✅ **Resultado final: 2 dias até que nenhum servidor precise ser desligado.**

---


