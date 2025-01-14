<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SeatReserve | Edit Feedback</title>
    
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    
    <style>
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
            min-height: 100vh; /* Ensure the hero section covers full viewport height */
            color: #333;
            text-align: center;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
        }

        .hero h2 {
            font-size: 3rem;
            margin-bottom: 10px;
        }

        .hero p {
            font-size: 1.2rem;
            margin-bottom: 20px;
        }

        /* Edit Form */
        .card {
            background-color: rgba(255, 255, 255, 0.8); /* Transparent background */
            border-radius: 10px;
            padding: 30px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Soft shadow for better visibility */
        }

        /* Form Controls */
        .form-control {
            padding: 10px;
            font-size: 1rem;
            border: 1px solid #ccc;
            border-radius: 20px;
        }

        /* Buttons */
        .btn {
            padding: 10px 20px;
            border-radius: 5px;
        }

        .btn-cancel {
            background-color: #ccc;
        }

        .btn-primary {
            background-color: #ff6b6b;
            border: none;
        }

        .btn-primary:hover {
            background-color: #ff4a4a;
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
            z-index: 10;
        }

        footer p {
            margin-bottom: 10px;
        }

        footer .social-links {
            list-style: none;
            display: flex;
            justify-content: center;
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
                float: none;
                text-align: center;
                margin-bottom: 10px;
            }

            header nav ul {
                float: none;
                text-align: center;
                margin: 0;
            }

            header nav ul li {
                display: block;
                margin: 10px 0;
            }

            .hero h2 {
                font-size: 2rem;
            }

            .hero p {
                font-size: 1rem;
            }

            .login-section form {
                padding: 20px;
            }

            .form-control {
                width: 100%;
            }
        }
    </style>
    <title>SeatReserve | Edit Feedback</title>
</head>

<body>
    <header>
        <div class="container">
            <h1>SeatReserve</h1>
            <nav>
                <ul>
                    <li><a href="homepage.jsp">Home</a></li>
                    <li><a href="log.jsp">Book a Ticket</a></li>
                    <li><a href="feedback.jsp">Feedback</a></li>
                    <li><a href="aboutus.jsp">About Us</a></li>
                    <li><a href="contactus.jsp">Contact</a></li>
                    <li><a href="logoutServlet">Logout</a></li>
                </ul>
            </nav>
        </div>
    </header>

    <section class="hero">
        <div class="container">
            <div class="card">
                <h1 class="text-center mb-4">Edit Your Feedback</h1>
                <div class="card-body">
                    <form action="EditFeedbackServlet" method="post">
                        <!-- Hidden input for ID -->
                        <input type="hidden" name="id" value="<%= request.getAttribute("id") %>">

                        <!-- Name Field -->
                        <div class="mb-3">
                            <label for="name" class="form-label">Name</label>
                            <input type="text" class="form-control shadow-sm" id="name" name="name" 
                                   value="<%= request.getAttribute("name") %>" readonly>
                        </div>

                        <!-- Email Field -->
                        <div class="mb-3">
                            <label for="email" class="form-label">Email</label>
                            <input type="email" class="form-control shadow-sm" id="email" name="email" 
                                   value="<%= request.getAttribute("email") %>" required>
                        </div>

                        <!-- Feedback Textarea -->
                        <div class="mb-3">
                            <label for="feedback" class="form-label">Feedback</label>
                            <textarea class="form-control shadow-sm" id="feedback" name="feedback" rows="4" required><%= request.getAttribute("feedback") %></textarea>
                        </div>

                        <!-- Rating Select -->
                        <div class="mb-3">
                            <label for="rating" class="form-label">Rating</label>
                            <select class="form-select shadow-sm" id="rating" name="rating" required>
                                <option value="1" <%= String.valueOf(request.getAttribute("rating")).equals("1") ? "selected" : "" %>>1</option>
                                <option value="2" <%= String.valueOf(request.getAttribute("rating")).equals("2") ? "selected" : "" %>>2</option>
                                <option value="3" <%= String.valueOf(request.getAttribute("rating")).equals("3") ? "selected" : "" %>>3</option>
                                <option value="4" <%= String.valueOf(request.getAttribute("rating")).equals("4") ? "selected" : "" %>>4</option>
                                <option value="5" <%= String.valueOf(request.getAttribute("rating")).equals("5") ? "selected" : "" %>>5</option>
                            </select>
                        </div>

                        <!-- Submit Button -->
                        <div class="d-flex justify-content-between mt-4">
                            <button type="submit" class="btn btn-primary shadow-sm">Update Feedback</button>
                            <a href="feedback.jsp" class="btn btn-cancel shadow-sm">Cancel</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>

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
