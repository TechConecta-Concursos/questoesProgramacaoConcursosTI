"""
Link da questão: https://www.qconcursos.com/questoes-de-concursos/questoes/6cb1eb80-76
"""

import re
text = "Inteligencia      artificial generativa&#10;Promoc"
clean_text = re.sub(r'\d', ' ', text)
print(clean_text)

""" Comentário humano
Essa questão testa conhecimentos relacionados a biblioteca re do python que trata do uso de expressões regex para extração de texto em strings. A função re.sub() serve para substituir textos que deem match em uma expressão por um outro texto especificado. No caso do código acima, a função re.sub busca por números usando a expressão \d e subsitui eles por um espaço. Assim, a saída será a string ""Inteligencia artifical generativa&# ;Promoc".

Guia básico de regex

Exemplo: a.b corresponde a "aab", "acb", etc.

\d: Qualquer dígito (0-9).

Exemplo: \d corresponde a "1", "2", etc.

\w: Qualquer caractere alfanumérico (a-z, A-Z, 0-9, _).

Exemplo: \w corresponde a "a", "1", "_", etc.

\s: Qualquer espaço em branco (espaço, tabulação, nova linha).

Exemplo: \s corresponde a " ", "\t", "\n", etc.

^: Início da string.

Exemplo: ^a corresponde a "a" no início da string.

$: Fim da string.

Exemplo: a$ corresponde a "a" no fim da string.

\b: Borda de palavra.

Exemplo: \bword\b corresponde a "word" como uma palavra inteira.
 """
