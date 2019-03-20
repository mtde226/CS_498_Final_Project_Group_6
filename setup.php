<?php

$name = $_POST["name"];
$class1 = $_POST["class1"];
$class2 = $_POST["class2"];
$class3 = $_POST["class3"];
$class4 = $_POST["class4"];
$class5 = $_POST["class5"];
$class6 = $_POST["class6"];

?>

<html lang="en">
<head>
<meta charset="utf-8"/>
</head>
<title>Homework Planner</title>
<body>

<h2 id="htwo">Thanks, <?php echo $name; ?>!</h2>
<p id="par">
What would you like to do now?<br><br>
<input type="button" onclick="assign()" value="Add Assignments">
<input type="button" onclick="calendar()" value="View Calendar">
<input type="button" onclick="addgrades()" value="Add Grades">
<input type="button" onclick="gradebook()" value="View Gradebook">
</p>
</body>
</html>

<script>
var htwo = document.getElementById("htwo");
var par = document.getElementById("par");
function assign() {
    htwo.innerHTML = "Which class is this for?";
    par.innerHTML = "";
}
function calendar() {

}
function addgrades() {
    htwo.innerHTML = "Which class is this for?";
    par.innerHTML = "";
}
function gradebook() {

}
</script>
