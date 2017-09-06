<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Cliente</title>
</head>
<body>

<form action="/Trabalho_MyCRM/CadastrarClienteServlet" method="post">
<br> <h1>Cadastro de Clientes</h1><br>
Nome:
<input type="text" id="nome" name="nome" />
<p>
CPF:
<input type="text" id="cpf" name="cpf" />
<p>
Email:
<input type="text" id="email" name="email" />
<p>
Telefone:
<input type="text" id="telefone" name="telefone" />
<p>

<input type="submit"  id="entrar"  value="Entrar"  />


</form>



</body>
</html>