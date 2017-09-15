algoritmo "O peso Ideal"
// Função : Apartir da altura informada pelo usuário, o programa irá calcular qual é o peso ideal.
// Autor : Gabriel Ripardo de Sena
// Data : 31/03/2016
// Seção de Declarações 
var
altura : REAL
result : REAL
inicio
// Seção de Comandos
escreval(">>>>>>>THE WEIGHT RECOMMENDED<<<<<<<<")
escreva("Escreva sua altura: ")
leia(altura)

result <- (72.7*altura) - 58

escreva("Seu peso ideal é:",result)
 
fimalgoritmo
