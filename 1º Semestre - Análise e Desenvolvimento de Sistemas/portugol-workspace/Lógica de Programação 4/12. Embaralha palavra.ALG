algoritmo "Palavra embaralhada"
// Função :
// Autor : Gabriel Ripardo de Sena
// Data : 22/04/2016
// Seção de Declarações

var
   palavra:caractere
   ePalavras:vetor[0..50] de caracter
   comprimento,x,posAleatoria:inteiro
inicio
   escreva("Digite um nome: ")
   leia(palavra)
   comprimento<-compr(palavra)
   para x de 0 ate comprimento-1 faca
        repita
              posAleatoria<-randi(comprimento)
        ate compr(ePalavras[posAleatoria])=0
        ePalavras[posAleatoria]<-copia(palavra,x+1,1)
   fimpara
   escreva("Palavra embaralhada: ")
   para x de 0 ate comprimento-1 faca
        escreva(minusc(ePalavras[x]))
   fimpara
fimalgoritmo
