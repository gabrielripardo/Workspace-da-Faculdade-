 
<?php
 include "conexao.php";
 ?>
 <div class="container">
 	<div class="row">
        <div class="col-sm-10 col-md-8 col-md-offset-1 main">
		
			<div class="container-fluid">
			  <div class="row">
				<div class="col-md-10 text-center" style="background-color:lavender;">Lista de Produtos</div>
			  </div>	
			  <?php
			  
				$link = abrirConexao();
				$strSql="
				SELECT 
					id_produto, 
					nome_produto, 
					descricao_produto,
					valor_produto
				FROM 
					produto";
				$rs=executarConsulta($link,$strSql);
				
			  ?>
			  
			  <div class="row">
				<div class="col-md-2" style="background-color:lavender;">Valor</div>
				<div class="col-md-4" style="background-color:lavender;">Nome</div>
				<div class="col-md-2" style="background-color:lavender;">Descricao</div>
				<div class="col-md-2" style="background-color:lavender;">ação</div>
			 </div>
			 
			 <?php
			 
				while($linha=mysqli_fetch_array($rs,MYSQLI_ASSOC))
				{	
			
					 echo '
					 <div class="row">
						<div class="col-sm-2" style="background-color:lavenderblush;">'.$linha['valor_produto'].'</div>
						<div class="col-sm-4" style="background-color:lavenderblush;">'.$linha['nome_produto'].'</div>
						<div class="col-sm-2" style="background-color:lavenderblush;">'.$linha['descricao_produto'].'</div>
						<div class="col-sm-2" style="background-color:lavenderblush;"> 
						<a href="index.php?pagina=excluir_produto.php&idProduto='.$linha['id_produto'].'">Excluir</a>
						</div>
					 </div>
					 ';
				}
				
				fecharConexao($link);
			 ?>
			 
			</div>
    	</div>
    </div>
</div>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	