algoritmo "O peso Ideal"
// Fun��o : Apartir da altura informada pelo usu�rio, o programa ir� calcular qual � o peso ideal.
// Autor : Gabriel Ripardo de Sena
// Data : 31/03/2016
// Se��o de Declara��es 
var
altura : REAL
result : REAL
inicio
// Se��o de Comandos
escreval(">>>>>>>THE WEIGHT RECOMMENDED<<<<<<<<")
escreva("Escreva sua altura: ")
leia(altura)

result <- (72.7*altura) - 58

escreva("Seu peso ideal �:",result)
 
fimalgoritmo
