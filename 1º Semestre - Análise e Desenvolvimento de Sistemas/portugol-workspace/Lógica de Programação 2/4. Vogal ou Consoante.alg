algoritmo "VOGAL OU CONSOANTE"
// Fun��o : Informar se a letra � vogal ou consoante
// Autor : Gabriel Ripardo de Sena
// Data : 28/03/2016
// Se��o de Declara��es 
var
vouc : CARACTERE
vouc2 : logico
inicio
// Se��o de Comandos 
escreva("Digite a letra: ")
leia(vouc)
escolha vouc
caso "a", "e", "i", "o", "u"
escreva("A letra � VOGAL")
caso "b", "c", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
escreva ("A letra  � CONSOANTE")
outrocaso
escreva("O caractere informado n�o � vogal nem consoante!")


fimescolha


fimalgoritmo
