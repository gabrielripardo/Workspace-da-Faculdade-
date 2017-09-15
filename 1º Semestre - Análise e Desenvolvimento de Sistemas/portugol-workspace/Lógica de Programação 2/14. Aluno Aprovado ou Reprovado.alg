algoritmo "Aluno Aprovado ou REPROVADO"
// Função :
// Autor :
// Data : 02/04/2016
// Seção de Declarações 
var
nota1 : REAL
nota2 : REAL
media : REAL
inicio
// Seção de Comandos
escreva("Digite a primeira nota: ")
leia(nota1)
escreva("Digite a segunda nota: ")
leia(nota2)

media <- (nota1 + nota2)/2


      se media >= 4.0 entao          // 4.0, 4.1, 4.2, 4.3 ... ate 5.9
      se media < 6.0 entao
      escreval
      escreval("Média:  ",media)
      escreval("Conceito: D")
      escreval("Situação: REPROVADO") senao
      fimse
      fimse

      se media < 4.0 entao         // 3.9, 3.8, 3.9  ate 0.0
      se media > 0.0 entao
      escreval
      escreval("Média:  ",media)
      escreval("Conceito: E")
      escreval("Situação: REPROVADO")
      fimse
      fimse
  
      se media >= 7.5 entao    // 7.5, 7.6, 7.7 .... ate 8.9
      se media < 9.0  entao
      escreval
      escreval("Média:  ",media)
      escreval("Conceito: B")
      escreval("Situação: APROVADO")
      fimse
      fimse
  
      se media >= 6.0 entao        // 6.0, 6.1, 6.2 .... ate 7.4
      se media < 7.5  entao
      escreval
      escreval("Média:  ",media)
      escreval("Conceito: C")
      escreval("Situação: APROVADO")
      fimse
      fimse
  
      se media >= 9 entao  //9.0, 9.1 .... ate 10
      se media <= 10.0 entao
      escreval
      escreval("Média:  ",media)
      escreval("Conceito: A")
      escreval("Situação: APROVADO")
      fimse
      fimse

fimalgoritmo
