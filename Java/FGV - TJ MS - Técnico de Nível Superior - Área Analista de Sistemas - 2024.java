// Enunciado:
// Considere a seguinte função na linguagem Java:

public static int funcao(int x, int y) { // Função que recebe dois inteiros e retorna ela mesma. Esse assunto se chama Recursividade.
  if (y == 0) // Se o inteiro y for igual a 0, então...
    return x; // Inteiro x será retornado
  else // Caso não...
    return funcao(y, x % y); // A função será chamada até y ser igual a 0
}

// O retorno da chamada funcao(49, 72) é:
//A) 1  B) 2  C) 3  D) 7  E) 9

// Resolução:

