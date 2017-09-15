<?php

		$mysql_usuario = "root";			
		$mysql_password = "";		
		$mysql_database = "loja";		
		$mysql_host  = "127.0.0.1";

		
		$link = mysqli_connect($mysql_host, $mysql_usuario, $mysql_password);

		if (!$link) {
			echo "Erro ao conectar.";
			exit;
		}else {
			
			echo "Sucesso ao conectar.";
			
			$strSql="
			CREATE DATABASE IF NOT EXISTS loja DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
			";
			
			$r=mysqli_query($link,$strSql);
			var_dump($r);
			mysqli_close($link);
	
		$linkTable = mysqli_connect($mysql_host, $mysql_usuario, $mysql_password, $mysql_database);
		
			$strSqlTable="
			CREATE TABLE IF NOT EXISTS cliente (
  id_cliente int(11) NOT NULL AUTO_INCREMENT,
  nome_cliente varchar(100) DEFAULT NULL,
  cpf_cliente varchar(11) DEFAULT NULL,
  data_nasc_cliente date DEFAULT NULL,
  PRIMARY KEY (id_cliente)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;
";
			
		$rt=mysqli_query($linkTable,$strSqlTable);	
			
			var_dump($rt);
			mysqli_close($linkTable);
			
			
			$linkInsert = mysqli_connect($mysql_host, $mysql_usuario, $mysql_password, $mysql_database);
		
			$strSqlInsert="
	INSERT INTO cliente (id_cliente, nome_cliente, cpf_cliente, data_nasc_cliente) VALUES
(1, 'joao', '99988877766', '2000-01-01'),
(2, 'maria', '55544433322', '1990-01-01');

";
			
		$ri=mysqli_query($linkInsert,$strSqlInsert);	
			
			var_dump($ri);
			mysqli_close($linkInsert);	
		}
?>