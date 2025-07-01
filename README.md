# Coffee Shop Project

Este projeto é uma aplicação de café que permite a criação de diferentes tipos de café, adição de complementos e escolha de métodos de pagamento. A estrutura do projeto é organizada em pacotes para facilitar a manutenção e a expansão.

## Estrutura do Projeto

```
coffee-shop
├── src
│   ├── coffee
│   │   ├── Coffee.java
│   │   ├── CoffeeFactory.java
│   │   ├── Main.java
│   │   └── SimpleCoffee.java
│   ├── decorators
│   │   ├── CoffeeDecorator.java
│   │   ├── MilkDecorator.java
│   │   └── SugarDecorator.java
│   └── payment
│       ├── Payment.java
│       └── CreditCardPayment.java
```

## Descrição dos Arquivos

- **src/coffee/Coffee.java**: Interface que define os métodos `getDescription()` e `getCost()` que devem ser implementados por qualquer tipo de café.

- **src/coffee/CoffeeFactory.java**: Classe responsável por criar instâncias de café com base no tipo especificado.

- **src/coffee/Main.java**: Ponto de entrada da aplicação que utiliza a `CoffeeFactory` para criar cafés, adiciona complementos e processa pagamentos.

- **src/coffee/SimpleCoffee.java**: Implementação da interface `Coffee` que representa um café simples.

- **src/decorators/CoffeeDecorator.java**: Classe abstrata que serve como base para decoradores de café, permitindo a adição de complementos.

- **src/decorators/MilkDecorator.java**: Decorador que adiciona leite ao café, sobrescrevendo os métodos para incluir o custo e a descrição do leite.

- **src/decorators/SugarDecorator.java**: Decorador que adiciona açúcar ao café, também sobrescrevendo os métodos para incluir o custo e a descrição do açúcar.

- **src/payment/Payment.java**: Interface que define o método `pay(double amount)` para estratégias de pagamento.

- **src/payment/CreditCardPayment.java**: Implementação da interface `Payment` que processa pagamentos via cartão de crédito.

## Como Compilar e Executar

1. Certifique-se de ter o JDK instalado em sua máquina.
2. Navegue até o diretório `src` do projeto.
3. Compile os arquivos Java usando o comando:
   ```
   javac coffee/*.java decorators/*.java payment/*.java
   ```
4. Execute a aplicação com o comando:
   ```
   java coffee.Main
   ```
