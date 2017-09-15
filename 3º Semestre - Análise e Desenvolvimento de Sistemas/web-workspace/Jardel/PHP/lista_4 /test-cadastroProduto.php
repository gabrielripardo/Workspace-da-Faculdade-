<!-- 
<div class="container">
      <div class="row">
        <div class="col-sm-10 col-md-8 col-md-offset-1 main">


		<form action="index.php?pagina=inserir_produto.php" method="post">
			<div class="form-group">
				<div class="row">
					<legend>Cadastrar Produto</legend>
					
					<div class="col-lg-5">
					
					<label class="col-lg-2 control-label"> Nome </label>
					<input name="nome_produto" class="form-control">
					
					<label class="col-lg-2 control-label"> Description </label>
					<input name="descricao_produto" class="form-control">
					

					<label class="col-lg-2 control-label"> Price </label>
					<input name="valor_produto" class="form-control">
							
					<button type="submit" class="btn btn-success">Salvar</button>
					
					</div>
					
				</div>
			</div>
		</form>

	</div>
  </div>
</div> 
-->

<?php

if($_SERVER["REQUEST_METHOD"]=="POST"){
	
include_once "conexao.php";	

$strNomeProduto = $_POST['nome_produto'];
$strDescricaoProduto = $_POST['descricao_produto'];
$strValorProduto = $_POST['valor_produto'];

$link=abrirConexao();

$strSql ="
INSERT INTO produto (
		nome_produto, 
		descricao_produto, 
		valor_produto
		)
VALUES 
	  (
        '".$strNomeProduto."',
		'".$strDescricaoProduto."',
		'".$strValorProduto."' 
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


		<form action="index.php?pagina=test-cadastroProduto.php" method="post">
			<div class="form-group">
				<div class="row">
					<legend>Cadastrar Produto</legend>
					
					<div class="col-lg-5">
					
					<label class="col-lg-2 control-label"> Nome </label>
					<input name="nome_produto" class="form-control">
					
					<label class="col-lg-2 control-label"> Descrição </label>
					<input name="descricao_produto" class="form-control">
					

					<label class="col-lg-2 control-label"> Preço </label>
					<input name="valor_produto" class="form-control">
							
					<button type="submit" class="btn btn-success">Salvar</button>
					
					</div>	
				</div>
			</div>
		</form>
	</div>
  </div>
</div>