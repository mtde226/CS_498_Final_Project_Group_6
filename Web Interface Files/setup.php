<?php

$student->username = $_POST["name"];
$student->courses = array($_POST["course1"],$_POST["course2"],$_POST["course3"],$_POST["course4"],$_POST["course5"],$_POST["course6"]);
$student->assignments = array();
$student->grades = array();
$userData = fopen("userData.json", "a+");
fwrite($userData, json_encode($student));
fclose($userData);
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

<h2 id="htwo">Thanks, <?php echo ($student->username); ?>!</h2>
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
