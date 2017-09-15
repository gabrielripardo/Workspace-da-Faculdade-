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

					
				//executar consulta sql e retornar o resultado	

				
			  ?>
			  
			  <div class="row">
				<div class="col-md-2" style="background-color:lavender;">nome</div>
				<div class="col-md-4" style="background-color:lavender;">cpf</div>
				<div class="col-md-2" style="background-color:lavender;">endereco</div>
				<div class="col-md-2" style="background-color:lavender;">ação</div>
			 </div>
			 
			 <?php
				
				//recuperar o resultado e montar a grid
				while( )
				{	
			
					 echo '
					 <div class="row">
						<div class="col-sm-2" style="background-color:lavenderblush;">'. .' joao</div>
						<div class="col-sm-4" style="background-color:lavenderblush;">'. .'</div>
						<div class="col-sm-2" style="background-color:lavenderblush;">'. .'</div>
						<div class="col-sm-2" style="background-color:lavenderblush;"> Alterar/Excluir</div>
					 </div>
					 ';
				}
				
				//encerrar conexao com o banco de dados
				
				
			 ?>
			 
			</div>
			
        </div>
      </div>
    </div>