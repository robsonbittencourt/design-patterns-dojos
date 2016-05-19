Chain of Responsability
==============================

![MIT](https://octodex.github.com/images/dojocat.jpg)

[Código](https://github.com/robsonbittencourt/design-patterns-dojos/tree/master/src/main/java/chainOfResponsability)

## Chain of Responsability
O padrão de projeto de software Chain of Responsibility representa um encadeamento de objetos receptores para o processamento de uma série de solicitações diferentes. Esses objetos receptores passam a solicitação ao longo da cadeia até que um ou vários objetos a tratem.

## Diagrama

![MIT](http://www.cs.ucsb.edu/~mikec/cs50/misc/Design_Class_Diagrams_files/ChainOfResponsibility_551-286.gif)

### Motivação
Desacoplar o cliente das requisições que este faz.

### Aplicabilidade
* Mais de um objeto pode tratar uma solicitação e o objeto que a tratará não é conhecido;
* O objeto que trata a solicitação deve ser escolhido automaticamente;
* Deve-se emitir uma solicitação para um dentre vários objetos, sem especificar explicitamente o receptor;
* O conjunto de objetos que pode tratar uma solicitação deve ser especificado dinamicamente.

### Pontos Negativos
* É responsabilidade do programador chamar o próximo item da corrente. 
* Não é garantido que o request será executado.
