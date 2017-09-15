<html>
	<head> <title> Variables </title> </head>
	<body>
		<h3> Welcome to the show of the notes </h3>
		<?php
			$note1 = 10;
			$note2 = 9.9;
			$note3 = 8;
			$message1 = "Your first note was ";
			$message2 = ", the second ";
			$message3 = " and third was "; 

			echo "Your first note was " .$note1. ", the second " .$note2. " and the third was " .$note3;
			echo "<br/>Your first note was $note1, the second $note2 and the third was $note3"; 
			echo "<br>" .$message1 .$note1. $message2. $note2. $message3. $note3;
			
			
			
			// Aritmetic operations
			$media = ($note1 + $note2 + $note3)/3;
			echo "<br>The note was: " .$media;



		?>
	</body>
</html>