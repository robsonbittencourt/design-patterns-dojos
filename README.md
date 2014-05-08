->dojo-design-patterns-decorator<-
==============================

![MIT](https://octodex.github.com/images/kimonotocat.png)

Código do Dojo de Design Patterns (Decorator) realizado na uMov.me dia 08/05/2014

## Decorator

Decorator ou wrapper, é um padrão de projeto de software que permite adicionar um comportamento a um objeto já existente em tempo de execução, ou seja, agrega dinamicamente responsabilidades adicionais a um objeto.

### Intenção
* Acrescentar responsabilidades a um objeto dinamicamente
* Prover alternativa flexível ao uso de subclasses para se estender a funcionalidade de uma classe

### Motivação
* Objeto usado possui as funcionalidades básicas, mas é necessário adicionar funcionalidades adicionais a ele que podem ocorrer antes ou depois da funcionalidade básica
* Funcionalidades devem ser adicionadas em instancias individuais e não na classe.

### Consequências
* Mais flexibilidade do que herança
** Adição ou remoção de responsabilidades em tempo de execução
** Adição da mesma propriedade mais de uma vez
* Evita o excesso de funcionalidades nas classes
* Decorator e seu componente não são idênticos
** Comparações tornam-se mais complexas
* Resulta em um design que tem vários pequenos objetos, todos parecidos

### Aplicabilidade
* Acrescentar ou remover responsabilidades a objetos  individuais dinamicamente, de forma transparente
* Evitar a explosão de subclasses para prover todas as combinações de responsabilidades

### Padrões relacionados
* Adapter: Decorator muda comportamento; Adapter muda interface
* Composite: Pode ser visto como um composite com um único componente; porém, não tem intenção de agregar objetos
* Strategy: Decorator envolve o objeto; Strategy muda o funcionamento interno
