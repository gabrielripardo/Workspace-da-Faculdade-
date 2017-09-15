
<?php
header("Content-type: text/html; charset=utf-8");

$aProduto = array("rice", "bean", "potatoe", "meet");

$size = count($aProduto); // count é uma função que retorna o tamanho do array
for($i = 0; $i < count($aProduto); $i++){		
	echo "Description; ".$i." - " .$aProduto[$i];
}
?>
