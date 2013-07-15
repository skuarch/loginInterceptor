<%-- 
    Document   : error
    Created on : Jun 12, 2013, 10:53:03 AM
    Author     : skuarch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>error!</h1>


        <s:if test="hasActionErrors()">
            <div><s:actionerror /></div>
        </s:if>
            
            
    </body>
</html>
