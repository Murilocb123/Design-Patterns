# Factory

- **Minha interpretação:**
Em resumo factory é um objeto que posssui a inteção de retornar objetos que possuem uma interface em comum que realizam diferentes funcionalidades.

- **O que o google diz:** Na programação orientada a objeto (POO), uma fábrica ou Factory é um objeto para a criação de outros objetos – formalmente uma fábrica é uma função ou método que retorna os objetos de uma classe ou protótipo variável ,[1] a partir de uma chamada de método, o que é considerado "novo". Mais amplamente, uma sub-rotina que retorna um objeto "novo" pode ser chamada de "fábrica", como no método de fábrica ou na função de fábrica. Este é um conceito básico em POO , e constitui a base para um número de padrões de design de software.

- **Exemplo:** Possuo um sistema que se comunica com scanner para digitalização de documentos, possuo o modelo de Scanner **A** e o modelo **B**, cada um desses possuem rotinas e maneiras diferentes de realizarem a mesma coisa(que seria digitalizar documentos), nesse contexto crio uma interface com o nome "Scanner", essa interface terá um metodo "digitalizar()" que me retorna um "list<Imagem>". Após isso cria outras duas classes que extendem essa interface (ex.: ClasseModeloA e ClasseModeloB), e implemento suas rotinas. Por fim crio uma Classe com o nome "FactoryScanner" que possui um metodo statico(getScanner) que retorna a interface Scanner, e passo por parametro qual modelo de scanner quero.

Obs.: O codigo de exemplo eu fiz com carros.