<?php
	$mysql_usuario = "root";
	$mysql_password = "mylife1024";
	$mysql_database = "loja";
	$mysql_host = "127.0.0.1";

	$link = mysqli_connect($mysql_host, $mysql_usuario, $mysql_password, $mysql_database);

	if(!$link){// Se não houver link printa na tela "error ao detectar"
		echo "Error ao conectar";
	}else{
		echo "Conectado com sucesso!";
	}
?>