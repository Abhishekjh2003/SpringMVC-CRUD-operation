<%@ page import ="com.model.StudentDetails"%>
<%@ page import ="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Information</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Age</th>
		</tr>
		<%
		List<StudentDetails> s= (List<StudentDetails>) request.getAttribute("stu");
		if(!s.isEmpty())
		{
			for(StudentDetails st :s)
			{
				%>
				
				<tr>
					<td><%=st.getId() %></td>
					<td><%=st.getName() %></td>
					<td><%=st.getAge() %></td>
					
				</tr>
				
				<%
			}
		}
		else{
			%>
			
			<h1>Student Data Not found</h1>
		<% }%>	
		
		
		
	
	</table>
</body>
</html>