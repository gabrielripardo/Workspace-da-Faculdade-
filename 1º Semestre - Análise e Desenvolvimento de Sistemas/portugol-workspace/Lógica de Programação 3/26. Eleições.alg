algoritmo "Elei��o de tr�s candidatos"
// Fun��o : Mostrar o total de votos de tr�s  candidatos
// Autor : Gabriel Ripardo de Sena
// Data : 12/04/2016
// Se��o de Declara��es 
var
eleitor, cand1, cand2, cand3, cont : INTEIRO
voto : Caractere
inicio
// Se��o de Comandos 
escreva("Digite o total de eleitores: ")
leia(eleitor)

repita
cont <- cont + 1
escreval("Candidato - 1, Candidato - 2, Candidato - 3")
escreval("Eleitor:",cont)
escreva("Digite qual � o seu voto: ")
leia(voto)
escreval
         escolha voto
                 caso "1", "candidato - 1", "candidato 1", "candidato1"
                 cand1 <- cand1 + 1
                 caso "2", "candidato - 2", "candidato 2", "candidato2"
                 cand2 <- cand2 + 1
                 caso "3", "candidato - 3", "candidato 3", "candidato3"
                 cand3 <- cand3 + 1
         fimescolha
ate cont = eleitor
escreval
escreval("Resultado das Elei��es;")
escreval("Candidato 1 =", cand1," votos")
escreval("Candidato 2 =", cand2," votos")
escreval("Candidato 3 =", cand3," votos")


fimalgoritmo
