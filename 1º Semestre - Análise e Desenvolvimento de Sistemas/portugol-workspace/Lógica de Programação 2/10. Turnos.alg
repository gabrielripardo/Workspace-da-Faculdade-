algoritmo "TURNOS"
// Fun��o : Pedir ao usu�rio que ele forne�a um dos turnos e imprimir uma sauda��o de acordo com hor�rio.
// Autor :  Gabriel Ripardo de Sena
// Data : 29/03/2016
// Se��o de Declara��es 
var

turno : CARACTERE
inicio
// Se��o de Comandos
escreva("Em que Turno voc� estuda?")
Escreval
escreva("M-Matutino, V-Vespertino ou N-Noturno?: ")
leia(turno)

escolha turno
caso "M-Matutino", "m", "matutino"
escreva("Bom Dia!")

caso "V-Vespertino", "vespertino", "v"
escreva("Boa Tarde!")

caso "N-Noturno", "n", "noturno"
escreva("Boa Noite!")

outrocaso
escreva("A sintaxe fornecida n�o est� seguida aos tr�s padr�es!")

fimescolha
 
fimalgoritmo
