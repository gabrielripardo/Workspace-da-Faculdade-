<?php
// This is a simple comment test
//Funçoes ou métodos
function myMedia($num1, $num2){
	$media = ($num1 + $num2)/2;
	return ($media);
}

$result = myMedia(5, 5);
echo "Média = " .$result. "<br>";

// Fluxo de controle
$a = 0;
while ($a <= 15){
	echo "<br>" .$a;
	$a = $a + 1;
} 
for($a = 0; $a <= 20; $a++){
	echo "<br>" .$a;
}
?>