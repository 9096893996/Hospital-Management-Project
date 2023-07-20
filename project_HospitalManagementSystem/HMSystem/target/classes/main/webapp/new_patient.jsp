<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <%@ include file="all_js_css.jsp" %>
    <title>New Patient</title>
    <style>
        /* Add custom CSS styles for the navbar */
        .navbar {
            background-color: purple;
        }

        .navbar .navbar-brand {
            color: white;
        }

        .navbar .navbar-nav .nav-link {
            color: white;
        }

        .navbar .navbar-nav .nav-link:hover {
            color: #ffc107; /* Change the hover color as per your preference */
        }

        .navbar .form-inline .form-control {
            background-color: #ffffff; /* Change the search input field background color as per your preference */
        }
    </style>
</head>
<body>
    <%@ include file="navbar.jsp" %>
    <form action="req1" method="get">
        <div class="form-group">
            <input type="text" name="pname" placeholder="Name">
            <input type="text" name="pcity" placeholder="City">
        </div>
        <div>
            <label for="pdescription">Patient Description</label>
            <textarea name="pdescription" placeholder="Enter the patient's description here" style="height: 200px"></textarea>
        </div>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
