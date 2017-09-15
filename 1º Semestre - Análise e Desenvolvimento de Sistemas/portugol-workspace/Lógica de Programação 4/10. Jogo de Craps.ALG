algoritmo "Jogo de Craps"
// Função :
// Autor : Gabriel Ripardo de Sena
// Data : 25/04/2016
// Seção de Declarações

var
   Resposta,stop:caractere
   Resultado,Jogadas,Pontos,aposta:inteiro
funcao Dados():inteiro
var
   dados1:vetor[0..5] de inteiro
   dados2:vetor[0..5] de inteiro
   ind,ind2:inteiro
   x,c,D1,D2,DT:inteiro
inicio
   dados1[0]<-1
   dados2[0]<-1
   para x de 1 ate 5 faca
      dados1[x]<-dados1[x-1]+1
   fimpara
   para x de 1 ate 5 faca
      dados2[x]<-dados2[x-1]+1
   fimpara
   ind<-randi(5)
   ind2<-randi(5)
   D1<-dados1[ind]
   D2<-dados2[ind2]
   DT<-D1+D2
   retorne DT
fimfuncao
procedimento craps(N:inteiro)
inicio
   se (N=2) ou (N=3) ou (N=12) entao
      escreval
      escreval("CRAPS!")
      escreval("Você perdeu.")
      escreval
   fimse
fimprocedimento
procedimento oJogar(var resposta,pontos:inteiro)
var
   ondeJogar:caractere
   aposta:inteiro
inicio
   pontos<-1000
   escreval("Seus pontos: ",pontos)
   repita
         escreva("Quanto irá apostar de seus pontos(limite:100): ")
         leia(aposta)
   ate (aposta<=100)
   repita
      escreval("TABELA: PASSLINE/DON'PASS/FIELD")
      escreval("(Digite uma das opções da tabela)")
      escreva("Digite onde quer apostar: ")
      leia(ondeJogar)
      escolha ondeJogar
              caso "passline"
                   escreval("Aposta em 7 ou 11 pontos no come out.")
                   se (resposta=7) ou (resposta=11) entao
                      escreval("Ganhou!")
                      pontos<-pontos+aposta
                      escreval("Seus pontos: ",pontos)
                      fimalgoritmo
                   senao
                      se (resposta=2) ou (resposta=3) ou (resposta=12) entao
                          escreval
                          escreval("CRAPS!")
                          escreval("Você perdeu.")
                          escreval
                          fimalgoritmo
                      senao
                           pontos<-pontos-aposta
                           escreval("Seus pontos: ",pontos)
                           escreval("Para o 'Point'.")
                      fimse
                   fimse
              caso "don't pass"
                   escreval("Aposta na casa 2,3 ou 12 pontos.")
                   se (resposta=2) ou (resposta=3) ou (resposta=12) entao
                      escreval("Ganhou!")
                      pontos<-pontos+aposta
                      escreval("Seus pontos: ",pontos)
                   senao
                      se (resposta=7) ou (resposta=11) entao
                           escreval
                           escreval("CRAPS!")
                           escreval("Você perdeu.")
                           escreval
                           fimalgoritmo
                      senao
                           pontos<-pontos-aposta
                           escreval("Seus pontos: ",pontos)
                           escreval("Para o 'Point'.")
                      fimse
                   fimse
              caso "field"
                   escreval("Aposta em 2,3,4,9,10,11,12 pontos.")
                   se (resposta=2) ou (resposta=3) ou (resposta=4) ou (resposta=9) ou (resposta=10) ou (resposta=11) ou (resposta=12) entao
                      escreval("Ganhou!")
                      pontos<-pontos+aposta
                      escreval("Seus pontos: ",pontos)
                   senao
                      pontos<-pontos-aposta
                      escreval("Seus pontos: ",pontos)
                      escreval("Para o 'Point'.")
                   fimse
              OUTROCASO
                   escreval("(Erro! Escolha apenas as opções da tabela sobre 'Come Out')")
      fimescolha
   escreval("Resultado dos dados:",resposta)
   ate (ondeJogar="passline") ou (ondeJogar="don't pass") ou (ondeJogar="field")
