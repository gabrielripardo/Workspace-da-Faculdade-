algoritmo "Departamento Estadual de Metodologia"
// Fun��o : Ler um conjeunto indeterminado de temperaturas e informar qual � a
//          maior e a menor temperatura informadas e a m�dia das temperaturas
// Autor :  Gabriel Ripardo de Sena
// Data : 12/04/2016
// Se��o de Declara��es 
var
temp, soma, media, maior_valor, menor_valor : REAL
cont : INTEIRO
inicio
// Se��o de Comandos
Repita
escreva("Digite a temperatura - ",cont+1,":")
leia(temp)

menor_valor <- 1000
cont <- cont + 1
soma <- temp + soma
media <- soma / cont

se temp > maior_valor entao
maior_valor <- temp
fimse

se temp < menor_valor entao
menor_valor <- temp
fimse

escreval("Menor temperatura: ",menor_valor," �C")
escreval("Maior temperatura: ",maior_valor," �C")
escreval("M�dia            : ",media," �C")
escreval

fimrepita
fimalgoritmo
