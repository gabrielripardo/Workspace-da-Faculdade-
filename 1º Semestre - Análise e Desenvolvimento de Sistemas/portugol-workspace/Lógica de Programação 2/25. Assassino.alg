algoritmo "Caça ao ASSASSINO"
// Função :  Por cinco perguntas delclarar se é suspeita, cúmplice ou assasino
// Autor : Gabriel Ripardo de Sena
// Data : 02/04/2016
// Seção de Declarações 
var
perg1 : CARACTERE
perg2 : CARACTERE
perg3 : CARACTERE
perg4 : CARACTERE
perg5 : CARACTERE
inicio
// Seção de Comandos 
s <- s
n <- n
escreval("Responda sim ou não usando 's' ou 'n'")

escreva("Telefonou para a vítima? ")  // s s
leia(perg1)

escreva("Esteve no local do crime? ") // s  n
leia(perg2)

escreva("Mora perto da vítima? ")     // n  s
leia(perg3)

escreva("Devia para a vítima? ")     //  n  s                                                2=5 3=5
leia(perg4)

escreva("Já trabalhou com a vítima? ")// n   s
leia(perg5)


          
           se perg2 = perg1 entao     //s s                ////s, s, n, n, n
           se perg2 = "s" entao
           se perg2 <> perg3 entao                        //s, n,
           se perg2 <> perg4 entao
           se perg2 <> perg5 entao
              escreva("A pessoa é SUSPEITA")

           fimse                                                                           //s, s, s, n, n
           fimse                                                                           //s, s, n, s, n
           fimse                                                                           //s, n, s, s, n
           fimse
           fimse                                                                           //s, n, n, s, s
           se perg3 <> perg1  entao                                                        //n, s, s, s, n
           se perg3 = perg2 entao
           se perg3 = "s" entao                                                        //n, s, n, s, s
           se perg3 <> perg4 entao                                                         //n, s ,n, n, s
           se perg3 <> perg5 entao                                                         //n, n, s, s, s
              escreva("A pessoa é SUSPEITA")
          fimse
          fimse
          fimse
          fimse
          fimse
           se perg4 <> perg1  entao
           se perg4 = "s" entao
           se perg4 <> perg2 entao
           se perg4 = perg3 entao
           se perg4 <> perg5 entao
              escreva("A pessoa é SUSPEITA")
          fimse
          fimse
          fimse
          fimse
          fimse
           se perg5 <> perg1  entao
           se perg5 = "s" entao
           se perg5 <> perg2 entao
           se perg5 <> perg3 entao
           se perg5 = perg4 entao
              escreva("A pessoa é SUSPEITA")
          fimse
          fimse
          fimse
          fimse
          fimse
           se perg3 = perg1  entao
           se perg3 = "s" entao
           se perg3 <> perg2 entao
           se perg3 <> perg4 entao
           se perg3 <> perg5 entao
              escreva("A pessoa é SUSPEITA")
          fimse
          fimse
          fimse
          fimse
          fimse
           se perg4 = perg1  entao
           se perg4 = "s" entao
           se perg4 <> perg2 entao
           se perg4 <> perg3 entao
           se perg4 <> perg5 entao
              escreva("A pessoa é SUSPEITA")
          fimse
          fimse
          fimse
          fimse
          fimse
           se perg1 <> perg2  entao
           se perg1 = "s" entao
           se perg1 <> perg3 entao
           se perg1 <> perg4 entao
           se perg1 = perg5 entao
              escreva("A pessoa é SUSPEITA")
          fimse
          fimse
          fimse
          fimse
          fimse
           se perg4 <> perg1  entao
           se perg4 = "s" entao
           se perg4 = perg2 entao
           se perg4 <> perg3 entao
           se perg4 <> perg5 entao
              escreva("A pessoa é SUSPEITA")
          fimse
          fimse
          fimse
          fimse
          fimse
           se perg5 <> perg1  entao
           se perg5 = "s" entao
           se perg5 = perg2 entao
           se perg5 <> perg3 entao
           se perg5 <> perg4 entao
              escreva("A pessoa é SUSPEITA")
          fimse
          fimse
          fimse
          fimse
          fimse
           se perg5 <> perg1  entao
           se perg5 = "s" entao
           se perg5 <> perg2 entao
           se perg5 = perg3 entao
           se perg5 <> perg4 entao
              escreva("A pessoa é SUSPEITA")
           fimse
           fimse
           fimse
           fimse
           fimse

                     /////////////////CÚMPLICE/////////////////////
                     
           
           se perg1 = perg2 entao
           se perg1 = "s" entao
           se perg2 = perg3 entao
           se perg3 <> perg4 entao
           se perg3 <> perg5 entao
           escreva("A pessoa é CÚMPLICE")
           fimse
           fimse
           fimse
           fimse
           fimse
           
           se perg2 = perg3 entao
           se perg2 = "s"  entao
           se perg3 = perg4 entao
           se perg3 <> perg1 entao
           se perg3 <> perg5 entao
           escreva("A pessoa é CÚMPLICE")
           fimse
           fimse
           fimse
           fimse
           fimse

           se perg3 = perg4 entao
           se perg3 = "s"  entao
           se perg4 = perg5 entao
           se perg3 <> perg2 entao
           se perg3 <> perg1 entao
           escreva("A pessoa é CÚMPLICE")
           fimse
           fimse
           fimse
           fimse
           fimse
           se perg4 = perg5 entao
           se perg4 = "s"   entao
           se perg5 = perg1 entao
           se perg4 <> perg2 entao
           se perg4 <> perg3 entao
           escreva("A pessoa é CÚMPLICE")
           fimse
           fimse
           fimse
           fimse
           fimse
           se perg1 = perg2 entao
           se perg1 = "s"  entao
           se perg2 = perg3 entao
           se perg3 = perg4 entao
           se perg5 <> "s" entao
           escreva("A pessoa é CÚMPLICE")
           fimse
           fimse
           fimse
           fimse
           fimse
           se perg5 = perg4 entao
           se perg5 = "s"   entao
           se perg4 = perg3 entao
           se perg3 = perg2 entao
           se perg1 <> "s" entao
           escreva("A pessoa é CÚMPLICE")
           fimse
           fimse
           fimse
           fimse
           fimse
           se perg5 = perg4 entao
           se perg1 = "s"   entao
           se perg4 = perg2 entao
           se perg3 = perg1 entao
           se perg3 <> "s" entao
           escreva("A pessoa é CÚMPLICE")
           fimse
           fimse
           fimse
           fimse
           fimse
           se perg4 = perg5 entao
           se perg1 = "s"   entao
           se perg4 = perg3 entao
           se perg3 = perg1 entao
           se perg2 <> "s" entao
           escreva("A pessoa é CÚMPLICE")
           fimse
           fimse
           fimse
           fimse
           fimse
           se perg1 = perg2 entao
           se perg2 = "s"   entao
           se perg2 = perg3 entao
           se perg3 = perg5 entao
           se perg4 <> "s" entao
           escreva("A pessoa é CÚMPLICE")

           se perg1 = "s" entao
           se perg2 = "n" entao
           se perg3 = "s" entao
           se perg4 = "n" entao
           se perg5 = "s" entao
           escreva("A pessoa é CÚMPLICE")
           fimse
           fimse
           fimse
           fimse
           fimse
           
           fimse
           fimse
           fimse
           fimse
           fimse
           se perg1 = "s" entao
           se perg2 = "s" entao
           se perg3 = "s" entao
           se perg4 = "s" entao
           escreva("A pessoa é o ASSASSINO")
           fimse
           fimse
           fimse
           fimse

          //2 "s" = Suspeita
//3 ou/e 4 "s" = Cúmplice
//5 "s" = Culpado

//se perg1 = "s"
//se perg2 = "n"
//se p

fimalgoritmo


