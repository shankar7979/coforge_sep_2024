<html>
<head>
<style>
form {
	border: solid blue;
	padding: 30px;
	width: 40%;
	margin-left: 300pt;
	margin-top: 40pt;
}

label {
	width: 100pt;
	float: left;
}

input {
	width: 110pt;
	margin-bottom: 5pt;
}

input[type='submit'] {
	width: 90pt;
	margin-right: 10pt;
}

input[type='reset'] {
	width: 90pt;
}
.error{
  color:red;
  font-weight:bold;
}
</style>
</head>
<body>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<%@ page isELIgnored="false" %>
	<form:form action="customerAction" modelAttribute="customer" method="post">
		<h1>Customer Page</h1>
		<div>
			    <form:label path="id">Enter Id</form:label>
				<form:input name="id" path="id" />
				<form:errors path="id"  cssClass="error"/>
		</div>

		<div>
			    <form:label path="name">Enter Name</form:label>
				<form:input name="name" path="name" />
				<form:errors path="name" cssClass="error" />
		</div>

		<div>
			    <form:label path="salary">Enter Salary</form:label>
				<form:input name="salary" path="salary" />
				<form:errors path="salary"  cssClass="error"/>
		</div>

          <div>
                <br>
			   <form:label path="gender">Select Gender</form:label><br>
			   <form:radiobuttons name="gender" path="gender" items="${gender}"
			      delimiter="<br>"/>
		  </div>
          <div>
			   <br><form:label path="hobby">Select Hobbies</form:label><br>
				<form:checkboxes name="hobby" path="hobby" items="${hobby}"  delimiter="<br>"/>
		  </div>
		  <div>
			    <br><form:label path="cities">Select Cities</form:label><br>
				<form:select name="cities" path="cities" items="${cities}" delimiter="<br>" />
		  </div>
		<div>
			<br><input type="submit" /> <input type="reset" />
		</div>
	</form:form>
</body>
</html>