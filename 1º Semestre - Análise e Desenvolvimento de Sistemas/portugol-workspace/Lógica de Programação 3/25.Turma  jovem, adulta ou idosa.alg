algoritmo "Turma"
// Fun��o :
// Autor : Gabriel Ripardo de Sena
// Data : 12/04/2016
// Se��o de Declara��es 
var
qtd, idade, cont, soma : INTEIRO
media : REAL
inicio
// Se��o de Comandos
escreva("Digite a quantidade de pessoas:" )
leia(qtd)

repita
cont <- cont + 1
escreval("Aluno -", cont)
escreva("Digite a idade: ")
leia(idade)
escreval

soma <- idade + soma

ate cont = qtd

media <- soma / qtd

      se media <= 25 entao
      se media > 0 entao
         escreval
         escreva(" >> A turma � JOVEM <<")
      fimse
      fimse
      
      se media >= 26 entao
      se media <= 60 entao
         escreval
         escreva(" >> A turma � ADULTA <<")
      fimse
      fimse
         
      se media > 60 entao
         escreval
         escreva(" >> A turma � IDOSA <<")
      fimse


// 0 e 25 = JOVEM
// 26 E 60 = ADULTA
// > 60 = IDOSO
fimalgoritmo
