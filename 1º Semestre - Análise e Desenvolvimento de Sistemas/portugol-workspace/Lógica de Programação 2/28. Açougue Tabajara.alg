algoritmo "A�ougue do Tabajara"
// Fun��o : Imprimir o valor total de carne comprada com ou sem desconto
// Autor : Gabriel Ripardo
// Data : 02/04/2016
// Se��o de Declara��es 
var
qtdbeef : REAL
tipbeef : CARACTERE
total : REAL
picanha : REAL
alcatra : REAL
fileduplo : REAL
pay : CARACTERE
descont : REAL
inicio
// Se��o de Comandos 

escreval("                               At� 5 Kg           Acima de 5 Kg ")
escreval("          File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg")
escreval("          Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg")
escreval("          Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg")
escreval
escreva("Tipo de carne: ")
leia(tipbeef)
     
escreva("Quantidade de carne: ")
leia(qtdbeef)

escreval("Tabajara - Mastercard - Visa")
escreva("Tipo de pagamento: ")
leia(pay)


         se pay = "tabajara" entao
            escreval
            escreva("Voc� tem 5% de desconto")
            escreval
            escreval
            senao
         fimse


            /////////// File duplo
                        /////COM CART�O - 5Kg
                        se qtdbeef < 5 entao
                        se tipbeef = "file duplo" entao
                        se pay = "tabajara" entao
                           escreval
                           escreval("############### Cupom Fiscal ##################")
                           escreval("Tipo de carne                    : ",tipbeef)
                           escreval("Quantidade de carne              :", qtdbeef," Kg")
                           escreval("Pre�o total                      : R$",4.90*qtdbeef)
                           escreval("Tipo de pagamento                : Cart�o Tabajara")
                           escreval("Valor do desconto                : R$",0.05 *(qtdbeef*4.90))
                           escreval("Valor a pagar                    : R$",(4.90*qtdbeef) - (0.05*(4.90*qtdbeef)))
                        senao
                        //SEM CART�O - 5KG
                        se qtdbeef < 5 entao
                        se tipbeef = "file duplo" entao
                        se pay <> "tabajara" entao
                           escreval
                           escreval("############### Cupom Fiscal ##################")
                           escreval("Tipo de carne                    : ",tipbeef)
                           escreval("Quantidade de carne              :", qtdbeef," Kg")
                           escreval("Pre�o total                      : R$",4.90*qtdbeef)
                           escreval("Tipo de pagamento                : ",pay)
                           escreval("Valor do desconto                : R$ 0,00")
                           escreval("Valor a pagar                    : R$",(4.90*qtdbeef))
            fimse
            fimse
            fimse
            fimse
            fimse
            fimse
            
                        //COM CART�O + 5Kg
                        se qtdbeef > 5 entao
                        se tipbeef = "file duplo" entao
                        se pay = "tabajara" entao
                           escreval
                           escreval("############### Cupom Fiscal ##################")
                           escreval("Tipo de carne                    : ",tipbeef)
                           escreval("Quantidade de carne              :", qtdbeef," Kg")
                           escreval("Pre�o total                      : R$",5.80*qtdbeef)
                           escreval("Tipo de pagamento                : Cart�o Tabajara")
                           escreval("Valor do desconto                : R$",0.05 *(qtdbeef*5.80))
                           escreval("Valor a pagar                    : R$",(5.80*qtdbeef) - (0.05*(5.80*qtdbeef)))

                        //SEM CART�O + 5kg
                        senao
                        se qtdbeef > 5 entao
                        se tipbeef = "file duplo" entao
                        se pay <> "tabajara" entao
                           escreval
                           escreval("############### Cupom Fiscal ##################")
                           escreval("Tipo de carne                    : ",tipbeef)
                           escreval("Quantidade de carne              :", qtdbeef," Kg")
                           escreval("Pre�o total                      : R$",5.80*qtdbeef)
                           escreval("Tipo de pagamento                : ",pay)
                           escreval("Valor do desconto                : R$ 0,00")
                           escreval("Valor a pagar                    : R$",5.80*qtdbeef)
            fimse
            fimse
            fimse
            fimse
            fimse
            fimse
            
            ///////////Alcatra////////
                        /////COM CART�O - 5Kg
                        se qtdbeef < 5 entao
                        se tipbeef = "alcatra" entao
                        se pay = "tabajara" entao
                           escreval
                           escreval("############### Cupom Fiscal ##################")
                           escreval("Tipo de carne                    : ",tipbeef)
                           escreval("Quantidade de carne              :", qtdbeef," Kg")
                           escreval("Pre�o total                      : R$",5.90*qtdbeef)
                           escreval("Tipo de pagamento                : Cart�o Tabajara")
                           escreval("Valor do desconto                : R$",0.05 *(qtdbeef*5.90))
                           escreval("Valor a pagar                    : R$",(5.90*qtdbeef) - (0.05*(5.90*qtdbeef)))
                        senao
                        //SEM CART�O - 5KG
                        se qtdbeef < 5 entao
                        se tipbeef = "alcatra" entao
                        se pay <> "tabajara" entao
                           escreval
                           escreval("############### Cupom Fiscal ##################")
                           escreval("Tipo de carne                    : ",tipbeef)
                           escreval("Quantidade de carne              :", qtdbeef," Kg")
                           escreval("Pre�o total                      : R$",5.90*qtdbeef)
                           escreval("Tipo de pagamento                : ",pay)
                           escreval("Valor do desconto                : R$ 0,00")
                           escreval("Valor a pagar                    : R$",(5.90*qtdbeef))
            fimse
            fimse
            fimse
            fimse
            fimse
            fimse

                        //COM CART�O + 5Kg
                        se qtdbeef > 5 entao
                        se tipbeef = "alcatra" entao
                        se pay = "tabajara" entao
                           escreval
                           escreval("############### Cupom Fiscal ##################")
                           escreval("Tipo de carne                    : ",tipbeef)
                           escreval("Quantidade de carne              :", qtdbeef," Kg")
                           escreval("Pre�o total                      : R$",6.80*qtdbeef)
                           escreval("Tipo de pagamento                : Cart�o Tabajara")
                           escreval("Valor do desconto                : R$",0.05 *(qtdbeef*6.80))
                           escreval("Valor a pagar                    : R$",(6.80*qtdbeef) - (0.05*(6.80*qtdbeef)))

                        //SEM CART�O + 5kg
                        senao
                        se qtdbeef > 5 entao
                        se tipbeef = "alcatra" entao
                        se pay <> "tabajara" entao
                           escreval
                           escreval("############### Cupom Fiscal ##################")
                           escreval("Tipo de carne                    : ",tipbeef)
                           escreval("Quantidade de carne              :", qtdbeef," Kg")
                           escreval("Pre�o total                      : R$",6.80*qtdbeef)
                           escreval("Tipo de pagamento                : ",pay)
                           escreval("Valor do desconto                : R$ 0,00")
                           escreval("Valor a pagar                    : R$",6.80*qtdbeef)


            fimse
            fimse
            fimse
            fimse
            fimse
            fimse
         ///////////PICANHA/////////////////
                      /////COM CART�O - 5Kg
                        se qtdbeef < 5 entao
                        se tipbeef = "picanha" entao
                        se pay = "tabajara" entao
                           escreval
                           escreval("############### Cupom Fiscal ##################")
                           escreval("Tipo de carne                    : ",tipbeef)
                           escreval("Quantidade de carne              :", qtdbeef," Kg")
                           escreval("Pre�o total                      : R$",6.90*qtdbeef)
                           escreval("Tipo de pagamento                : Cart�o Tabajara")
                           escreval("Valor do desconto                : R$",0.05 *(qtdbeef*6.90))
                           escreval("Valor a pagar                    : R$",(6.90*qtdbeef) - (0.05*(6.90*qtdbeef)))
                        senao
                        //SEM CART�O - 5KG
                        se qtdbeef < 5 entao
                        se tipbeef = "picanha" entao
                        se pay <> "tabajara" entao
                           escreval
                           escreval("############### Cupom Fiscal ##################")
                           escreval("Tipo de carne                    : ",tipbeef)
                           escreval("Quantidade de carne              :", qtdbeef," Kg")
                           escreval("Pre�o total                      : R$",6.90*qtdbeef)
                           escreval("Tipo de pagamento                : ",pay)
                           escreval("Valor do desconto                : R$ 0,00")
                           escreval("Valor a pagar                    : R$",(6.90*qtdbeef))
            fimse
            fimse
            fimse
            fimse
            fimse
            fimse

                        //COM CART�O + 5Kg
                        se qtdbeef > 5 entao
                        se tipbeef = "picanha" entao
                        se pay = "tabajara" entao
                           escreval
                           escreval("############### Cupom Fiscal ##################")
                           escreval("Tipo de carne                    : ",tipbeef)
                           escreval("Quantidade de carne              :", qtdbeef," Kg")
                           escreval("Pre�o total                      : R$",7.80*qtdbeef)
                           escreval("Tipo de pagamento                : Cart�o Tabajara")
                           escreval("Valor do desconto                : R$",0.05 *(qtdbeef*7.80))
                           escreval("Valor a pagar                    : R$",(7.80*qtdbeef) - (0.05*(7.80*qtdbeef)))

                        //SEM CART�O + 5kg
                        senao
                        se qtdbeef > 5 entao
                        se tipbeef = "picanha" entao
                        se pay <> "tabajara" entao
                           escreval
                           escreval("############### Cupom Fiscal ##################")
                           escreval("Tipo de carne                    : ",tipbeef)
                           escreval("Quantidade de carne              :", qtdbeef," Kg")
                           escreval("Pre�o total                      : R$",7.80*qtdbeef)
                           escreval("Tipo de pagamento                : ",pay)
                           escreval("Valor do desconto                : R$ 0,00")
                           escreval("Valor a pagar                    : R$",7.80*qtdbeef)
            fimse
            fimse
            fimse
            fimse
            fimse
            fimse

fimalgoritmo


