<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table align="center" border="1">
<tr>
<th> Student No </th>
<th> Student Name </th>
<th> Student Age </th>
</tr>

<logic:iterate id="myid" name="StudentForm" property="studList">
<tr>
  <td><bean:write name="myid" property="sno"/></td>
  <td><bean:write name="myid" property="sname"/></td>
  <td><bean:write name="myid" property="age"/></td>
</tr>

</logic:iterate>

</table>

</body>
</html>