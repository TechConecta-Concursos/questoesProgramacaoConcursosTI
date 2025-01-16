// Analise o código Java a seguir.
public class Main { // Início da classe Main
  public static void main(String[] args) { // Método principal usado para iniciar o script
    System.out.println(x); // System.out.println() é uma função que serve para mostrar algo na tela, mas no momento x nem se quer foi inicializado
    int x = 100; // Somente aqui ele é inicializado
  }
}

/*
Quando esse código é executado:
A) “null” é exibido;
B) “undefined” é exibido;
C) o valor 100 é exibido;
D) ocorre um erro de símbolo não encontrado;
E) ocorre um erro de variável não inicializada.

Resolução:
Temos uma casca de banana nessa questão. Percebemos que, dentro do método Main, a função System.out.println() está tentando imprimir x.
Porém, x, nesse momento, ainda não foi inicializado. Ou seja, não se sabe o que é o x nessa linha. Só temos essa resposta na próxima linha,
onde ele é declarado como uma variável do tipo inteira e inicializado com o valor 100.

Então o que vamos ter como resultado, já que o x ainda não tinha sido inicializado na chamada da função System.out.println()?

Acredito que algumas pessoas já iriam responder de cara que vai ocorrer um erro de variável não inicializada. Mas infelizmente essa
não é a resposta. A resposta correta que o compilador Java iria informar é de um erro de símbolo não encontrado (letra D).

Se pensar bem, por um lado faz sentido, pois antes não se sabe o que é x. Poderia ser uma variável, uma constante... Qualquer outra coisa
que se encaixasse. Por isso que o Java chama x de símbolo e não de variável.
*/
