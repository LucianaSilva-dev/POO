
# Lista 1

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
# Lista 2


## Questão 1 - Getters, Setters e Encapsulamento

Getters e setters aplicam o princípio do **encapsulamento**: o atributo fica `private` e o acesso passa por métodos que a própria classe controla.

Isso permite:

- Proteger os dados do objeto;
- Validar valores antes de alterá-los;
- Evitar que o objeto fique em um estado inválido;
- Alterar a implementação interna da classe sem afetar o código que a utiliza.

### Exemplo em Java

```java
public class Aluno {
    private int idade;

    public Aluno(int idade) {
        setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }
}
```
## Questão 2 - Classe Livro

## a) Informações relevantes

As informações mais relevantes que podemos utilizar para representar um livro são:

- Título;
- ISBN;
- Editora;
- Ano de publicação;
- Autores.

### b) Abstração

Ao criar a classe `Livro`, escolhemos apenas os atributos e comportamentos **essenciais ao contexto do sistema** e ignoramos o restante.

Ou seja, a classe é um modelo simplificado que representa o conceito de "livro" para o problema que queremos resolver.

## c) Comportamentos

Alguns comportamentos que podem ser representados na classe `Livro` são:

```java
consultarLivro();
emprestarLivro();
devolverLivro();

```

# Lista 3

## Questão 4 - Array de Tipos Primitivos × Array de Objetos

### a) Alocação de memória

Em Java, todo array é um objeto e fica no **heap**. A diferença está no que cada posição armazena:

- **`int[]` / `double[]`:** cada posição guarda diretamente o valor, que começa com o valor padrão do tipo (`0` ou `0.0`).
- **`Aluno[]` / `Produto[]`:** cada posição guarda uma referência a um objeto, que começa como `null`. Os objetos são criados separadamente, com `new`, e ocupam outras áreas do heap.

Exemplo em Java:

```java
int[] numeros = new int[3];      // [0, 0, 0]
Aluno[] alunos = new Aluno[3];   // [null, null, null]
alunos[0] = new Aluno("Ana", 1); // primeira posição recebe uma referência
```

### b) Cuidados ao acessar um array de objetos

- **`NullPointerException`:** chamar um método em uma posição ainda não preenchida pode causar erro. Crie o objeto antes de utilizá-lo, verifique se a posição é diferente de `null` ou percorra apenas as posições preenchidas.
- **Cópia de referências:** `Aluno[] copia = alunos;` copia apenas a referência ao array. Assim, os dois nomes apontam para o mesmo array, e alterações feitas por um serão percebidas pelo outro.
- **Índice inválido:** acessar uma posição fora do intervalo de `0` a `length - 1` gera `ArrayIndexOutOfBoundsException`.
```
