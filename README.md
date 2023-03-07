# Compilador ANTLR

# Introdução
O compilador é um programa que transforma um código fonte em uma linguagem de programação para um programa executável. Ele é composto por vários componentes, como o analisador léxico, analisador sintático, gerador de código e otimizador de código. O objetivo do compilador é garantir que o programa esteja correto e possa ser executado de forma eficiente.

# Requisitos
Para compilar e executar o compilador, é necessário ter instalado o Java Development Kit (JDK) versão 8 ou superior e o Ant (um gerenciador de compilação de software livre) versão 1.9.3 ou superior.

# Estrutura do projeto
O projeto está estruturado em vários pacotes e arquivos, como segue:

- antlr: Este pacote contém os arquivos gerados pelo ANTLR (ANother Tool for Language Recognition) que é uma ferramenta para gerar analisadores léxicos e sintáticos para várias linguagens de programação.
- ast: Este pacote contém as classes que representam a árvore de sintaxe abstrata (AST) para a linguagem de programação definida pela gramática do compilador.
- codegen: Este pacote contém as classes que geram código para a linguagem de destino do compilador.
- main: Este pacote contém a classe principal do compilador, que inicia a análise do arquivo de entrada e gera o arquivo de saída.
- parser: Este pacote contém as classes que definem o analisador sintático para a linguagem de programação definida pela gramática do compilador.
- semantic: Este pacote contém as classes que implementam a análise semântica da linguagem de programação definida pela gramática do compilador.

# Como compilar e executar o compilador
Para compilar o compilador, siga os seguintes passos:

1. Clone o repositório do Github `https://github.com/Gabriellimmaa/antlr-compiler.git`
2. Abra um terminal e navegue até o diretório raiz do projeto.
3. Digite o comando `ant jar` para gerar o arquivo JAR do compilador.
Para executar o compilador, digite o comando `java -jar antlr4-4.9.2-complete.jar -Dlanguage=CSharp -visitor -package Grammar -o Grammar Lang.g4` no terminal. Onde nome_do_arquivo_de_entrada é o nome do arquivo que contém o código fonte da linguagem definida pela gramática do compilador.

# Exemplos

comtário de código
```
/* 
regra para comentarios em bloco
*/

// regra para comentarios em linha
```
atribuicao de variaveis
```
int x = 1;
write x;
double y = 1.5;
write y;
string z = "Della Lindo";
write z;
boolean b = true;
write b;
```
entrada de dados
```
read x2 int;
write x2;
read y2 double;
write y2;
read z2 string;;
write z2;
read b2 boolean;
write b2;
```
concatenação de variaveis
```
int teste_int = 2;
write f"teste_int: ${teste_int}";
```
calculos matemáticos
```
int x3 = 2 + 2;
write x3;
int y3 = 2.5 - 2.1;
write y3;
int z3 = 2 * 2;
write z3;
int a3 = 7 / 2;
write a3;
int b3 = 2 + 2 + 2;
write b3;
int c3 = ( 2 + 2.5 ) * 2;
write c3;
```
atribuir valor a uma variavel existente
```
int x4 = 2;
x4 += 1;
write f"teste_int contém valor ${x4}";
x4 -= 1;
write f"teste_int contém valor ${x4}";
```
IF e IF ELSE
```
int teste_int = 11;
if(teste_int > 10) {
    write "IF teste_int é maior que 10";
}else{
    write "IF teste_int NÃO é maior que 10";
}
```
laço de repetição FOR
```
int teste_int = 2;
for(teste_int;teste_int < 20;teste_int += 1) {
    write f"FOR ${teste_int}";
};
```
laço de repetição WHILE
```
int teste_int = 2;
while (teste_int < 10) {
    write f"WHILE teste_int: ${teste_int}";
    teste_int += 2;
};
```
condição ternária
```
int teste_int = 11;
teste_int > 10 ? "TERNÁRIA teste_int é maior que 10" : "TERNÁRIA teste_int NÃO é maior que 10";
```
array
```
array <string> teste1 = ["1","2","3"];
write teste1;
write teste1[0];
array <int> teste2 = [1,2,3];
write teste2;
write teste2[1];
array <double> teste3 = [1.4,2.2,3.3];
write teste3;
write teste3[2];
```

# Conclusão
Este projeto é um exemplo de como implementar um compilador usando a ferramenta ANTLR e o Java. Ele pode ser usado como base para a implementação de compiladores para outras linguagens de programação.
