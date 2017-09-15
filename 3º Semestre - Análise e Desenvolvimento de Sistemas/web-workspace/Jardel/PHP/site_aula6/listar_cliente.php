 <?php
 //importar o arquivo de conexao
include "conexao.php";
 
 ?>
 <div class="container">
      <div class="row">
        <div class="col-sm-10 col-md-8 col-md-offset-1 main">
		
			<div class="container-fluid">
			  <div class="row">
				<div class="col-md-10 text-center" style="background-color:lavender;">Lista de Clientes</div>
			  </div>	
			  <?php
				//abrir conexao com banco de dados 
				$link = abrirConexao();
				
				//criar consulta sql
				$strSql = "Select 
				id_cliente,
				nome_cliente,
				cpf_cliente,
				data_nasc_cliente
				from cliente
				";
					
				//executar consulta sql e retornar o resultado	
				$rs = executarConsulta($link, $strSql);
				
			  ?>
			  
			  <div class="row">
				<div class="col-md-2" style="background-color:lavender;">nome</div>
				<div class="col-md-4" style="background-color:lavender;">cpf</div>
				<div class="col-md-2" style="background-color:lavender;">endereco</div>
				<div class="col-md-2" style="background-color:lavender;">ação</div>
			 </div>
			 
			 <?php
				
				//recuperar o resultado e montar a grid
				while($link = mysqli_fetch_array($rs, MYSQLI_ASSOC))
				{	
			
					 echo '
					 <div class="row">
						<div class="col-sm-2" style="background-color:lavenderblush;">'.$linha['nome_cliente'].'</div>
						<div class="col-sm-4" style="background-color:lavenderblush;">'.$linha['cpf_cliente'].'</div>
						<div class="col-sm-2" style="background-color:lavenderblush;">'.$linha['data_nasc_cliente'].'</div>
						<div class="col-sm-2" style="background-color:lavenderblush;"> Alterar/Excluir</div>
					 </div>
					 ';
				}
				
				//encerrar conexao com o banco de dados
				fecharConexao($link);
				
			 ?>
			 
			</div>
			
        </div>
      </div>
    </div>
	</div>    
?>