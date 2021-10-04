<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Style.css">
    <title>Calculadora</title>
</head>
<body>
	<div class="container">
    <div class="logo"></div>
    <div class="titulo">Exercício Servlet Calculadora</div>
    <div class="inputs">
    <form action="ServletCalc" method='get'>
        <input name="n1" type="text" placeholder="Digite um valor"><br/>
        <input type="submit" value="Calcular"/>
    </form>
  </div>
</body>
</html>