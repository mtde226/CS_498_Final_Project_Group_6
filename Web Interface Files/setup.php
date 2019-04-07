<?php

$student->username = $_POST["name"];
$student->courses = array($_POST["course1"],$_POST["course2"],$_POST["course3"],$_POST["course4"],$_POST["course5"],$_POST["course6"]);

$student->courses[$_POST["course1"]]->assignments = array();
$student->courses[$_POST["course1"]]->exams = array();
$student->courses[$_POST["course1"]]->quizzes = array();
$student->courses[$_POST["course1"]]->aweight = $_POST[];
$student->courses[$_POST["course1"]]->eweight = $_POST[];
$student->courses[$_POST["course1"]]->qweight = $_POST[];

$student->courses[$_POST["course2"]]->assignments = array();
$student->courses[$_POST["course2"]]->exams = array();
$student->courses[$_POST["course2"]]->quizzes = array();
$student->courses[$_POST["course2"]]->aweight = $_POST[];
$student->courses[$_POST["course2"]]->eweight = $_POST[];
$student->courses[$_POST["course2"]]->qweight = $_POST[];

$student->courses[$_POST["course3"]]->assignments = array();
$student->courses[$_POST["course3"]]->exams = array();
$student->courses[$_POST["course3"]]->quizzes = array();
$student->courses[$_POST["course3"]]->aweight = $_POST[];
$student->courses[$_POST["course3"]]->eweight = $_POST[];
$student->courses[$_POST["course3"]]->qweight = $_POST[];

$student->courses[$_POST["course4"]]->assignments = array();
$student->courses[$_POST["course4"]]->exams = array();
$student->courses[$_POST["course4"]]->quizzes = array();
$student->courses[$_POST["course4"]]->aweight = $_POST[];
$student->courses[$_POST["course4"]]->eweight = $_POST[];
$student->courses[$_POST["course4"]]->qweight = $_POST[];

$student->courses[$_POST["course5"]]->assignments = array();
$student->courses[$_POST["course5"]]->exams = array();
$student->courses[$_POST["course5"]]->quizzes = array();
$student->courses[$_POST["course5"]]->aweight = $_POST[];
$student->courses[$_POST["course5"]]->eweight = $_POST[];
$student->courses[$_POST["course5"]]->qweight = $_POST[];

$student->courses[$_POST["course6"]]->assignments = array();
$student->courses[$_POST["course6"]]->exams = array();
$student->courses[$_POST["course6"]]->quizzes = array();
$student->courses[$_POST["course6"]]->aweight = $_POST[];
$student->courses[$_POST["course6"]]->eweight = $_POST[];
$student->courses[$_POST["course6"]]->qweight = $_POST[];

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
