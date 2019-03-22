<?php
$userData = file_get_contents('userData.json');
$userData = json_decode($userData, true);
$assgnObj->course = $_POST["selected_course"];
$assgnObj->label = $_POST["label"];
$assgnObj->dueDate = $_POST["dueDate"];
$assgnObj->dueTime = $_POST["dueTime"];
array_push($userData["assignments"], $assgnObj);
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

<h2 id="htwo">Assignment successfully added!</h2>
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
