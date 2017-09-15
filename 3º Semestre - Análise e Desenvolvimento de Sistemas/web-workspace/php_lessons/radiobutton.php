<!DOCTYPE html>
<html>
<head>
	<title>Just one Option</title>
</head>
<body>
	<form action="" method="POST">
		<label> <input type="radio" name="avaliation" value='best'> Low </label><br>
		<label> <input type="radio" name="avaliation" value="medium"> Medium </label><br>
		<label> <input type="radio" name="avaliation" value="worst"> Worst </label><br>
		<input type="submit" name="submit"/>
	</form>
	<?php
		$choose = $_POST['avaliation'];
		if(isset($_POST['submit'])){
			if(isset(isset($choose == 'best'){
				echo "<br> Escolha: " .$_POST['avaliation'];
				echo "Obrigado, volte sempre!";		
			}/**
			if(isset($_POST['avaliation']) == $_POST['avaliation'])=medium){
				echo "<br> Escolha: " .$_POST['avaliation'];
				echo "Obrigado, vamos melhorar!";		
			}
			if(isset($_POST['avaliation'])) == $_POST['avaliation'])=worst{
				echo "<br> Escolha: " .$_POST['avaliation'];		
				echo "Lamentamos, mas vamos melhorar!";
			}
			*/
		}
	?>
</body>
</html>