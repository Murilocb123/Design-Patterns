# Abstract Factory and Singleton


- Abstract Factory: Conforme o livro "padrões de projetos" seria fornecer uma interface para criação de familias de objetos relacionados ou dependentes sem especificar suas classes concretas. Ao meu entendimento seria basicamente criar um padrão de factory apartir de uma classe abstrata junto com o seus metodos abstratos e extender na classe concreta. Usado para definir atividades ou caracterisca diferentes da mesma factory, ex.: Uma concecionaria tem varios carros de diferentes modelos, e se colocassemos uma subdivição em carros antigos e carros novos.
- Um exemplo seria de uma pizzaria que está nesse [link](https://www.thiengo.com.br/padrao-de-projeto-abstract-factory)



- Singleton: Conforme o livro "padrões de projetos" procura garantir que uma classe tenha somente uma instância e fornecer um ponto global de acesso para a mesma.

nesse caso foi usado para retornar a instancia das factory