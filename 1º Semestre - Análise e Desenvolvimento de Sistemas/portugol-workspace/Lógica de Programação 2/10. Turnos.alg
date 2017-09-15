algoritmo "TURNOS"
// Função : Pedir ao usuário que ele forneça um dos turnos e imprimir uma saudação de acordo com horário.
// Autor :  Gabriel Ripardo de Sena
// Data : 29/03/2016
// Seção de Declarações 
var

turno : CARACTERE
inicio
// Seção de Comandos
escreva("Em que Turno você estuda?")
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
escreva("A sintaxe fornecida não está seguida aos três padrões!")

fimescolha
 
fimalgoritmo
