algoritmo "semnome"
// Função :
// Autor :
// Data : 29/03/2016
// Seção de Declarações 
var
 num1 : REAL
 num2 : REAL
 num3 : REAL

inicio
// Seção de Comandos

escreva("Escreva o primeiro número: ")        /////EXEMPLO: 3 2 1
leia(num1)

escreva("Escreva o segundo número: ")
leia(num2)

escreva("Escreva o terceiro número: ")
leia(num3)

          se num3 > num2 entao
          se num2 > num1 entao
             escreva("A sequência decrescente dos números são:",num3,num2,num1)
          senao
             escreva("A sequência decrescente dos números são:",num3,num1,num2)
          fimse
          fimse

          se num1 > num2 entao
          se num2 > num3 entao
             escreva("A sequência decrescente dos números são:",num1,num2,num3)
          senao
             escreva("A sequência decrescente dos números são:",num1,num3,num2)
          fimse
          fimse

           se num2 > num3 entao
           se num3 > num1 entao
           escreva("A sequência decrescente dos números são: ",num2, num3, num1)
            senao
            se num2 > num3 entao
            se num1 > num3 entao
           escreva("A sequência decrescente dos números são: ",num2, num1, num3)

          fimse
          fimse
          fimse
          fimse



         //
        //  se num2 > num3 entao
        //  se num3 > num1 entao
         //    escreva("A sequência decrescente dos números são:",num2,num3,num1)
        //  senao
        //     escreva("A sequência decrescente dos números são:",num2,num1,num3)
         // fimse
         // fimse

        //  se num1 > num2 entao
        //  se num2 > num3 entao
        //     escreva("A sequência decrescente dos números são:",num1,num2,num3)
        //  senao
         //    escreva("A sequência decrescente dos números são:",num1,num3,num2)
         // fimse
         // fimse


fimalgoritmo