fimprocedimento
   procedimento oJogar2(var r,pontos:inteiro)
   var
      ondeJogar2:caractere
      aposta2:inteiro
   inicio
      escreval("Seus pontos: ",pontos)
      repita
         escreva("Quanto irá apostar de seus pontos(limite:100): ")
         leia(aposta2)
      ate (aposta2<=100)
      repita
      escreval("TABELA: COME/DON'T COME/4/5/6/8/9/10/FIELD")
      escreval("(Digite uma das opções da tabela)")
      escreva("Digite onde quer apostar: ")
      leia(ondeJogar2)
      escolha ondeJogar2
              caso "Come"
                   escreval("Aposta em 7 ou 11 pontos no point.")
                   escreval("Dados: ",r)
                   se (r=7) ou (r=11) entao
                      escreval("Ganhou!")
                      pontos<-pontos+aposta2
                   senao
                      se (r=2) ou (r=3) ou (r=12) entao
                          escreval
                          escreval("CRAPS!")
                          escreval("Você perdeu.")
                          escreval
                          fimalgoritmo
                      senao
                          pontos<-pontos-aposta2
                          escreval("Seus pontos: ",pontos)
                          escreval("Ainda no point: ")
                      fimse
                   fimse
              caso "Don't come"
                   escreval("Aposta na casa 2,3 ou 12 pontos.")
                   escreval("Dados: ",r)
                   se (r=2) ou (r=3) ou (r=12) entao
                      escreval("Ganhou!")
                      pontos<-pontos+apostas2
                   senao
                      se (r=7) ou (r=11) entao
                         escreval
                         escreval("CRAPS!"
                         escreval("Você perdeu.")
                         escreval
                         fimalgoritmo
                      senao
                         pontos<-pontos-apostas2
                         escreval("Seus pontos: ",pontos
                         escreval("Ainda no point: ")
                      fimse
                   fimse
              caso "4"
                   escreval("Aposta em 4 pontos:  ")
                   escreval("Dados: ",r)
                   se (r=4) entao
                      escreval("Ganhou!")
                      pontos<-pontos+apostas2
                   senao
                      pontos<-pontos-apostas2
                   fimse
              caso "5"
                   escreval("Aposta em 5 pontos: ")
                   escreval("Dados: ",r)
                   se (r=5) entao
                      escreval("Ganhou!")
                      pontos<-pontos+apostas2
                   senao
                      pontos<-pontos-apostas2
                   fimse
              caso "6"
                   escreval("Aposta em 6 pontos: ")
                   escreval("Dados: ",r)
                   se (r=6) entao
                      escreval("Ganhou!")
                      pontos<-pontos+apostas2
                   senao
                      pontos<-pontos-apostas2
                   fimse
              caso "8"
                   escreval("Aposta em 8 pontos: ")
                   escreval("Dados: ",r)
                   se (r=8) entao
                      escreval("Ganhou!")
                      pontos<-pontos+apostas2
                   senao
                      pontos<-pontos-apostas2
                   fimse
              caso "9"
                   escreval("Aposta em 9 pontos: ")
                   escreval("Dados: ",r)
                   se (r=9) entao
                      escreval("Ganhou!")
                      pontos<-pontos+apostas2
                   senao
                      pontos<-pontos-apostas2
                   fimse
              caso "10"
                   escreval("Aposta em 10 pontos: ")
                   escreval("Dados: ",r)
                   se (r=10) entao
                      escreval("Ganhou!")
                      pontos<-pontos+apostas2
                   senao
                      pontos<-pontos-apostas2
                   fimse
              caso "field"
                   escreval("Aposta em 2,3,4,9,10,11,12 pontos.")
                   escreval("Dados: ",r)
                   se (r=2) ou (r=3) ou (r=4) ou (r=9) ou (r=10) ou (r=11) ou (r=12) entao
                      escreval("Ganhou!")
                      pontos<-pontos+aposta2
                      escreval("Seus pontos: ",pontos)
                   senao
                      pontos<-pontos-aposta2
                      escreval("Seus pontos: ",pontos)
                      escreval("Para o 'Point'.")
                   fimse
              OUTROCASO
                   escreval("(Erro! Escolha apenas as opções da tabela)")
      fimescolha
      ate (ondeJogar2="come") ou (ondeJogar2="don't come") ou (ondeJogar2="4") ou (ondeJogar2="5") ou (ondeJogar2="6") ou (ondeJogar2="8") ou (ondeJogar2="9") ou (ondeJogar2="10") ou (ondeJogar2="field")
   fimprocedimento
inicio
   pontos<-1000
   repita
   escreva("Deseja continuar?(Qualquer tecla pra continuar/N para parar): ")
   leia(stop)
   se (stop="n") entao
      fimalgoritmo
   fimse
   jogadas<-jogadas+1
      repita
         se (jogadas=1) entao
            escrevaL("COME OUT!")
            repita
               escreval("Digite 'jogar'")
               escreva(jogadas,"° jogada: ")
               leia(resposta)
               se (resposta<>"jogar") entao
               escreval("(Digite 'jogar' para lançar os dados)")
               fimse
            ate (resposta="jogar")
            resultado<-Dados
            oJogar(resultado,pontos)
         senao
            escreval("Point!")
            repita
               escreval("Digite 'jogar'")
               escreva(jogadas,"° jogada: ")
               leia(resposta)
               se (resposta<>"jogar") entao
               escreval("(Digite 'jogar' para lançar os dados)")
               fimse
            ate (resposta="jogar")
            resultado<-Dados
            oJogar2(resultado,pontos)
         fimse
      ate (resposta = "jogar")
   ate stop="N"
fimalgoritmo
