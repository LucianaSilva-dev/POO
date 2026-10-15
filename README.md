
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

```
# Lista 4

## Questão 1 - Herança, Composição e Sobrescrita

### a) Verdadeira

Construtores não são herdados pelas subclasses. A subclasse precisa declarar seus próprios construtores e, dentro deles, pode chamar um construtor da superclasse com `super(...)`. Se não houver uma chamada explícita, o compilador insere uma chamada implícita ao construtor sem argumentos da superclasse, desde que ele exista e seja acessível.

### b) Falsa

Um relacionamento **“é um”** é implementado por meio da herança. Por exemplo, um `Carro` *é um* `Veículo`.

Já o relacionamento **“tem um”** é implementado por meio da composição, em que uma classe possui referências a objetos de outras classes como atributos. Por exemplo, um `Carro` *tem um* `Motor`.

### c) Falsa

Quando a subclasse redefine um método da superclasse com a mesma assinatura, diz-se que ela **sobrescreve** (*override*) o método, e não que o sobrecarrega.

A **sobrecarga** (*overload*) ocorre quando há métodos com o mesmo nome, mas assinaturas diferentes, como número, tipo ou ordem dos parâmetros. Isso pode ocorrer na mesma classe ou em uma hierarquia de classes.

---

## Questão 2 - Uso de `protected` e `private`

O modificador `protected` em atributos oferece conveniência, mas pode prejudicar o encapsulamento e a manutenibilidade, pois acopla as subclasses à implementação da superclasse.

O uso de `private` nos atributos, combinado com **métodos de acesso `protected`**, geralmente é preferível, pois preserva o encapsulamento e ainda permite a extensão da classe.

O uso de `protected` diretamente nos atributos pode ser justificável em situações específicas, como classes fortemente relacionadas dentro de um mesmo pacote ou quando há uma necessidade concreta de acesso direto e a estrutura interna é estável.

---

## Questão 3 - Construção de Objetos e Herança

Quando criamos um objeto de uma subclasse, ele contém tanto a parte herdada da superclasse quanto a parte declarada na própria subclasse.

Por isso, a construção acontece em cadeia, **de cima para baixo na hierarquia**: primeiro a superclasse é inicializada e, depois, a subclasse.

A primeira instrução de um construtor pode ser uma chamada a outro construtor:

- `super(...)`: chama um construtor da superclasse.
- `this(...)`: chama outro construtor da própria classe, que acabará chamando um construtor da superclasse.

Caso o programador não escreva nenhuma dessas chamadas, o compilador pode inserir automaticamente `super()`, que chama o construtor sem argumentos da superclasse. Isso só funciona se esse construtor existir e puder ser acessado.

Essa chamada é importante porque a subclasse herda a parte correspondente à superclasse, incluindo atributos `private`, que não podem ser acessados diretamente pela subclasse. A própria superclasse é responsável por inicializar corretamente sua parte do objeto.

```