<?php

/* Set up user data--each user can have up to six courses. Each course has weights
for assignments, exams, and quizzes (for grading purposes), an array of assignments, 
an array of quizzes, and an array of exams. This is then written to a json file to 
store the data for future usage. */

$student->username = $_POST["name"];

$c1->Assignments = array();
$c1->Exams = array();
$c1->Quizzes = array();
$c1->aweight = $_POST["course1assignmentweight"];
$c1->eweight = $_POST["course1examweight"];
$c1->qweight = $_POST["course1quizweight"];

$c2->Assignments = array();
$c2->Exams = array();
$c2->Quizzes = array();
$c2->aweight = $_POST["course2assignmentweight"];
$c2->eweight = $_POST["course2examweight"];
$c2->qweight = $_POST["course2quizweight"];

$c3->Assignments = array();
$c3->Exams = array();
$c3->Quizzes = array();
$c3->aweight = $_POST["course3assignmentweight"];
$c3->eweight = $_POST["course3examweight"];
$c3->qweight = $_POST["course3quizweight"];

$c4->Assignments = array();
$c4->Exams = array();
$c4->Quizzes = array();
$c4->aweight = $_POST["course4assignmentweight"];
$c4->eweight = $_POST["course4examweight"];
$c4->qweight = $_POST["course4quizweight"];

$c5->Assignments = array();
$c5->Exams = array();
$c5->Quizzes = array();
$c5->aweight = $_POST["course5assignmentweight"];
$c5->eweight = $_POST["course5examweight"];
$c5->qweight = $_POST["course5quizweight"];

$c6->Assignments = array();
$c6->Exams = array();
$c6->Quizzes = array();
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

<!-- HTML form to determine next action. User can add assignments or grades, or view assignments or grades -->  
  
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
