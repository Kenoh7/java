<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
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
            <div class="special">
                <div class="sleft">
                    <img class="boat" src="../image/boat.png" alt="sushiboat">
                </div>
                <div class="sright">
                    <h2>DomoSushi Special!</h2>
                    <p> --- Limited Quantity ---</p>
                    <p class="padding">4/20/22 - 4/30/22</p>
                    <p>Try our Large Extremely Fresh Sashimi Boat for only $99</p>
                    <p>(Fish from Hokkaido Japan)</p>
                </div>
            </div>
            <div class="theway">
                <h3 class="green">The DomoSushi Experience</h3>
                <div class="column">
                    <div class="twleft">
                        <div class="tlone">
                            <H4 class="paddingbot">ALWAYS FRESH</H4>
                            <p>To maximize freshness, our fish is hand picked from the fish market,</p>
                            <p class="paddingbot">and prepped every morning with care in the kitchen.</p>
                        </div>
                        <div class="tltwo">
                            <H4 class="paddingbot">CREATIVE MENU</H4>
                            <p>We continuously invent seasonal and delicious menu items</p>
                            <p class="paddingbot">for you to delightfully explore every time you return. </p>
                        </div>
                        <div class="tlthree">
                            <H4 class="paddingbot">PREMIUM INGREDIENTS</H4>
                            <p>All our menu items are made with the best ingredients.</p>
                            <p class="paddingbot">Our items do not contain any artificial additives.</p>
                        </div>
                    </div>
                    <div class="twright">
                        <div class="trone">
                            <H4 class="paddingbot">MENU VARIETY</H4>
                            <p>Don't be fooled by our name, our menu items has</p>
                            <p>Japanese, Korean, and chinese cusines. Great for</p>
                            <p class="paddingbot">thoughs who do not eat fish.</p>
                        </div>
                        <div class="trtwo">
                            <H4 class="paddingbot">FRIENDLY STAFF</H4>
                            <p>Our staff is friendly is here to help!</p>
                            <p>Need help choosing something on the menu?</p>
                            <p class="paddingbot">Ask our server for recommendations! We are happy to help!</p>
                        </div>
                        <div class="trthree">
                            <H4 class="paddingbot">COVID PREVENTION</H4>
                            <p>To minimize the spread of covid, we take serious measures</p>
                            <p class="paddingbot">to santize before and after each customer visit.</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="borderflower">
            </div>
            <div class="botnav">
                <h5>CHECK OUT OUR SOCIAL!</h5>
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