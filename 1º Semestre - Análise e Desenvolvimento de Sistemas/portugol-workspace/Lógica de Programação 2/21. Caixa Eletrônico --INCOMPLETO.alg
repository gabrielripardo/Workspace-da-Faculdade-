algoritmo "Caixa Eletr�nico"
// Fun��o :  Sacar notas de 1, 5, 10, 50 e 100
// Autor : Gabriel Ripardo de Sena
// Data : 02/04/2016
// Se��o de Declara��es 
var
centen : REAL
dezen : REAL
unid : REAL

inicio
// Se��o de Comando
escreval("Informe o valor a ser sacado")
escreva(:)
leia(centen)

se unid >=5 entao
se unid < 10
escreva(cent," notas de cem reais,",dezen," notas de 10 reais, 1 nota de 5 reais")

senao
se unid   entao
se unid < 10
escreva(cent," notas de cem reais,",dezen," notas de 10 reais, 1 nota de 5 reais")

escreva(:)
leia(dezen)

escreva(:)
leia(unid)

escreva(cent," notas de cem reais,",dezen," notas de 10 reais,",unid," de 1 real)

// O programa dever� perguntar ao usu�rio a valor do saque e depois informar
// quantas notas de cada valor ser�o fornecidas. As notas dispon�veis ser�o as de 1, 5, 10, 50 e 100 reais.
// O valor m�nimo � de 10 reais e o m�ximo de 600 reais. O programa n�o deve se preocupar com a quantidade de notas existentes na m�quina.

    //Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
    //Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece tr�s notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
 
fimalgoritmo
