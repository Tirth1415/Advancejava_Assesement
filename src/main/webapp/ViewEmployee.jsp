<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>View Employee</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>List of Employees</h1>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">EMPID</th>
            <th scope="col">First Name</th>
            <th scope="col">Last Name</th>
            <th scope="col">Email</th>
            <th scope="col">Mobile</th>
            <th scope="col">EDIT</th>
            <th scope="col">DELETE</th>
        </tr>
        </thead>
        <tbody>
        <%
            // Get the list of employees from the database or some other source
            List<Employee> employees = getEmployees();

            // Loop through the list of employees and display them in a table
            for (Employee employee : employees) {
                out.println("<tr>");
                out.println("<td>" + employee.getId() + "</td>");
                out.println("<td>" + employee.getFirstName() + "</td>");
                out.println("<td>" + employee.getLastName() + "</td>");
                out.println("<td>" + employee.getEmail() + "</td>");
                out.println("<td>" + employee.getMobile() + "</td>");
                out.println("<td><a href=\"edit_employee.jsp?id=" + employee.getId() + "\">Edit</a></td>");
                out.println("<td><a href=\"delete_employee.jsp?id=" + employee.getId() + "\" onclick=\"return confirm('Are you sure you want to delete this employee?')\">Delete</a></td>");
                out.println("</tr>");
            }
        %>
        </tbody>
    </table>
    <a href="add_employee.jsp" class="btn btn-primary">Add Employee</a>
</div>
</body>
</html>
    