algoritmo "Formato de data válido"
// Função : Informar se a data informada estão nos padrões de dia, mês e ano.
// Autor : Gabriel Ripardo de Sena
// Data : 28/03/2016
// Seção de Declarações

var
dia : INTEIRO
mes : INTEIRO
ano : INTEIRO
vld : logico
inicio
   escreval("Digite a data no formato dd/mm/aaaa: ")

   escreva("Dia:")
   leia(dia)
   escreva("Mês:")
   leia(mes)
   escreva("Ano:")
   leia(ano)

   vld <- verdadeiro  //comando para verificar se na variável ano foi digitado um valor mair que 0.
   se (ano < 0) entao
      vld <- falso
   else
      se ((mes < 1) OU (mes > 12)) entao //comando para verficiar se na variável mes foi digitado um dia entre 1 e 12.
         vld <- falso
      senao
         se ((mes = 4) OU (mes = 6) OU (mes = 9) OU (mes = 11)) entao //se o mês estiver correcto passará para dia
            se ((dia < 1) OU (dia > 30)) //parâmetro para verificar a informação contida na variável 'dia' e se está nos parâmetros corretos
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
      escreval(dia,"/",mes,"/",ano," - Data válida!!!") // se até agora não deu nenhuma resposta negativa o programa irá informar o dia, o mês e o ano nos padrões corretos.
   senao
      escreval(dia,"/",mes,"/",ano," - Data inválida!!!") // se tiver usuário tiver digitado qualquer coisa fora dos padrões o programa irá informar que a data digitada é inválida.
   fimse
fimalgoritmo
