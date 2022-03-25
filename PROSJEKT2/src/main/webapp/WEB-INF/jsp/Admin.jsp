<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- Fra https://purecss.io/ -->
<link rel="stylesheet"
    href="https://unpkg.com/purecss@1.0.0/build/pure-min.css">
<title>Admin</title>
</head>
<body>
    <h2>Oversikt over stemmer</h2>
    

    <table class="pure-table">


        <tr bgcolor="#cccccc">
            <th>Stand 1</th>
            <th align="left">Stand 2</th>
            <th align="left">Stand 3</th>
        </tr>

        <c:forEach items="${liste}" var="deltager">
           
           <c:if test="${deltager.mobil eq mobil}">
            <tr bgcolor="#aaffaa">
                <td align="center"><c:out value="${deltager.kjonn}" /></td>
                <td><c:out value="${deltager.fornavn}" /> <c:out
                        value="${deltager.etternavn}" /></td>
                <td><c:out value="${deltager.mobil}" /></td>

            </tr>
  
            </c:if>
            
            <c:if test="${deltager.mobil ne mobil}">
            
            <tr bgcolor="#ffffff">
                <td align="center"><c:out value="${deltager.kjonn}" /></td>
                <td><c:out value="${deltager.fornavn}" /> <c:out
                        value="${deltager.etternavn}" /></td>
                <td><c:out value="${deltager.mobil}" /></td>

            </tr>
            
             </c:if>
            
            
            
        </c:forEach>


    </table>
    <p>
        <a href="/Oblig4/loggut">Ferdig</a>
    </p>
</body>
</html>