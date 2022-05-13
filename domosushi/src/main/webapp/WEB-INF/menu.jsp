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
            <div class="menuhead">
                <h4 class="mtitle">Our Menu</h4>
                <div class="pmenu">
                    <a class="mlink"href="https://domosushi.weebly.com/uploads/2/4/9/8/24980755/to_go_menu_1.pdf">Lunch Menu</a>
                    <a class="mlink" href="https://domosushi.weebly.com/uploads/2/4/9/8/24980755/to_go_menu_2.pdf">Dinner Menu</a>
                </div>
                <div class="borderflower1">
                </div>
            </div>
            <div class="menubody">
                <h5 class="ftitle">Nigiri</h5>
                <div class="nigri">
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/salmon.png" alt="salmon">
                        <p>Salmon</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/tuna.png" alt="tuna">
                        <p>Tuna</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/shrimp.png" alt="shrimp">
                        <p>Shrimp</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/redsnapper.png" alt="redsnapper">
                        <p>Red Snapper</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/eel.png" alt="eel">
                        <p>Eel</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/flounder.png" alt="flounder">
                        <p>Flounder</p>
                    </div>
                </div>
                <div class="nigri">
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/squid.png" alt="squid">
                        <p>Squid</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/octopus.png" alt="octopus">
                        <p>Octopus</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/stripedbass.png" alt="strippedbass">
                        <p>Stripped Bass</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/mackerel.png" alt="mackerel">
                        <p>Mackerel</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/yellowtail.png" alt="yellowtail">
                        <p>Yellow Tail</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/clam.png" alt="clam">
                        <p>Clam</p>
                    </div>
                </div>
                <div class="nigri">
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/scallop.png" alt="scallop">
                        <p>Scallop</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/sweetshrimp.png" alt="sweetshrimp">
                        <p>Sweet Shrimp</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/tamago.jpeg" alt="tamago">
                        <p>Tamago</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/salmonroe.png" alt="salmonroe">
                        <p>Salmon Roe</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/smeltroe.png" alt="smeltroe">
                        <p>Smelt Roe</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/nigiri/uni.png" alt="uni">
                        <p>Uni</p>
                    </div>
                </div>
                <div class="spacer">
                    <div class="spacer1"></div>
                </div>
                <h5 class="ftitle">Rolls</h5>
                <div class="nigri">
                    <div class="sec1">
                        <img class="mpic" src="../image/roll/californiaroll.png" alt="californiaroll">
                        <p>California Roll</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/roll/dragonroll.png" alt="dragonroll">
                        <p>Dragon Roll</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/roll/spicytunaroll.png" alt="spicytunaroll">
                        <p>Spicy Tuna Roll</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/roll/tempurashrimproll.png" alt="tempurashrimproll">
                        <p>Tempura Shrimp Roll</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/roll/friedsalmonroll.png" alt="friedsalmonroll">
                        <p>Fried Salmon Roll</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/roll/spiderroll.png" alt="spiderroll">
                        <p>Spider Roll</p>
                    </div>
                </div>
                <div class="nigri">
                    <div class="sec1">
                        <img class="mpic" src="../image/roll/philiroll.png" alt="philiroll">
                        <p>Phili Roll</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/roll/tunaphiliroll.png" alt="tunaphiliroll">
                        <p>Tuna Phili Roll</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/roll/salmonroll.png" alt="salmonroll">
                        <p>Salmon Roll</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/roll/avocadoroll.png" alt="avocadoroll">
                        <p>Avocado Roll</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/roll/cucumberroll.png" alt="cucumberroll">
                        <p>Cucumber Roll</p>
                    </div>
                    <div class="sec1">
                        <img class="mpic" src="../image/roll/crabroll.png" alt="crabroll">
                        <p>Crab Roll</p>
                    </div>
                </div>
                <div class="spacer">
                    <div class="spacer1"></div>
                </div>
                <h5 class="ftitle">Poke</h5>
                <div class="poke">
                    <div class="sec1">
                        <img class="bpic" src="../image/poke/salmon poke.png" alt="salmonpoke">
                        <p>Salmon Poke</p>
                    </div>
                    <div class="sec1">
                        <img class="bpic" src="../image/poke/spicydonburipoke.png" alt="spicydonburipoke">
                        <p>Spicy Donburi Poke</p>
                    </div>
                    <div class="sec1">
                        <img class="bpic" src="../image/poke/hawaiianpoke.png" alt="hawaiianpoke">
                        <p>Hawaiian Poke</p>
                    </div>
                    <div class="sec1">
                        <img class="bpic" src="../image/poke/surfandturfpoke.png" alt="surfandturfpoke">
                        <p>Surf and Turf Poke</p>
                    </div>
                    <div class="sec1">
                        <img class="bpic" src="../image/poke/koreanstylepoke.png" alt="koreanstylepoke">
                        <p>Korean Style Poke</p>
                    </div>
                </div>
                <div class="spacer">
                    <div class="spacer1"></div>
                </div>
                <h5 class="ftitle">Bowls</h5>
                <div class="bowl">
                    <div class="sec1">
                        <img class="bpic" src="../image/bowl/chickenteriyaki.png" alt="chickenteriyaki">
                        <p>Chicken Teriyaki</p>
                    </div>
                    <div class="sec1">
                        <img class="bpic" src="../image/bowl/spicychickenteriyaki.png" alt="spicychickenteriyaki">
                        <p>Spicy Chicken Teriyaki</p>
                    </div>
                    <div class="sec1">
                        <img class="bpic" src="../image/bowl/teriyakichickenbreast.png" alt="teriyakichickenbreast">
                        <p>Chicken Breast Teriyaki</p>
                    </div>
                </div>
                <div class="bowl">
                    <div class="sec1">
                        <img class="bpic" src="../image/bowl/steakteriyaki.png" alt="steakteriyaki">
                        <p>Steak Teriyaki</p>
                    </div>
                    <div class="sec1">
                        <img class="bpic" src="../image/bowl/salmonteriyaki.png" alt="salmonteriyaki">
                        <p>Salmon Teriyaki</p>
                    </div>
                    <div class="sec1">
                        <img class="bpic" src="../image/bowl/orangechicken.png" alt="orangechicken">
                        <p>Orange Chicken</p>
                    </div>
                </div>
            </div>
            <div class="spacer">
                <div class="spacer1"></div>
            </div>
            <h5 class="ftitle">Fried Rice</h5>
            <div class="friedrice">
                <div class="sec1">
                    <img class="bpic" src="../image/friedrice/friedrice.png" alt="friedrice">
                    <p>Fried Rice</p>
                </div>
                <div class="sec1">
                    <img class="bpic" src="../image/friedrice/shrimpfriedrice.png" alt="shrimpfriedrice">
                    <p>Shrimp Fried Rice</p>
                </div>
                <div class="sec1">
                    <img class="bpic" src="../image/friedrice/porkrice.png" alt="porkrice">
                    <p>Pork Fried Rice</p>
                </div>
                <div class="sec1">
                    <img class="bpic" src="../image/friedrice/veggierice.png" alt="veggierice">
                    <p>Veggie Fried Rice</p>
                </div>
            </div>
            <div class="spacer">
                <div class="spacer1"></div>
            </div>
            <h5 class="ftitle">Noodles</h5>
            <div class="noodle">
                <div class="sec1">
                    <img class="bpic" src="../image/noodle/udon.png" alt="udon">
                    <p>Udon</p>
                </div>
                <div class="sec1">
                    <img class="bpic" src="../image/noodle/nabeyakiudon.png" alt="nabeyakiudon">
                    <p>Nabeyaki Udon</p>
                </div>
                <div class="sec1">
                    <img class="bpic" src="../image/noodle/yakiudon.png" alt="yakiudon">
                    <p>YakiUdon</p>
                </div>
                <div class="sec1">
                    <img class="bpic" src="../image/noodle/yakisoba.png" alt="yakisoba">
                    <p>YakiSoba</p>
                </div>
            </div>
            <div class="spacer">
                <div class="spacer1"></div>
            </div>
            <h5 class="ftitle">Appetizers</h5>
            <div class="nigri">
                <div class="sec1">
                    <img class="mpic" src="../image/appetizer/tempurashrimp.png" alt="tempurashrimp">
                    <p>Shrimp Tempura</p>
                </div>
                <div class="sec1">
                    <img class="mpic" src="../image/appetizer/tempurasquid.png" alt="tempurasquid">
                    <p>Squid Tempura</p>
                </div>
                <div class="sec1">
                    <img class="mpic" src="../image/appetizer/tempuraveggies.png" alt="tempuraveggies">
                    <p>Veggie Tempura</p>
                </div>
                <div class="sec1">
                    <img class="mpic" src="../image/appetizer/chickenkarage.png" alt="chickenkarage">
                    <p>Chicken Karage</p>
                </div>
                <div class="sec1">
                    <img class="mpic" src="../image/appetizer/frieddumplings.png" alt="frieddumplings">
                    <p>Gyoza</p>
                </div>
                <div class="sec1">
                    <img class="mpic" src="../image/appetizer/eggroll.png" alt="eggroll">
                    <p>Egg Roll</p>
                </div>
            </div>
            <div class="borderflower">
            </div>
            <div class="copyr">
                <p class="textsize">&#169; 2022 DOMOSUSHI,INC. ALL RIGHTS RESERVED.</p>
            </div>
        </main>
	</div>
</body>
</html>