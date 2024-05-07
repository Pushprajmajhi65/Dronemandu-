<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile Pop-up</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
        integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <style>
        /* Your CSS styles here */
        /* Styling for the pop-up */
        .popup {
            display: none;
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background-color: rgba(0, 0, 0, 0.5);
            z-index: 9999;
        }
        
        .popup-content {
            background-color: white;
            width: 50%;
            max-width: 500px;
            margin: 100px auto;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
        }
        
        .close {
            position: absolute;
            top: 10px;
            right: 10px;
            cursor: pointer;
        }
        
        .close i {
            font-size: 20px;
            color: #333;
        }
        
        /* Additional styling */
        /* Add your existing styles here */
    </style>
</head>
<body>

<header>
    <nav>
        <div class="nav-left">
            <img src="../Image/Logo.png" alt="" class="logoimg">
            <ul class="nav-menu">
                <li>DJI</li>
                <li>AIRDATA</li>
                <li>SKYDIO</li>
                <li>FLYABILITY</li>
                <li class="new">AIR 3<span>New</span></li>
            </ul>
        </div>
        <div class="nav-right">
            <div class="search-bar">
                <a href="#"><i class="fa-solid fa-magnifying-glass"></i></a>
                <input type="text" placeholder="Search For Products, brands and more">
            </div>
            <div>
                <a href="#" onclick="openPopup()"><i class="fa-regular fa-user"></i></a>
                <p>Profile</p>
            </div>
            <div>
                <a href="#"><i class="fa-regular fa-heart"></i></a>
                <p>Wishlist</p>
            </div>
            <div>
                <a href="#"><i class="fa-solid fa-right-from-bracket"></i></a>
                <p>Out</p>
            </div>
        </div>
    </nav>
</header>

<div id="popup" class="popup">
    <div class="popup-content">
        <div class="close" onclick="closePopup()">
            <i class="fas fa-times"></i>
        </div>
        <h3>User Profile</h3>
        <!-- Your profile content here -->
        <div class="main-frame">
            <!-- Your profile form content here -->
        </div>
    </div>
</div>

<!-- Your main content here -->

<script>
    // Function to open the pop-up
    function openPopup() {
        document.getElementById("popup").style.display = "block";
    }

    // Function to close the pop-up
    function closePopup() {
        document.getElementById("popup").style.display = "none";
    }
</script>

</body>
</html>
