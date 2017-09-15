algoritmo "TELA DE LOGIN"
// Função :  Informar se o usuário e senha estão certos ou errados
// Autor : GABRIEL RIPARDO DE SENA
// Data : 04/04/2016
// Seção de Declarações
var
user : CARACTERE
pass : CARACTERE
inicio
// Seção de Comandos
escreval("<<<<<LOGIN>>>>>")
      escreval
      escreva(">Usuário: ")
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
      escreval("          Usário e senha não podem ser iguais!")
      escreval("          Digite novamente:")
      escreval
      escreva("           >Usuário: ")
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
