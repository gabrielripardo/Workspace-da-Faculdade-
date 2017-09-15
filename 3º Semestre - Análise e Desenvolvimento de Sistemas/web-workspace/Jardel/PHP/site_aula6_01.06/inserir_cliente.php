<?php

if($_SERVER["REQUEST_METHOD"]=="POST"){
	
include_once "conexao.php";	

$strNomeCliente = $_POST['nome_cliente'];
$strCpfCliente = $_POST['cpf_cliente'];
$strDataNascCliente = $_POST['data_nasc_cliente'];

$link=abrirConexao();

$strSql ="
INSERT INTO cliente (
		nome_cliente, 
		cpf_cliente, 
		data_nasc_cliente
		)
VALUES 
	  (
        '".$strNomeCliente."',
		'".$strCpfCliente."',
		'".$strDataNascCliente."' 
	   )";
	   
	$id=inserirId($link, $strSql);

	if($id > 0){
	 echo "Cadastro realizado com sucesso!!!";
	}
	 
	fecharConexao($link);

}



?>

<div class="container">
      <div class="row">
        <div class="col-sm-10 col-md-8 col-md-offset-1 main">


		<form action="index.php?pagina=inserir_cliente.php" method="post">
			<div class="form-group">
				<div class="row">
					<legend>Cadastrar Cliente</legend>
					
					<div class="col-lg-5">
					
					<label class="col-lg-2 control-label"> Nome </label>
					<input name="nome_cliente" class="form-control">
					
					<label class="col-lg-2 control-label"> Cpf </label>
					<input name="cpf_cliente" class="form-control">
					

					<label class="col-lg-2 control-label"> Data Nasc </label>
					<input name="data_nasc_cliente" class="form-control">
							
					<button type="submit" class="btn btn-success">Salvar</button>
					
					</div>
					
				</div>
			</div>
		</form>

	</div>
  </div>
</div>