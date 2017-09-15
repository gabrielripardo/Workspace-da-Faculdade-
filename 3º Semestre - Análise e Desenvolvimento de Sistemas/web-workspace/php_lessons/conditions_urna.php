<html>
	<head>
		<meta charset="utf-8">
		<title> Urna eletrônica </title>
	</head>
	<body>
		<?php
			$compiled = isset ($_GET["years"]) ? $_GET["year"s]:1900;
			$myears = date("Y") - $compiled;
			echo "Você nasceu em " .$compiled. " e tem " .$myears. " anos <br>";
			
			if ($myears >= 18){
				$vota = "você pode votar";
			}else{
				$vota = "você não pode votar";
			}

			echo "Mensagem: Com essa idade ".$vota;
		?>
	</body>
<html>