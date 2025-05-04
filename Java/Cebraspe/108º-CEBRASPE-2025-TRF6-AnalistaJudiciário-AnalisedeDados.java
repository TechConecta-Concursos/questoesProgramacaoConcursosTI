/*
Enunciado:

Julgue o próximo item, relativo a Java.
*/

import java.io.*; 
class Easy{
  public static void main(String[] args){
    int x[] = {1, 3, 7, 22, 51};
    for (int size : x)
      System.out.print(size);
  }
}

/*
O resultado da execução do código precedente, desenvolvido em Java, será 6. 

C) Certo
E) Errado

Comentário humano:
Temos aqui uma questão relativamente fácil de lógica de programação em Java, não é à toa que o nome da classe é Easy.
De início nós temos os padrões comuns de um algoritmo Java, tendo como nosso trecho de interesse apenas o que se encontra dentro
do método main. Nele nós temos a declaração de um vetor com 5 elementos e depois um laço de repetição FOR que repete por 5 vezes
(que é o tamanho do vetor x) a seguinte linha: "System.out.print(size);".
Daí, nós já podemos perceber que o resultado não será 6, pois o FOR fará com que 5 elementos diferentes sejam mostrados. São eles:
1372251 //Saída

Obs: Como algumas pessoas podem ter percebido, esse for está meio "diferente", pois se trata de um enhanced for loop (ou for-each).
A diferença dele para o FOR "comum" é que ele não precisa de um índice para correr todo o vetor.

Resposta: E) Errado
*/
