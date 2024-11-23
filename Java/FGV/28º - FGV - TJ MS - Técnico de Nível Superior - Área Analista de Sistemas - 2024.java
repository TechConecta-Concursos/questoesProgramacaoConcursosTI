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
// A) 1  B) 2  C) 3  D) 7  E) 9

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
Comentário gerado por IA:
A função fornecida é uma implementação do algoritmo de Euclides, que calcula o máximo divisor comum (MDC) entre dois números.
O processo de cálculo é feito recursivamente, trocando os valores de `x` e `y` e reduzindo `y` com o resto da divisão de `x` por `y`,
até que `y` se torne zero.

Vamos seguir o passo a passo da execução para `funcao(49, 72)`:

1. **Primeira chamada:** `funcao(49, 72)`
   - `y != 0`, então a função retorna `funcao(72, 49 % 72)`.
   - Calculando `49 % 72` → Resto = 49 (pois 49 é menor que 72).
   - Resultado: `funcao(72, 49)`

2. **Segunda chamada:** `funcao(72, 49)`
   - `y != 0`, então a função retorna `funcao(49, 72 % 49)`.
   - Calculando `72 % 49` → Resto = 23.
   - Resultado: `funcao(49, 23)`

3. **Terceira chamada:** `funcao(49, 23)`
   - `y != 0`, então a função retorna `funcao(23, 49 % 23)`.
   - Calculando `49 % 23` → Resto = 3.
   - Resultado: `funcao(23, 3)`

4. **Quarta chamada:** `funcao(23, 3)`
   - `y != 0`, então a função retorna `funcao(3, 23 % 3)`.
   - Calculando `23 % 3` → Resto = 2.
   - Resultado: `funcao(3, 2)`

5. **Quinta chamada:** `funcao(3, 2)`
   - `y != 0`, então a função retorna `funcao(2, 3 % 2)`.
   - Calculando `3 % 2` → Resto = 1.
   - Resultado: `funcao(2, 1)`

6. **Sexta chamada:** `funcao(2, 1)`
   - `y != 0`, então a função retorna `funcao(1, 2 % 1)`.
   - Calculando `2 % 1` → Resto = 0.
   - Resultado: `funcao(1, 0)`

7. **Sétima chamada:** `funcao(1, 0)`
   - `y == 0`, então a função retorna `x`, que é `1`.

### Resultado Final
A função retorna `1`, que é o MDC de 49 e 72.
*/
