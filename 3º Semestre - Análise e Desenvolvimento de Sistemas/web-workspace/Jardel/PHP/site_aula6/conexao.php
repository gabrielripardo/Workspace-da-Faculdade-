<?php

function abrirConexao(){
	
	$mysql_host = "localhost";
	$mysql_usuario = "root";
	$mysql_password = "mylife1024";
	$mysql_database = "loja";


	
	//conectar no banco de dados

	$link = mysqli_connect($mysql_host, $mysql_usuario, $mysql_password, $mysql_database);

	if(!$link){
		return false;
	}else{
		return $link;
	}
}

//crie a função para executar consulta no banco de dados
function fecharConexao($link){
	mysqli_close($link);
}

//crie a função para encerrar a conexao com banco de dados
function executarConsulta($link, $strSql){
	$rs = mysqli_query($link, $strSql);

	return $rs;
}


?>