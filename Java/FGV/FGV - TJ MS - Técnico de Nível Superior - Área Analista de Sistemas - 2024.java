// Enunciado:
// Considere a seguinte função na linguagem Java:

/*
public static int funcao(int x, int y) { // Função que recebe dois inteiros e retorna ela mesma. Esse assunto se chama Recursividade.
  if (y == 0) // Se o inteiro y for igual a 0, então...
    return x; // Inteiro x será retornado
  else // Caso não...
    return funcao(y, x % y); // A função será chamada até y ser igual a 0
}
*/

// O retorno da chamada funcao(49, 72) é:
//A) 1  B) 2  C) 3  D) 7  E) 9

// Resolução:
// O código do enunciado foi inserido em uma classe para visualização do resultado
// Se quiser ver o resultado em algum compilador basta apenas copiar e colar todo o código ou somente o código abaixo.

public class Main {
  public static void main(String[] args) {
    System.out.println(funcao(49, 72));
  }
  public static int funcao(int x, int y) { // Função que recebe dois inteiros e retorna ela mesma. Esse assunto se chama Recursividade.
      if (y == 0) // Se o inteiro y for igual a 0, então...
        return x; // Inteiro x será retornado
      else // Caso não...
        return funcao(y, x % y); // A função será chamada até y ser igual a 0
    }
}

/*
Vamos por parte. Identificamos que se trata de Recursividade. Podemos olhar esse assunto como uma estrutura de repetição, pois
essa função irá se repetir até a condição do if for verdadeira. A questão passou como parâmetro da função os inteiros 49 e 72.
Basicamente, o que temos que fazer é ir de repetição em repetição. Na primeira repetição temos x = 49 e y = 72, y não é igual a 0
então iremos para o else, onde está sendo inserido novos valores na função, onde x = 72 e y = 49, pois além de Recursividade, seria
bastante interessante o aluno saber como funciona o operador %. Tivemos como parâmetro do y o cálculo entre 49 % 72, ou seja,
o resto entre essa divisão, que seria 49, pois o dividendo (49) é menor que o divisor (72). Desse modo, já na segunda repetição, o
y ainda não é 0, e no else temos como parâmetro da função x = 49 e y = 1
