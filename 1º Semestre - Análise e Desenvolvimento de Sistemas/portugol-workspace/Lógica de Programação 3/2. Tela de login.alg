algoritmo "TELA DE LOGIN"
// Fun��o :  Informar se o usu�rio e senha est�o certos ou errados
// Autor : GABRIEL RIPARDO DE SENA
// Data : 04/04/2016
// Se��o de Declara��es
var
user : CARACTERE
pass : CARACTERE
inicio
// Se��o de Comandos
escreval("<<<<<LOGIN>>>>>")
      escreval
      escreva(">Usu�rio: ")
      leia(user)

      escreva(">Senha: ")
      leia(pass)
se user <> pass entao
escreva("Login correto!")
   senao
   se user = pass entao
   repita
      escreval
      escreval("          <<<<<LOGIN - Incorreto>>>>>")
      escreval("          Us�rio e senha n�o podem ser iguais!")
      escreval("          Digite novamente:")
      escreval
      escreva("           >Usu�rio: ")
      leia(user)

      escreva("           >Senha: ")
      leia(pass)
   ate user <> pass
   
   se user <> pass entao
   escreval
   escreva("                            Login correto!")
fimse
fimse
fimse

fimalgoritmo
