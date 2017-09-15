algoritmo "Dias da Semana"
// Função : Imprimir o dia da semana de acordo com o número correspondente
// Autor : Gabriel Ripardo de Sena
// Data : 02/04/2016
// Seção de Declarações 
var
num : REAL

inicio
escreval("                      >>>>> Dias da semana <<<<")
escreval("1-Domingo, 2-Segunda, 3-Terça, 4-Quarta, 5-Quinta, 6-Sexta, 7-Sábado")  ////////NESTA LINHA É DEFINIDA QUE O USUÁRIO DEVERÁ ESCOLHER UM NÚMERO DE ACORDO COM O DIA DA SEMANA E DIGITAR PARA QUE POSSA IMPRIMIR O DIA ESCOLHIDO.
escreva("Digite um número: ")
leia(num)

         escolha num
         caso 1
         escreval("O dia escolhido foi DOMINGO")
         
         caso 2
         escreval("O dia escolhido foi SEGUNDA")
         
         caso 3
         escreval("O dia escolhido foi TERÇA")
         
         caso 4
         escreval("O dia escolhido foi QUARTA")
         
         caso 5
         escreval("O dia escolhido foi QUINTA")
         
         caso 6
         escreval("O dia escolhido foi SEXTA")
         
         caso 7
         escreval("O dia escolhido foi SÁBADO")
fimescolha

// Seção de Comandos 
fimalgoritmo
