algoritmo "VOGAL OU CONSOANTE"
// Função : Informar se a letra é vogal ou consoante
// Autor : Gabriel Ripardo de Sena
// Data : 28/03/2016
// Seção de Declarações 
var
vouc : CARACTERE
vouc2 : logico
inicio
// Seção de Comandos 
escreva("Digite a letra: ")
leia(vouc)
escolha vouc
caso "a", "e", "i", "o", "u"
escreva("A letra é VOGAL")
caso "b", "c", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
escreva ("A letra  é CONSOANTE")
outrocaso
escreva("O caractere informado não é vogal nem consoante!")


fimescolha


fimalgoritmo
