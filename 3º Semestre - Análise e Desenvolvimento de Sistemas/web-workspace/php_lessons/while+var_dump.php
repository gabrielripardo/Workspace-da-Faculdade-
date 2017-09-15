<?php
header("Content-type: text/html; charset=utf-8");

$aVeiculo[0] = "moto";
$aVeiculo[1] = "carro";
$aVeiculo[2] = "bike";

$tamanho = count($aVeiculo);
$i = 0;
while($i < $tamanho) {
	echo "<br> Veiculo: " .$aVeiculo[$i];	
	$i++;
}

echo "<br>";
var_dump($aVeiculo); // Função que descreve o que tem dentro de $aVeiculo
?>