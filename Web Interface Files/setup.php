<?php

$student->username = $_POST["name"];

$c1->assignments = array();
$c1->exams = array();
$c1->quizzes = array();
$c1->aweight = $_POST["course1assignmentweight"];
$c1->eweight = $_POST["course1examweight"];
$c1->qweight = $_POST["course1quizweight"];

$c2->assignments = array();
$c2->exams = array();
$c2->quizzes = array();
$c2->aweight = $_POST["course2assignmentweight"];
$c2->eweight = $_POST["course2examweight"];
$c2->qweight = $_POST["course2quizweight"];

$c3->assignments = array();
$c3->exams = array();
$c3->quizzes = array();
$c3->aweight = $_POST["course3assignmentweight"];
$c3->eweight = $_POST["course3examweight"];
$c3->qweight = $_POST["course3quizweight"];

$c4->assignments = array();
$c4->exams = array();
$c4->quizzes = array();
$c4->aweight = $_POST["course4assignmentweight"];
$c4->eweight = $_POST["course4examweight"];
$c4->qweight = $_POST["course4quizweight"];

$c5->assignments = array();
$c5->exams = array();
$c5->quizzes = array();
$c5->aweight = $_POST["course5assignmentweight"];
$c5->eweight = $_POST["course5examweight"];
$c5->qweight = $_POST["course5quizweight"];

$c6->assignments = array();
$c6->exams = array();
$c6->quizzes = array();
$c6->aweight = $_POST["course6assignmentweight"];
$c6->eweight = $_POST["course6examweight"];
$c6->qweight = $_POST["course6quizweight"];

$student->courses = array($_POST["course1"]=>$c1, $_POST["course2"]=>$c2, $_POST["course3"]=>$c3, $_POST["course4"]=>$c4, $_POST["course5"]=>$c5, $_POST["course6"]=>$c6);

var_dump($student);

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
