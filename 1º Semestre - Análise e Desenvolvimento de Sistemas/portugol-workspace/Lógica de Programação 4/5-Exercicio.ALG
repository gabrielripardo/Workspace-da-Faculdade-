algoritmo "Valor válido ou inválido"
// Função :
// Autor : Gabriel Ripardo de Sena
// Data : 24/04/2016
// Seção de Declarações

var
   taxa,custo,tcusto:real
   funcao somaImposto(taxaImposto,custo: real): real
   inicio
         taxaImposto<-(custo*taxaImposto)/100
         custo<-custo+taxaImposto
         retorne custo
   fimfuncao
inicio
   escreval("    IMPOSTOS DE RENDA+PREÇO REAL")
   escreval
   escreva("Digite o custo do produto: R$")
   leia(custo)
   escreva("Digite o valor da taxa de imposto(Em Porcentagem): %")
   leia(taxa)
   tcusto<-somaImposto(taxa,custo)
   escreva("O valor final com impostos do produto é: R$",tcusto:2:2)
fimalgoritmo
