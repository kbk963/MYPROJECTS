<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<body>
<a href="/firstspringmvcproject/admission.html?siteLanguage=en">English</a> | <a href="/firstspringmvcproject/admission.html?siteLanguage=fr">French</a>

	<h1>${h1}</h1>
	<h2>Admission Form</h2>
	<form:errors path="student1.*" />
	<form action="/firstspringmvcproject/submission.html" method="post">

		<table>
			<tr>
				<td><spring:message code="label.studentname"/></td>
				<td><input type="text" name="name" /></td>
			</tr>


			<tr>
				<td><spring:message code="label.studentregion"/></td>
				<td><input type="text" name="region" /></td>
			</tr>

			<tr>
				<td><spring:message code="label.studentmobile"/></td>
				<td><input type="text" name="mobileno" /></td>
			</tr>

			<tr>
				<td><spring:message code="label.studentDOB"/></td>
				<td><input type="date" name="date" /></td>
			</tr>

			

		</table>

		<input type="submit" value="Submit Form" />

	</form>
</body>
</html>