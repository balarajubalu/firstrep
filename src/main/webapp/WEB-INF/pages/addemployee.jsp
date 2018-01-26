<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddEmployee</title>
</head>
<body>
<form action="employee/add" method="post">
	<label>First Name:</label>&nbsp;<input type="text" name="empName" />&nbsp;&nbsp;
	<label>Last Name:</label>&nbsp;<input type="text" name="surName" /><br><br>

	<label>New ICNO:</label>&nbsp;<input type="text" name="newICNo" />&nbsp;&nbsp;
	<label>Old ICNO:</label>&nbsp;<input type="text" name="oldICNo" /><br><br>

	<label>Passport No:</label>&nbsp;<input type="text" name="passportNo" />&nbsp;&nbsp;
	<label>Gender </label>&nbsp;<input type="radio" name="gender" value="M"/>Male&nbsp;<input type="radio" name="gender" value="F"/>Female<br><br>

	<label>DOB:</label>&nbsp;<input type="text" name="dateOfBirth" placeholder="DD-MM-YYYY" />&nbsp;
 	<label>Nationality &nbsp:<label>
 					<select name="nationality">
  									<option value="" >[choose yours]</option>
  									<option value="indian">Indian</option>
  									<option value="malay">Malay</option>
  									<option value="chinies">Chinies</option>
  									<option value="japanies">Japanies</option>
					</select><br><br>
 	

	<label>Foreign or Local &nbsp; </label>&nbsp;<input type="radio" name="forenLocal" value="L"/>Local&nbsp;
	<input type="radio" name="forenLocal" value="F"/>Foreign<br><br>&nbsp;
	<label>Merital Status&nbsp; </label>&nbsp;<input type="radio" name="maritalStatus" value="s"/>Single&nbsp;
	<input type="radio" name="maritalStatus" value="M"/>Married<br><br>

	<label>Employee position:</label>&nbsp;<input type="text" name="position" />&nbsp;&nbsp;
	<label>employee Salary:</label>&nbsp;<input type="text" name="salary" /><br><br>
	
	<label>Phone No&nbsp;</label>&nbsp;<input type="text" name="phoneNo" />&nbsp;&nbsp;
	<label>Email &nbsp;</label>&nbsp;<input type="text" name="email" placeholder="example@gmail.com"/>&nbsp;&nbsp;<br><br>
<div align="center"><input type="submit" value="submit"/></div>
</form>
</body>
</html>