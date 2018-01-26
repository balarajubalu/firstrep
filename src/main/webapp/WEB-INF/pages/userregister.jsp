<%@page isELIgnored="false" %>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<html>
<head>

</script>
<body>
<h1><div>${message}<div></div></h1><br>
<div align="right"><a href="go_to_loginuser_Page"> Login</a></div>
<form action="register_page" name="myform" onsubmit="return validateForm()" method="post">
<table align="center" cellspacing="2" cellpadding="5" border="1">
<td>
<label>Name :</label>   <input type="text" name="name"/><br><br>
<label>Mobile No:</label><input  Type="text" name="mobile"><br><br>

<label>Nationality :</label><select name="country">
  <option value="" >[choose yours]</option>
  <option value="india">INDIA</option>
  <option value="usa">USA</option>
  <option value="mlaysia">MALAYSIA</option>
  <option value="singapoor">SINGAPOOR</option>
  <option value="kenada">KENADA</option>
</select>
<label>Mail Id:</label><input Type="text" name="mailId" placeholder="example@gmail.com"><br><br>
<label>Password:</label><input Type="password" name="password" ><br><br>
<input type="submit" value="register"/>
</td>
</table>
</form>
</body>
<head>
<body>
<script>
function validateForm(){
var fname=document.forms["myform"]["name"].value;
if(fname==""){
    alert("name must be filed out");
   return false;
 }
var mobile=document.forms["myform"]["mobile"].value;
if(mobile==""||mobile.length!=10){
    alert("mobile no enter properly");
   return false;
 }

var country=document.forms["myform"]["country"].value;
if(country==""){
alert("please select your country..");
return false;
 }
var mail=document.forms["myform"]["mailId"].value;
atpos=mail.indexOf("@");
dotpos=mail.lastIndexOf(".");

if(mail==""){
    alert("please prowide your email");
   return false;
 }
if(atpos < 1 || ( dotpos  < 1 )){
	
	alert("Please enter a valid e-mail address \n atpostion:"+atpos+"\n dotposition:"+dotpos);  
    
   return false;
 }
}
</script>
</body>
</html>