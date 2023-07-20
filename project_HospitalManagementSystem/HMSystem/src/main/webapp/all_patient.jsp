<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.utils.HBUtils" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="org.hibernate.query.Query" %>
<%@ page import="java.util.List" %>
<%@ page import="com.model.Patient" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Patient</title>
    <%@ include file="all_js_css.jsp" %>
    <%@ include file="navbar.jsp" %>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        .actions {
            display: flex;
            justify-content: center;
            align-items: center;
        }
    </style>
</head>
<body>
    <table>
        <tr><th>ID</th>
            <th>Name</th>
            <th>City</th>
            <th>Actions</th>
        </tr>
        <%
        Session s = HBUtils.getSessionFactory().openSession();
        Query<Patient> query = s.createQuery("FROM Patient", Patient.class);
        List<Patient> patients = query.list();
        for (Patient patient : patients) {
        %>
        <tr>
            <td><%= patient.getPid() %></td>
            <td><%= patient.getPname() %></td>
            <td><%= patient.getPcity() %></td>
            <td><%= patient.getPdescrption()%></td>
            <td class="actions">
                <form action="delete" method="get" style="display: inline;">
                    <input type="hidden" name="patientId" value="<%= patient.getPid() %>">
                    <input type="submit" value="Delete">
                </form>
                <form action="update.jsp" method="get" style="display: inline;">
                    <input type="hidden" name="patientId" value="<%= patient.getPid() %>">
                    <input type="submit" value="Update">
                </form>
            </td>
        </tr>
        <%
        }

        s.close();
        %>
    </table>
</body>
</html>
