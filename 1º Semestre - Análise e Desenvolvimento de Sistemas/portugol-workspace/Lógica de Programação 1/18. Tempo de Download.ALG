algoritmo "Tempo de Download"
// Função :   Calcular o tempo de download usando o tamanho e a velocidade
// Autor :    Gabriel Ripardo de Sena
// Data : 31/03/2016
// Seção de Declarações

Var
mb, mbps: real
time1, time2: inteiro
Inicio
escrevaL("           LOADING>>>>>>>>>>>>>>>   ")
escreva ("Digite o tamanho do arquivo em MB: ")
leia(mb)

escreva ("Digite a velocidade da internet em MB/s: ")
leia(mbps)

time1 <- int(mb/mbps)
time2 <- int (time1/60)

       escreval(time2, " minutos sera o tempo estiamdo para download")
       
       
Fimalgoritmo
