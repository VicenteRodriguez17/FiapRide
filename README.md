# Projeto FIAP Ride - Sistema de Gestão de Geladeiras
## Aula 2: Métodos e Comportamentos (Programação Orientada a Objetos)

Este projeto foi desenvolvido como parte da atividade prática da disciplina de POO, evoluindo um objeto estático para um sistema dinâmico com comportamentos e regras de negócio reais.

---

## O Desafio Prático
O objetivo deste projeto é transformar a classe `Geladeira` em um objeto funcional, capaz de gerenciar seu estado interno (volume ocupado) através de métodos específicos, respeitando regras de negócio que impedem estados inconsistentes.

### Tecnologias Utilizadas
*   **Linguagem:** Java 11+
*   **IDE Recomendada:** Eclipse ou IntelliJ IDEA
*   **Versionamento:** Git

---

## Estrutura do Projeto

### 1. Classe de Modelo: `Geladeira.java`
Representa o objeto do mundo real com seus atributos e comportamentos.
*   **Atributos:** `formato`, `aparencia`, `capacidadeTotalEmMl`, `volumeOcupadoEmMl`.
*   **Construtor:** Inicializa a geladeira com suas características físicas e capacidade máxima.
*   **Métodos (Comportamentos):**
    *   `adicionarVolume(int volume)`: Insere conteúdo na geladeira.
    *   `removerVolume(int volume)`: Retira conteúdo da geladeira.
    *   `verificarEspacoDisponivel()`: Retorna quanto espaço ainda resta.
    *   `exibirStatus()`: Mostra um relatório completo do estado atual do objeto.

### 2. Classe de Teste: `SistemaPrincipal.java`
Responsável por instanciar os objetos e validar todas as regras de negócio através de testes automatizados no console.

---

## Regras de Negócio Implementadas
Para garantir a nota máxima e a integridade do sistema, as seguintes validações foram aplicadas:

| Regra | Descrição |
| :--- | :--- |
| **Volume Positivo** | Não é permitido adicionar ou remover volumes menores ou iguais a zero. |
| **Limite de Capacidade** | O sistema impede a adição de volume que ultrapasse a capacidade total da geladeira. |
| **Estoque Mínimo** | Não é possível remover mais volume do que o que está atualmente ocupado (evita volume negativo). |
| **Consistência Inicial** | A geladeira deve ser criada com uma capacidade total positiva. |

---

## Como Executar
1.  Importe os arquivos para o seu projeto no **Eclipse**.
2.  Certifique-se de que os pacotes `br.com.fiapride.model` e `br.com.fiapride.main` estão corretos.
3.  Execute a classe `SistemaPrincipal.java` como **Java Application**.
4.  Acompanhe os resultados dos testes de sucesso e erro no **Console**.

---
