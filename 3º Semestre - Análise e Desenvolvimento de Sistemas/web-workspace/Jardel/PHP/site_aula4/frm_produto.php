<!DOCTYPE html>
<html>
  <head>
	<meta charset="UTF-8">
    <title>Calcula Desconto</title>

  </head>
<!-- Todo atributo é igualado a uma variável, pois dá um identificador para o javascript -->
  <body>
	<form name="prod" action="produto.php" method="post"> <!-- Post= Informações escondidas-->
	descrição:<input type="text" name="descricao" >
	<br>
	preço:<input type="text" name="preco">
	<br>
	desconto(%):<input type="text" name="desconto">
	<br>
	<input type="submit" value="calcular">
	</form>

  </body>
</html>