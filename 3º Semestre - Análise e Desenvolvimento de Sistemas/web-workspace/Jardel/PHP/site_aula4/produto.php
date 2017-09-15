<?php
header("Content-type: text/html; charset=utf-8"); // Instrução para colocar caracteres especiais

//recupere os valores do formulário
$strDescricao = $_POST['descricao'];
$floatPreco = $_POST['preco'];
$floatDesc = $_POST['desconto'];

//faça o cálculo do valor final com desconto
$precoFinal = $floatPreco - ($floatPreco * ($floatDesc / 100)); // Padrão de programação: escrever a segunda palavra de uma variável em maiúsculo. Os programadores chamam de "Came Case". 

//imprima a descrição, preço e preço com desconto
echo "<br>Descrição: " .$strDescricao;
echo "<br>Preço: " .$floatPreco;
echo "<br> Valor a ser pago: " .$precoFinal;
?>
