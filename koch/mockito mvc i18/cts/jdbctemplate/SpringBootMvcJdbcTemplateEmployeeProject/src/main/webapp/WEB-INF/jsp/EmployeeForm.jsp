<html>
<head>

</head>
<body>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<style>
@import url("../../employee.css");

</style>
<form:form action="EmployeeAction" modelAttribute="employee">
<h1>Employee Form</h1>
	<form:label path="id">Enter Id</form:label>
	<form:input path="id"/>
	<form:errors path="id"/><br>
	
	<form:label path="name">Enter Name</form:label>
	<form:input path="name"/>
	<span><form:errors path="name"/></span><br>
	
	<form:label path="salary">Enter Salary</form:label>
	<form:input path="salary"/>
	<span><form:errors path="salary"/></span>
	<br>
	<br>
	<br>
	
	<input type="submit" name="submit"  value="Add Employee">
	<input type="submit" name="submit" value="Remove Employee"><br>
	<input type="submit" name="submit" value="Search Employee">
	<input type="submit" name="submit" value="ShowAll Employee"><br>
	<input type="submit" name="submit" value="Update Employee">
	<input type="reset" value="Cancel">

</form:form>

</body>
</html>