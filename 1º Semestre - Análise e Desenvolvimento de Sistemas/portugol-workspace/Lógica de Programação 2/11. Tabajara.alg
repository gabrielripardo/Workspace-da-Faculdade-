algoritmo "Organiza��es Tabajara"
// Fun��o : Informar o sal�rio ap�s v�rios tipos de reajustes.
// Autor : Gabriel Ripardo de Sena
// Data : 01/04/2016
// Se��o de Declara��es 
var
salario : REAL
reaj1 : REAL
reaj2 : REAL
reaj3 : REAL
reaj4 : REAL

inicio
// Se��o de Comandos
escreva("Digite o sal�rio: ")
leia(salario)

reaj1 <- salario * 0.2
reaj2 <- salario * 0.15
reaj3 <- salario * 0.1
reaj4 <- salario * 0.05


     se (salario <= 280) entao
        escreval("O sal�rio antes do reajuste: ",salario)
        escreval("O percentual de aumento aplicado: 20 por cento")
        escreval("O valor do aumento: ",reaj1)
        escreval("O novo sal�rio, ap�s o aumento: ", (reaj1+salario) )

     senao
        se salario >= 1500 entao
        escreval("O sal�rio antes do reajuste: ",salario)
        escreval("O percentual de aumento aplicado: 5 por cento")
        escreval("O valor do aumento: ",reaj4)
        escreval("O novo sal�rio, ap�s o aumento: ", (reaj4+salario) )
        
     senao
        se salario >= 280 entao
        se salario <= 700 entao
        escreval("O sal�rio antes do reajuste: ",salario)
        escreval("O percentual de aumento aplicado: 15 por cento")
        escreval("O valor do aumento: ",reaj2)
        escreval("O novo sal�rio, ap�s o aumento: ", (reaj2+salario) )
        
     senao
        se salario > 700 entao
        se salario < 1500 entao
        escreval("O sal�rio antes do reajuste: ",salario)
        escreval("O percentual de aumento aplicado: 10 por cento")
        escreval("O valor do aumento: ",reaj3)
        escreval("O novo sal�rio, ap�s o aumento: ", (reaj3+salario) )

        senao
        escreval("Sintaxe n�o encontrada")
fimse
fimse
fimse
fimse
fimse
fimse


fimalgoritmo







