algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 29/03/2016
// Se��o de Declara��es 
var
 num1 : REAL
 num2 : REAL
 num3 : REAL

inicio
// Se��o de Comandos

escreva("Escreva o primeiro n�mero: ")        /////EXEMPLO: 3 2 1
leia(num1)

escreva("Escreva o segundo n�mero: ")
leia(num2)

escreva("Escreva o terceiro n�mero: ")
leia(num3)

          se num3 > num2 entao
          se num2 > num1 entao
             escreva("A sequ�ncia decrescente dos n�meros s�o:",num3,num2,num1)
          senao
             escreva("A sequ�ncia decrescente dos n�meros s�o:",num3,num1,num2)
          fimse
          fimse

          se num1 > num2 entao
          se num2 > num3 entao
             escreva("A sequ�ncia decrescente dos n�meros s�o:",num1,num2,num3)
          senao
             escreva("A sequ�ncia decrescente dos n�meros s�o:",num1,num3,num2)
          fimse
          fimse

           se num2 > num3 entao
           se num3 > num1 entao
           escreva("A sequ�ncia decrescente dos n�meros s�o: ",num2, num3, num1)
            senao
            se num2 > num3 entao
            se num1 > num3 entao
           escreva("A sequ�ncia decrescente dos n�meros s�o: ",num2, num1, num3)

          fimse
          fimse
          fimse
          fimse



         //
        //  se num2 > num3 entao
        //  se num3 > num1 entao
         //    escreva("A sequ�ncia decrescente dos n�meros s�o:",num2,num3,num1)
        //  senao
        //     escreva("A sequ�ncia decrescente dos n�meros s�o:",num2,num1,num3)
         // fimse
         // fimse

        //  se num1 > num2 entao
        //  se num2 > num3 entao
        //     escreva("A sequ�ncia decrescente dos n�meros s�o:",num1,num2,num3)
        //  senao
         //    escreva("A sequ�ncia decrescente dos n�meros s�o:",num1,num3,num2)
         // fimse
         // fimse


fimalgoritmo
