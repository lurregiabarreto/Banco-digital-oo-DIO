Aqui está o README atualizado, incluindo a classe `Main` como ponto de entrada do programa:

---

## Banco Digital com Java e Orientação a Objetos

### Descrição do Projeto

Este projeto é uma simulação de um banco digital utilizando conceitos de Programação Orientada a Objetos (POO) em Java. O banco oferece aos clientes dois tipos de contas: **Conta Corrente** e **Conta Poupança**, ambas com funcionalidades de **depósito**, **saque** e **transferência** entre contas da mesma instituição.

### Funcionalidades

- **Criar clientes:** Cadastro de novos clientes no banco.
- **Criar contas:** Abertura de Conta Corrente e Conta Poupança para os clientes cadastrados.
- **Depositar:** Adicionar fundos a uma conta.
- **Sacar:** Retirar fundos de uma conta.
- **Transferir:** Mover fundos de uma conta para outra dentro da mesma instituição.
- **Imprimir extratos:** Exibir detalhes de transações e saldo atual.

### Conceitos de POO Utilizados

- **Abstração:** Definição de objetos que representam entidades do domínio bancário.
- **Encapsulamento:** Ocultação dos detalhes de implementação das contas, expondo apenas métodos públicos para interagir com os dados.
- **Herança:** `ContaCorrente` e `ContaPoupanca` herdam de uma classe base `Conta`.
- **Polimorfismo:** Possibilidade de tratar diferentes tipos de contas de forma genérica através da classe base `Conta`.

### Estrutura do Projeto

- **Cliente.java**: Classe que representa um cliente do banco.
- **Conta.java**: Classe abstrata que define uma conta bancária genérica.
- **ContaCorrente.java**: Subclasse de `Conta` que implementa uma conta corrente.
- **ContaPoupanca.java**: Subclasse de `Conta` que implementa uma conta poupança.
- **Banco.java**: Classe que gerencia as contas e os clientes do banco.
- **Main.java**: Ponto de entrada do programa. Contém o método `main` que executa a aplicação.

### Como Executar o Projeto

1. **Pré-requisitos:** Certifique-se de ter o JDK 17 instalado em seu sistema.

2. **Clonar o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   cd nome-do-repositorio
   ```

3. **Compilar os arquivos Java:**
   ```bash
   javac *.java
   ```

4. **Executar o programa:**
   ```bash
   java Main
   ```

### Exemplo de Execução

Ao executar o programa, a saída pode ser algo como:

```
Depósito de 500.0 realizado com sucesso na conta de Alice.
Depósito de 300.0 realizado com sucesso na conta de Bob.
Transferência de 100.0 realizada com sucesso de Alice para Bob.

Extrato Conta Corrente:
Titular: Alice
Saldo: 400.0

Extrato Conta Poupança:
Titular: Bob
Saldo: 400.0
```

### Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir **issues** ou enviar **pull requests**.

