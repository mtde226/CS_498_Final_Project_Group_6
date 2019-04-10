<?php

function letterGrade($ptsPossible, $ptsEarned){
    $score = floatval($ptsEarned) / floatval($ptsPossible);
    if($score >= 0.90) {return "A";}
    elseif($score >= 0.80) {return "B";}
    elseif($score >= 0.70) {return "C";}
    elseif($score >= 0.60) {return "D";}
    else {return "E";}
}
$userData = file_get_contents('userData.json');
$userData = json_decode($userData, true);
$assgnObj->label = $_POST["label"];
$assgnObj->ptsEarned = $_POST["score"];
$assgnObj->ptsPossible = $_POST["weight"];
$assgnObj->letter = letterGrade($_POST["weight"], $_POST["score"]);
array_push($userData["courses"][$_POST["selected_course"]][$_POST["category"]], $assgnObj);
file_put_contents('userData.json', json_encode($userData));
?>

<html lang="en">
<head>
<meta charset="utf-8"/>
<title>Homework Planner</title>
<style>
    form {display: inline;}
</style>
</head>
<body>

<h2 id="htwo">Grade successfully added!</h2>
<p id="par">
What would you like to do now?<br><br>
<form action="add-assignment.php" method="post">
<input type="submit" value="Add Assignments">
</form>
<form action="view-tasks.php" method="post">
<input type="submit" value="View Tasks">
</form>
<form action="add-grades.php" method="post">
<input type="submit" value="Add Grades">
</form>
<form action="view-gradebook.php" method="post">
<input type="submit" value="View Gradebook">
</form>
</p>

</body>
</html>
