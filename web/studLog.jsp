<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Application</title>
</head>
<body>
    <a href="index.jsp">Home</a>
<center>
    <form action="loginServlet2" method="post">        
        <fieldset style="width: 300px">
            <legend> Student Login </legend>
            <table>
                <tr>
                    <td>User ID</td>
                    <td><input type="text" name="username" required="required" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="userpass" required="required" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login" /></td>
                </tr>
            </table>
        </fieldset>
    </form>
    </center>
</body>
</html>