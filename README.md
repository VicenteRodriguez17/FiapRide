# Projeto Geladeira - FIAP Ride (Aula 2 - Métodos e Comportamentos)

Este projeto demonstra os conceitos de Programação Orientada a Objetos (POO), focando na criação de classes, atributos, métodos e regras de negócio, conforme abordado na Aula 2 da disciplina de Programação Orientada a Objetos da FIAP Ride.

## Objetivo

O objetivo principal é simular o comportamento de uma geladeira através de uma classe Java, aplicando os seguintes conceitos:

*   **Modelagem de Objetos:** Representar uma geladeira como um objeto com suas características (atributos) e comportamentos (métodos).
*   **Métodos e Comportamentos:** Implementar ações que a geladeira pode realizar, como adicionar e remover volume.
*   **Regras de Negócio:** Definir e aplicar validações para garantir a integridade e o funcionamento lógico do objeto (ex: não exceder a capacidade, não remover volume inexistente).
*   **Encapsulamento:** Proteger os dados internos do objeto, expondo apenas os métodos necessários para interagir com ele.

## Estrutura do Projeto

O projeto é composto por duas classes principais:

1.  `Geladeira.java`: Define o objeto `Geladeira`.
2.  `SistemaPrincipal.java`: Contém o método `main` para testar as funcionalidades da classe `Geladeira`.

### `Geladeira.java`

Esta classe representa uma geladeira e possui os seguintes atributos e métodos:

#### Atributos

*   `formato` (String): Descreve o formato físico da geladeira (ex: "Retangular", "Duplex").
*   `aparencia` (String): Descreve a aparência da geladeira (ex: "Com Botões", "Inox").
*   `capacidadeTotalEmMl` (int): A capacidade máxima da geladeira em mililitros.
*   `volumeOcupadoEmMl` (int): O volume atualmente ocupado na geladeira em mililitros.

#### Construtor

*   `Geladeira(String formato, String aparencia, int capacidadeTotalEmMl)`:
    *   Inicializa uma nova instância de `Geladeira` com o formato, aparência e capacidade total especificados.
    *   **Regra de Negócio:** A `capacidadeTotalEmMl` deve ser um valor positivo. Caso contrário, um erro é impresso e a capacidade é definida como 1ml para evitar inconsistências.
    *   O `volumeOcupadoEmMl` é inicializado como 0.

#### Métodos

*   `adicionarVolume(int volume)`:
    *   Adiciona um determinado `volume` à geladeira.
    *   **Regra de Negócio:** O `volume` a ser adicionado deve ser positivo.
    *   **Regra de Negócio:** Não é possível adicionar volume que exceda a `capacidadeTotalEmMl`. Um erro é impresso caso a capacidade seja excedida.
*   `removerVolume(int volume)`:
    *   Remove um determinado `volume` da geladeira.
    *   **Regra de Negócio:** O `volume` a ser removido deve ser positivo.
    *   **Regra de Negócio:** Não é possível remover mais volume do que o `volumeOcupadoEmMl` atualmente. Um erro é impresso caso se tente remover mais do que o disponível.
*   `verificarEspacoDisponivel()`:
    *   Retorna o espaço disponível na geladeira ( `capacidadeTotalEmMl` - `volumeOcupadoEmMl`).
*   `exibirStatus()`:
    *   Imprime no console o formato, aparência, capacidade total, volume ocupado e espaço disponível da geladeira.

### `SistemaPrincipal.java`

Esta classe contém o método `main` que serve como ponto de entrada para a aplicação. Ela cria instâncias da classe `Geladeira` e testa seus métodos e regras de negócio em diversos cenários, incluindo:

*   Criação de geladeiras com capacidades válidas e inválidas.
*   Adição de volume (válida, excedendo capacidade, volume zero/negativo).
*   Remoção de volume (válida, removendo mais do que o ocupado, volume zero/negativo).
*   Verificação do espaço disponível.

## Como Executar o Projeto

Para executar este projeto, siga os passos abaixo:

1.  **Certifique-se de ter o Java Development Kit (JDK) instalado** em sua máquina.
2.  **Abra o projeto em uma IDE Java** como o Eclipse ou IntelliJ IDEA.
3.  **Compile as classes** `Geladeira.java` e `SistemaPrincipal.java`.
4.  **Execute a classe `SistemaPrincipal.java`**.

Os resultados dos testes e as mensagens de status e erro serão exibidos no console da sua IDE.

## Critérios para Nota 10 (Dicas Adicionais)

Para garantir a nota máxima no seu trabalho, considere os seguintes pontos:

*   **Clean Code:** Mantenha a clareza e a legibilidade do código. Nomes de variáveis e métodos devem ser autoexplicativos.
*   **Comentários:** Adicione comentários explicativos em partes complexas do código ou para justificar decisões de design.
*   **Testes Abrangentes:** O `SistemaPrincipal` já cobre vários cenários, mas você pode pensar em outros casos de uso para testar ainda mais a robustez da sua classe `Geladeira`.
*   **Versionamento (Git):** Se o professor solicitou o uso de Git, certifique-se de que seu repositório esteja organizado, com commits significativos e mensagens claras. Exemplo de mensagem de commit:
    ```bash
    git commit -m "feat: Implementa classe Geladeira com métodos de adicionar/remover volume e regras de negócio"
    ```
*   **UML (Opcional, mas valorizado):** Se você tiver conhecimento, pode incluir um diagrama de classes UML da `Geladeira` no seu `README.md` ou como um arquivo separado. Isso demonstra uma compreensão mais profunda da modelagem de objetos.

---
