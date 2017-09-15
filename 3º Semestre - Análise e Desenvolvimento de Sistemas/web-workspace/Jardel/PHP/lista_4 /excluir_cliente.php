 <?php
 include "conexao.php";
 
	//abra a conexao com o banco de dados
 	$link = abrirConexao();
	
	//crie a consulta para excluir cliente do banco de dados
 	$strDelete = "DELETE FROM cliente 
 					WHERE 
 					id_cliente=".$_GET['idCliente'];

		
	//execute a consulta para excluir	
 	$rs=executarConsulta($link, $strDelete);
	
	//verifique se a exclusao foi realizada e emita mensagem de sucesso ou falha
 	if($rs==true){
 		echo "Cliente excluído com sucesso";
 	}else{
 		echo "Error ao tentar excluir cliente";
 	}
	
	//feche a conexao com o banco de dados
	fecharConexao($link);
  
 ?>
 
	
	
	
	
	
	
	
	
	