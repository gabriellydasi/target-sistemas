# Estágio Target Sistemas
Neste repositório, encontra-se soluções para os desafios propostos durante o processo de recrutamento para o estágio na empresa Target Sistemas. O teste técnico foi dividido em duas partes: a primeira consistiu em uma redação e a segunda um teste de lógica, que envolveu a resolução de problemas práticos.

Para a parte de desenvolvimento de código, optei por resolver os desafios utilizando a linguagem Java, que é a tecnologia que venho estudando atualmente. Assim, espero que as soluções apresentadas aqui demonstrem meu conhecimento e capacidade de resolver problemas de forma eficaz.

### Questão 1
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
<br>
- Solução: [Fibonnaci](https://github.com/gabriellydasi/target-sistemas/blob/main/src/desafios/desafio1/FibonacciChecker.java)

### Questão 2
Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
<br>
- Solução: [String A](https://github.com/gabriellydasi/target-sistemas/blob/main/src/desafios/desafio2/ContadorDeA.java)

### Questão 3
Observe o trecho de código abaixo:
```
int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça
{
K = K + 1;
SOMA = SOMA + K;
}

imprimir(SOMA);
```

Ao final do processamento, qual será o valor da variável SOMA?
<br>
- Solução: [Resultado da Soma](https://github.com/gabriellydasi/target-sistemas/blob/main/src/desafios/desafio3/Soma.java)

### Questão 4
Descubra a lógica e complete o próximo elemento:
* a) 1, 3, 5, 7, ___
* b) 2, 4, 8, 16, 32, 64, ____
* c) 0, 1, 4, 9, 16, 25, 36, ____
* d) 4, 16, 36, 64, ____
* e) 1, 1, 2, 3, 5, 8, ____
* f) 2, 10, 12, 16, 17, 18, 19, ____

Solução:  
* a) Sequência de números ímpares. Próximo elemento: 9
* b) Sequência de potências de 2. Próximo elemento: 2^7 = 128
* c) Sequência de números quadrados. Próximo elemento: 7^2 = 49
* d) Sequência de quadrados de números pares. Próximo elemento: 10^2 = 100
* e) Sequência de Fibonacci. Próximo elemento: 8 + 5 = 13
* f) Números naturais iniciados pela letra D. Próximo elemento: 200

### Questão 5
Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?  

Solução: Primeiro, iria ligar o interruptor 1 e deixá-lo ligado por uns 20 minutos para que a lâmpada correspondente fique mais quente em relação às outras lâmpadas. Depois, desligo o interruptor 1 e ligo o interruptor 2. Em seguida vou até as salas conferir as lâmpadas. Se a lâmpada estiver acesa, então ela corresponde ao interruptor 2. Se estiver apagada e quente, corresponde ao interruptor 1. E se estiver apagada e fria, então ela corresponde ao interruptor 3. 

