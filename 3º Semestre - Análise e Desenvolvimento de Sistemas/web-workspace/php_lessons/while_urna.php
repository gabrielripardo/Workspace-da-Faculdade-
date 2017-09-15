<!DOCTYPE html>
<html>
<head>
	<meta charset="utf8">
	<title>	Contagem dos anos</title>
</head>
<body>
	<?php
		$mylife = isset ($_GET["years"]) ? $_GET["years"]:1900;
		echo "Esses são os anos que você já passou";
		while ($mylife < 2018){
			echo "<br>".$mylife; 
			$mylife += 1;
		} 
	?>
</body>
</html>