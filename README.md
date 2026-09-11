# Questão 5 - Scanner e Formatação de Dados

## Scanner

O `Scanner` é uma classe do pacote `java.util` usada para ler dados digitados pelo usuário (ou de outras fontes, como arquivos).

Para usá-la, importa-se a classe:

```java
import java.util.Scanner;
```

Cria-se um objeto associado à entrada padrão (o teclado):

```java
Scanner input = new Scanner(System.in);
```

Usam-se métodos específicos para cada tipo de dado que se quer ler:

- `nextInt()` → para inteiros
- `nextDouble()` → para `double`
- `nextLine()` → para `String`
- `nextBoolean()` → para booleanos

## Exemplo da leitura de um double

```java
import java.util.Scanner;

public class LeituraDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = input.nextDouble();

        System.out.println("Você digitou: " + valor);
    }
}
```

## Formatação com printf

Enquanto `System.out.println` exibe o valor "bruto", `System.out.printf` permite controlar exatamente como o número aparece na tela, usando **especificadores de formato**.

Os especificadores mais comuns são:

- `%d` → inteiro
- `%f` → `float` ou `double`
- `%s` → `String`

Para controlar o número de casas decimais, coloca-se `.n` entre o `%` e o `f`, onde `n` é a quantidade de casas desejada.

Por exemplo:

```text
%.2f
```

exibe duas casas decimais.

## Exemplo da leitura de um double com 2 casas decimais

```java
import java.util.Scanner;

public class FormatarDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = input.nextDouble();

        System.out.printf("Valor formatado: %.2f%n", valor);
    }
}
```


# Questão 6 - Identificação e Correção de Erros

## 1. Erro de sintaxe na declaração do `main`

Código com erro:

```java
public static void main(String args)
```

Faltam os colchetes `[]`. O parâmetro do método `main` precisa ser um **array de Strings**, não uma String única.

A assinatura correta é:

```java
public static void main(String[] args)
```

Sem isso, o código não compila.

---

## 2. Ponto e vírgula faltando

Código com erro:

```java
System.out.println("Contador: " + contador)
```

Falta o `;` no final da linha. Toda instrução em Java precisa terminar com ponto e vírgula.

O correto é:

```java
System.out.println("Contador: " + contador);
```

---

## 3. Erro de lógica - loop infinito

Código com problema:

```java
while (contador <= 5) {
    System.out.println("Contador: " + contador);
}
```

A variável `contador` nunca é alterada dentro do laço.

Como ela começa em `0` e nunca aumenta, a condição:

```java
contador <= 5
```

é **sempre verdadeira**.

Por isso, o programa fica imprimindo:

```text
Contador: 0
```

continuamente, sem nunca parar.

Falta incrementar `contador` a cada repetição, por exemplo:

```java
contador++;
```

---

## Código Corrigido

```java
public class Contador {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}
```

