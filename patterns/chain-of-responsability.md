Chain of Responsability
==============================

![MIT](https://octodex.github.com/images/dojocat.jpg)

[Código](https://github.com/robsonbittencourt/design-patterns-dojos/tree/master/src/main/java/chainOfResponsability)

## Chain of Responsability
O padrão de projeto de software Chain of Responsibility representa um encadeamento de objetos receptores para o processamento de uma série de solicitações diferentes. Esses objetos receptores passam a solicitação ao longo da cadeia até que um ou vários objetos a tratem.

## Diagrama

![MIT](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9-EO8T-Rv_SO3kuaPWQPbPHdDKIQh0Si6hj6-0fYt_vcubNGYHOCqSZ8-)

### Motivação
Desacoplar o cliente das requisições que este faz.

### Consequências
* É responsabilidade do programador chamar o próximo item da corrente. 
* Não é garantido que o request será executado.

### Aplicabilidade
* Mais de um objeto pode tratar uma solicitação e o objeto que a tratará não é conhecido;
* O objeto que trata a solicitação deve ser escolhido automaticamente;
* Deve-se emitir uma solicitação para um dentre vários objetos, sem especificar explicitamente o receptor;
* O conjunto de objetos que pode tratar uma solicitação deve ser especificado dinamicamente.
