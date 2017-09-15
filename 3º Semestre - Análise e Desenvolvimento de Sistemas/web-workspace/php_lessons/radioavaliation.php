	<?php
		echo "Página php";
		if(isset($_POST['submit'])){
			if(isset($_POST['avaliation'])){
				echo "<br> Escolha: " .$_POST['avaliation'];		
			}
		}
	?>