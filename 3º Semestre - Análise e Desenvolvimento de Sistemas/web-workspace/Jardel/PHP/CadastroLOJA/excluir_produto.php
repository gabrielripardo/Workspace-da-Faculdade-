 <?php
 include "conexao.php";
 
	//abra a conexao com o banco de dados
 	$link = abrirConexao();
	
	//crie a consulta para excluir cliente do banco de dados
 	$strDelete = "DELETE FROM produto 
 					WHERE 
 					id_produto=".$_GET['idProduto'];
		
	//execute a consulta para excluir	
 	$rs=executarConsulta($link, $strDelete);
	
	//verifique se a exclusao foi realizada e emita mensagem de sucesso ou falha
 	if($rs==true){
 		echo "Produto excluído com sucesso";
 	}else{
 		echo "Error ao tentar excluir produto";
 	}
	
	//feche a conexao com o banco de dados
	fecharConexao($link);
  
 ?>
 
	
	
	
	
	
	
	
	
	