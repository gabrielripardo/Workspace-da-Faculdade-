algoritmo "Média de 3 notas"
// Função :  Informar qual é a nota e informar se foi aprovado ou reprovado
// Autor : Gabriel Ripardo de Sena
// Data : 02/04/2016
// Seção de Declarações 
var
nota1 : REAL
nota2 : REAL
nota3 : REAL
media : REAL
inicio
// Seção de Comandos 
escreva("Digite a primeira nota: ")
leia(nota1)
escreva("Digite a segunda nota: ")
leia(nota2)
escreva("Digite a terceira nota: ")
leia(nota3)

media <- (nota1 + nota2 + nota3)/3

se media >= 7 entao
se media < 10 entao
escreval
escreva(media," APROVADO")
fimse
fimse

se media < 7 entao
escreval
escreva("REPROVADO com",media)
fimse

se media = 10 entao
escreval
escreva("APROVADO COM DISTINÇÃO")

fimse

fimalgoritmo
