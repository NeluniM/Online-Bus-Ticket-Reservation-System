<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>SeatReserve | Delete Payment Details</title>

<!-- Add Google Fonts for better typography -->
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap" rel="stylesheet">

<style>
    /* General Styles */
          * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        html, body {
            height: 100%; /* Ensure the body takes full viewport height */
        }

        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            background-color: #f4f4f4;
            display: flex;
            flex-direction: column;
            color: #333;
            animation: fadeIn 1s ease-in forwards;
        }
        @keyframes fadeIn {
            0% { opacity: 0; }
            100% { opacity: 1; }
        }

        /* Container */
        .container {
            width: 90%;
            margin: 0 auto;
            max-width: 1200px;
        }

        /* Header Styles */
        header {
            background-color: #333;
            color: #fff;
            padding: 10px 0;
            width: 100%;
            position: relative;
            z-index: 10;
        }

        header h1 {
            float: left;
            margin-left: 20px;
        }

        header nav ul {
            list-style: none;
            float: right;
            margin-right: 20px;
        }

        header nav ul li {
            display: inline;
            margin-left: 20px;
        }

        header nav ul li a {
            color: #fff;
            text-decoration: none;
        }

        header nav ul li a:hover {
            text-decoration: underline;
        }
    /* Hero Section Styles */
    .hero {
        background: url('css/Bus.jpg') no-repeat center center/cover;
        min-height: 100vh;
        color: #fff;
        display: flex;
        justify-content: center;
        align-items: center;
        flex-direction: column;
        position: relative;
        padding-bottom: 50px; /* Added padding at the bottom to create space for the button */
    }

    .hero::before {
        content: '';
        position: absolute;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background-color: rgba(0, 0, 0, 0.5);
        z-index: 1;
    }

    .hero h1 {
        font-size: 2.5rem;
        color: #fff;
        z-index: 2;
    }

    /* Table Styles */
    table {
        width: 90%; /* Make the table wider */
        margin: 20px auto;
        border-collapse: collapse;
        border: 1px solid #ddd;
        background-color: #fff;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        border-radius: 8px;
        overflow: hidden;
        z-index: 2;
        position: relative;
    }

    th, td {
        padding: 20px; /* Increased padding for better spacing */
        text-align: left;
        border-bottom: 1px solid #ddd;
    }

    th {
        background-color: gray;
        color: white;
        text-transform: uppercase;
        letter-spacing: 1px;
        font-size: 1rem;
    }

    td {
        background-color: #f9f9f9;
        color: #333;
    }

    tr:hover td {
        background-color: #f1f1f1;
    }

    /* Button Container */
    .button-container {
        text-align: center;
        margin: 40px 0; /* Increased margin for spacing */
        z-index: 2;
    }

    /* Buttons */
    input[type="submit"], input[type="button"] {
        padding: 15px 30px; /* Larger button size for better visibility */
        font-size: 18px;
        margin: 20px; /* Increased margin for more space around the button */
        cursor: pointer;
        border: none;
        border-radius: 5px;
        transition: background-color 0.3s ease;
        z-index: 2;
        position: relative;
    }

    input[type="submit"] {
        background-color: #f44336;
        color: white;
    }

    input[type="submit"]:hover {
        background-color: #e3342f;
    }

    input[type="button"] {
        background-color: #3a7cdf;
        color: white;
    }

    input[type="button"]:hover {
        background-color: #447cb1;
    }

    /* Footer Section */
    footer {
        background-color: #333;
        color: white;
        text-align: center;
        padding: 20px 0;
        width: 100%;
        position: relative;
        bottom: 0;
    }

    footer p {
        margin-bottom: 10px;
    }

    footer .social-links {
        list-style: none;
        display: flex;
        justify-content: center;
        padding: 0;
    }

    footer .social-links li {
        margin: 0 10px;
    }

    footer .social-links li a {
        color: white;
        text-decoration: none;
    }

    footer .social-links li a:hover {
        text-decoration: underline;
    }

    /* Responsive Design */
    @media (max-width: 768px) {
        header h1 {
            font-size: 2rem;
        }

        header nav ul li {
            display: block;
            text-align: center;
            margin: 10px 0;
        }

        table {
            width: 100%;
        }
    }
</style>
<title>SeatReserve | Delete Payment</title>

</head>
<body>
<header>
    <div class="container">
        <h1>SeatReserve</h1>
        <nav>
            <ul>
                <li><a href="homepage.jsp">Home</a></li>
                <li><a href="log.jsp">Book a Ticket</a></li>
                <li><a href="feedback,jsp">Feedback</a></li>
                <li><a href="aboutus,jsp">About Us</a></li>
                <li><a href="contactus.jsp">Contact</a></li>
                <li><a href="logoutServlet">Logout</a></li>
            </ul>
        </nav>
    </div>
</header>

<section class="hero">
    <h1>Delete Payment Details</h1>
    <%
        String pid = request.getParameter("pid");
        String passenger_name = request.getParameter("passenger_name");
        String card_number = request.getParameter("card_number");
        String CVV_code = request.getParameter("CVV_code");
        String expire_date = request.getParameter("expire_date");
        String email = request.getParameter("email");
        String payment_amount = request.getParameter("payment_amount");
    %>
    <form action="DeletePayServlet" method="post">  
        <input type="hidden" name="pid" value="<%= pid %>">
        <table>
            <tr>
                <th>Passenger ID</th>
                <td><%= pid %></td>
            </tr>
            <tr>
                <th>Passenger Name</th>
                <td><%= passenger_name %></td>
            </tr>
            <tr>
                <th>Card Number</th>
                <td><%= card_number %></td>
            </tr>
            <tr>
                <th>CVV Code</th>
                <td><%= CVV_code %></td>
            </tr>
            <tr>
                <th>Expire Date</th>
                <td><%= expire_date %></td>
            </tr>
            <tr>
                <th>Email</th>
                <td><%= email %></td>
            </tr>
            <tr>
                <th>Payment Amount</th>
                <td><%= payment_amount %></td>
            </tr>
        </table>

        <div class="button-container">
            <input type="submit" name="submit" value="Confirm Delete">
        </div>
    </form>
</section>

<footer>
    <div class="container">
        <p>&copy; 2024 SeatReserve. All rights reserved.</p>
        <ul class="social-links">
            <li><a href="#">Facebook</a></li>
            <li><a href="#">Twitter</a></li>
            <li><a href="#">Instagram</a></li>
        </ul>
    </div>
</footer>
</body>
</html>