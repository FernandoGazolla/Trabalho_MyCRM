<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Servico</title>
</head>
<body>

<form action="/Trabalho_MyCRM/CadastrarServicodeManutencaoServlet" method="post"> 

<br> <h1>Cadastro de Serviços</h1><br> 
<p>
Produto: <input type="text" id="produto" name="produto" />
<p>
Cliente: <input type="text" id="cliente" name="cliente" />
<p>
Data: <input type="text" id="data" name="data" />
<p>
Hora: <input type="text" id="hora" name="hora" />
<p>
Status: <input type="text" id="status" name="status" />
<p>
<input type="submit"  id="cadastrar"  value="Cadastrar"  />

</form>

</body>
</html>