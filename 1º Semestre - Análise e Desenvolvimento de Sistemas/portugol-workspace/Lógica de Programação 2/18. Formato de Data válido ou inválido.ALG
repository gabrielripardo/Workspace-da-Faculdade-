algoritmo "Formato de data v�lido"
// Fun��o : Informar se a data informada est�o nos padr�es de dia, m�s e ano.
// Autor : Gabriel Ripardo de Sena
// Data : 28/03/2016
// Se��o de Declara��es

var
dia : INTEIRO
mes : INTEIRO
ano : INTEIRO
vld : logico
inicio
   escreval("Digite a data no formato dd/mm/aaaa: ")

   escreva("Dia:")
   leia(dia)
   escreva("M�s:")
   leia(mes)
   escreva("Ano:")
   leia(ano)

   vld <- verdadeiro  //comando para verificar se na vari�vel ano foi digitado um valor mair que 0.
   se (ano < 0) entao
      vld <- falso
   else
      se ((mes < 1) OU (mes > 12)) entao //comando para verficiar se na vari�vel mes foi digitado um dia entre 1 e 12.
         vld <- falso
      senao
         se ((mes = 4) OU (mes = 6) OU (mes = 9) OU (mes = 11)) entao //se o m�s estiver correcto passar� para dia
            se ((dia < 1) OU (dia > 30)) //par�metro para verificar a informa��o contida na vari�vel 'dia' e se est� nos par�metros corretos
               vld <- falso
            fimse
         senao
            se (mes = 2) entao
               se (((ano % 4 = 0) E (ano % 100 <> 0)) OU (ano % 400 = 0)) entao
                  se ((dia < 1) OU (dia > 29)) entao
                     vld <- falso
                  fimse
               senao
                  se ((dia < 1) OU (dia > 28)) entao
                     vld <- falso
                  fimse
               fimse
            senao
               se ((dia < 1) OU (dia > 31)) entao
                  vld <- falso
               fimse
            fimse
         fimse
      fimse
   fimse
   se (vld) entao
      escreval(dia,"/",mes,"/",ano," - Data v�lida!!!") // se at� agora n�o deu nenhuma resposta negativa o programa ir� informar o dia, o m�s e o ano nos padr�es corretos.
   senao
      escreval(dia,"/",mes,"/",ano," - Data inv�lida!!!") // se tiver usu�rio tiver digitado qualquer coisa fora dos padr�es o programa ir� informar que a data digitada � inv�lida.
   fimse
fimalgoritmo
