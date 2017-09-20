<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Employee Details Form</title>
<body>
     <h1>Student Details Form</h1>
     <br>
	<h2>Enter Details to Save </h2>
	<!--  form:errors path="student1.*" /-->
	<form action="Actionpath" method="post">

		<table>
			<tr>
					<td>First Name: <td>
					<td><input type="text" name="firstName" /><td>
			</tr>
			<tr>
					<td>Last Name: <td>
					<td><input type="text" name="lastName" /><td>
			</tr>
			<tr>
					<td>Id: <td>
					<td><input type="text" name="id" /><td>
			</tr>
			<tr>
					<td>Region:<td>
					<td> <input type="text"  name="region" /><td>
			</tr>	

		</table>
		<input type="submit" value="Submit Form" />

	</form>
	<br>
	
		<h3>Click the below button to Get available Students </h3>
	<!--  form:errors path="student1.*" /-->
	<form action="Actionpath" method="get">
		<input type="submit" value="Get All" name="method" />

	</form>
	
	<br>
	<h3>Delete a Student from list </h3>
	<!--  form:errors path="student1.*" /-->
	<form action="Actionpath" method="get">
		ID:<input type="text" name="id" />
		<input type="submit" value="Delete" name="method" />
	</form>
	
	
	
	<br>
	<h4>Update a Student Details </h4>
	<form action="Actionpath" method="get">
		ID:<input type="text" name="id" />
		firstName:<input type="text" name="firstName" />
		LastName:<input type="text" name="lastName" />
		Region:<input type="text" name="region" />
	         <input type="submit" value="Update" name="method" />
	</form>

	
</body>

</html>