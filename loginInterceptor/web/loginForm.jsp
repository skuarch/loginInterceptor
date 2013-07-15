<%-- 
    Document   : loginForm
    Created on : Jun 12, 2013, 10:53:31 AM
    Author     : skuarch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="Authentication" method="post">
            
            <input type="text" id="username" name="username"/>
            <input type="password" id="password" name="password"/>
            
            <input type="submit" value="login" />
                        
        </form>        
        
    </body>
</html>
