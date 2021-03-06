<!DOCTYPE html>
<html>
  <head>
	<meta charset="UTF-8">
    <title>Sistema de Pedidos - Televendas</title>

    <!-- Bootstrap core CSS -->
    <link href="bootstrap-3.1.1-dist/css/bootstrap.min.css" rel="stylesheet">

  </head>

  <body>
        <nav class="navbar navbar-inverse navbar-static-top" role="navigation">
          <div class="container">
            <div class="navbar-header">
              <a class="navbar-brand" href="#">SisPedidos</a>
            </div>
            <div class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">
		  Cliente <b class="caret"></b></a>
                  <ul class="dropdown-menu">
                    <li><a href="#">Cadastrar Cliente</a></li>
                    <li><a href="index.php?pagina=listar_cliente.php">Listar Cliente</a></li>
                  </ul>
                </li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">
		  Produto <b class="caret"></b></a>
                  <ul class="dropdown-menu">
                    <li><a href="#">Cadastrar Produto</a></li>
                    <li><a href="#">Listar Produto</a></li>
                  </ul>
                </li>

                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">
		  Pedido <b class="caret"></b></a>
                  <ul class="dropdown-menu">
                    <li><a href="#">Cadastrar Pedido</a></li>
                    <li><a href="#">Listar Pedido</a></li>
                  </ul>
                </li>				
				
              </ul>
            </div>
          </div>
        </nav>

		<?php 
			if(isset($_GET["pagina"])){
				include_once $_GET["pagina"]; 
			}	
		?>

		<br><br>
		
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-5 col-md-10 col-md-offset-2">
                    <p class="text-muted">SisPedidos</p>
                </div>
            </div>
        </div>
    </footer>

    
    <script src="bootstrap-3.1.1-dist/js/jquery/jquery-1.11.1.min.js"></script>
    <script src="bootstrap-3.1.1-dist/js/bootstrap.min.js"></script>

  </body>
</html>








