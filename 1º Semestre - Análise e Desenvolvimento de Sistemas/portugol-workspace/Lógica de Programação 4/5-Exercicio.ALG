algoritmo "Valor v�lido ou inv�lido"
// Fun��o :
// Autor : Gabriel Ripardo de Sena
// Data : 24/04/2016
// Se��o de Declara��es

var
   taxa,custo,tcusto:real
   funcao somaImposto(taxaImposto,custo: real): real
   inicio
         taxaImposto<-(custo*taxaImposto)/100
         custo<-custo+taxaImposto
         retorne custo
   fimfuncao
inicio
   escreval("    IMPOSTOS DE RENDA+PRE�O REAL")
   escreval
   escreva("Digite o custo do produto: R$")
   leia(custo)
   escreva("Digite o valor da taxa de imposto(Em Porcentagem): %")
   leia(taxa)
   tcusto<-somaImposto(taxa,custo)
   escreva("O valor final com impostos do produto �: R$",tcusto:2:2)
fimalgoritmo
