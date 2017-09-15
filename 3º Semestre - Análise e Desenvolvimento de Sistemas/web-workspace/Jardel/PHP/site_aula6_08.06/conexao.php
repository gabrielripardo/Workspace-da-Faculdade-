<?php

function abrirConexao(){
	
	$mysql_host = "127.0.0.1";
	$mysql_usuario = "root";
	$mysql_password = "mylife1024";
	$mysql_database = "loja";
	
	$link = mysqli_connect($mysql_host,$mysql_usuario,$mysql_password,$mysql_database);

	if(!$link){
		return false;
	}else{
		return $link;
	}
}

function fecharConexao($link){
	mysqli_close($link);
}

function executarConsulta($link, $strSql){
	
	$rs = mysqli_query($link, $strSql);
	
	return $rs;
}

function inserirId($link, $strSql){
	
	mysqli_query($link,$strSql);
	
	$id = mysqli_insert_id($link);
	
	return $id;
} 


?>










