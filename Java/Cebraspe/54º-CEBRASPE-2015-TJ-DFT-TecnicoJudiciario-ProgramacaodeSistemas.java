public class TesteTJDFT {
    public static void main(String[] args) {
        TesteTJDFT x = new TesteTJDFT();
        System.out.println(x.abc(4.4, 2));
    }

    private int abc(int a, int b) {
        return a + b;
    }

    private double abc(double a, double b) {
        return (a + b) / b;
    }

    private String abc(String a, String b) {
        return a + b;
    }

    private int abc(char a, char b) {
        return a + b;
    }
}

/* 
Link da questão: https://www.qconcursos.com/questoes-de-concursos/questoes/b424e68e-bb



Considerando o código Java apresentado, julgue o seguinte item.

Uma vez executado, o código apresentará 6.2 como resultado.

Certo
Errado

*/

/*
 Comentário humano:

 Essa questão trata do tema de polimorfismo por sobrecarga da linguagem Java. 
 A classe TesteTJDFT possui um método chamado abc que possui diversas assinaturas, 
 isto é, o método tem o mesmo nome, porém tem retornos e parâmetros diferentes. A classe
 main chama o método abc passando os parâmetros 4.4 e 2, ou seja, um double e um int.
 Com isso, sabe-se que os métodos que recebem somente parâmetros int, String ou char 
 não serão acionados. Portanto, o método com assinatura double abc(double a, double b) 
 será chamado. Sua execução será (4.4+2)/2, o que resulta em 3.2, logo a 
 resposta é "Errado".
 
 */

 /*
  Comentário gerado por IA

### Passo 1: Definição da Classe e Método `main`

O código começa com a definição da classe `TesteTJDFT` que contém o método `main`, o ponto de entrada do programa.

```java
public class TesteTJDFT {
    public static void main(String[] args) {
        TesteTJDFT x = new TesteTJDFT();
        System.out.println(x.abc(4.4, 2));
    }
}
```

- **Linha 2**: Criação de uma instância da classe `TesteTJDFT` chamada `x`.
- **Linha 3**: Chamada do método `abc` da instância `x`, passando os argumentos `4.4` e `2`. O resultado dessa chamada será impresso no console.

Agora, a execução vai buscar o método `abc` que corresponda aos parâmetros `4.4` (tipo `double`) e `2` (tipo `int`).

### Passo 2: Seleção do Método `abc`

A classe `TesteTJDFT` possui várias sobrecargas do método `abc`:

```java
private int abc(int a, int b) { ... }
private double abc(double a, double b) { ... }
private String abc(String a, String b) { ... }
private int abc(char a, char b) { ... }
```

Vamos analisar os métodos disponíveis:
1. `abc(int a, int b)`: aceita dois inteiros (`int`).
2. `abc(double a, double b)`: aceita dois valores do tipo `double`.
3. `abc(String a, String b)`: aceita duas strings (`String`).
4. `abc(char a, char b)`: aceita dois caracteres (`char`).

O método chamado tem os argumentos `4.4` (um `double`) e `2` (um `int`). Não há um método que aceite exatamente esses tipos, mas o compilador tentará encontrar o método mais adequado.

### Passo 3: Conversão de Tipos

Java tenta fazer uma conversão implícita de tipos (também chamada de *casting*). No caso do argumento `2` (um `int`), ele pode ser convertido para `double` automaticamente. Então, o método `abc(double a, double b)` será o mais adequado, pois ele aceita dois `double`.

### Passo 4: Execução do Método `abc(double a, double b)`

O método `abc(double a, double b)` recebe dois parâmetros:
- `a = 4.4` (do tipo `double`)
- `b = 2.0` (o valor `2` será convertido implicitamente para `double`)

Dentro do método, a operação realizada é:

```java
return (a + b) / b;
```

Substituindo os valores:

```java
return (4.4 + 2.0) / 2.0;
```

Primeiro, calculamos a soma:

```java
4.4 + 2.0 = 6.4
```

Agora, dividimos por `b` (que é `2.0`):

```java
6.4 / 2.0 = 3.2
```

Então, o valor retornado por esse método é `3.2`.

### Passo 5: Impressão do Resultado

O valor `3.2` será impresso no console devido à chamada de `System.out.println(x.abc(4.4, 2));`.

### Resumo

1. O código cria uma instância de `TesteTJDFT`.
2. Chama o método `abc(4.4, 2)`, que corresponde ao método `abc(double a, double b)`.
3. O valor retornado por esse método é `3.2`.
4. O valor `3.2` é impresso no console.

**Resultado final:**
```
3.2
```
  */
