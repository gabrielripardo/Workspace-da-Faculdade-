algoritmo "Informações pessoais"
// Função : O programa irá receber informações e validar de acordo com a condições
//          que foi dada, como número mínimo do nome deverá conter mais de três carac
//          teres.
// Autor :  Gabriel Ripardo de Sena
// Data : 05/04/2016
// Seção de Declarações 
var
nome : CARACTERE
year : REAL
sal  : REAL
sexo : CARACTERE
cv   : CARACTERE
cv2  : CARACTERE
cont : INTEIRO
inicio
// Seção de Comandos 
repita
escreva("Nome: ")
leia(nome)
          cont <- compr (nome)
          se cont <= 3 entao
          escreval
          escreval("Digite um nome maior que três caracteres: ")
          fimse
ate cont > 3

repita
repita
escreva("Idade: ")
leia(year)
          se year > 150 entao
          se year <> 0 entao
             escreval
             escreval("Idade inválida!")
             escreval("Digite novamente")
          fimse
          fimse
ate year < 150
ate year <> 0

repita
escreva("Salário: ")
leia(sal)
         se sal <= 0 entao
         fimse
ate sal > 0

repita
escreva("Sexo 'f' ou 'm': ")
leia(sexo)
        se sexo <> "f" entao
        se sexo <> "m" entao
        escreval("Sintaxe não encotrada!")
        escreval("Tente novamente! ")
        fimse
        fimse
ate sexo = "f"

repita
escreva("Estado Civil 's', 'c', 'v', 'd': ")
leia(cv)
        escolha cv
        caso "s"
        cv <- cv2
        escreva("Estado Civil: Solteiro")
        caso "c"
        cv <- cv2
        escreva("Estado Civil: Casado")
        caso "v"
        cv <- cv2
        escreva("Estado Civil: Viúvo")
        caso "d"
        cv <- cv2
        escreva("Estado Civil: Divorciado")
        
        outrocaso
        se cv <> cv2 entao
        escreval("Sintaxe não encotrada")
        escreval("Tente Novamente!")
        fimse
fimescolha

          ate cv = cv2

//Nome: maior que 3 caracteres;
//Idade: entre 0 e 150;
//Salário: maior que zero;
//Sexo: 'f' ou 'm';
//Estado Civil: 's', 'c', 'v', 'd';
fimalgoritmo
