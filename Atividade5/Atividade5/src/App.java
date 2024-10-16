import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
       Stack<Character> originalStack = new Stack<>();
originalStack.push('@');
originalStack.push('&');
originalStack.push('@');
originalStack.push('#');
originalStack.push('%');
originalStack.push('&');
originalStack.push('$');

// Chamando o método para remover caracteres duplicados
Stack<Character> resultadoStack = removeDuplicados(originalStack);

// Exibindo resultado
System.out.println("Caracteres após remoção de duplicados:");
while (!resultadoStack.isEmpty()) {
System.out.print(resultadoStack.pop() + " ");
}
}

public static Stack<Character> removeDuplicados(Stack<Character> original) {
Stack<Character> auxStack1 = new Stack<>();
Stack<Character> auxStack2 = new Stack<>();

// Percorrer a pilha original
while (!original.isEmpty()) {
char current = original.pop();

// Verifica se o caractere atual já está em auxStack1
if (!auxStack1.contains(current)) {
// Se não estiver, empilha em auxStack1
auxStack1.push(current);
}
}

// Colocar os caracteres únicos na pilha de resultado
while (!auxStack1.isEmpty()) {
char current = auxStack1.pop();
auxStack2.push(current); // Mantém a ordem original dos caracteres
}

// Transfira da auxStack2 de volta para a pilha de resultados
return auxStack2;
}
}
