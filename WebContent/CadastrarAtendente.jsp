<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Atendente</title>
</head>
<body>
<form action="/Trabalho_MyCRM/CadastrarAtendenteServlet" method="post">  

<br> <h1>Cadastro de Atendentes</h1><br>
<p>
Id:  <input type="text" id="id" name="id" /> <br>
<p>
Nome:  <input type="text" id="nome" name="nome" /><br>
<p>
CPF: <input type="text" id="cpf" name="cpf" /><br>
<p>
Email: <input type="text" id="email" name="email" /><br>
<p>
<input type="submit"  id="cadastrar"  value="Cadastrar"  />

</form>

</body>
</html>