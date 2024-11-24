// Seja o seguinte programa Java:

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Stack<Integer> p1=new Stack<Integer>();
    Stack<Integer> p2=new Stack<Integer>();
    Stack<Integer> p3=new Stack<Integer>();
    Stack<Integer> p4=new Stack<Integer>();
    for (int i=100; i < 300; i+=50)
      p1.push(i);
    for (int i=70; i < 90; i+=10)
      p2.push(i);
    for (int i=45; i < 50; i+=2)
      p3.push(i);
    for( boolean x=false; !x; ) {
      if (!p3.isEmpty())
        p4.push(p3.pop());
      else
        x=true;
      if (!p2.isEmpty())
        p4.push(p2.pop());
      else
        x=x&&true;
      if (!p1.isEmpty())
        p4.push(p1.pop());
      else
        x=x&&true;
    }
    int val=0;
    for (int i=0; i < 6; i++)
      val=p4.pop();
    System.out.println(val);
  }
}
/*
Quando a função main for executada, será exibido no console o valor
A) 47
B) 49
C) 100
D) 150
E) 200

Comentário gerado por IA:

*Passo 1: Inicialização das Pilhas
p1 contém: 100, 150, 200, 250.
p2 contém: 70, 80.
p3 contém: 45, 47, 49.

*Passo 2: Laço while com p4
O laço transfere elementos de p3, p2 e p1 para p4. Vamos revisar o comportamento com os valores corrigidos.

  Iteração 1:
  p3.pop() → Adiciona 49 a p4 (restam 45, 47 em p3).
  p2.pop() → Adiciona 80 a p4 (resta 70 em p2).
  p1.pop() → Adiciona 250 a p4 (restam 100, 150, 200 em p1).
  Estado de p4: [49, 80, 250].
  
  Iteração 2:
  p3.pop() → Adiciona 47 a p4 (resta 45 em p3).
  p2.pop() → Adiciona 70 a p4 (p2 fica vazia).
  p1.pop() → Adiciona 200 a p4 (restam 100, 150 em p1).
  Estado de p4: [49, 80, 250, 47, 70, 200].
  
  Iteração 3:
  p3.pop() → Adiciona 45 a p4 (p3 fica vazia).
  p2 está vazia, nada é adicionado.
  p1.pop() → Adiciona 150 a p4 (resta 100 em p1).
  Estado de p4: [49, 80, 250, 47, 70, 200, 45, 150].
  
  Iteração 4:
  p3 e p2 estão vazias, nada é adicionado delas.
  p1.pop() → Adiciona 100 a p4 (p1 fica vazia).
  Estado final de p4: [49, 80, 250, 47, 70, 200, 45, 150, 100].

*Passo 3: Desempilhamento de p4
O loop for (int i = 0; i < 6; i++) desempilha 6 elementos de p4:

val = p4.pop(); → val = 100 (resta [49, 80, 250, 47, 70, 200, 45, 150]).
val = p4.pop(); → val = 150 (resta [49, 80, 250, 47, 70, 200, 45]).
val = p4.pop(); → val = 45 (resta [49, 80, 250, 47, 70, 200]).
val = p4.pop(); → val = 200 (resta [49, 80, 250, 47, 70]).
val = p4.pop(); → val = 70 (resta [49, 80, 250, 47]).
val = p4.pop(); → val = 47 (resta [49, 80, 250]).

*Passo 4: Resultado
Após o loop, o valor de val é 47, que será exibido no System.out.println.
*/
