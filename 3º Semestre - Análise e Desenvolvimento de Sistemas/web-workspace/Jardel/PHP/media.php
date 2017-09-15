<html>
<head>
	<title> Input </title>
	<style>
	body{
		background-color: yellow;
	}
	#media{
		color:blue;
	}
	#notas{
		color:green;
	}
	</style>
</head>
<body>
	<p id="media">
		<?php
		$nota1 = $_POST['val1'];
		$nota2 = $_POST['val2'];

		$media = ($nota1 + $nota2) / 2;

		echo "Média: ".$media;  
		?>
	</p>
	<p id="notas">
		<?php
		$nota1 = $_POST['val1'];
		$nota2 = $_POST['val2'];

		echo "Nota1: ".$nota1;
		echo "<br>Nota2: ".$nota2; 
		?>
	</p>
</body>
</html>