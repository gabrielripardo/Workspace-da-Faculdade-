<?php
$valprd = $_POST['val_prd'];
$prd = $_POST['nome_prd'];
$desc = 0.20;
$total = $valprd - ($valprd * $desc) ;
echo "<br>Produto: " .$prd;
echo "Total a pagar: " .$total;
?>