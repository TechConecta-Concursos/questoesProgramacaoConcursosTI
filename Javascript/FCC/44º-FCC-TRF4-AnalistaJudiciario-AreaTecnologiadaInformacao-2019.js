/*
Link (Questões Gran Cursos): https://questoes.grancursosonline.com.br/questoes-de-concursos/tecnologia-da-informacao-14/2095186

Considere o fragmento de programa JavaScript abaixo.

A variável resultado vai conter


A) 1,2,3,4,8,9
B) 5,6,7
C) 5,7
D) 1,2,3,4,6,8,9
E) 3

*/

var str = "123456789";

var p = /[^5-7]/g;

var resultado = str.match(p);

// Adicione {{ console.log(resultado); }} para ver o valor de resultado.

/*

Comentário humano:

O código declara três variáveis: uma string (str), uma expressão regex (p) e a variável (resultado) que receberá um array com os matches da string. 
A expressão p dá match em tudo que não seja "5","6" ou "7" em razão do símbolo ^. Caso a expressão fosse /[5-7]/g, o match ocorreria apenas para "5", "6" e "7".
A função match retornará um array que conterá os matches, que será ["1","2","3","4","8","9"]. Logo, alternativa correta é Letra A.


Comentário por IA:

O código em questão realiza uma correspondência de caracteres com a função `.match()` em JavaScript, utilizando uma expressão regular. Vamos analisar o código passo a passo:

---

### Código:
```javascript
var str = "123456789";

var p = /[^5-7]/g;

var resultado = str.match(p);
```

---

### Explicação passo a passo:

1. **Definição da string `str`:**
   ```javascript
   var str = "123456789";
   ```
   A string contém os caracteres "123456789".

2. **Expressão regular `p`:**
   ```javascript
   var p = /[^5-7]/g;
   ```
   - **`[^5-7]`**: Essa parte especifica que queremos corresponder a qualquer caractere que **não esteja no intervalo de 5 a 7**.
     - `[5-7]`: Intervalo de caracteres que inclui "5", "6" e "7".
     - `[^5-7]`: O `^` no início indica a negação, ou seja, queremos tudo que não seja "5", "6" ou "7".
   - **`g`**: A flag `g` (global) permite que a correspondência seja feita para todos os caracteres da string, e não apenas o primeiro.

3. **Método `.match()`:**
   ```javascript
   var resultado = str.match(p);
   ```
   O método `.match()` retorna um array contendo todas as correspondências encontradas pela expressão regular, ou `null` se nenhuma correspondência for encontrada.

4. **Execução da expressão regular:**
   A expressão `[^5-7]` é aplicada à string "123456789". Vamos analisar cada caractere:
   - "1" → não está no intervalo [5-7] → corresponde.
   - "2" → não está no intervalo [5-7] → corresponde.
   - "3" → não está no intervalo [5-7] → corresponde.
   - "4" → não está no intervalo [5-7] → corresponde.
   - "5" → está no intervalo [5-7] → **não corresponde**.
   - "6" → está no intervalo [5-7] → **não corresponde**.
   - "7" → está no intervalo [5-7] → **não corresponde**.
   - "8" → não está no intervalo [5-7] → corresponde.
   - "9" → não está no intervalo [5-7] → corresponde.

5. **Resultado:**
   Após o processo acima, os caracteres correspondentes são: `"1"`, `"2"`, `"3"`, `"4"`, `"8"`, `"9"`.

   O método `.match()` retorna um array com esses caracteres:
   ```javascript
   resultado = ["1", "2", "3", "4", "8", "9"];
   ```

---

### Valor final:
A variável `resultado` terá o valor:
```javascript
["1", "2", "3", "4", "8", "9"]
```

Alternativa A está correta.

*/
