<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/css/style.css">
<meta charset="UTF-8">
<title>DomoSushi</title>
</head>
<body>
	<div class="container mt-3">
		        <header class="nav">
            <div class="logo">
                <h1>DomoSushi</h1>
            </div>
            <div class="button">
                <a href="/home" class="navbutton">HOME</a>
                <a href="/menu" class="navbutton2">MENU</a>
                <a href="/location" class="navbutton1">LOCATION</a>
            </div>
        </header>
        <div class="borderflower">
        </div>
        <main>
            <div class="location">
                <h2 class="white">Our Location</h2>
                <img class="map" src="../image/Map.png" alt="map">
                <p class="red1">For prompt and timely service, please call at least 10 minutes in advance for take-out orders. Thank you!</p>
                <p class="red2">While every effort to provide accurate, up to date information will be made, item availability and prices are subject to change at any time, without notice.</p>
                <div class="row">
                    <div class="row1">
                        <h5 class="bhour">ADDRESS</h5>
                        <p class="white1"> 4901 Point Fosdick Dr. NW Suite B 100</p>
                        <p class="white1">Gig Harbor, WA 98335</p>
                        <p class="white1">Tel: 253-851-0592</p>
                        <p class="white1">Fax: 253-851-0841</p>
                    </div>
                    <div class="row2">
                        <h5 class="bhour">Business Hours</h5>
                        <table class="scheduleT">
                            <thead>
                                <tr>
                                    <th>Days</th>
                                    <th>Hours</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Monday</td>
                                    <td>11am - 10pm</td>
                                </tr>
                                <tr>
                                    <td>Tuesday</td>
                                    <td>11am - 10pm</td>
                                </tr>
                                <tr>
                                    <td>Wednesday</td>
                                    <td>11am - 10pm</td>
                                </tr>
                                <tr>
                                    <td>Thursday</td>
                                    <td>11am - 10pm</td>
                                </tr>
                                <tr>
                                    <td>Friday</td>
                                    <td>11am - 10pm</td>
                                </tr>
                                <tr>
                                    <td>Saturday</td>
                                    <td>11am - 10pm</td>
                                </tr>
                                <tr>
                                    <td>Sunday</td>
                                    <td>4pm - 9pm</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="borderflower">
            </div>
            <div class="botnav">
                <h5>CHECK OUT OUR SOCIAL PAGES!</h5>
                <div class="row">
                    <a href="https://www.yelp.com/biz/domo-sushi-gig-harbor"><img class="resize" src="../image/yelp.png" alt="yelp"></a>
                    <a href="#"><img class="resize" src="../image/instagram.png" alt="instagram"></a>
                    <a href="https://www.facebook.com/DomoSushi.GigHarbor"><img class="resize" src="../image/facebook.png" alt="facebook"></a>
                </div>
            </div>
            <div class="copyr">
                <p class="textsize">&#169; 2022 DOMOSUSHI,INC. ALL RIGHTS RESERVED.</p>
            </div>
        </main>
	</div>
</body>
</html>