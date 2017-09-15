<html>
	<head>
		<meta charset="utf-8">
		<title> Urna eletrônica </title>
	</head>
	<body>
		<?php
			$year = isset($_GET["ano"])?$_GET["ano"]:1900;
			
			echo $year;
		?>
	</body>
<html>